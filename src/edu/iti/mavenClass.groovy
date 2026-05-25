package edu.iti
def build(commandOptions){
    sh "mvn ${commandOptions}"
}
def test(nanInput){
    sh "mvn test"
}
