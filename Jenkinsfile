pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the project'
                sh './gradlew clean build -x test'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing the project'
                sh './gradlew clean test'
            }
        }
        stage('Deploy') {
            when {
                branch 'master'
            }
            steps {
                echo 'Deploying the project'
            }
        }

        stage('ProdDeploy') {
             when {
                branch 'master'
            }
            steps {
                echo 'Deploying the project'
            }
        }
    }
}