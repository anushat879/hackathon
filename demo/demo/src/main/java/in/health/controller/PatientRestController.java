package in.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.health.binding.Patient;
import in.health.service.PatientService;

@RestController
public class PatientRestController {

	@Autowired
	private PatientService service;

	@PostMapping("/addPatient")
	public ResponseEntity<String> createPatientApp(@RequestBody Patient patient) {

		String status = service.createApplication(patient);
		return new ResponseEntity(status, HttpStatus.OK);
	}

}
