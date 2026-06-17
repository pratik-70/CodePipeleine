pipeline {

    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {

        failure {
            mail to: '70812345pratik@gmail.com',
                 subject: 'Build Failed',
                 body: 'Selenium Tests Failed'
        }
    }
}