package in.health.service;

import java.security.SecureRandom;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import in.health.binding.Patient;
import in.health.entity.PatientEntity;
import in.health.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepo;

	@Override
	public String createApplication(Patient patient) {

		PatientEntity entity = new PatientEntity();
		BeanUtils.copyProperties(patient, entity);
        String pwd = encode(patient.getPassword());
        entity.setPassword(pwd);
        System.out.println("password is "+entity.getPassword());
		return "Application is Created :" + patientRepo.save(entity).getPatientId();
	}
	public String encode(String passWord) {
	    BCryptPasswordEncoder bCryptPasswordEncoder =
	            new BCryptPasswordEncoder(10, new SecureRandom());
	    return bCryptPasswordEncoder.encode(passWord);

	}
}
