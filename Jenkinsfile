pipeline {
  agent any

  stages {
    stage('Exemple') {
      steps {
        echo 'Bonjour depuis Jenkins'
      }
    }
	stage('Checkout') {
      steps {
        git url: 'https://github.com/Abdirahman283/projet-pipeline-maven.git'
      }
    }
  }
}
