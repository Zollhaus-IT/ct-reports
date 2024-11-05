package ch.zollhaus.adapter.mapping.persons;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrivacyPolicyAgreement{

	@JsonProperty("date")
	private String date;

	@JsonProperty("whoId")
	private int whoId;

	@JsonProperty("typeId")
	private int typeId;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setWhoId(int whoId){
		this.whoId = whoId;
	}

	public int getWhoId(){
		return whoId;
	}

	public void setTypeId(int typeId){
		this.typeId = typeId;
	}

	public int getTypeId(){
		return typeId;
	}

	@Override
 	public String toString(){
		return 
			"PrivacyPolicyAgreement{" + 
			"date = '" + date + '\'' + 
			",whoId = '" + whoId + '\'' + 
			",typeId = '" + typeId + '\'' + 
			"}";
		}
}