package ch.zollhaus.adapter.mapping.gmr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta{

	@JsonProperty("next")
	private Object next;

	@JsonProperty("previous")
	private String previous;

	@JsonProperty("count")
	private int count;

	@JsonProperty("statistics")
	private Statistics statistics;

	@JsonProperty("modifiedDate")
	private String modifiedDate;

	@JsonProperty("modifiedPerson")
	private ModifiedPerson modifiedPerson;

	public Object getNext(){
		return next;
	}

	public String getPrevious(){
		return previous;
	}

	public int getCount(){
		return count;
	}

	public Statistics getStatistics(){
		return statistics;
	}

	public String getModifiedDate(){
		return modifiedDate;
	}

	public ModifiedPerson getModifiedPerson(){
		return modifiedPerson;
	}
}