pipeline {
    agent any
    tools{
        maven 'M2_HOME'
    }
stages{
    stage('checkout') {
      steps{
         git 'https://github.com/laxman261/devops-certification-project1.git'
           }
       }
      
       stage('Compile') {
       steps{
           sh 'mvn --version'
              }
            }   
        stage('Docker Build') {
       steps{
           sh 'java --version'
              }
            }
        stage('Docker Push') {
       steps{
           sh 'docker --version'
              }
            }
         stage('Teeraform init') {
       steps{
           sh 'mvn --version'
              }
            }
         stage('Terraform Apply') {
       steps{
           sh 'java --version'
              }
            }
        stage('Docker Deploy using Ansible') {
       steps{
           sh 'docker --version'
              }
            }
         stage('Email Notify') {
       steps{
           sh 'mvn --version'
              }
            }     
        }
   }
