package ch.zollhaus.adapter.mapping.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta{

	@JsonProperty("all")
	private int all;

	@JsonProperty("pagination")
	private Pagination pagination;

	@JsonProperty("count")
	private int count;

	public int getAll(){
		return all;
	}

	public Pagination getPagination(){
		return pagination;
	}

	public int getCount(){
		return count;
	}
}