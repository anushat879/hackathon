package in.health.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.health.entity.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Serializable>{

	
}
