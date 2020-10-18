package edu.fiu.ffqr.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import edu.fiu.ffqr.models.ResearcherParent;
import edu.fiu.ffqr.models.Clinician;

@Repository
public interface ResearcherParentRepository extends MongoRepository<ResearcherParent, String> {

    ResearcherParent getUserBy_id(ObjectId _id);

    ResearcherParent getByUserId(String userId);
	
    ResearcherParent findByUsername(String username);

    ResearcherParent findByAssignedResearcherOrg(String assignedResearcherOrg);   
   
    
}