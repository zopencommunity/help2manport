node('linux') 
{
        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'help2manport'), string(name: 'DESCRIPTION', 'help2manport' )]
        }
}
