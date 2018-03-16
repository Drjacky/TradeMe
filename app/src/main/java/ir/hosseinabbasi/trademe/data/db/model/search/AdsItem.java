package ir.hosseinabbasi.trademe.data.db.model.search;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AdsItem{

	@SerializedName("BrandLogoUri")
	private String brandLogoUri;

	@SerializedName("Action")
	private int action;

	@SerializedName("ListOffset")
	private int listOffset;

	@SerializedName("IsFallback")
	private boolean isFallback;

	@SerializedName("Title")
	private String title;

	@SerializedName("AdImageUri")
	private String adImageUri;

	@SerializedName("Subtitle")
	private String subtitle;

	@SerializedName("Details")
	private String details;

	@SerializedName("ExternalCountUri")
	private String externalCountUri;

	@SerializedName("ActionUri")
	private String actionUri;

	@SerializedName("GalleryViewImageUri")
	private String galleryViewImageUri;

	@SerializedName("AdServerRequestUrl")
	private String adServerRequestUrl;

	@SerializedName("ActionListingId")
	private int actionListingId;

	public void setBrandLogoUri(String brandLogoUri){
		this.brandLogoUri = brandLogoUri;
	}

	public String getBrandLogoUri(){
		return brandLogoUri;
	}

	public void setAction(int action){
		this.action = action;
	}

	public int getAction(){
		return action;
	}

	public void setListOffset(int listOffset){
		this.listOffset = listOffset;
	}

	public int getListOffset(){
		return listOffset;
	}

	public void setIsFallback(boolean isFallback){
		this.isFallback = isFallback;
	}

	public boolean isIsFallback(){
		return isFallback;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setAdImageUri(String adImageUri){
		this.adImageUri = adImageUri;
	}

	public String getAdImageUri(){
		return adImageUri;
	}

	public void setSubtitle(String subtitle){
		this.subtitle = subtitle;
	}

	public String getSubtitle(){
		return subtitle;
	}

	public void setDetails(String details){
		this.details = details;
	}

	public String getDetails(){
		return details;
	}

	public void setExternalCountUri(String externalCountUri){
		this.externalCountUri = externalCountUri;
	}

	public String getExternalCountUri(){
		return externalCountUri;
	}

	public void setActionUri(String actionUri){
		this.actionUri = actionUri;
	}

	public String getActionUri(){
		return actionUri;
	}

	public void setGalleryViewImageUri(String galleryViewImageUri){
		this.galleryViewImageUri = galleryViewImageUri;
	}

	public String getGalleryViewImageUri(){
		return galleryViewImageUri;
	}

	public void setAdServerRequestUrl(String adServerRequestUrl){
		this.adServerRequestUrl = adServerRequestUrl;
	}

	public String getAdServerRequestUrl(){
		return adServerRequestUrl;
	}

	public void setActionListingId(int actionListingId){
		this.actionListingId = actionListingId;
	}

	public int getActionListingId(){
		return actionListingId;
	}

	@Override
 	public String toString(){
		return 
			"AdsItem{" + 
			"brandLogoUri = '" + brandLogoUri + '\'' + 
			",action = '" + action + '\'' + 
			",listOffset = '" + listOffset + '\'' + 
			",isFallback = '" + isFallback + '\'' + 
			",title = '" + title + '\'' + 
			",adImageUri = '" + adImageUri + '\'' + 
			",subtitle = '" + subtitle + '\'' + 
			",details = '" + details + '\'' + 
			",externalCountUri = '" + externalCountUri + '\'' + 
			",actionUri = '" + actionUri + '\'' + 
			",galleryViewImageUri = '" + galleryViewImageUri + '\'' + 
			",adServerRequestUrl = '" + adServerRequestUrl + '\'' + 
			",actionListingId = '" + actionListingId + '\'' + 
			"}";
		}
}