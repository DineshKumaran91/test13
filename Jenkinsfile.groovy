pipeline{
    agent none
    stages {
        stage('Build Tags') {
            when {
                changeset glob: "*.js"
            }
            steps{
                echo "Change Set executed"
            }
        }
    }
}