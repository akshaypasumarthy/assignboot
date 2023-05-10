pipeline{
    agent any
 



    stages{
        stage('checkout'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github access', url: 'https://github.com/akshaypasumarthy/assignboot.git']]])
            }
        }
        stage('clean'){
            steps{
               bat 'mvn clean'
            }
        }
         stage('install'){
            steps{
               bat 'mvn install'
            }
        }
    }
}
