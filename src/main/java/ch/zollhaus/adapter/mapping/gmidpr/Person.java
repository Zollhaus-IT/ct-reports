package ch.zollhaus.adapter.mapping.gmidpr;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Person{

	@JsonProperty("domainIdentifier")
	private String domainIdentifier;

	@JsonProperty("apiUrl")
	private String apiUrl;

	@JsonProperty("domainType")
	private String domainType;

	@JsonProperty("frontendUrl")
	private String frontendUrl;

	@JsonProperty("imageUrl")
	private String imageUrl;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("domainAttributes")
	private DomainAttributes domainAttributes;

	@JsonProperty("title")
	private String title;

	@JsonProperty("infos")
	private List<Object> infos;

	public String getDomainIdentifier(){
		return domainIdentifier;
	}

	public String getApiUrl(){
		return apiUrl;
	}

	public String getDomainType(){
		return domainType;
	}

	public String getFrontendUrl(){
		return frontendUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public String getIcon(){
		return icon;
	}

	public DomainAttributes getDomainAttributes(){
		return domainAttributes;
	}

	public String getTitle(){
		return title;
	}

	public List<Object> getInfos(){
		return infos;
	}
}