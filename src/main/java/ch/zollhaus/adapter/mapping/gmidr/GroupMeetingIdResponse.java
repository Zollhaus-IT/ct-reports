package ch.zollhaus.adapter.mapping.gmidr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupMeetingIdResponse{

	@JsonProperty("data")
	private Data data;

	public Data getData(){
		return data;
	}
}