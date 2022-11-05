package in.health.service;

import in.health.binding.Patient;
import in.health.entity.PatientEntity;

public interface PatientService {
	public String createApplication(Patient patient);
	public Iterable<PatientEntity> getAllPatients();
	
}
