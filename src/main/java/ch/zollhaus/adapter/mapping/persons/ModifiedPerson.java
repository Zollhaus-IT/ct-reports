package ch.zollhaus.adapter.mapping.persons;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModifiedPerson{

	@JsonProperty("id")
	private int id;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"ModifiedPerson{" + 
			"id = '" + id + '\'' + 
			"}";
		}
}