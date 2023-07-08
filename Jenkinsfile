pipeline {
    agent any
    environment {
    PATH = "C:\\WINDOWS\\SYSTEM32"
    DOCKERHUB_CREDENTIALS=credentials('DOCKERHUB_CREDENTIALS')
    } 
    tools {
        
        maven "Maven"
        jdk "OpenJDK17"
    }
     /*environment {
    DOCKERHUB_CREDENTIALS=credentials('DOCKERHUB_CREDENTIALS')
    } */
    stages {
        stage('Maven package') {
            steps {
                bat 'mvn clean package'
            }
        }
		stage('Docker Build'){
		steps {
		 bat "docker build -t $DOCKERHUB_CREDENTIALS_USR/simple-service-app:${currentBuild.number} ."
		 }
		 }
		  stage('Docker Push') {
          steps {
		     withDockerRegistry([credentialsId: 'DOCKERHUB_CREDENTIALS', url: '']){
              bat "docker push $DOCKERHUB_CREDENTIALS_USR/simple-service-app:${currentBuild.number}"
          }
            
        } 
    }
}
post {
     always {
	    bat "docker logout"
		}	
	}		
}
