package ch.zollhaus.adapter.mapping.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination{

	@JsonProperty("total")
	private int total;

	@JsonProperty("current")
	private int current;

	@JsonProperty("lastPage")
	private int lastPage;

	@JsonProperty("limit")
	private int limit;

	public int getTotal(){
		return total;
	}

	public int getCurrent(){
		return current;
	}

	public int getLastPage(){
		return lastPage;
	}

	public int getLimit(){
		return limit;
	}
}