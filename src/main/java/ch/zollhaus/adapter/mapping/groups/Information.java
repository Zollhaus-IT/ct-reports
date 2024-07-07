package ch.zollhaus.adapter.mapping.groups;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Information{

	@JsonProperty("note")
	private String note;

	@JsonProperty("chatStatus")
	private String chatStatus;

	@JsonProperty("ageGroupIds")
	private List<Object> ageGroupIds;

	@JsonProperty("color")
	private String color;

	@JsonProperty("endDate")
	private Object endDate;

	@JsonProperty("groupTypeId")
	private int groupTypeId;

	@JsonProperty("weekday")
	private Object weekday;

	@JsonProperty("campusId")
	private Object campusId;

	@JsonProperty("groupHomepageUrl")
	private Object groupHomepageUrl;

	@JsonProperty("groupCategoryId")
	private Object groupCategoryId;

	@JsonProperty("meetingTime")
	private String meetingTime;

	@JsonProperty("dateOfFoundation")
	private Object dateOfFoundation;

	@JsonProperty("maxMembers")
	private Object maxMembers;

	@JsonProperty("imageUrl")
	private String imageUrl;

	@JsonProperty("signUpOverrideRoleId")
	private int signUpOverrideRoleId;

	@JsonProperty("targetGroupId")
	private Object targetGroupId;

	@JsonProperty("groupStatusId")
	private int groupStatusId;

	public String getNote(){
		return note;
	}

	public String getChatStatus(){
		return chatStatus;
	}

	public List<Object> getAgeGroupIds(){
		return ageGroupIds;
	}

	public String getColor(){
		return color;
	}

	public Object getEndDate(){
		return endDate;
	}

	public int getGroupTypeId(){
		return groupTypeId;
	}

	public Object getWeekday(){
		return weekday;
	}

	public Object getCampusId(){
		return campusId;
	}

	public Object getGroupHomepageUrl(){
		return groupHomepageUrl;
	}

	public Object getGroupCategoryId(){
		return groupCategoryId;
	}

	public String getMeetingTime(){
		return meetingTime;
	}

	public Object getDateOfFoundation(){
		return dateOfFoundation;
	}

	public Object getMaxMembers(){
		return maxMembers;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public int getSignUpOverrideRoleId(){
		return signUpOverrideRoleId;
	}

	public Object getTargetGroupId(){
		return targetGroupId;
	}

	public int getGroupStatusId(){
		return groupStatusId;
	}
}