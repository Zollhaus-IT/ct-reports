package ch.zollhaus.adapter.mapping.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Permissions{

	@JsonProperty("startChat")
	private boolean startChat;

	@JsonProperty("useChat")
	private boolean useChat;

	public boolean isStartChat(){
		return startChat;
	}

	public boolean isUseChat(){
		return useChat;
	}
}