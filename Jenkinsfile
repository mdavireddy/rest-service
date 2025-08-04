pipeline {
    agent any
 options {
        // This sets the build display name in the UI
        buildDisplayName("Build #${BUILD_NUMBER} - My Custom Name")
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building the project'
              //  sh './gradlew clean build -x test'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing the project'
               // sh './gradlew clean test'
            }
        }
        stage('Deploy') {
            when {
                beforeAgent true
                expression {env.GIT_BRANCH == 'origin/main'}
            }
            steps {
                echo 'Deploying the project'
            }
        }

        stage('ProdDeploy') {
             when {
                beforeAgent  true
                expression {env.GIT_BRANCH == 'origin/main'}
            }
            steps {
                echo 'Deploying the project'
            }
        }
    }
}
