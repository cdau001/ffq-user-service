package edu.fiu.ffqr.service;

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

}
