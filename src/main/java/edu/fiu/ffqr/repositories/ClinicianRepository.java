package edu.fiu.ffqr.repositories;

import org.springframework.stereotype.Repository;

import edu.fiu.ffqr.models.Clinician;

@Repository
public interface ClinicianRepository extends UserRepository<Clinician> {

}
