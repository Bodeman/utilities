def call(mode, mvnHome, POMLocation, disable) {
	try {
		if(disable != true) {
			if(mode == "Windows") {
				bat "mvn -X -B --file ${POMLocation} -Dmaven.test.failure.ignore clean install cobertura:cobertura -Dcobertura.report.format=xml"
			} else {
				sh "'${mvnHome}/bin/mvn' -X -B --file '${POMLocation}' -Dmaven.test.failure.ignore clean install cobertura:cobertura -Dcobertura.report.format=xml"
			}
		}
		else {echo "Skipping compile: ${disable}"}
	}
	catch (e) { echo "ERROR: ${e}"}
}