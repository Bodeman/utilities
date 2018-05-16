def call(global_level, level, message) {
	def emit = false
	switch(global_level) {
	case "DEBUG":
		emit = true
	case "INFO":
		if(level == "INFO")
		emit = true
	case "WARNING"
		if(level == "WARNING")
		emit = true
	case "ERROR"
		if(level == "ERROR")
		emit = true

	default:
		if(emit) {echo "${level}: ${message}"}
	}
	
	echo ${loglevel}
}
