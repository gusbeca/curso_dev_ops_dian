package gov.dian.devops;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


/**

* Punto de entrada de la aplicación.

*/

@SpringBootApplication

public class IncidentApplication {

public static void main(String[] args) {

SpringApplication.run(IncidentApplication.class, args);

}

}

2) IncidentController.java (ruta: src/main/java/gov/dian/devops/controller/IncidentController.java)

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