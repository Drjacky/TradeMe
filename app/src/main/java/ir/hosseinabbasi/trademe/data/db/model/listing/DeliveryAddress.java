package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DeliveryAddress{

	@SerializedName("Suburb")
	private String suburb;

	@SerializedName("Address2")
	private String address2;

	@SerializedName("Country")
	private String country;

	@SerializedName("PhoneNumber")
	private String phoneNumber;

	@SerializedName("Address1")
	private String address1;

	@SerializedName("City")
	private String city;

	@SerializedName("Postcode")
	private String postcode;

	@SerializedName("Name")
	private String name;

	public void setSuburb(String suburb){
		this.suburb = suburb;
	}

	public String getSuburb(){
		return suburb;
	}

	public void setAddress2(String address2){
		this.address2 = address2;
	}

	public String getAddress2(){
		return address2;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setAddress1(String address1){
		this.address1 = address1;
	}

	public String getAddress1(){
		return address1;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setPostcode(String postcode){
		this.postcode = postcode;
	}

	public String getPostcode(){
		return postcode;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"DeliveryAddress{" + 
			"suburb = '" + suburb + '\'' + 
			",address2 = '" + address2 + '\'' + 
			",country = '" + country + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",address1 = '" + address1 + '\'' + 
			",city = '" + city + '\'' + 
			",postcode = '" + postcode + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}