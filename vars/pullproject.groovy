def call(workingGitURL, workingBranch) {
	try {
		logger "${loglevel}", "DEBUG", "Attempting git pull ${workingGitURL}, branch: ${workingBranch}"
		git url: "${workingGitURL}", branch: "${workingBranch}"
		}
	catch (e) {
		logger "${loglevel}", "ERROR", "Pull failed. Error[${e}]"
		continueBuild = false
		}
}