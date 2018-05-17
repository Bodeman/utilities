def call(global_level, level, message) {
	try {
	def emit = false

	//Compare global logging level to message level, emit if message level less than global
	if(global_level == "DEBUG") {emit = true} 
	if(global_level == "INFO" && level != "DEBUG") {emit = true}
	if(global_level == "WARN" && (level != "DEBUG" || level != "INFO")) {emit = true}
	if(global_level == "ERROR" && level == "ERROR") {emit = true}

	if(emit) {echo "${level}: ${message}"}
	}
	catch (e) {
		echo "Logger Error: ${e}"
	}
}
