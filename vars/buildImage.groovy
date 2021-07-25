#!/usr/bin/env groovy

import com.example.Docker
def call (String imageName) { // We use imageName for not to hardcode app name and version on the shared library
        return new Docker(this).buildDockerImage(imageName)
    }