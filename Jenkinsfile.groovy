pipeline{
    agent none
    stages {
        stage('Build Tags') {
            when {
                changeRequest()
            }
            steps{
                echo "Change request executed"
            }
        }
    }
}