package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ContactDetails{

	@SerializedName("PhoneNumber")
	private String phoneNumber;

	@SerializedName("Website")
	private String website;

	@SerializedName("ContactName")
	private String contactName;

	@SerializedName("MobilePhoneNumber")
	private String mobilePhoneNumber;

	@SerializedName("BestContactTime")
	private String bestContactTime;

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebsite(){
		return website;
	}

	public void setContactName(String contactName){
		this.contactName = contactName;
	}

	public String getContactName(){
		return contactName;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber){
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getMobilePhoneNumber(){
		return mobilePhoneNumber;
	}

	public void setBestContactTime(String bestContactTime){
		this.bestContactTime = bestContactTime;
	}

	public String getBestContactTime(){
		return bestContactTime;
	}

	@Override
 	public String toString(){
		return 
			"ContactDetails{" + 
			"phoneNumber = '" + phoneNumber + '\'' + 
			",website = '" + website + '\'' + 
			",contactName = '" + contactName + '\'' + 
			",mobilePhoneNumber = '" + mobilePhoneNumber + '\'' + 
			",bestContactTime = '" + bestContactTime + '\'' + 
			"}";
		}
}