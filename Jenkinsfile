pipeline {
    agent any

    triggers {
    pollSCM '* * * * *'
    }
    // tools {
    //     // Install the Maven version configured as "M3" and add it to the path.
    //     maven "M3"
    // }

    stages {
        echo '"Job \'${JOB_NAME}\' (${BUILD_NUMBER}) starts.'
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/cubic2008/jenkins_springboot_app.git'
            }
        }
        stage('Build') {
            steps {
                bat "mvn clean package"
            }
        }
    }
    post {
        success {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts 'target/*.jar'
        }
    }
    echo '"Job \'${JOB_NAME}\' (${BUILD_NUMBER}) starts.'
}
