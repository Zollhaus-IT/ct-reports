package ch.zollhaus.adapter.mapping.gmpr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataItem{

	@JsonProperty("isCheckedIn")
	private boolean isCheckedIn;

	@JsonProperty("dateFrom")
	private String dateFrom;

	@JsonProperty("dateTo")
	private String dateTo;

	@JsonProperty("member")
	private Member member;

	@JsonProperty("status")
	private String status;

	public boolean isIsCheckedIn(){
		return isCheckedIn;
	}

	public Member getMember(){
		return member;
	}

	public String getStatus(){
		return status;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}
}