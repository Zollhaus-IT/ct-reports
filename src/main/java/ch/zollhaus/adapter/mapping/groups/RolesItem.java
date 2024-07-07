package ch.zollhaus.adapter.mapping.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RolesItem{

	@JsonProperty("countsTowardsSeats")
	private boolean countsTowardsSeats;

	@JsonProperty("isLeader")
	private boolean isLeader;

	@JsonProperty("canWriteChat")
	private boolean canWriteChat;

	@JsonProperty("groupTypeId")
	private int groupTypeId;

	@JsonProperty("groupTypeRoleId")
	private int groupTypeRoleId;

	@JsonProperty("type")
	private String type;

	@JsonProperty("isActive")
	private boolean isActive;

	@JsonProperty("growPathId")
	private Object growPathId;

	@JsonProperty("isHidden")
	private boolean isHidden;

	@JsonProperty("isDefault")
	private boolean isDefault;

	@JsonProperty("sortKey")
	private int sortKey;

	@JsonProperty("forceTwoFactorAuth")
	private boolean forceTwoFactorAuth;

	@JsonProperty("shorty")
	private String shorty;

	@JsonProperty("receiveQRCode")
	private boolean receiveQRCode;

	@JsonProperty("canReadChat")
	private boolean canReadChat;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("nameTranslated")
	private String nameTranslated;

	public boolean isCountsTowardsSeats(){
		return countsTowardsSeats;
	}

	public boolean isIsLeader(){
		return isLeader;
	}

	public boolean isCanWriteChat(){
		return canWriteChat;
	}

	public int getGroupTypeId(){
		return groupTypeId;
	}

	public int getGroupTypeRoleId(){
		return groupTypeRoleId;
	}

	public String getType(){
		return type;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public Object getGrowPathId(){
		return growPathId;
	}

	public boolean isIsHidden(){
		return isHidden;
	}

	public boolean isIsDefault(){
		return isDefault;
	}

	public int getSortKey(){
		return sortKey;
	}

	public boolean isForceTwoFactorAuth(){
		return forceTwoFactorAuth;
	}

	public String getShorty(){
		return shorty;
	}

	public boolean isReceiveQRCode(){
		return receiveQRCode;
	}

	public boolean isCanReadChat(){
		return canReadChat;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getNameTranslated(){
		return nameTranslated;
	}
}