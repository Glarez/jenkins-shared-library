#!/usr/bin/env groovy

def call () {
    echo "========Building the Docker image========"
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t glarez/java-maven-app:1.0 .'
        echo "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push glarez/java-maven-app:1.0'
    }
}