package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Agency{

	@SerializedName("IsRealEstateAgency")
	private boolean isRealEstateAgency;

	@SerializedName("Address")
	private String address;

	@SerializedName("Suburb")
	private String suburb;

	@SerializedName("Logo2")
	private String logo2;

	@SerializedName("Agents")
	private List<AgentsItem> agents;

	@SerializedName("Website")
	private String website;

	@SerializedName("City")
	private String city;

	@SerializedName("EMail")
	private String eMail;

	@SerializedName("Branding")
	private Branding branding;

	@SerializedName("Name")
	private String name;

	@SerializedName("Logo")
	private String logo;

	@SerializedName("IsLicensedPropertyAgency")
	private boolean isLicensedPropertyAgency;

	@SerializedName("IsJobAgency")
	private boolean isJobAgency;

	@SerializedName("FaxNumber")
	private String faxNumber;

	@SerializedName("PhoneNumber")
	private String phoneNumber;

	@SerializedName("Id")
	private int id;

	public void setIsRealEstateAgency(boolean isRealEstateAgency){
		this.isRealEstateAgency = isRealEstateAgency;
	}

	public boolean isIsRealEstateAgency(){
		return isRealEstateAgency;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setSuburb(String suburb){
		this.suburb = suburb;
	}

	public String getSuburb(){
		return suburb;
	}

	public void setLogo2(String logo2){
		this.logo2 = logo2;
	}

	public String getLogo2(){
		return logo2;
	}

	public void setAgents(List<AgentsItem> agents){
		this.agents = agents;
	}

	public List<AgentsItem> getAgents(){
		return agents;
	}

	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebsite(){
		return website;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setEMail(String eMail){
		this.eMail = eMail;
	}

	public String getEMail(){
		return eMail;
	}

	public void setBranding(Branding branding){
		this.branding = branding;
	}

	public Branding getBranding(){
		return branding;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLogo(String logo){
		this.logo = logo;
	}

	public String getLogo(){
		return logo;
	}

	public void setIsLicensedPropertyAgency(boolean isLicensedPropertyAgency){
		this.isLicensedPropertyAgency = isLicensedPropertyAgency;
	}

	public boolean isIsLicensedPropertyAgency(){
		return isLicensedPropertyAgency;
	}

	public void setIsJobAgency(boolean isJobAgency){
		this.isJobAgency = isJobAgency;
	}

	public boolean isIsJobAgency(){
		return isJobAgency;
	}

	public void setFaxNumber(String faxNumber){
		this.faxNumber = faxNumber;
	}

	public String getFaxNumber(){
		return faxNumber;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Agency{" + 
			"isRealEstateAgency = '" + isRealEstateAgency + '\'' + 
			",address = '" + address + '\'' + 
			",suburb = '" + suburb + '\'' + 
			",logo2 = '" + logo2 + '\'' + 
			",agents = '" + agents + '\'' + 
			",website = '" + website + '\'' + 
			",city = '" + city + '\'' + 
			",eMail = '" + eMail + '\'' + 
			",branding = '" + branding + '\'' + 
			",name = '" + name + '\'' + 
			",logo = '" + logo + '\'' + 
			",isLicensedPropertyAgency = '" + isLicensedPropertyAgency + '\'' + 
			",isJobAgency = '" + isJobAgency + '\'' + 
			",faxNumber = '" + faxNumber + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}