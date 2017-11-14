pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat './gradlew.bat clean testClasses'
            }
        }
        stage('cleanDb') {
           steps {
               bat './gradlew.bat flywayClean -P flyway.schemas=mattia -P flyway.url=jdbc:mysql://localhost:3306/mattia -P flyway.user=mattia'
               bat './gradlew.bat flywayMigrate -P flyway.schemas=mattia -P flyway.url=jdbc:mysql://localhost:3306/mattia  -P flyway.user=mattia'
           }
        }

        stage('Test') {
            steps {
                bat(script: './gradlew.bat test -Dspring.profiles.active=jenkins', returnStatus:true)
            }
        }

        stage('CodeCoverage') {
            steps {
                script {
                    try {
                        bat './gradlew.bat jacocoTestCoverageVerification'
                    } catch(error) {
                        currentBuild.result='UNSTABLE'
                    }
                }
            }
        }
    }

    post {
        always {
            junit '**/build/test-results/test/*.xml'
            step( [ $class: 'JacocoPublisher' ] )
        }
    }
}