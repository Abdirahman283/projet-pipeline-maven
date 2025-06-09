pipeline {
  agent any
  
  parameters {
      string(name: 'BRANCH_NAME', defaultValue: 'main', description: 'Branche Git à utiliser')
  }
  
  stages {
    stage('Exemple') {
      steps {
        echo 'Bonjour depuis Jenkins'
      }
    }
	stage('Checkout') {
          steps {
            git credentialsId: 'b05b1de6-30ea-4ef6-8616-ba9827a21975',
	            branch: "${params.BRANCH_NAME}",
		        url: 'https://github.com/Abdirahman283/projet-pipeline-maven.git'
          }
    }
	stage('Build') {
          steps {
            sh 'mvn clean compile'
          }
    }
	stage('Test') {
	  steps {
        sh 'mvn test'
      }
      post {
        always {
          junit '**/target/surefire-reports/*.xml'
        }
      }
    }
	stage('Package') {
	  steps {
            sh 'mvn package'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
	stage('Analyse') {
          steps {
            sh 'mvn checkstyle:checkstyle'
            publishHTML([reportDir: 'target/site', reportFiles: 'checkstyle.html', reportName: 'Checkstyle'])
        }
    }
  }
}

