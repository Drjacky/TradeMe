package ir.hosseinabbasi.trademe.data.db.model.search;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ListItem implements Parcelable {

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
				"ListItem{" +
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

	protected ListItem(Parcel in) {
		suburb = in.readString();
		promotionId = in.readInt();
		shortDescription = in.readString();
		startDate = in.readString();
		isClassified = in.readByte() != 0x00;
		listingId = in.readInt();
		wasPrice = in.readDouble();
		startPrice = in.readDouble();
		isClearance = in.readByte() != 0x00;
		hasHomePageFeature = in.readByte() != 0x00;
		pictureHref = in.readString();
		additionalData = (AdditionalData) in.readValue(AdditionalData.class.getClassLoader());
		geographicLocation = (GeographicLocation) in.readValue(GeographicLocation.class.getClassLoader());
		isFeatured = in.readByte() != 0x00;
		subtitle = in.readString();
		bidCount = in.readInt();
		hasPayNow = in.readByte() != 0x00;
		canonicalPath = in.readString();
		region = in.readString();
		hasGallery = in.readByte() != 0x00;
		asAt = in.readString();
		hasReserve = in.readByte() != 0x00;
		isOnWatchList = in.readByte() != 0x00;
		maxBidAmount = in.readDouble();
		hasFreeShipping = in.readByte() != 0x00;
		category = in.readString();
		isNew = in.readByte() != 0x00;
		hasBuyNow = in.readByte() != 0x00;
		branding = (Branding) in.readValue(Branding.class.getClassLoader());
		variantDefinitionSummary = (VariantDefinitionSummary) in.readValue(VariantDefinitionSummary.class.getClassLoader());
		totalReviewCount = in.readInt();
		categoryPath = in.readString();
		positiveReviewCount = in.readInt();
		remainingGalleryPlusRelists = in.readInt();
		suburbId = in.readInt();
		isHighlighted = in.readByte() != 0x00;
		buyNowPrice = in.readDouble();
		title = in.readString();
		isBold = in.readByte() != 0x00;
		hasEmbeddedVideo = in.readByte() != 0x00;
		endDate = in.readString();
		isBuyNowOnly = in.readByte() != 0x00;
		percentageOff = in.readInt();
		reserveState = in.readInt();
		noteDate = in.readString();
		if (in.readByte() == 0x01) {
			photoUrls = new ArrayList<String>();
			in.readList(photoUrls, String.class.getClassLoader());
		} else {
			photoUrls = null;
		}
		isReserveMet = in.readByte() != 0x00;
		isSuperFeatured = in.readByte() != 0x00;
		regionId = in.readInt();
		priceDisplay = in.readString();
		if (in.readByte() == 0x01) {
			openHomes = new ArrayList<OpenHomesItem>();
			in.readList(openHomes, OpenHomesItem.class.getClassLoader());
		} else {
			openHomes = null;
		}
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(suburb);
		dest.writeInt(promotionId);
		dest.writeString(shortDescription);
		dest.writeString(startDate);
		dest.writeByte((byte) (isClassified ? 0x01 : 0x00));
		dest.writeInt(listingId);
		dest.writeDouble(wasPrice);
		dest.writeDouble(startPrice);
		dest.writeByte((byte) (isClearance ? 0x01 : 0x00));
		dest.writeByte((byte) (hasHomePageFeature ? 0x01 : 0x00));
		dest.writeString(pictureHref);
		dest.writeValue(additionalData);
		dest.writeValue(geographicLocation);
		dest.writeByte((byte) (isFeatured ? 0x01 : 0x00));
		dest.writeString(subtitle);
		dest.writeInt(bidCount);
		dest.writeByte((byte) (hasPayNow ? 0x01 : 0x00));
		dest.writeString(canonicalPath);
		dest.writeString(region);
		dest.writeByte((byte) (hasGallery ? 0x01 : 0x00));
		dest.writeString(asAt);
		dest.writeByte((byte) (hasReserve ? 0x01 : 0x00));
		dest.writeByte((byte) (isOnWatchList ? 0x01 : 0x00));
		dest.writeDouble(maxBidAmount);
		dest.writeByte((byte) (hasFreeShipping ? 0x01 : 0x00));
		dest.writeString(category);
		dest.writeByte((byte) (isNew ? 0x01 : 0x00));
		dest.writeByte((byte) (hasBuyNow ? 0x01 : 0x00));
		dest.writeValue(branding);
		dest.writeValue(variantDefinitionSummary);
		dest.writeInt(totalReviewCount);
		dest.writeString(categoryPath);
		dest.writeInt(positiveReviewCount);
		dest.writeInt(remainingGalleryPlusRelists);
		dest.writeInt(suburbId);
		dest.writeByte((byte) (isHighlighted ? 0x01 : 0x00));
		dest.writeDouble(buyNowPrice);
		dest.writeString(title);
		dest.writeByte((byte) (isBold ? 0x01 : 0x00));
		dest.writeByte((byte) (hasEmbeddedVideo ? 0x01 : 0x00));
		dest.writeString(endDate);
		dest.writeByte((byte) (isBuyNowOnly ? 0x01 : 0x00));
		dest.writeInt(percentageOff);
		dest.writeInt(reserveState);
		dest.writeString(noteDate);
		if (photoUrls == null) {
			dest.writeByte((byte) (0x00));
		} else {
			dest.writeByte((byte) (0x01));
			dest.writeList(photoUrls);
		}
		dest.writeByte((byte) (isReserveMet ? 0x01 : 0x00));
		dest.writeByte((byte) (isSuperFeatured ? 0x01 : 0x00));
		dest.writeInt(regionId);
		dest.writeString(priceDisplay);
		if (openHomes == null) {
			dest.writeByte((byte) (0x00));
		} else {
			dest.writeByte((byte) (0x01));
			dest.writeList(openHomes);
		}
	}

	@SuppressWarnings("unused")
	public static final Parcelable.Creator<ListItem> CREATOR = new Parcelable.Creator<ListItem>() {
		@Override
		public ListItem createFromParcel(Parcel in) {
			return new ListItem(in);
		}

		@Override
		public ListItem[] newArray(int size) {
			return new ListItem[size];
		}
	};
}