package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DealersItem{

	@SerializedName("Position")
	private String position;

	@SerializedName("OfficePhoneNumber")
	private String officePhoneNumber;

	@SerializedName("HomePhoneNumber")
	private String homePhoneNumber;

	@SerializedName("FullName")
	private String fullName;

	@SerializedName("FaxNumber")
	private String faxNumber;

	@SerializedName("EMail")
	private String eMail;

	@SerializedName("MobilePhoneNumber")
	private String mobilePhoneNumber;

	public void setPosition(String position){
		this.position = position;
	}

	public String getPosition(){
		return position;
	}

	public void setOfficePhoneNumber(String officePhoneNumber){
		this.officePhoneNumber = officePhoneNumber;
	}

	public String getOfficePhoneNumber(){
		return officePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber){
		this.homePhoneNumber = homePhoneNumber;
	}

	public String getHomePhoneNumber(){
		return homePhoneNumber;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setFaxNumber(String faxNumber){
		this.faxNumber = faxNumber;
	}

	public String getFaxNumber(){
		return faxNumber;
	}

	public void setEMail(String eMail){
		this.eMail = eMail;
	}

	public String getEMail(){
		return eMail;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber){
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getMobilePhoneNumber(){
		return mobilePhoneNumber;
	}

	@Override
 	public String toString(){
		return 
			"DealersItem{" + 
			"position = '" + position + '\'' + 
			",officePhoneNumber = '" + officePhoneNumber + '\'' + 
			",homePhoneNumber = '" + homePhoneNumber + '\'' + 
			",fullName = '" + fullName + '\'' + 
			",faxNumber = '" + faxNumber + '\'' + 
			",eMail = '" + eMail + '\'' + 
			",mobilePhoneNumber = '" + mobilePhoneNumber + '\'' + 
			"}";
		}
}