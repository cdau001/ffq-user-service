package edu.fiu.ffqr.service;

import java.util.List;

import edu.fiu.ffqr.models.Admin;
import edu.fiu.ffqr.repositories.AdminRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.fiu.ffqr.repositories.ResearcherParentRepository;
import edu.fiu.ffqr.models.ResearcherParent;

@Service
@Component
public class ResearcherParentService extends UserService<ResearcherParent, ResearcherParentRepository> {

	@Autowired
	public ResearcherParentService(ResearcherParentRepository repository) {
		this.repository = repository;
	}

	public List<ResearcherParent> getAll()	{
		return repository.findAll();
	}
	
	public ResearcherParent getParentByUsername(String username) {
		return repository.findByUsername(username);
	}
	
	public ResearcherParent getParentBy_id(ObjectId _id) {
		return repository.getUserBy_id(_id);
	}

	public ResearcherParent getParentByUserId(String userId) {
		return repository.getByUserId(userId);
	}

	public ResearcherParent getParentByAssignedclinic(String assignedResearcherOrg) {
		return repository.findByAssignedResearcherOrg(assignedResearcherOrg);
	}       
        
	
	public void delete(String userName) {
		ResearcherParent fi = repository.findByUsername(userName);
		repository.delete(fi);
	}

	public void deleteById(String userId) {
		ResearcherParent fi = repository.getByUserId(userId);
		repository.delete(fi);
	}
	
}
