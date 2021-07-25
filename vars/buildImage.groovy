#!/usr/bin/env groovy

def call (String imageName) { // We use imageName for not to hardcode app name and version on the shared library
    echo "========Building the Docker image========"
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker build -t $imageName ."
        echo "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push $imageName"
    }
}