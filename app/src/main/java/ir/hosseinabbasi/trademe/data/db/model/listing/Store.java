package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Store{

	@SerializedName("LogoImageUri")
	private String logoImageUri;

	@SerializedName("BannerImageUri")
	private String bannerImageUri;

	@SerializedName("Promotions")
	private List<PromotionsItem> promotions;

	@SerializedName("PhoneNumber")
	private String phoneNumber;

	@SerializedName("Website")
	private String website;

	@SerializedName("Name")
	private String name;

	@SerializedName("ShortDescription")
	private String shortDescription;

	@SerializedName("LargeBannerImage")
	private LargeBannerImage largeBannerImage;

	@SerializedName("StorePath")
	private String storePath;

	@SerializedName("Location")
	private String location;

	public void setLogoImageUri(String logoImageUri){
		this.logoImageUri = logoImageUri;
	}

	public String getLogoImageUri(){
		return logoImageUri;
	}

	public void setBannerImageUri(String bannerImageUri){
		this.bannerImageUri = bannerImageUri;
	}

	public String getBannerImageUri(){
		return bannerImageUri;
	}

	public void setPromotions(List<PromotionsItem> promotions){
		this.promotions = promotions;
	}

	public List<PromotionsItem> getPromotions(){
		return promotions;
	}

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

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setShortDescription(String shortDescription){
		this.shortDescription = shortDescription;
	}

	public String getShortDescription(){
		return shortDescription;
	}

	public void setLargeBannerImage(LargeBannerImage largeBannerImage){
		this.largeBannerImage = largeBannerImage;
	}

	public LargeBannerImage getLargeBannerImage(){
		return largeBannerImage;
	}

	public void setStorePath(String storePath){
		this.storePath = storePath;
	}

	public String getStorePath(){
		return storePath;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}

	@Override
 	public String toString(){
		return 
			"Store{" + 
			"logoImageUri = '" + logoImageUri + '\'' + 
			",bannerImageUri = '" + bannerImageUri + '\'' + 
			",promotions = '" + promotions + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",website = '" + website + '\'' + 
			",name = '" + name + '\'' + 
			",shortDescription = '" + shortDescription + '\'' + 
			",largeBannerImage = '" + largeBannerImage + '\'' + 
			",storePath = '" + storePath + '\'' + 
			",location = '" + location + '\'' + 
			"}";
		}
}