pipeline{
    agent any
    stages{
        stage("stages will run parallel"){
            failFast true
            parallel{
                stage('stage'){
                    steps{
                        echo "Before sleep"
                        sleep 10
                        echo "Wake up after 10 seconds"
                    }
                }
                stage('stage'){
                    steps{
                        echo "Before sleep"
                        sleep 10
                        echo "Wake up after 10 seconds"
                    }
                }
                stage('stage'){
                    steps{
                        echo "Before sleep"
                        sleep 10
                        echo "Wake up after 10 seconds"
                    }
                }
            }
        }
    }
}