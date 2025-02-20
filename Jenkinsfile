pipeline {
    agent any

    environment {
    // nom image pour DockerHub
    registry = "mevine54/helloweb"
    // compte DockerHub parametre sur le serveur jenkins
    // dans la rubrique credentials de l'administration serveur
    registryCredential = 'pipeline'
    dockerImage = ''
    }

    tools {
        maven 'Maven 3.9.6'
    }
    stages {
        stage('Git Checkout') {
            steps {
                script {
                    git branch: 'main',
                    credentialsId: 'jenkinstest',
                    url: 'https://github.com/mevine54/helloweb.git'
                }
            }
        }
        stage('Build maven') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build('mevine54/helloweb:latest', '-f Dockerfile .')
                }
            }
        }
//         push de l'image dans le dockerhub
        stage('Push to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        docker.image('mevine54/helloweb:latest').push()
                    }
                }
            }
        }
    }
}