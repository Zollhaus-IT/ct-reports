package ch.zollhaus.adapter.mapping.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewMember{

	@JsonProperty("statusId")
	private Object statusId;

	@JsonProperty("departmentId")
	private Object departmentId;

	@JsonProperty("campusId")
	private Object campusId;

	public Object getStatusId(){
		return statusId;
	}

	public Object getDepartmentId(){
		return departmentId;
	}

	public Object getCampusId(){
		return campusId;
	}
}