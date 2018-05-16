def call(global_level, level, message) {
	def emit = false
	if(global_level == "DEBUG") {emit = true} 
	if(global_level == "INFO" && level != "DEBUG") {emit = true}

	if(emit) {echo "${level}: ${message}"}

}
