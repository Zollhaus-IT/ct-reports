package ch.zollhaus.domain.groups;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "persons")
public class Person {

   @Id
   @GeneratedValue(strategy = SEQUENCE, generator = "CUST_SEQ")
   private Long id;
   private String ctPersonId;
   private String ctFirstName;
   private String ctLastName;

   public String getCtLastName() {
      return ctLastName;
   }

   public void setCtLastName(String ctLastName) {
      this.ctLastName = ctLastName;
   }

   private String ctBirthday;

   public String getCtBirthday() {
      return ctBirthday;
   }

   public void setCtBirthday(String ctBirthday) {
      this.ctBirthday = ctBirthday;
   }

   public String getCtStreet() {
      return ctStreet;
   }

   public void setCtStreet(String ctStreet) {
      this.ctStreet = ctStreet;
   }

   public String getCtStreetAddititon() {
      return ctStreetAddititon;
   }

   public void setCtStreetAddititon(String ctStreetAddititon) {
      this.ctStreetAddititon = ctStreetAddititon;
   }

   public String getCtZip() {
      return ctZip;
   }

   public void setCtZip(String ctZip) {
      this.ctZip = ctZip;
   }

   public String getCtCity() {
      return ctCity;
   }

   public void setCtCity(String ctCity) {
      this.ctCity = ctCity;
   }

   public String getCtCountry() {
      return ctCountry;
   }

   public void setCtCountry(String ctCountry) {
      this.ctCountry = ctCountry;
   }

   public Integer getCtSexId() {
      return ctSexId;
   }

   public void setCtSexId(Integer ctSexId) {
      this.ctSexId = ctSexId;
   }

   private String ctStreet;
   private String ctStreetAddititon;
   private String ctZip;
   private String ctCity;
   private String ctCountry;
   private Integer ctSexId;

   public Person() {

   }

   public Person(String ctPersonId, String ctFirstName, String ctLastName, String ctBirthday, String ctStreet,
         String ctStreetAddititon, String ctZip, String ctCity, String ctCountry, Integer ctSexId) {
      this.ctPersonId = ctPersonId;
      this.ctFirstName = ctFirstName;
      this.ctLastName = ctLastName;
      this.ctBirthday = ctBirthday;
      this.ctStreet = ctStreet;
      this.ctStreetAddititon = ctStreetAddititon;
      this.ctZip = ctZip;
      this.ctCity = ctCity;
      this.ctCountry = ctCountry;
      this.ctSexId = ctSexId;
   }

   // getters and setters

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public void setCtPersonId(String ctPersonId) {
      this.ctPersonId = ctPersonId;
   }

   public String getCtPersonId() {
      return ctPersonId;
   }

   public String getCtFirstName() {
      return ctFirstName;
   }

   public void setCtFirstName(String ctFirstName) {
      this.ctFirstName = ctFirstName;
   }

}
