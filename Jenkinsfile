pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn clean'
                    } else {
                        bat 'mvn clean'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn test'
                    } else {
                        bat 'mvn test'
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'Tests Passed'
        }

        failure {
            mail to: '70812345pratik@gmail.com',
                 subject: 'Selenium Test Failed',
                 body: 'Please check Jenkins Build.'
        }
    }
}