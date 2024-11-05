package ch.zollhaus.adapter.mapping.persons;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DataItem{

	@JsonProperty("privacyPolicyAgreementWhoId")
	private int privacyPolicyAgreementWhoId;

	@JsonProperty("country")
	private String country;

	@JsonProperty("lastLogin")
	private Object lastLogin;

	@JsonProperty("phonePrivate")
	private String phonePrivate;

	@JsonProperty("postbox")
	private String postbox;

	@JsonProperty("Mitgliedschaft")
	private Object mitgliedschaft;

	@JsonProperty("dateOfBaptism")
	private Object dateOfBaptism;

	@JsonProperty("privacyPolicyAgreementTypeId")
	private int privacyPolicyAgreementTypeId;

	@JsonProperty("familyStatusId")
	private int familyStatusId;

	@JsonProperty("birthName")
	private String birthName;

	@JsonProperty("privacyPolicyAgreementDate")
	private String privacyPolicyAgreementDate;

	@JsonProperty("chatActive")
	private boolean chatActive;

	@JsonProperty("id")
	private int id;

	@JsonProperty("fax")
	private String fax;

	@JsonProperty("longitude")
	private Object longitude;

	@JsonProperty("securityLevelForPerson")
	private int securityLevelForPerson;

	@JsonProperty("zip")
	private String zip;

	@JsonProperty("placeOfBaptism")
	private String placeOfBaptism;

	@JsonProperty("sexId")
	private int sexId;

	@JsonProperty("nationalityId")
	private int nationalityId;

	@JsonProperty("growPathId")
	private Object growPathId;

	@JsonProperty("firstContact")
	private String firstContact;

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("phoneWork")
	private String phoneWork;

	@JsonProperty("birthplace")
	private String birthplace;

	@JsonProperty("statusId")
	private int statusId;

	@JsonProperty("meta")
	private Meta meta;

	@JsonProperty("guid")
	private String guid;

	@JsonProperty("job")
	private String job;

	@JsonProperty("cmsUserId")
	private String cmsUserId;

	@JsonProperty("invitationStatus")
	private String invitationStatus;

	@JsonProperty("birthday")
	private String birthday;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("privacyPolicyAgreement")
	private PrivacyPolicyAgreement privacyPolicyAgreement;

	@JsonProperty("city")
	private String city;

	@JsonProperty("isArchived")
	private boolean isArchived;

	@JsonProperty("latitude")
	private Object latitude;

	@JsonProperty("weddingDate")
	private Object weddingDate;

	@JsonProperty("departmentIds")
	private List<Integer> departmentIds;

	@JsonProperty("dateOfResign")
	private Object dateOfResign;

	@JsonProperty("title")
	private String title;

	@JsonProperty("emails")
	private List<Object> emails;

	@JsonProperty("dateOfBelonging")
	private Object dateOfBelonging;

	@JsonProperty("baptisedBy")
	private String baptisedBy;

	@JsonProperty("acceptedsecurity")
	private Object acceptedsecurity;

	@JsonProperty("referredTo")
	private String referredTo;

	@JsonProperty("addressAddition")
	private String addressAddition;

	@JsonProperty("street")
	private String street;

	@JsonProperty("imageUrl")
	private Object imageUrl;

	@JsonProperty("nickname")
	private String nickname;

	@JsonProperty("email")
	private String email;

	@JsonProperty("longitudeLoose")
	private Object longitudeLoose;

	@JsonProperty("mobile")
	private String mobile;

	@JsonProperty("campusId")
	private int campusId;

	@JsonProperty("url")
	private String url;

	@JsonProperty("email_business")
	private String emailBusiness;

	@JsonProperty("employer1")
	private String employer1;

	@JsonProperty("canChat")
	private boolean canChat;

	@JsonProperty("referredBy")
	private String referredBy;

	@JsonProperty("latitudeLoose")
	private Object latitudeLoose;

	@JsonProperty("familyImageUrl")
	private String familyImageUrl;

	@JsonProperty("optigemId")
	private String optigemId;

	@JsonProperty("editSecurityLevelForPerson")
	private int editSecurityLevelForPerson;

	public void setPrivacyPolicyAgreementWhoId(int privacyPolicyAgreementWhoId){
		this.privacyPolicyAgreementWhoId = privacyPolicyAgreementWhoId;
	}

	public int getPrivacyPolicyAgreementWhoId(){
		return privacyPolicyAgreementWhoId;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setLastLogin(Object lastLogin){
		this.lastLogin = lastLogin;
	}

	public Object getLastLogin(){
		return lastLogin;
	}

	public void setPhonePrivate(String phonePrivate){
		this.phonePrivate = phonePrivate;
	}

	public String getPhonePrivate(){
		return phonePrivate;
	}

	public void setPostbox(String postbox){
		this.postbox = postbox;
	}

	public String getPostbox(){
		return postbox;
	}

	public void setMitgliedschaft(Object mitgliedschaft){
		this.mitgliedschaft = mitgliedschaft;
	}

	public Object getMitgliedschaft(){
		return mitgliedschaft;
	}

	public void setDateOfBaptism(Object dateOfBaptism){
		this.dateOfBaptism = dateOfBaptism;
	}

	public Object getDateOfBaptism(){
		return dateOfBaptism;
	}

	public void setPrivacyPolicyAgreementTypeId(int privacyPolicyAgreementTypeId){
		this.privacyPolicyAgreementTypeId = privacyPolicyAgreementTypeId;
	}

	public int getPrivacyPolicyAgreementTypeId(){
		return privacyPolicyAgreementTypeId;
	}

	public void setFamilyStatusId(int familyStatusId){
		this.familyStatusId = familyStatusId;
	}

	public int getFamilyStatusId(){
		return familyStatusId;
	}

	public void setBirthName(String birthName){
		this.birthName = birthName;
	}

	public String getBirthName(){
		return birthName;
	}

	public void setPrivacyPolicyAgreementDate(String privacyPolicyAgreementDate){
		this.privacyPolicyAgreementDate = privacyPolicyAgreementDate;
	}

	public String getPrivacyPolicyAgreementDate(){
		return privacyPolicyAgreementDate;
	}

	public void setChatActive(boolean chatActive){
		this.chatActive = chatActive;
	}

	public boolean isChatActive(){
		return chatActive;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setFax(String fax){
		this.fax = fax;
	}

	public String getFax(){
		return fax;
	}

	public void setLongitude(Object longitude){
		this.longitude = longitude;
	}

	public Object getLongitude(){
		return longitude;
	}

	public void setSecurityLevelForPerson(int securityLevelForPerson){
		this.securityLevelForPerson = securityLevelForPerson;
	}

	public int getSecurityLevelForPerson(){
		return securityLevelForPerson;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return zip;
	}

	public void setPlaceOfBaptism(String placeOfBaptism){
		this.placeOfBaptism = placeOfBaptism;
	}

	public String getPlaceOfBaptism(){
		return placeOfBaptism;
	}

	public void setSexId(int sexId){
		this.sexId = sexId;
	}

	public int getSexId(){
		return sexId;
	}

	public void setNationalityId(int nationalityId){
		this.nationalityId = nationalityId;
	}

	public int getNationalityId(){
		return nationalityId;
	}

	public void setGrowPathId(Object growPathId){
		this.growPathId = growPathId;
	}

	public Object getGrowPathId(){
		return growPathId;
	}

	public void setFirstContact(String firstContact){
		this.firstContact = firstContact;
	}

	public String getFirstContact(){
		return firstContact;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setPhoneWork(String phoneWork){
		this.phoneWork = phoneWork;
	}

	public String getPhoneWork(){
		return phoneWork;
	}

	public void setBirthplace(String birthplace){
		this.birthplace = birthplace;
	}

	public String getBirthplace(){
		return birthplace;
	}

	public void setStatusId(int statusId){
		this.statusId = statusId;
	}

	public int getStatusId(){
		return statusId;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setGuid(String guid){
		this.guid = guid;
	}

	public String getGuid(){
		return guid;
	}

	public void setJob(String job){
		this.job = job;
	}

	public String getJob(){
		return job;
	}

	public void setCmsUserId(String cmsUserId){
		this.cmsUserId = cmsUserId;
	}

	public String getCmsUserId(){
		return cmsUserId;
	}

	public void setInvitationStatus(String invitationStatus){
		this.invitationStatus = invitationStatus;
	}

	public String getInvitationStatus(){
		return invitationStatus;
	}

	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	public String getBirthday(){
		return birthday;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setPrivacyPolicyAgreement(PrivacyPolicyAgreement privacyPolicyAgreement){
		this.privacyPolicyAgreement = privacyPolicyAgreement;
	}

	public PrivacyPolicyAgreement getPrivacyPolicyAgreement(){
		return privacyPolicyAgreement;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setIsArchived(boolean isArchived){
		this.isArchived = isArchived;
	}

	public boolean isIsArchived(){
		return isArchived;
	}

	public void setLatitude(Object latitude){
		this.latitude = latitude;
	}

	public Object getLatitude(){
		return latitude;
	}

	public void setWeddingDate(Object weddingDate){
		this.weddingDate = weddingDate;
	}

	public Object getWeddingDate(){
		return weddingDate;
	}

	public void setDepartmentIds(List<Integer> departmentIds){
		this.departmentIds = departmentIds;
	}

	public List<Integer> getDepartmentIds(){
		return departmentIds;
	}

	public void setDateOfResign(Object dateOfResign){
		this.dateOfResign = dateOfResign;
	}

	public Object getDateOfResign(){
		return dateOfResign;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setEmails(List<Object> emails){
		this.emails = emails;
	}

	public List<Object> getEmails(){
		return emails;
	}

	public void setDateOfBelonging(Object dateOfBelonging){
		this.dateOfBelonging = dateOfBelonging;
	}

	public Object getDateOfBelonging(){
		return dateOfBelonging;
	}

	public void setBaptisedBy(String baptisedBy){
		this.baptisedBy = baptisedBy;
	}

	public String getBaptisedBy(){
		return baptisedBy;
	}

	public void setAcceptedsecurity(Object acceptedsecurity){
		this.acceptedsecurity = acceptedsecurity;
	}

	public Object getAcceptedsecurity(){
		return acceptedsecurity;
	}

	public void setReferredTo(String referredTo){
		this.referredTo = referredTo;
	}

	public String getReferredTo(){
		return referredTo;
	}

	public void setAddressAddition(String addressAddition){
		this.addressAddition = addressAddition;
	}

	public String getAddressAddition(){
		return addressAddition;
	}

	public void setStreet(String street){
		this.street = street;
	}

	public String getStreet(){
		return street;
	}

	public void setImageUrl(Object imageUrl){
		this.imageUrl = imageUrl;
	}

	public Object getImageUrl(){
		return imageUrl;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getNickname(){
		return nickname;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setLongitudeLoose(Object longitudeLoose){
		this.longitudeLoose = longitudeLoose;
	}

	public Object getLongitudeLoose(){
		return longitudeLoose;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	public String getMobile(){
		return mobile;
	}

	public void setCampusId(int campusId){
		this.campusId = campusId;
	}

	public int getCampusId(){
		return campusId;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setEmailBusiness(String emailBusiness){
		this.emailBusiness = emailBusiness;
	}

	public String getEmailBusiness(){
		return emailBusiness;
	}

	public void setEmployer1(String employer1){
		this.employer1 = employer1;
	}

	public String getEmployer1(){
		return employer1;
	}

	public void setCanChat(boolean canChat){
		this.canChat = canChat;
	}

	public boolean isCanChat(){
		return canChat;
	}

	public void setReferredBy(String referredBy){
		this.referredBy = referredBy;
	}

	public String getReferredBy(){
		return referredBy;
	}

	public void setLatitudeLoose(Object latitudeLoose){
		this.latitudeLoose = latitudeLoose;
	}

	public Object getLatitudeLoose(){
		return latitudeLoose;
	}

	public void setFamilyImageUrl(String familyImageUrl){
		this.familyImageUrl = familyImageUrl;
	}

	public String getFamilyImageUrl(){
		return familyImageUrl;
	}

	public void setOptigemId(String optigemId){
		this.optigemId = optigemId;
	}

	public String getOptigemId(){
		return optigemId;
	}

	public void setEditSecurityLevelForPerson(int editSecurityLevelForPerson){
		this.editSecurityLevelForPerson = editSecurityLevelForPerson;
	}

	public int getEditSecurityLevelForPerson(){
		return editSecurityLevelForPerson;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"privacyPolicyAgreementWhoId = '" + privacyPolicyAgreementWhoId + '\'' + 
			",country = '" + country + '\'' + 
			",lastLogin = '" + lastLogin + '\'' + 
			",phonePrivate = '" + phonePrivate + '\'' + 
			",postbox = '" + postbox + '\'' + 
			",mitgliedschaft = '" + mitgliedschaft + '\'' + 
			",dateOfBaptism = '" + dateOfBaptism + '\'' + 
			",privacyPolicyAgreementTypeId = '" + privacyPolicyAgreementTypeId + '\'' + 
			",familyStatusId = '" + familyStatusId + '\'' + 
			",birthName = '" + birthName + '\'' + 
			",privacyPolicyAgreementDate = '" + privacyPolicyAgreementDate + '\'' + 
			",chatActive = '" + chatActive + '\'' + 
			",id = '" + id + '\'' + 
			",fax = '" + fax + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",securityLevelForPerson = '" + securityLevelForPerson + '\'' + 
			",zip = '" + zip + '\'' + 
			",placeOfBaptism = '" + placeOfBaptism + '\'' + 
			",sexId = '" + sexId + '\'' + 
			",nationalityId = '" + nationalityId + '\'' + 
			",growPathId = '" + growPathId + '\'' + 
			",firstContact = '" + firstContact + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",phoneWork = '" + phoneWork + '\'' + 
			",birthplace = '" + birthplace + '\'' + 
			",statusId = '" + statusId + '\'' + 
			",meta = '" + meta + '\'' + 
			",guid = '" + guid + '\'' + 
			",job = '" + job + '\'' + 
			",cmsUserId = '" + cmsUserId + '\'' + 
			",invitationStatus = '" + invitationStatus + '\'' + 
			",birthday = '" + birthday + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",privacyPolicyAgreement = '" + privacyPolicyAgreement + '\'' + 
			",city = '" + city + '\'' + 
			",isArchived = '" + isArchived + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",weddingDate = '" + weddingDate + '\'' + 
			",departmentIds = '" + departmentIds + '\'' + 
			",dateOfResign = '" + dateOfResign + '\'' + 
			",title = '" + title + '\'' + 
			",emails = '" + emails + '\'' + 
			",dateOfBelonging = '" + dateOfBelonging + '\'' + 
			",baptisedBy = '" + baptisedBy + '\'' + 
			",acceptedsecurity = '" + acceptedsecurity + '\'' + 
			",referredTo = '" + referredTo + '\'' + 
			",addressAddition = '" + addressAddition + '\'' + 
			",street = '" + street + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",nickname = '" + nickname + '\'' + 
			",email = '" + email + '\'' + 
			",longitudeLoose = '" + longitudeLoose + '\'' + 
			",mobile = '" + mobile + '\'' + 
			",campusId = '" + campusId + '\'' + 
			",url = '" + url + '\'' + 
			",email_business = '" + emailBusiness + '\'' + 
			",employer1 = '" + employer1 + '\'' + 
			",canChat = '" + canChat + '\'' + 
			",referredBy = '" + referredBy + '\'' + 
			",latitudeLoose = '" + latitudeLoose + '\'' + 
			",familyImageUrl = '" + familyImageUrl + '\'' + 
			",optigemId = '" + optigemId + '\'' + 
			",editSecurityLevelForPerson = '" + editSecurityLevelForPerson + '\'' + 
			"}";
		}
}