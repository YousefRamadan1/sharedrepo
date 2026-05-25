package edu.iti

def build(imageName, imageTag) {
    sh "docker build -t ${imageName}:${imageTag} ."
}
def push(imageName, imageTag) {
    sh "docker push ${imageName}:${imageTag}"
}
def pull(imageName, imageTag) {
    sh "docker pull ${imageName}:${imageTag}"
}
def login(username, password) {
    sh "echo ${password} | docker login -u ${username} --p ${password}"
}

