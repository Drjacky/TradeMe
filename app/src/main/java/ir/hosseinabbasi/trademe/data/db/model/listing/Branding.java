package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Branding{

	@SerializedName("LargeSquareLogo")
	private String largeSquareLogo;

	@SerializedName("StrokeColor")
	private String strokeColor;

	@SerializedName("OfficeLocation")
	private String officeLocation;

	@SerializedName("TextColor")
	private String textColor;

	@SerializedName("LargeBannerURL")
	private String largeBannerURL;

	@SerializedName("LargeWideLogo")
	private String largeWideLogo;

	@SerializedName("BackgroundColor")
	private String backgroundColor;

	@SerializedName("DisableBanner")
	private boolean disableBanner;

	public void setLargeSquareLogo(String largeSquareLogo){
		this.largeSquareLogo = largeSquareLogo;
	}

	public String getLargeSquareLogo(){
		return largeSquareLogo;
	}

	public void setStrokeColor(String strokeColor){
		this.strokeColor = strokeColor;
	}

	public String getStrokeColor(){
		return strokeColor;
	}

	public void setOfficeLocation(String officeLocation){
		this.officeLocation = officeLocation;
	}

	public String getOfficeLocation(){
		return officeLocation;
	}

	public void setTextColor(String textColor){
		this.textColor = textColor;
	}

	public String getTextColor(){
		return textColor;
	}

	public void setLargeBannerURL(String largeBannerURL){
		this.largeBannerURL = largeBannerURL;
	}

	public String getLargeBannerURL(){
		return largeBannerURL;
	}

	public void setLargeWideLogo(String largeWideLogo){
		this.largeWideLogo = largeWideLogo;
	}

	public String getLargeWideLogo(){
		return largeWideLogo;
	}

	public void setBackgroundColor(String backgroundColor){
		this.backgroundColor = backgroundColor;
	}

	public String getBackgroundColor(){
		return backgroundColor;
	}

	public void setDisableBanner(boolean disableBanner){
		this.disableBanner = disableBanner;
	}

	public boolean isDisableBanner(){
		return disableBanner;
	}

	@Override
 	public String toString(){
		return 
			"Branding{" + 
			"largeSquareLogo = '" + largeSquareLogo + '\'' + 
			",strokeColor = '" + strokeColor + '\'' + 
			",officeLocation = '" + officeLocation + '\'' + 
			",textColor = '" + textColor + '\'' + 
			",largeBannerURL = '" + largeBannerURL + '\'' + 
			",largeWideLogo = '" + largeWideLogo + '\'' + 
			",backgroundColor = '" + backgroundColor + '\'' + 
			",disableBanner = '" + disableBanner + '\'' + 
			"}";
		}
}