pipeline {
    agent any
    tools {
        maven "Maven386"
    }
    environment {
        DOCKER_IMAGE_NAME = "saigneur-utilitaire"
        BUILD_TAG = "v0.0.${BUILD_NUMBER}"
        CONTAINER_NAME = "msaigneur-utilitaire"
    }

    stages {
        stage('Build') {
            steps {
                echo '--------------------< Compilation du code source >--------------------'
                sh 'mvn -B -DskipTests clean package'
            }
//             post {
//                 success {
//                     // we only worry about archiving the jar file if the build steps are successful
//                     archiveArtifacts(artifacts: '**/target/*.jar', allowEmptyArchive: true)
//                 }
//             }
        }

        stage ('Arret et suppression') {
            steps {
                echo '--------------------< Arret du conteneur >--------------------'
                script {
                    try {
                        sh 'docker container ls -a -fname=${CONTAINER_NAME} -q | xargs -r docker stop'
                    } catch(error) {
                        echo 'error Arret du conteneur'
                    }
                }

                echo '--------------------< Suppression du conteneur >--------------------'
                script {
                    try {
                        sh 'docker container ls -a -fname=${CONTAINER_NAME} -q | xargs -r docker rm'
                    } catch(error) {
                        echo 'error Suppression du conteneur' +error
                    }
                }
            }
        }

        stage('Build and start container') {
            steps {
                echo '--------------------< Compilation du docker-compose >--------------------'
                sh 'docker compose build'

                echo '--------------------< Lancement du docker-compose (containers) >--------------------'
                sh 'docker compose up -d'

                echo '--------------------< Affichage des containers actifs >--------------------'
                sh 'docker ps'
            }
        }
    }
}
