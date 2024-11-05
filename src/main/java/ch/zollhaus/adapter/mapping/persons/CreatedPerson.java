package ch.zollhaus.adapter.mapping.persons;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatedPerson{

	@JsonProperty("id")
	private Object id;

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"CreatedPerson{" + 
			"id = '" + id + '\'' + 
			"}";
		}
}