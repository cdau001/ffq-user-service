package edu.fiu.ffqr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.fiu.ffqr.models.Clinician;
import edu.fiu.ffqr.repositories.ClinicianRepository;

@Service
@Component
public class ClinicianService  extends UserService<Clinician, ClinicianRepository> {

	@Autowired
	public ClinicianService(ClinicianRepository repository) {
		this.repository = repository;
	}

}
