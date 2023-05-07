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
                ./demo_script.sh
            }
        }
    }
}