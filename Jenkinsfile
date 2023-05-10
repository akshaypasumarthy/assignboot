pipeline{
    agent any
 tools {
        // define the JDK version
        jdk 'java.home'
        // define the maven version
        maven 'jenkins-maven'
    }



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
         stage('build'){
            steps{
               bat 'mvn clean package'
            }
        }
         stage('deploy'){
            steps{
               bat 'mvn deploy'
            }
        }
    }
}
