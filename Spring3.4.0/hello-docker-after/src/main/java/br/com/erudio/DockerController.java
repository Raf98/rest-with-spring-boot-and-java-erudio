package br.com.erudio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	Logger logger = LoggerFactory.getLogger(DockerController.class);

	@GetMapping(path = "/")
	public String imUpAndRunning() {
		logger.info("Endpoint / called!!!");
		return "{healthy: true}";
	}

	@RequestMapping("/hello-docker")
	public HelloDocker greeting() {

		logger.info("Endpoint /hello-docker called!!!");
		
		//var hostName = System.getenv("COMPUTERNAME");
		var hostName = System.getenv("HOSTNAME");
		if (hostName == null) {
			hostName = "LOCAL";
		}
		
		return new HelloDocker(
					"Hello Docker",
					hostName
				);
	}
}
