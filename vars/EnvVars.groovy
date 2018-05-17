def LoadWorkingGitURL(mode) {
	try{
	if(mode == 0) {
		return "Cammis"
	}
	else {
		return 'https://github.com/Bodeman/Dev.git'  
	}
	}
	catch (e) {
		echo "${e}"
	}
}