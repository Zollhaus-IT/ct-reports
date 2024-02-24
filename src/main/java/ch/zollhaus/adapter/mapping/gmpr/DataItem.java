package ch.zollhaus.adapter.mapping.gmpr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataItem{

	@JsonProperty("isCheckedIn")
	private boolean isCheckedIn;

	@JsonProperty("member")
	private Member member;

	@JsonProperty("status")
	private String status;

	public boolean isIsCheckedIn(){
		return isCheckedIn;
	}

	public Member getMember(){
		return member;
	}

	public String getStatus(){
		return status;
	}
}