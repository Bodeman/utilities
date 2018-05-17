def call(mode) {
	try{
	if(mode == 0) {
		env.workingGitURL = "CAMMIS"
	}
	else {
		env.workingGitURL = 'https://github.com/Bodeman/Dev.git'  
	}
	}
	catch (e) {
		echo "${e}"
	}
}