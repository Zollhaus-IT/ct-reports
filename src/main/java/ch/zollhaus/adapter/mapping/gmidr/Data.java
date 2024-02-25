package ch.zollhaus.adapter.mapping.gmidr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data{

	@JsonProperty("numGuests")
	private int numGuests;

	@JsonProperty("isCanceled")
	private boolean isCanceled;

	@JsonProperty("meta")
	private Meta meta;

	@JsonProperty("groupId")
	private int groupId;

	@JsonProperty("dateTo")
	private String dateTo;

	@JsonProperty("comment")
	private String comment;

	@JsonProperty("id")
	private int id;

	@JsonProperty("dateFrom")
	private String dateFrom;

	@JsonProperty("hasEditingStarted")
	private boolean hasEditingStarted;

	@JsonProperty("pollResult")
	private Object pollResult;

	@JsonProperty("isCompleted")
	private boolean isCompleted;

	@JsonProperty("statistics")
	private Statistics statistics;

	public int getNumGuests(){
		return numGuests;
	}

	public boolean isIsCanceled(){
		return isCanceled;
	}

	public Meta getMeta(){
		return meta;
	}

	public int getGroupId(){
		return groupId;
	}

	public String getDateTo(){
		return dateTo;
	}

	public String getComment(){
		return comment;
	}

	public int getId(){
		return id;
	}

	public String getDateFrom(){
		return dateFrom;
	}

	public boolean isHasEditingStarted(){
		return hasEditingStarted;
	}

	public Object getPollResult(){
		return pollResult;
	}

	public boolean isIsCompleted(){
		return isCompleted;
	}

	public Statistics getStatistics(){
		return statistics;
	}
}