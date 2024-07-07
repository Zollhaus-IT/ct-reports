package ch.zollhaus.adapter.mapping.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Settings{

	@JsonProperty("allowChildRegistration")
	private boolean allowChildRegistration;

	@JsonProperty("allowSameEmailRegistration")
	private boolean allowSameEmailRegistration;

	@JsonProperty("defaultPostVisibility")
	private String defaultPostVisibility;

	@JsonProperty("dynamicGroupStatus")
	private Object dynamicGroupStatus;

	@JsonProperty("qrCodeCheckinAutomaticEmail")
	private boolean qrCodeCheckinAutomaticEmail;

	@JsonProperty("dynamicGroupUpdateFinished")
	private Object dynamicGroupUpdateFinished;

	@JsonProperty("allowWaitinglist")
	private boolean allowWaitinglist;

	@JsonProperty("autoAccept")
	private boolean autoAccept;

	@JsonProperty("defaultPostPlaceholderText")
	private Object defaultPostPlaceholderText;

	@JsonProperty("isOpenForMembers")
	private boolean isOpenForMembers;

	@JsonProperty("isPublic")
	private boolean isPublic;

	@JsonProperty("informLeader")
	private boolean informLeader;

	@JsonProperty("allowOtherRegistration")
	private boolean allowOtherRegistration;

	@JsonProperty("dynamicGroupUpdateStarted")
	private Object dynamicGroupUpdateStarted;

	@JsonProperty("waitinglistMaxPersons")
	private Object waitinglistMaxPersons;

	@JsonProperty("visibility")
	private String visibility;

	@JsonProperty("defaultPostNotificationScope")
	private Object defaultPostNotificationScope;

	@JsonProperty("inStatistic")
	private boolean inStatistic;

	@JsonProperty("automaticMoveUp")
	private boolean automaticMoveUp;

	@JsonProperty("groupMeeting")
	private GroupMeeting groupMeeting;

	@JsonProperty("isHidden")
	private boolean isHidden;

	@JsonProperty("newMember")
	private NewMember newMember;

	@JsonProperty("qrCodeCheckin")
	private boolean qrCodeCheckin;

	@JsonProperty("allowSpouseRegistration")
	private boolean allowSpouseRegistration;

	@JsonProperty("signUpHeadline")
	private Object signUpHeadline;

	@JsonProperty("defaultPostCommentsActive")
	private boolean defaultPostCommentsActive;

	@JsonProperty("postsEnabled")
	private boolean postsEnabled;

	@JsonProperty("dynamicGroupRuleSet")
	private Object dynamicGroupRuleSet;

	public boolean isAllowChildRegistration(){
		return allowChildRegistration;
	}

	public boolean isAllowSameEmailRegistration(){
		return allowSameEmailRegistration;
	}

	public String getDefaultPostVisibility(){
		return defaultPostVisibility;
	}

	public Object getDynamicGroupStatus(){
		return dynamicGroupStatus;
	}

	public boolean isQrCodeCheckinAutomaticEmail(){
		return qrCodeCheckinAutomaticEmail;
	}

	public Object getDynamicGroupUpdateFinished(){
		return dynamicGroupUpdateFinished;
	}

	public boolean isAllowWaitinglist(){
		return allowWaitinglist;
	}

	public boolean isAutoAccept(){
		return autoAccept;
	}

	public Object getDefaultPostPlaceholderText(){
		return defaultPostPlaceholderText;
	}

	public boolean isIsOpenForMembers(){
		return isOpenForMembers;
	}

	public boolean isIsPublic(){
		return isPublic;
	}

	public boolean isInformLeader(){
		return informLeader;
	}

	public boolean isAllowOtherRegistration(){
		return allowOtherRegistration;
	}

	public Object getDynamicGroupUpdateStarted(){
		return dynamicGroupUpdateStarted;
	}

	public Object getWaitinglistMaxPersons(){
		return waitinglistMaxPersons;
	}

	public String getVisibility(){
		return visibility;
	}

	public Object getDefaultPostNotificationScope(){
		return defaultPostNotificationScope;
	}

	public boolean isInStatistic(){
		return inStatistic;
	}

	public boolean isAutomaticMoveUp(){
		return automaticMoveUp;
	}

	public GroupMeeting getGroupMeeting(){
		return groupMeeting;
	}

	public boolean isIsHidden(){
		return isHidden;
	}

	public NewMember getNewMember(){
		return newMember;
	}

	public boolean isQrCodeCheckin(){
		return qrCodeCheckin;
	}

	public boolean isAllowSpouseRegistration(){
		return allowSpouseRegistration;
	}

	public Object getSignUpHeadline(){
		return signUpHeadline;
	}

	public boolean isDefaultPostCommentsActive(){
		return defaultPostCommentsActive;
	}

	public boolean isPostsEnabled(){
		return postsEnabled;
	}

	public Object getDynamicGroupRuleSet(){
		return dynamicGroupRuleSet;
	}
}