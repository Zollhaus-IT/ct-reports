package ch.zollhaus.adapter.mapping.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FollowUp{

	@JsonProperty("targetObjectId")
	private Object targetObjectId;

	@JsonProperty("targetTypeId")
	private int targetTypeId;

	@JsonProperty("targetGroupMemberStatusId")
	private Object targetGroupMemberStatusId;

	@JsonProperty("typeId")
	private Object typeId;

	@JsonProperty("sendReminderMails")
	private boolean sendReminderMails;

	public Object getTargetObjectId(){
		return targetObjectId;
	}

	public int getTargetTypeId(){
		return targetTypeId;
	}

	public Object getTargetGroupMemberStatusId(){
		return targetGroupMemberStatusId;
	}

	public Object getTypeId(){
		return typeId;
	}

	public boolean isSendReminderMails(){
		return sendReminderMails;
	}
}