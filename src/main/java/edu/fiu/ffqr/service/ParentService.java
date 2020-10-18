package edu.fiu.ffqr.service;

import java.util.List;

import edu.fiu.ffqr.models.Admin;
import edu.fiu.ffqr.repositories.AdminRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.fiu.ffqr.repositories.ParentRepository;
import edu.fiu.ffqr.models.Parent;

@Service
@Component
public class ParentService extends UserService<Parent, ParentRepository> {

	@Autowired
	public ParentService(ParentRepository repository) {
		this.repository = repository;
	}

	public List<Parent> getAll()	{
		return repository.findAll();
	}
	
	public Parent getParentByUsername(String username) {
		return repository.findByUsername(username);
	}
	
	public Parent getParentBy_id(ObjectId _id) {
		return repository.getUserBy_id(_id);
	}

	public Parent getParentByUserId(String userId) {
		return repository.getByUserId(userId);
	}

	public Parent getParentByAssignedclinic(String assignedclinic) {
		return repository.findByAssignedclinic(assignedclinic);
	}       
        
	
	public void delete(String userName) {
		Parent fi = repository.findByUsername(userName);
		repository.delete(fi);
	}

	public void deleteById(String userId) {
		Parent fi = repository.getByUserId(userId);
		repository.delete(fi);
	}
	
}
