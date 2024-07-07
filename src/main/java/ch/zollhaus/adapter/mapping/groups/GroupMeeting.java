package ch.zollhaus.adapter.mapping.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupMeeting{

	@JsonProperty("autoCreate")
	private boolean autoCreate;

	@JsonProperty("templateId")
	private Object templateId;

	public boolean isAutoCreate(){
		return autoCreate;
	}

	public Object getTemplateId(){
		return templateId;
	}
}