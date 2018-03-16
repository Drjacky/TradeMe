package ir.hosseinabbasi.trademe.data.db.model.search;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DealPromotionInfo{

	@SerializedName("TermsBackgroundColour")
	private String termsBackgroundColour;

	@SerializedName("TermsAndConditionsUrl")
	private String termsAndConditionsUrl;

	@SerializedName("StartDateTime")
	private String startDateTime;

	@SerializedName("TermsAndConditions")
	private String termsAndConditions;

	@SerializedName("EndDateTime")
	private String endDateTime;

	@SerializedName("IsActive")
	private boolean isActive;

	@SerializedName("Title")
	private String title;

	@SerializedName("AsAt")
	private String asAt;

	@SerializedName("Id")
	private int id;

	@SerializedName("SubTitle")
	private String subTitle;

	@SerializedName("LargeBannerImage")
	private LargeBannerImage largeBannerImage;

	@SerializedName("TextBackgroundColour")
	private String textBackgroundColour;

	public void setTermsBackgroundColour(String termsBackgroundColour){
		this.termsBackgroundColour = termsBackgroundColour;
	}

	public String getTermsBackgroundColour(){
		return termsBackgroundColour;
	}

	public void setTermsAndConditionsUrl(String termsAndConditionsUrl){
		this.termsAndConditionsUrl = termsAndConditionsUrl;
	}

	public String getTermsAndConditionsUrl(){
		return termsAndConditionsUrl;
	}

	public void setStartDateTime(String startDateTime){
		this.startDateTime = startDateTime;
	}

	public String getStartDateTime(){
		return startDateTime;
	}

	public void setTermsAndConditions(String termsAndConditions){
		this.termsAndConditions = termsAndConditions;
	}

	public String getTermsAndConditions(){
		return termsAndConditions;
	}

	public void setEndDateTime(String endDateTime){
		this.endDateTime = endDateTime;
	}

	public String getEndDateTime(){
		return endDateTime;
	}

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setAsAt(String asAt){
		this.asAt = asAt;
	}

	public String getAsAt(){
		return asAt;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSubTitle(String subTitle){
		this.subTitle = subTitle;
	}

	public String getSubTitle(){
		return subTitle;
	}

	public void setLargeBannerImage(LargeBannerImage largeBannerImage){
		this.largeBannerImage = largeBannerImage;
	}

	public LargeBannerImage getLargeBannerImage(){
		return largeBannerImage;
	}

	public void setTextBackgroundColour(String textBackgroundColour){
		this.textBackgroundColour = textBackgroundColour;
	}

	public String getTextBackgroundColour(){
		return textBackgroundColour;
	}

	@Override
 	public String toString(){
		return 
			"DealPromotionInfo{" + 
			"termsBackgroundColour = '" + termsBackgroundColour + '\'' + 
			",termsAndConditionsUrl = '" + termsAndConditionsUrl + '\'' + 
			",startDateTime = '" + startDateTime + '\'' + 
			",termsAndConditions = '" + termsAndConditions + '\'' + 
			",endDateTime = '" + endDateTime + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",title = '" + title + '\'' + 
			",asAt = '" + asAt + '\'' + 
			",id = '" + id + '\'' + 
			",subTitle = '" + subTitle + '\'' + 
			",largeBannerImage = '" + largeBannerImage + '\'' + 
			",textBackgroundColour = '" + textBackgroundColour + '\'' + 
			"}";
		}
}