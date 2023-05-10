pipeline{
    agent any
 tools {
        // define the JDK version
        jdk 'Java 17'
        // define the maven version
        maven 'Maven 3.6.3'
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
