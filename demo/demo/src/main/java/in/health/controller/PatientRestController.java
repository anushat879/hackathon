package in.health.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.health.binding.Patient;
import in.health.entity.PatientEntity;
import in.health.service.PatientService;

@Controller
@RequestMapping("/pt")
public class PatientRestController {

	@Autowired
	private PatientService service;

	/*
	 * @PostMapping("/addPatient") public ResponseEntity<String>
	 * createPatientApp(@RequestBody Patient patient) {
	 * 
	 * System.out.println(" name" + patient);
	 * 
	 * String status = service.createApplication(patient); return new
	 * ResponseEntity(status, HttpStatus.OK); }
	 */

	@GetMapping("/app")
	public String createPatientApp(@ModelAttribute("p") Patient patient) {

		return "addpatient";
	}

	@PostMapping("/app")
	public String savePatientApp(@ModelAttribute("p") Patient patient, Map<String, Object> map) {

		String msg = service.createApplication(patient);
		Iterable<PatientEntity> ee = service.getAllPatients();
		
		map.put("emps", ee);
        return "show_result";
	}

}
