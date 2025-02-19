pipeline {
    agent any
    tools {
        maven 'Maven 3.9.6'
    }
    stages {
        stage('Clean workspace') {
            steps{
                cleanWs()
            }
        }

        stage('Git Checkout') {
            steps {
                script {
                    git branch: 'main',
                    credentialsId: 'jenhub',
                    url: 'https://github.com/mevine54/helloWeb.git'
                }
            }
        }
        stage('Build maven') {
            steps {
                bat 'mvn clean package'
            }
        }
    }
}