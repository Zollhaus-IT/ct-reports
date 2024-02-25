package ch.zollhaus.adapter.mapping.gmidpr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Member{

	@JsonProperty("followUpDiffDays")
	private Object followUpDiffDays;

	@JsonProperty("registeredBy")
	private Object registeredBy;

	@JsonProperty("followUpUnsuccessfulBackGroupId")
	private Object followUpUnsuccessfulBackGroupId;

	@JsonProperty("memberEndDate")
	private Object memberEndDate;

	@JsonProperty("followUpStep")
	private int followUpStep;

	@JsonProperty("groupTypeRoleId")
	private int groupTypeRoleId;

	@JsonProperty("memberStartDate")
	private String memberStartDate;

	@JsonProperty("person")
	private Person person;

	@JsonProperty("waitinglistPosition")
	private Object waitinglistPosition;

	@JsonProperty("personId")
	private int personId;

	@JsonProperty("comment")
	private String comment;

	@JsonProperty("groupMemberStatus")
	private String groupMemberStatus;

	@JsonProperty("group")
	private Group group;

	public Object getFollowUpDiffDays(){
		return followUpDiffDays;
	}

	public Object getRegisteredBy(){
		return registeredBy;
	}

	public Object getFollowUpUnsuccessfulBackGroupId(){
		return followUpUnsuccessfulBackGroupId;
	}

	public Object getMemberEndDate(){
		return memberEndDate;
	}

	public int getFollowUpStep(){
		return followUpStep;
	}

	public int getGroupTypeRoleId(){
		return groupTypeRoleId;
	}

	public String getMemberStartDate(){
		return memberStartDate;
	}

	public Person getPerson(){
		return person;
	}

	public Object getWaitinglistPosition(){
		return waitinglistPosition;
	}

	public int getPersonId(){
		return personId;
	}

	public String getComment(){
		return comment;
	}

	public String getGroupMemberStatus(){
		return groupMemberStatus;
	}

	public Group getGroup(){
		return group;
	}
}