package ch.zollhaus.adapter.mapping.groups;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DataItem{

	@JsonProperty("settings")
	private Settings settings;

	@JsonProperty("followUp")
	private FollowUp followUp;

	@JsonProperty("permissions")
	private Permissions permissions;

	@JsonProperty("roles")
	private List<RolesItem> roles;

	@JsonProperty("name")
	private String name;

	@JsonProperty("modifiedDate")
	private String modifiedDate;

	@JsonProperty("guid")
	private String guid;

	@JsonProperty("information")
	private Information information;

	@JsonProperty("id")
	private int id;

	@JsonProperty("modifiedPerson")
	private ModifiedPerson modifiedPerson;

	@JsonProperty("securityLevelForGroup")
	private int securityLevelForGroup;

	public Settings getSettings(){
		return settings;
	}

	public FollowUp getFollowUp(){
		return followUp;
	}

	public Permissions getPermissions(){
		return permissions;
	}

	public List<RolesItem> getRoles(){
		return roles;
	}

	public String getName(){
		return name;
	}

	public String getModifiedDate(){
		return modifiedDate;
	}

	public String getGuid(){
		return guid;
	}

	public Information getInformation(){
		return information;
	}

	public int getId(){
		return id;
	}

	public ModifiedPerson getModifiedPerson(){
		return modifiedPerson;
	}

	public int getSecurityLevelForGroup(){
		return securityLevelForGroup;
	}
}