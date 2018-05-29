def call(mode, mvnHome, POMLocation, disable) {
	if (loglevel == "DEBUG") {
		add_debug = "-X"
	}
	if(loglevel == "WARNING" || loglevel == "ERROR") {
		remove_info = "-q"
	}
	try {
		if(disable != true) {
			if(mode == "Windows") {
				bat "mvn ${add_debug} ${remove_info} -B --file ${POMLocation} -Dmaven.test.failure.ignore clean install cobertura:cobertura -Dcobertura.report.format=xml"
			} else {
				sh "'${mvnHome}/bin/mvn' ${add_debug} ${remove_info} -B --file '${POMLocation}' -Dmaven.test.failure.ignore clean install cobertura:cobertura -Dcobertura.report.format=xml"
			}
		}
		else {echo "Skipping compile: ${disable}"}
	}
	catch (e) { echo "ERROR: ${e}"}
}