pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {

        success {
            echo 'Tests Passed'
        }

        failure {
            mail to: 'your_email@gmail.com',
                 subject: 'Selenium Test Failed',
                 body: 'Please check Jenkins Build.'
        }
    }
}