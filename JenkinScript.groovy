node{
	stage('Build'){
		echo 'NOT Building the project'
	}

	stage('Test'){
		echo 'NOT Testing the project'
	}

	stage('Deploy'){
		echo 'NOT Deploying the project'
	}
}