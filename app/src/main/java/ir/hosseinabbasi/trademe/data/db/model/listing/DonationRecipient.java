package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DonationRecipient{

	@SerializedName("Tagline")
	private String tagline;

	@SerializedName("Description")
	private String description;

	@SerializedName("CharityType")
	private int charityType;

	@SerializedName("ImageSource")
	private String imageSource;

	public void setTagline(String tagline){
		this.tagline = tagline;
	}

	public String getTagline(){
		return tagline;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setCharityType(int charityType){
		this.charityType = charityType;
	}

	public int getCharityType(){
		return charityType;
	}

	public void setImageSource(String imageSource){
		this.imageSource = imageSource;
	}

	public String getImageSource(){
		return imageSource;
	}

	@Override
 	public String toString(){
		return 
			"DonationRecipient{" + 
			"tagline = '" + tagline + '\'' + 
			",description = '" + description + '\'' + 
			",charityType = '" + charityType + '\'' + 
			",imageSource = '" + imageSource + '\'' + 
			"}";
		}
}