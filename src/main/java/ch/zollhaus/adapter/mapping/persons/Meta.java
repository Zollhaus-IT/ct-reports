package ch.zollhaus.adapter.mapping.persons;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta{

	@JsonProperty("pagination")
	private Pagination pagination;

	@JsonProperty("count")
	private int count;

	@JsonProperty("createdDate")
	private String createdDate;

	@JsonProperty("modifiedDate")
	private String modifiedDate;

	@JsonProperty("createdPerson")
	private CreatedPerson createdPerson;

	@JsonProperty("modifiedPerson")
	private ModifiedPerson modifiedPerson;

	public void setPagination(Pagination pagination){
		this.pagination = pagination;
	}

	public Pagination getPagination(){
		return pagination;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setModifiedDate(String modifiedDate){
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedDate(){
		return modifiedDate;
	}

	public void setCreatedPerson(CreatedPerson createdPerson){
		this.createdPerson = createdPerson;
	}

	public CreatedPerson getCreatedPerson(){
		return createdPerson;
	}

	public void setModifiedPerson(ModifiedPerson modifiedPerson){
		this.modifiedPerson = modifiedPerson;
	}

	public ModifiedPerson getModifiedPerson(){
		return modifiedPerson;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"pagination = '" + pagination + '\'' + 
			",count = '" + count + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",modifiedDate = '" + modifiedDate + '\'' + 
			",createdPerson = '" + createdPerson + '\'' + 
			",modifiedPerson = '" + modifiedPerson + '\'' + 
			"}";
		}
}