def call(mode, SonarHost, workingProject, workingJenkinsDir, workingJob) {
	try {
		if(mode == 'Windows') {
			bat "cd ${workingJenkinsDir}\\${workingProject}"
			bat "mvn sonar:sonar -Dsonar.host.url=${SonarHost}' -Dsonar.projectBaseDir='${workingJenkinsDir}\\${workingProject}\\'  -Dsonar.sources='${workingJenkinsDir}\\${workingProject}\\src'"		
			}
		else {
			sh '/var/lib/jenkins/tools/hudson.plugins.sonar.SonarRunnerInstallation/Sonar/bin/sonar-scanner' +
					' -Dsonar.host.url=${SonarHost}' + 
					' -Dsonar.projectVersion=1.0' +
					' -Dsonar.sourceEncoding=UTF-8' +
					' -Dsonar.projectKey="${workingJob}"' +
					' -Dsonar.java.binaries="${workingJenkinsDir}"/"${workingJob}"/"${workingProject}"/target/classes' +
					' -Dsonar.sources="${workingProject}"/src' +
					' -Dsonar.projectBaseDir="${workingJenkinsDir}"/"${workingJob}"'
			}
		}
	catch (e) {
		logger "${loglevel}", "ERROR", "Pull failed. Error[${e}]"
		}
}