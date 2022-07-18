node('linux') 
{
        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'help2manport'), string(name: 'DESCRIPTION', 'help2man is a tool for automatically generating simple manual pages from program output.' )]
        }
}
