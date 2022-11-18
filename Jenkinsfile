pipeline {
    agent any
    tools {
        maven '3.8.6'
    }
    stages {
        stage('Compile') {
            steps {
                echo 'Compiling...'
                sh "./mvnw clean compile -e"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh "./mvnw clean test -e"            
            }
        }
        stage('Package') {
            steps {
                echo 'Packaging...'
                sh "./mvnw clean package -e"            
            }
        }
        stage('sonar') {
           steps{
              withSonarQubeEnv(credentialsId:'newtoken',installationName:'SonarServer') { 
                sh 'mvn sonar:sonar'
             }
          }
        } 
    }    
}