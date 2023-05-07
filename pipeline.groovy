pipeline {
    agent any

    stages {
        stage('say hello') {
            steps {
                echo "I've run"
            }
        }
        stage('exec script') {
            steps {
                sh './demo_script.sh'
            }
        }
    }
}