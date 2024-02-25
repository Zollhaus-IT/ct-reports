package ch.zollhaus.adapter.mapping.gmidr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta{

	@JsonProperty("modifiedDate")
	private String modifiedDate;

	@JsonProperty("modifiedPerson")
	private ModifiedPerson modifiedPerson;

	public String getModifiedDate(){
		return modifiedDate;
	}

	public ModifiedPerson getModifiedPerson(){
		return modifiedPerson;
	}
}