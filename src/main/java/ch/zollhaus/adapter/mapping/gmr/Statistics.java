package ch.zollhaus.adapter.mapping.gmr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Statistics{

	@JsonProperty("notCompleted")
	private int notCompleted;

	@JsonProperty("canceled")
	private int canceled;

	@JsonProperty("total")
	private int total;

	@JsonProperty("notCompletedAndNotCanceledAndInPast")
	private int notCompletedAndNotCanceledAndInPast;

	@JsonProperty("notCompletedAndNotCanceledAndInFuture")
	private int notCompletedAndNotCanceledAndInFuture;

	@JsonProperty("completed")
	private int completed;

	@JsonProperty("notCanceled")
	private int notCanceled;

	@JsonProperty("completedAndNotCanceled")
	private int completedAndNotCanceled;

	@JsonProperty("unsure")
	private int unsure;

	@JsonProperty("absent")
	private int absent;

	@JsonProperty("present")
	private int present;

	public int getNotCompleted(){
		return notCompleted;
	}

	public int getCanceled(){
		return canceled;
	}

	public int getTotal(){
		return total;
	}

	public int getNotCompletedAndNotCanceledAndInPast(){
		return notCompletedAndNotCanceledAndInPast;
	}

	public int getNotCompletedAndNotCanceledAndInFuture(){
		return notCompletedAndNotCanceledAndInFuture;
	}

	public int getCompleted(){
		return completed;
	}

	public int getNotCanceled(){
		return notCanceled;
	}

	public int getCompletedAndNotCanceled(){
		return completedAndNotCanceled;
	}

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