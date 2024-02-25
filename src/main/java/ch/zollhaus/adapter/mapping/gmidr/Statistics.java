package ch.zollhaus.adapter.mapping.gmidr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Statistics{

	@JsonProperty("unsure")
	private int unsure;

	@JsonProperty("absent")
	private int absent;

	@JsonProperty("present")
	private int present;

	public int getUnsure(){
		return unsure;
	}

	public int getAbsent(){
		return absent;
	}

	public int getPresent(){
		return present;
	}
}