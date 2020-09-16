package se.home.k8s;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	Logger logger = LoggerFactory.getLogger(ConfigController.class);
	@GetMapping("/")
	public ResponseEntity<String> getConfigValue(){
		logger.warn("Logging Statement");
		return new ResponseEntity<>("Some value", HttpStatus.OK);
	}
}
