package ch.zollhaus.adapter.mapping.groups;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupsResponse{

	@JsonProperty("data")
	private List<DataItem> data;

	@JsonProperty("meta")
	private Meta meta;

	public List<DataItem> getData(){
		return data;
	}

	public Meta getMeta(){
		return meta;
	}
}