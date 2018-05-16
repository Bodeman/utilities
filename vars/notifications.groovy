def call(channel, args) {
	if (channel == "CONSOLE") {
		echo "${args}"
	}
	if (channel == "SLACK") {
		echo "Call slack method ${args}"
	}
}