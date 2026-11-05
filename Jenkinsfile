pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Compilation') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Automation Execution') {
            steps {
                sh 'mvn test -DsuiteXmlFile=testng.xml'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/ExtentReports.html', fingerprint: true
        }
    }
}
