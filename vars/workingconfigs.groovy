def seturl(mode) {
	try{
		if(mode == 0) {
			return 'CAMMIS'
		}
		else {
			return 'https://github.com/Bodeman/Dev.git'  
		}
	}
	catch (e) {
		echo "${e}"
	}
}
def setbranch(mode) {
	try{
		if(mode == 0) {
			return 'errorTest'
		}
		else {
			return 'errorTest'  
		}
	}
	catch (e) {
		echo "${e}"
	}
}
def setPOM(mode) {
	try{
		if(mode == 0) {
			return '/var/lib/jenkins/workspace/TestPipeline/SpringPOC'
		}
		else {
			return 'C:\\code\\workspace\\Spring\\SpringPOC'
		}
	}
	catch (e) {
		echo "${e}"
	}
}
def setJenkinsDir(mode) {
	try{
		if(mode == 0) {
			return '/var/lib/jenkins/workspace'
		}
		else {
			return 'C:\\code\\workspace\\Spring'  
		}
	}
	catch (e) {
		echo "${e}"
	}
}