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
        stage('Checkout') {
            steps {
                echo "Job \'${JOB_NAME}\' (${BUILD_NUMBER}) starts."
                git branch: 'main', url: 'https://github.com/cubic2008/jenkins_springboot_app.git'
            }
        }
        stage('Build') {
            steps {
                bat "mvn clean package"
            }
        }
        stage('Post-Build') {
            steps {
                echo "Job \'${JOB_NAME}\' (${BUILD_NUMBER}) starts."
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
