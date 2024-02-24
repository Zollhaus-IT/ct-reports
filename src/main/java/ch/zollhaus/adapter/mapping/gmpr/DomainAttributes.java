package ch.zollhaus.adapter.mapping.gmpr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DomainAttributes{

	@JsonProperty("note")
	private String note;

	@JsonProperty("campusId")
	private Object campusId;

	@JsonProperty("groupStatusId")
	private int groupStatusId;

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("guid")
	private String guid;

	public String getNote(){
		return note;
	}

	public Object getCampusId(){
		return campusId;
	}

	public int getGroupStatusId(){
		return groupStatusId;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public String getGuid(){
		return guid;
	}
}