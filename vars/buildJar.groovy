#!/usr/bin/env groovy

def call () {
    echo "========executing Maven Build for $BRANCH_NAME========"
    sh "mvn package"
}
