package ir.hosseinabbasi.trademe.data.db.model.search;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SuperFeaturesItem{

	@SerializedName("Suburb")
	private String suburb;

	@SerializedName("PromotionId")
	private int promotionId;

	@SerializedName("ShortDescription")
	private String shortDescription;

	@SerializedName("StartDate")
	private String startDate;

	@SerializedName("IsClassified")
	private boolean isClassified;

	@SerializedName("ListingId")
	private int listingId;

	@SerializedName("WasPrice")
	private double wasPrice;

	@SerializedName("StartPrice")
	private double startPrice;

	@SerializedName("IsClearance")
	private boolean isClearance;

	@SerializedName("HasHomePageFeature")
	private boolean hasHomePageFeature;

	@SerializedName("PictureHref")
	private String pictureHref;

	@SerializedName("AdditionalData")
	private AdditionalData additionalData;

	@SerializedName("GeographicLocation")
	private GeographicLocation geographicLocation;

	@SerializedName("IsFeatured")
	private boolean isFeatured;

	@SerializedName("Subtitle")
	private String subtitle;

	@SerializedName("BidCount")
	private int bidCount;

	@SerializedName("HasPayNow")
	private boolean hasPayNow;

	@SerializedName("CanonicalPath")
	private String canonicalPath;

	@SerializedName("Region")
	private String region;

	@SerializedName("HasGallery")
	private boolean hasGallery;

	@SerializedName("AsAt")
	private String asAt;

	@SerializedName("HasReserve")
	private boolean hasReserve;

	@SerializedName("IsOnWatchList")
	private boolean isOnWatchList;

	@SerializedName("MaxBidAmount")
	private double maxBidAmount;

	@SerializedName("HasFreeShipping")
	private boolean hasFreeShipping;

	@SerializedName("Category")
	private String category;

	@SerializedName("IsNew")
	private boolean isNew;

	@SerializedName("HasBuyNow")
	private boolean hasBuyNow;

	@SerializedName("Branding")
	private Branding branding;

	@SerializedName("VariantDefinitionSummary")
	private VariantDefinitionSummary variantDefinitionSummary;

	@SerializedName("TotalReviewCount")
	private int totalReviewCount;

	@SerializedName("CategoryPath")
	private String categoryPath;

	@SerializedName("PositiveReviewCount")
	private int positiveReviewCount;

	@SerializedName("RemainingGalleryPlusRelists")
	private int remainingGalleryPlusRelists;

	@SerializedName("SuburbId")
	private int suburbId;

	@SerializedName("IsHighlighted")
	private boolean isHighlighted;

	@SerializedName("BuyNowPrice")
	private double buyNowPrice;

	@SerializedName("Title")
	private String title;

	@SerializedName("IsBold")
	private boolean isBold;

	@SerializedName("HasEmbeddedVideo")
	private boolean hasEmbeddedVideo;

	@SerializedName("EndDate")
	private String endDate;

	@SerializedName("IsBuyNowOnly")
	private boolean isBuyNowOnly;

	@SerializedName("PercentageOff")
	private int percentageOff;

	@SerializedName("ReserveState")
	private int reserveState;

	@SerializedName("NoteDate")
	private String noteDate;

	@SerializedName("PhotoUrls")
	private List<String> photoUrls;

	@SerializedName("IsReserveMet")
	private boolean isReserveMet;

	@SerializedName("IsSuperFeatured")
	private boolean isSuperFeatured;

	@SerializedName("RegionId")
	private int regionId;

	@SerializedName("PriceDisplay")
	private String priceDisplay;

	@SerializedName("OpenHomes")
	private List<OpenHomesItem> openHomes;

	public void setSuburb(String suburb){
		this.suburb = suburb;
	}

	public String getSuburb(){
		return suburb;
	}

	public void setPromotionId(int promotionId){
		this.promotionId = promotionId;
	}

	public int getPromotionId(){
		return promotionId;
	}

	public void setShortDescription(String shortDescription){
		this.shortDescription = shortDescription;
	}

	public String getShortDescription(){
		return shortDescription;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setIsClassified(boolean isClassified){
		this.isClassified = isClassified;
	}

	public boolean isIsClassified(){
		return isClassified;
	}

	public void setListingId(int listingId){
		this.listingId = listingId;
	}

	public int getListingId(){
		return listingId;
	}

	public void setWasPrice(double wasPrice){
		this.wasPrice = wasPrice;
	}

	public double getWasPrice(){
		return wasPrice;
	}

	public void setStartPrice(double startPrice){
		this.startPrice = startPrice;
	}

	public double getStartPrice(){
		return startPrice;
	}

	public void setIsClearance(boolean isClearance){
		this.isClearance = isClearance;
	}

	public boolean isIsClearance(){
		return isClearance;
	}

	public void setHasHomePageFeature(boolean hasHomePageFeature){
		this.hasHomePageFeature = hasHomePageFeature;
	}

	public boolean isHasHomePageFeature(){
		return hasHomePageFeature;
	}

	public void setPictureHref(String pictureHref){
		this.pictureHref = pictureHref;
	}

	public String getPictureHref(){
		return pictureHref;
	}

	public void setAdditionalData(AdditionalData additionalData){
		this.additionalData = additionalData;
	}

	public AdditionalData getAdditionalData(){
		return additionalData;
	}

	public void setGeographicLocation(GeographicLocation geographicLocation){
		this.geographicLocation = geographicLocation;
	}

	public GeographicLocation getGeographicLocation(){
		return geographicLocation;
	}

	public void setIsFeatured(boolean isFeatured){
		this.isFeatured = isFeatured;
	}

	public boolean isIsFeatured(){
		return isFeatured;
	}

	public void setSubtitle(String subtitle){
		this.subtitle = subtitle;
	}

	public String getSubtitle(){
		return subtitle;
	}

	public void setBidCount(int bidCount){
		this.bidCount = bidCount;
	}

	public int getBidCount(){
		return bidCount;
	}

	public void setHasPayNow(boolean hasPayNow){
		this.hasPayNow = hasPayNow;
	}

	public boolean isHasPayNow(){
		return hasPayNow;
	}

	public void setCanonicalPath(String canonicalPath){
		this.canonicalPath = canonicalPath;
	}

	public String getCanonicalPath(){
		return canonicalPath;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setHasGallery(boolean hasGallery){
		this.hasGallery = hasGallery;
	}

	public boolean isHasGallery(){
		return hasGallery;
	}

	public void setAsAt(String asAt){
		this.asAt = asAt;
	}

	public String getAsAt(){
		return asAt;
	}

	public void setHasReserve(boolean hasReserve){
		this.hasReserve = hasReserve;
	}

	public boolean isHasReserve(){
		return hasReserve;
	}

	public void setIsOnWatchList(boolean isOnWatchList){
		this.isOnWatchList = isOnWatchList;
	}

	public boolean isIsOnWatchList(){
		return isOnWatchList;
	}

	public void setMaxBidAmount(double maxBidAmount){
		this.maxBidAmount = maxBidAmount;
	}

	public double getMaxBidAmount(){
		return maxBidAmount;
	}

	public void setHasFreeShipping(boolean hasFreeShipping){
		this.hasFreeShipping = hasFreeShipping;
	}

	public boolean isHasFreeShipping(){
		return hasFreeShipping;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setIsNew(boolean isNew){
		this.isNew = isNew;
	}

	public boolean isIsNew(){
		return isNew;
	}

	public void setHasBuyNow(boolean hasBuyNow){
		this.hasBuyNow = hasBuyNow;
	}

	public boolean isHasBuyNow(){
		return hasBuyNow;
	}

	public void setBranding(Branding branding){
		this.branding = branding;
	}

	public Branding getBranding(){
		return branding;
	}

	public void setVariantDefinitionSummary(VariantDefinitionSummary variantDefinitionSummary){
		this.variantDefinitionSummary = variantDefinitionSummary;
	}

	public VariantDefinitionSummary getVariantDefinitionSummary(){
		return variantDefinitionSummary;
	}

	public void setTotalReviewCount(int totalReviewCount){
		this.totalReviewCount = totalReviewCount;
	}

	public int getTotalReviewCount(){
		return totalReviewCount;
	}

	public void setCategoryPath(String categoryPath){
		this.categoryPath = categoryPath;
	}

	public String getCategoryPath(){
		return categoryPath;
	}

	public void setPositiveReviewCount(int positiveReviewCount){
		this.positiveReviewCount = positiveReviewCount;
	}

	public int getPositiveReviewCount(){
		return positiveReviewCount;
	}

	public void setRemainingGalleryPlusRelists(int remainingGalleryPlusRelists){
		this.remainingGalleryPlusRelists = remainingGalleryPlusRelists;
	}

	public int getRemainingGalleryPlusRelists(){
		return remainingGalleryPlusRelists;
	}

	public void setSuburbId(int suburbId){
		this.suburbId = suburbId;
	}

	public int getSuburbId(){
		return suburbId;
	}

	public void setIsHighlighted(boolean isHighlighted){
		this.isHighlighted = isHighlighted;
	}

	public boolean isIsHighlighted(){
		return isHighlighted;
	}

	public void setBuyNowPrice(double buyNowPrice){
		this.buyNowPrice = buyNowPrice;
	}

	public double getBuyNowPrice(){
		return buyNowPrice;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setIsBold(boolean isBold){
		this.isBold = isBold;
	}

	public boolean isIsBold(){
		return isBold;
	}

	public void setHasEmbeddedVideo(boolean hasEmbeddedVideo){
		this.hasEmbeddedVideo = hasEmbeddedVideo;
	}

	public boolean isHasEmbeddedVideo(){
		return hasEmbeddedVideo;
	}

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setIsBuyNowOnly(boolean isBuyNowOnly){
		this.isBuyNowOnly = isBuyNowOnly;
	}

	public boolean isIsBuyNowOnly(){
		return isBuyNowOnly;
	}

	public void setPercentageOff(int percentageOff){
		this.percentageOff = percentageOff;
	}

	public int getPercentageOff(){
		return percentageOff;
	}

	public void setReserveState(int reserveState){
		this.reserveState = reserveState;
	}

	public int getReserveState(){
		return reserveState;
	}

	public void setNoteDate(String noteDate){
		this.noteDate = noteDate;
	}

	public String getNoteDate(){
		return noteDate;
	}

	public void setPhotoUrls(List<String> photoUrls){
		this.photoUrls = photoUrls;
	}

	public List<String> getPhotoUrls(){
		return photoUrls;
	}

	public void setIsReserveMet(boolean isReserveMet){
		this.isReserveMet = isReserveMet;
	}

	public boolean isIsReserveMet(){
		return isReserveMet;
	}

	public void setIsSuperFeatured(boolean isSuperFeatured){
		this.isSuperFeatured = isSuperFeatured;
	}

	public boolean isIsSuperFeatured(){
		return isSuperFeatured;
	}

	public void setRegionId(int regionId){
		this.regionId = regionId;
	}

	public int getRegionId(){
		return regionId;
	}

	public void setPriceDisplay(String priceDisplay){
		this.priceDisplay = priceDisplay;
	}

	public String getPriceDisplay(){
		return priceDisplay;
	}

	public void setOpenHomes(List<OpenHomesItem> openHomes){
		this.openHomes = openHomes;
	}

	public List<OpenHomesItem> getOpenHomes(){
		return openHomes;
	}

	@Override
 	public String toString(){
		return 
			"SuperFeaturesItem{" + 
			"suburb = '" + suburb + '\'' + 
			",promotionId = '" + promotionId + '\'' + 
			",shortDescription = '" + shortDescription + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",isClassified = '" + isClassified + '\'' + 
			",listingId = '" + listingId + '\'' + 
			",wasPrice = '" + wasPrice + '\'' + 
			",startPrice = '" + startPrice + '\'' + 
			",isClearance = '" + isClearance + '\'' + 
			",hasHomePageFeature = '" + hasHomePageFeature + '\'' + 
			",pictureHref = '" + pictureHref + '\'' + 
			",additionalData = '" + additionalData + '\'' + 
			",geographicLocation = '" + geographicLocation + '\'' + 
			",isFeatured = '" + isFeatured + '\'' + 
			",subtitle = '" + subtitle + '\'' + 
			",bidCount = '" + bidCount + '\'' + 
			",hasPayNow = '" + hasPayNow + '\'' + 
			",canonicalPath = '" + canonicalPath + '\'' + 
			",region = '" + region + '\'' + 
			",hasGallery = '" + hasGallery + '\'' + 
			",asAt = '" + asAt + '\'' + 
			",hasReserve = '" + hasReserve + '\'' + 
			",isOnWatchList = '" + isOnWatchList + '\'' + 
			",maxBidAmount = '" + maxBidAmount + '\'' + 
			",hasFreeShipping = '" + hasFreeShipping + '\'' + 
			",category = '" + category + '\'' + 
			",isNew = '" + isNew + '\'' + 
			",hasBuyNow = '" + hasBuyNow + '\'' + 
			",branding = '" + branding + '\'' + 
			",variantDefinitionSummary = '" + variantDefinitionSummary + '\'' + 
			",totalReviewCount = '" + totalReviewCount + '\'' + 
			",categoryPath = '" + categoryPath + '\'' + 
			",positiveReviewCount = '" + positiveReviewCount + '\'' + 
			",remainingGalleryPlusRelists = '" + remainingGalleryPlusRelists + '\'' + 
			",suburbId = '" + suburbId + '\'' + 
			",isHighlighted = '" + isHighlighted + '\'' + 
			",buyNowPrice = '" + buyNowPrice + '\'' + 
			",title = '" + title + '\'' + 
			",isBold = '" + isBold + '\'' + 
			",hasEmbeddedVideo = '" + hasEmbeddedVideo + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",isBuyNowOnly = '" + isBuyNowOnly + '\'' + 
			",percentageOff = '" + percentageOff + '\'' + 
			",reserveState = '" + reserveState + '\'' + 
			",noteDate = '" + noteDate + '\'' + 
			",photoUrls = '" + photoUrls + '\'' + 
			",isReserveMet = '" + isReserveMet + '\'' + 
			",isSuperFeatured = '" + isSuperFeatured + '\'' + 
			",regionId = '" + regionId + '\'' + 
			",priceDisplay = '" + priceDisplay + '\'' + 
			",openHomes = '" + openHomes + '\'' + 
			"}";
		}
}