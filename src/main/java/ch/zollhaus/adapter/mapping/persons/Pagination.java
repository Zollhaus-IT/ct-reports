package ch.zollhaus.adapter.mapping.persons;

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

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setCurrent(int current){
		this.current = current;
	}

	public int getCurrent(){
		return current;
	}

	public void setLastPage(int lastPage){
		this.lastPage = lastPage;
	}

	public int getLastPage(){
		return lastPage;
	}

	public void setLimit(int limit){
		this.limit = limit;
	}

	public int getLimit(){
		return limit;
	}

	@Override
 	public String toString(){
		return 
			"Pagination{" + 
			"total = '" + total + '\'' + 
			",current = '" + current + '\'' + 
			",lastPage = '" + lastPage + '\'' + 
			",limit = '" + limit + '\'' + 
			"}";
		}
}