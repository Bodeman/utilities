//src/org/cammis/EnvVars/groovy
package org.cammis;

def LoadWorkingGitURL(mode) {
	if(mode == 0) {
		return "Cammis"
	}
	else {
		return 'https://github.com/Bodeman/Dev.git'  
	}
}