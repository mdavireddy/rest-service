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
                beforeAgent true
                branch 'master'
            }
            steps {
                echo 'Deploying the project'
            }
        }

        stage('ProdDeploy') {
             when {
                beforeAgent true
                branch 'master'
            }
            steps {
                echo 'Deploying the project'
            }
        }
    }
}