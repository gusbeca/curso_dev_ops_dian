package gov.dian.devops.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Controller para la ruta /api/incident
 */
@RestController
@RequestMapping("/api/incident")
public class IncidentController {

	@GetMapping("/ping")
	public ResponseEntity<Map<String, String>> ping() {
		return ResponseEntity.ok(Map.of("message", "pong"));
	}

}