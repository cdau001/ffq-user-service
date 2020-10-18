package edu.fiu.ffqr.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import edu.fiu.ffqr.models.Clinician;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="researcher_parents")
public class ResearcherParent extends User implements Serializable{

    @Id
    private ObjectId _id;
    @JsonProperty("userId")
    private String userId; 
    @JsonProperty("username")
    private String username;
    @JsonProperty("usertype")
    private String usertype;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("assignedResearcherOrg")
    private String assignedResearcherOrg;
    @JsonProperty("assignedResearcherUser")
    private String assignedResearcherUser;    
    @JsonProperty("childrennames")
    private ArrayList<String> childrennames = new ArrayList<String>();
    @JsonProperty("isactive")
    private boolean isactive;

	public ResearcherParent() {}
	
    public ResearcherParent(String userId, String username, String userpassword, String usertype, 
            String firstname, String lastname, String assignedResearcherOrg,
            String assignedResearcherUser, ArrayList<String> childrennames, boolean isactive){
        this.userId = userId;
		this.username = username;
        this.userpassword = userpassword;
        this.usertype = usertype;
        this.firstname = firstname;
        this.lastname = lastname;
        this.assignedResearcherOrg = assignedResearcherOrg;
        this.assignedResearcherUser = assignedResearcherUser;
        this.childrennames = childrennames;
        this.isactive = isactive;
       

    }


    public ObjectId getId() {
        return this._id;
    }
	/*public void setId(ObjectId id) {
        this._id = id;
    }*/
	
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
    }

    public String getUsertype(){
        return this.usertype;
    }
    public void setUsertype(String usertype){
        this.usertype = usertype;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    

    public String getAssignedResearcherOrg() {
        return this.assignedResearcherOrg;
    }
    public void setAssignedResearcherOrg(String assignedResearcherOrg) {
        this.assignedResearcherOrg = assignedResearcherOrg;
            
    }

    public String getAssignedResearcherUser() {
        return this.assignedResearcherUser;
    }
    public void setAssignedResearcherUser(String assignedResearcherUser) {
        this.assignedResearcherUser = assignedResearcherUser;
            
    }

    public void setUsername(String username) {
            this.username = username;
    }

    public ArrayList<String> getChildrennames() {
        return this.childrennames;
    }

    public void setChildrennames(ArrayList<String> childrennames) {
        this.childrennames = childrennames;
    }

    public void setIsactive(boolean isactive){
        this.isactive = isactive;
    }

    public boolean getIsactive(){
        return this.isactive;
    }


}
