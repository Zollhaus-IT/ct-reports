package ch.zollhaus.adapter.mapping.gmidr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModifiedPerson{

	@JsonProperty("id")
	private int id;

	public int getId(){
		return id;
	}
}