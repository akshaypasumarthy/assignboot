pipeline{
    agent any
 tools {
        // define the JDK version
        jdk 'java.home'
        // define the maven version
        maven 'maven3.6'
    }



    stages{
        stage('checkout'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'akshay', url: 'https://github.com/akshaypasumarthy/assignboot.git']]])
            }
        }
        stage('build'){
            steps{
               bat 'mvn clean package'
            }
        }
    }
}
