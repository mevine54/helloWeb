pipeline {
    agent any
    tools {
        maven 'Maven 3.9.6'
    }
    stages {

        stage('Git Checkout') {
            steps {
                script {
                    git branch: 'main',
                    credentialsId: 'jenhub',
                    url: 'https://github.com/mevine54/jenkins.git'
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