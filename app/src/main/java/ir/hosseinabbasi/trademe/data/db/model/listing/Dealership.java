package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Dealership{

	@SerializedName("PhoneNumbers")
	private List<String> phoneNumbers;

	@SerializedName("Address")
	private String address;

	@SerializedName("Suburb")
	private String suburb;

	@SerializedName("Logo2")
	private String logo2;

	@SerializedName("AboutUs")
	private String aboutUs;

	@SerializedName("Website")
	private String website;

	@SerializedName("Product")
	private String product;

	@SerializedName("ListingCounts")
	private ListingCounts listingCounts;

	@SerializedName("City")
	private String city;

	@SerializedName("EMail")
	private String eMail;

	@SerializedName("Branding")
	private Branding branding;

	@SerializedName("Showroom")
	private Showroom showroom;

	@SerializedName("Name")
	private String name;

	@SerializedName("Logo")
	private String logo;

	@SerializedName("Dealers")
	private List<DealersItem> dealers;

	@SerializedName("FaxNumber")
	private String faxNumber;

	@SerializedName("PhoneNumber")
	private String phoneNumber;

	@SerializedName("Id")
	private int id;

	public void setPhoneNumbers(List<String> phoneNumbers){
		this.phoneNumbers = phoneNumbers;
	}

	public List<String> getPhoneNumbers(){
		return phoneNumbers;
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

	public void setAboutUs(String aboutUs){
		this.aboutUs = aboutUs;
	}

	public String getAboutUs(){
		return aboutUs;
	}

	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebsite(){
		return website;
	}

	public void setProduct(String product){
		this.product = product;
	}

	public String getProduct(){
		return product;
	}

	public void setListingCounts(ListingCounts listingCounts){
		this.listingCounts = listingCounts;
	}

	public ListingCounts getListingCounts(){
		return listingCounts;
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

	public void setShowroom(Showroom showroom){
		this.showroom = showroom;
	}

	public Showroom getShowroom(){
		return showroom;
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

	public void setDealers(List<DealersItem> dealers){
		this.dealers = dealers;
	}

	public List<DealersItem> getDealers(){
		return dealers;
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
			"Dealership{" + 
			"phoneNumbers = '" + phoneNumbers + '\'' + 
			",address = '" + address + '\'' + 
			",suburb = '" + suburb + '\'' + 
			",logo2 = '" + logo2 + '\'' + 
			",aboutUs = '" + aboutUs + '\'' + 
			",website = '" + website + '\'' + 
			",product = '" + product + '\'' + 
			",listingCounts = '" + listingCounts + '\'' + 
			",city = '" + city + '\'' + 
			",eMail = '" + eMail + '\'' + 
			",branding = '" + branding + '\'' + 
			",showroom = '" + showroom + '\'' + 
			",name = '" + name + '\'' + 
			",logo = '" + logo + '\'' + 
			",dealers = '" + dealers + '\'' + 
			",faxNumber = '" + faxNumber + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}