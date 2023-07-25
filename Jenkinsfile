pipeline {
    agent any
    
    tools {
        maven 'M2_HOME'
    }
    environment {

        AWS_SECRET_KEY = 'mNhjTmGA5GDSRZPXKKg+kPxzGvM6FZ597rYj4RxX'    
        
} 

    stages {
        stage('Checkout') {
            steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/laxman261/devops-certification-project1.git']]])
            }
        }
        stage('Compile') {
            steps {
            sh 'mvn clean package'
            }
        }  
        stage('Docker Build') {
            steps {
                sh 'docker build -t pkcsmath/certificationproject1 .'
            }
        }
  
        stage('Docker Push') {
    	agent any
      steps {
      	withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
        	sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
          sh 'docker push pkcsmath/certificationproject1'
        }
      }
    }
              stage('Terraform init') {
             steps {
                 sh 'terraform init'
             }
         }
         stage('Terraform Apply') {
             steps {
                 sh 'terraform apply --auto-approve'
                 sleep 20
             }
         }
        stage('Docker Deploy using Ansible') {
            steps {
           ansiblePlaybook credentialsId: 'ec2-user', disableHostKeyChecking: true, installation: 'Ansible', inventory: 'dev.inv', playbook: 'deploy-docker.yml'
             }
        }
        stage(" Email-Notify"){
        steps {
            emailext attachLog: true, body: '''Hello,
            Check your build status and build logs.
            Thankyou.''', recipientProviders: [developers()], subject: 'Build Success or Failure?', to: 'laxman502singh@gmail.com'
             }
         }
   }
}
