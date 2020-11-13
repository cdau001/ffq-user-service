package edu.fiu.ffqr.repositories;

import org.springframework.stereotype.Repository;

import edu.fiu.ffqr.models.Parent;

@Repository
<<<<<<< HEAD
public interface ParentRepository extends MongoRepository<Parent, String> {

    Parent getUserBy_id(ObjectId _id);

    Parent getByUserId(String userId);
	
    Parent findByUsername(String username);

    Parent findByAssignedclinic(String assignedclinic);   
   
    
}
=======
public interface ParentRepository extends UserRepository<Parent> {
}
>>>>>>> 4990bc9ca318afa4ac900a716dd6ba3896b98de8
