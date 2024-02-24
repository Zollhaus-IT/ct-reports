package ch.zollhaus.adapter.mapping.gmpr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta{

	@JsonProperty("totalCheckedIn")
	private int totalCheckedIn;

	@JsonProperty("count")
	private int count;

	public int getTotalCheckedIn(){
		return totalCheckedIn;
	}

	public int getCount(){
		return count;
	}
}