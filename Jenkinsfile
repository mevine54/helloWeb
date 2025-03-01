pipeline {
    agent any
  options {
        // This is required if you want to clean before build
        skipDefaultCheckout(true)
    }
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
        jdk 'JDK21'
    }
    stages {
        stage('Clean workspace'){
            steps {
                    cleanWs()
            }
        }
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
                    docker.build('mevine54/helloapi:latest', '-f Dockerfile .')
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
        stage('Deploy docker-compose') {
                    steps {
                        // initialise le conteneur docker
                        script {
                            // construit les services
                            bat 'docker-compose up -d --build --force-recreate --remove-orphans'
                        }
                    }
            }
    }
}