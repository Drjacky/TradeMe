package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class LargeBannerImage{

	@SerializedName("Small")
	private String small;

	@SerializedName("XLarge")
	private String xLarge;

	@SerializedName("Medium")
	private String medium;

	@SerializedName("Large")
	private String large;

	public void setSmall(String small){
		this.small = small;
	}

	public String getSmall(){
		return small;
	}

	public void setXLarge(String xLarge){
		this.xLarge = xLarge;
	}

	public String getXLarge(){
		return xLarge;
	}

	public void setMedium(String medium){
		this.medium = medium;
	}

	public String getMedium(){
		return medium;
	}

	public void setLarge(String large){
		this.large = large;
	}

	public String getLarge(){
		return large;
	}

	@Override
 	public String toString(){
		return 
			"LargeBannerImage{" + 
			"small = '" + small + '\'' + 
			",xLarge = '" + xLarge + '\'' + 
			",medium = '" + medium + '\'' + 
			",large = '" + large + '\'' + 
			"}";
		}
}