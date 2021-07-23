#!/usr/bin/env groovy

def call () {
    echo "========executing Maven Build========"
    sh "mvn package"
}
