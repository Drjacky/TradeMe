package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Listing{

	@SerializedName("BidderAndWatchers")
	private int bidderAndWatchers;

	@SerializedName("Suburb")
	private String suburb;

	@SerializedName("ExternalReferenceId")
	private String externalReferenceId;

	@SerializedName("Store")
	private Store store;

	@SerializedName("IsFlatShippingCharge")
	private boolean isFlatShippingCharge;

	@SerializedName("CartItemId")
	private int cartItemId;

	@SerializedName("DeferredPaymentDetails")
	private DeferredPaymentDetails deferredPaymentDetails;

	@SerializedName("PaymentMethods")
	private List<PaymentMethodsItem> paymentMethods;

	@SerializedName("ContactDetails")
	private ContactDetails contactDetails;

	@SerializedName("SponsorLinks")
	private List<SponsorLinksItem> sponsorLinks;

	@SerializedName("Questions")
	private Questions questions;

	@SerializedName("RelistedItemId")
	private int relistedItemId;

	@SerializedName("SupportsQuestionsAndAnswers")
	private boolean supportsQuestionsAndAnswers;

	@SerializedName("HasMultiple")
	private boolean hasMultiple;

	@SerializedName("StartPrice")
	private double startPrice;

	@SerializedName("IsClearance")
	private boolean isClearance;

	@SerializedName("HasHomePageFeature")
	private boolean hasHomePageFeature;

	@SerializedName("IsEligibleForBuyerProtection")
	private boolean isEligibleForBuyerProtection;

	@SerializedName("CountUnprocessedSales")
	private int countUnprocessedSales;

	@SerializedName("CanUsePayNowInstant")
	private boolean canUsePayNowInstant;

	@SerializedName("Bids")
	private Bids bids;

	@SerializedName("IsInTradeProtected")
	private boolean isInTradeProtected;

	@SerializedName("ListingGroupId")
	private int listingGroupId;

	@SerializedName("CurrentShippingPromotion")
	private CurrentShippingPromotion currentShippingPromotion;

	@SerializedName("Subtitle")
	private String subtitle;

	@SerializedName("MemberRequestInformation")
	private MemberRequestInformation memberRequestInformation;

	@SerializedName("BidCount")
	private int bidCount;

	@SerializedName("HasPayNow")
	private boolean hasPayNow;

	@SerializedName("CanonicalPath")
	private String canonicalPath;

	@SerializedName("HasGallery")
	private boolean hasGallery;

	@SerializedName("AsAt")
	private String asAt;

	@SerializedName("QuantityRemaining")
	private int quantityRemaining;

	@SerializedName("Dealership")
	private Dealership dealership;

	@SerializedName("MaxBidAmount")
	private double maxBidAmount;

	@SerializedName("FinanceOffer")
	private FinanceOffer financeOffer;

	@SerializedName("Branding")
	private Branding branding;

	@SerializedName("UnansweredQuestionCount")
	private int unansweredQuestionCount;

	@SerializedName("ShippingOptions")
	private List<ShippingOptionsItem> shippingOptions;

	@SerializedName("CategoryPath")
	private String categoryPath;

	@SerializedName("Sales")
	private List<SalesItem> sales;

	@SerializedName("LocalSales")
	private LocalSales localSales;

	@SerializedName("RemainingGalleryPlusRelists")
	private int remainingGalleryPlusRelists;

	@SerializedName("SuburbId")
	private int suburbId;

	@SerializedName("IsHighlighted")
	private boolean isHighlighted;

	@SerializedName("AuthenticatedMembersOnly")
	private boolean authenticatedMembersOnly;

	@SerializedName("VariantDefinition")
	private VariantDefinition variantDefinition;

	@SerializedName("BuyNowPrice")
	private double buyNowPrice;

	@SerializedName("ViewCount")
	private int viewCount;

	@SerializedName("EndDate")
	private String endDate;

	@SerializedName("IsBuyNowOnly")
	private boolean isBuyNowOnly;

	@SerializedName("PhotoId")
	private int photoId;

	@SerializedName("Over18DeclarationRequiredToBuy")
	private boolean over18DeclarationRequiredToBuy;

	@SerializedName("DonationRecipient")
	private DonationRecipient donationRecipient;

	@SerializedName("IsReserveMet")
	private boolean isReserveMet;

	@SerializedName("ReservePrice")
	private double reservePrice;

	@SerializedName("IsSuperFeatured")
	private boolean isSuperFeatured;

	@SerializedName("OpenHomes")
	private List<OpenHomesItem> openHomes;

	@SerializedName("ContactCount")
	private int contactCount;

	@SerializedName("MemberProfile")
	private MemberProfile memberProfile;

	@SerializedName("SuperFeatureEndDate")
	private String superFeatureEndDate;

	@SerializedName("Attributes")
	private List<AttributesItem> attributes;

	@SerializedName("WithdrawnBySeller")
	private boolean withdrawnBySeller;

	@SerializedName("StartDate")
	private String startDate;

	@SerializedName("IsClassified")
	private boolean isClassified;

	@SerializedName("ListingId")
	private int listingId;

	@SerializedName("FirearmsLicenseRequiredToBuy")
	private boolean firearmsLicenseRequiredToBuy;

	@SerializedName("WasPrice")
	private double wasPrice;

	@SerializedName("ClosedOffer")
	private ClosedOffer closedOffer;

	@SerializedName("Member")
	private Member member;

	@SerializedName("AdditionalData")
	private AdditionalData additionalData;

	@SerializedName("GeographicLocation")
	private GeographicLocation geographicLocation;

	@SerializedName("PaymentOptions")
	private String paymentOptions;

	@SerializedName("IsInCart")
	private boolean isInCart;

	@SerializedName("IsFeatured")
	private boolean isFeatured;

	@SerializedName("IsOrNearOffer")
	private boolean isOrNearOffer;

	@SerializedName("PendingOffer")
	private PendingOffer pendingOffer;

	@SerializedName("Region")
	private String region;

	@SerializedName("HasReserve")
	private boolean hasReserve;

	@SerializedName("IsOnWatchList")
	private boolean isOnWatchList;

	@SerializedName("BroadbandTechnologies")
	private List<BroadbandTechnologiesItem> broadbandTechnologies;

	@SerializedName("IsLeading")
	private boolean isLeading;

	@SerializedName("IsOutbid")
	private boolean isOutbid;

	@SerializedName("Category")
	private String category;

	@SerializedName("ViewingTrackerSupported")
	private boolean viewingTrackerSupported;

	@SerializedName("CurrentAutoBid")
	private double currentAutoBid;

	@SerializedName("FormattedStartDate")
	private String formattedStartDate;

	@SerializedName("IsNew")
	private boolean isNew;

	@SerializedName("HasBuyNow")
	private boolean hasBuyNow;

	@SerializedName("HasPing")
	private boolean hasPing;

	@SerializedName("HasContactDetails")
	private boolean hasContactDetails;

	@SerializedName("Photos")
	private List<PhotosItem> photos;

	@SerializedName("TotalReviewCount")
	private int totalReviewCount;

	@SerializedName("PositiveReviewCount")
	private int positiveReviewCount;

	@SerializedName("EmbeddedContent")
	private EmbeddedContent embeddedContent;

	@SerializedName("SuppressRelatedListings")
	private boolean suppressRelatedListings;

	@SerializedName("SendPaymentInstructions")
	private boolean sendPaymentInstructions;

	@SerializedName("Body")
	private String body;

	@SerializedName("AvailableToBuy")
	private String availableToBuy;

	@SerializedName("MotorWebBasicReport")
	private MotorWebBasicReport motorWebBasicReport;

	@SerializedName("CanAddToCart")
	private boolean canAddToCart;

	@SerializedName("Agency")
	private Agency agency;

	@SerializedName("OfferStatus")
	private int offerStatus;

	@SerializedName("CanOffer")
	private boolean canOffer;

	@SerializedName("Breadcrumbs")
	private List<BreadcrumbsItem> breadcrumbs;

	@SerializedName("AllowsPickups")
	private int allowsPickups;

	@SerializedName("Title")
	private String title;

	@SerializedName("IsBold")
	private boolean isBold;

	@SerializedName("Quantity")
	private int quantity;

	@SerializedName("PercentageOff")
	private int percentageOff;

	@SerializedName("ProductSpecification")
	private ProductSpecification productSpecification;

	@SerializedName("ReserveState")
	private int reserveState;

	@SerializedName("NoteDate")
	private String noteDate;

	@SerializedName("HiddenAttributes")
	private List<HiddenAttributesItem> hiddenAttributes;

	@SerializedName("CanRelist")
	private boolean canRelist;

	@SerializedName("CategoryName")
	private String categoryName;

	@SerializedName("RegionId")
	private int regionId;

	@SerializedName("MinimumNextBidAmount")
	private double minimumNextBidAmount;

	@SerializedName("PriceDisplay")
	private String priceDisplay;

	@SerializedName("SKU")
	private String sKU;

	public void setBidderAndWatchers(int bidderAndWatchers){
		this.bidderAndWatchers = bidderAndWatchers;
	}

	public int getBidderAndWatchers(){
		return bidderAndWatchers;
	}

	public void setSuburb(String suburb){
		this.suburb = suburb;
	}

	public String getSuburb(){
		return suburb;
	}

	public void setExternalReferenceId(String externalReferenceId){
		this.externalReferenceId = externalReferenceId;
	}

	public String getExternalReferenceId(){
		return externalReferenceId;
	}

	public void setStore(Store store){
		this.store = store;
	}

	public Store getStore(){
		return store;
	}

	public void setIsFlatShippingCharge(boolean isFlatShippingCharge){
		this.isFlatShippingCharge = isFlatShippingCharge;
	}

	public boolean isIsFlatShippingCharge(){
		return isFlatShippingCharge;
	}

	public void setCartItemId(int cartItemId){
		this.cartItemId = cartItemId;
	}

	public int getCartItemId(){
		return cartItemId;
	}

	public void setDeferredPaymentDetails(DeferredPaymentDetails deferredPaymentDetails){
		this.deferredPaymentDetails = deferredPaymentDetails;
	}

	public DeferredPaymentDetails getDeferredPaymentDetails(){
		return deferredPaymentDetails;
	}

	public void setPaymentMethods(List<PaymentMethodsItem> paymentMethods){
		this.paymentMethods = paymentMethods;
	}

	public List<PaymentMethodsItem> getPaymentMethods(){
		return paymentMethods;
	}

	public void setContactDetails(ContactDetails contactDetails){
		this.contactDetails = contactDetails;
	}

	public ContactDetails getContactDetails(){
		return contactDetails;
	}

	public void setSponsorLinks(List<SponsorLinksItem> sponsorLinks){
		this.sponsorLinks = sponsorLinks;
	}

	public List<SponsorLinksItem> getSponsorLinks(){
		return sponsorLinks;
	}

	public void setQuestions(Questions questions){
		this.questions = questions;
	}

	public Questions getQuestions(){
		return questions;
	}

	public void setRelistedItemId(int relistedItemId){
		this.relistedItemId = relistedItemId;
	}

	public int getRelistedItemId(){
		return relistedItemId;
	}

	public void setSupportsQuestionsAndAnswers(boolean supportsQuestionsAndAnswers){
		this.supportsQuestionsAndAnswers = supportsQuestionsAndAnswers;
	}

	public boolean isSupportsQuestionsAndAnswers(){
		return supportsQuestionsAndAnswers;
	}

	public void setHasMultiple(boolean hasMultiple){
		this.hasMultiple = hasMultiple;
	}

	public boolean isHasMultiple(){
		return hasMultiple;
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

	public void setIsEligibleForBuyerProtection(boolean isEligibleForBuyerProtection){
		this.isEligibleForBuyerProtection = isEligibleForBuyerProtection;
	}

	public boolean isIsEligibleForBuyerProtection(){
		return isEligibleForBuyerProtection;
	}

	public void setCountUnprocessedSales(int countUnprocessedSales){
		this.countUnprocessedSales = countUnprocessedSales;
	}

	public int getCountUnprocessedSales(){
		return countUnprocessedSales;
	}

	public void setCanUsePayNowInstant(boolean canUsePayNowInstant){
		this.canUsePayNowInstant = canUsePayNowInstant;
	}

	public boolean isCanUsePayNowInstant(){
		return canUsePayNowInstant;
	}

	public void setBids(Bids bids){
		this.bids = bids;
	}

	public Bids getBids(){
		return bids;
	}

	public void setIsInTradeProtected(boolean isInTradeProtected){
		this.isInTradeProtected = isInTradeProtected;
	}

	public boolean isIsInTradeProtected(){
		return isInTradeProtected;
	}

	public void setListingGroupId(int listingGroupId){
		this.listingGroupId = listingGroupId;
	}

	public int getListingGroupId(){
		return listingGroupId;
	}

	public void setCurrentShippingPromotion(CurrentShippingPromotion currentShippingPromotion){
		this.currentShippingPromotion = currentShippingPromotion;
	}

	public CurrentShippingPromotion getCurrentShippingPromotion(){
		return currentShippingPromotion;
	}

	public void setSubtitle(String subtitle){
		this.subtitle = subtitle;
	}

	public String getSubtitle(){
		return subtitle;
	}

	public void setMemberRequestInformation(MemberRequestInformation memberRequestInformation){
		this.memberRequestInformation = memberRequestInformation;
	}

	public MemberRequestInformation getMemberRequestInformation(){
		return memberRequestInformation;
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

	public void setQuantityRemaining(int quantityRemaining){
		this.quantityRemaining = quantityRemaining;
	}

	public int getQuantityRemaining(){
		return quantityRemaining;
	}

	public void setDealership(Dealership dealership){
		this.dealership = dealership;
	}

	public Dealership getDealership(){
		return dealership;
	}

	public void setMaxBidAmount(double maxBidAmount){
		this.maxBidAmount = maxBidAmount;
	}

	public double getMaxBidAmount(){
		return maxBidAmount;
	}

	public void setFinanceOffer(FinanceOffer financeOffer){
		this.financeOffer = financeOffer;
	}

	public FinanceOffer getFinanceOffer(){
		return financeOffer;
	}

	public void setBranding(Branding branding){
		this.branding = branding;
	}

	public Branding getBranding(){
		return branding;
	}

	public void setUnansweredQuestionCount(int unansweredQuestionCount){
		this.unansweredQuestionCount = unansweredQuestionCount;
	}

	public int getUnansweredQuestionCount(){
		return unansweredQuestionCount;
	}

	public void setShippingOptions(List<ShippingOptionsItem> shippingOptions){
		this.shippingOptions = shippingOptions;
	}

	public List<ShippingOptionsItem> getShippingOptions(){
		return shippingOptions;
	}

	public void setCategoryPath(String categoryPath){
		this.categoryPath = categoryPath;
	}

	public String getCategoryPath(){
		return categoryPath;
	}

	public void setSales(List<SalesItem> sales){
		this.sales = sales;
	}

	public List<SalesItem> getSales(){
		return sales;
	}

	public void setLocalSales(LocalSales localSales){
		this.localSales = localSales;
	}

	public LocalSales getLocalSales(){
		return localSales;
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

	public void setAuthenticatedMembersOnly(boolean authenticatedMembersOnly){
		this.authenticatedMembersOnly = authenticatedMembersOnly;
	}

	public boolean isAuthenticatedMembersOnly(){
		return authenticatedMembersOnly;
	}

	public void setVariantDefinition(VariantDefinition variantDefinition){
		this.variantDefinition = variantDefinition;
	}

	public VariantDefinition getVariantDefinition(){
		return variantDefinition;
	}

	public void setBuyNowPrice(double buyNowPrice){
		this.buyNowPrice = buyNowPrice;
	}

	public double getBuyNowPrice(){
		return buyNowPrice;
	}

	public void setViewCount(int viewCount){
		this.viewCount = viewCount;
	}

	public int getViewCount(){
		return viewCount;
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

	public void setPhotoId(int photoId){
		this.photoId = photoId;
	}

	public int getPhotoId(){
		return photoId;
	}

	public void setOver18DeclarationRequiredToBuy(boolean over18DeclarationRequiredToBuy){
		this.over18DeclarationRequiredToBuy = over18DeclarationRequiredToBuy;
	}

	public boolean isOver18DeclarationRequiredToBuy(){
		return over18DeclarationRequiredToBuy;
	}

	public void setDonationRecipient(DonationRecipient donationRecipient){
		this.donationRecipient = donationRecipient;
	}

	public DonationRecipient getDonationRecipient(){
		return donationRecipient;
	}

	public void setIsReserveMet(boolean isReserveMet){
		this.isReserveMet = isReserveMet;
	}

	public boolean isIsReserveMet(){
		return isReserveMet;
	}

	public void setReservePrice(double reservePrice){
		this.reservePrice = reservePrice;
	}

	public double getReservePrice(){
		return reservePrice;
	}

	public void setIsSuperFeatured(boolean isSuperFeatured){
		this.isSuperFeatured = isSuperFeatured;
	}

	public boolean isIsSuperFeatured(){
		return isSuperFeatured;
	}

	public void setOpenHomes(List<OpenHomesItem> openHomes){
		this.openHomes = openHomes;
	}

	public List<OpenHomesItem> getOpenHomes(){
		return openHomes;
	}

	public void setContactCount(int contactCount){
		this.contactCount = contactCount;
	}

	public int getContactCount(){
		return contactCount;
	}

	public void setMemberProfile(MemberProfile memberProfile){
		this.memberProfile = memberProfile;
	}

	public MemberProfile getMemberProfile(){
		return memberProfile;
	}

	public void setSuperFeatureEndDate(String superFeatureEndDate){
		this.superFeatureEndDate = superFeatureEndDate;
	}

	public String getSuperFeatureEndDate(){
		return superFeatureEndDate;
	}

	public void setAttributes(List<AttributesItem> attributes){
		this.attributes = attributes;
	}

	public List<AttributesItem> getAttributes(){
		return attributes;
	}

	public void setWithdrawnBySeller(boolean withdrawnBySeller){
		this.withdrawnBySeller = withdrawnBySeller;
	}

	public boolean isWithdrawnBySeller(){
		return withdrawnBySeller;
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

	public void setFirearmsLicenseRequiredToBuy(boolean firearmsLicenseRequiredToBuy){
		this.firearmsLicenseRequiredToBuy = firearmsLicenseRequiredToBuy;
	}

	public boolean isFirearmsLicenseRequiredToBuy(){
		return firearmsLicenseRequiredToBuy;
	}

	public void setWasPrice(double wasPrice){
		this.wasPrice = wasPrice;
	}

	public double getWasPrice(){
		return wasPrice;
	}

	public void setClosedOffer(ClosedOffer closedOffer){
		this.closedOffer = closedOffer;
	}

	public ClosedOffer getClosedOffer(){
		return closedOffer;
	}

	public void setMember(Member member){
		this.member = member;
	}

	public Member getMember(){
		return member;
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

	public void setPaymentOptions(String paymentOptions){
		this.paymentOptions = paymentOptions;
	}

	public String getPaymentOptions(){
		return paymentOptions;
	}

	public void setIsInCart(boolean isInCart){
		this.isInCart = isInCart;
	}

	public boolean isIsInCart(){
		return isInCart;
	}

	public void setIsFeatured(boolean isFeatured){
		this.isFeatured = isFeatured;
	}

	public boolean isIsFeatured(){
		return isFeatured;
	}

	public void setIsOrNearOffer(boolean isOrNearOffer){
		this.isOrNearOffer = isOrNearOffer;
	}

	public boolean isIsOrNearOffer(){
		return isOrNearOffer;
	}

	public void setPendingOffer(PendingOffer pendingOffer){
		this.pendingOffer = pendingOffer;
	}

	public PendingOffer getPendingOffer(){
		return pendingOffer;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
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

	public void setBroadbandTechnologies(List<BroadbandTechnologiesItem> broadbandTechnologies){
		this.broadbandTechnologies = broadbandTechnologies;
	}

	public List<BroadbandTechnologiesItem> getBroadbandTechnologies(){
		return broadbandTechnologies;
	}

	public void setIsLeading(boolean isLeading){
		this.isLeading = isLeading;
	}

	public boolean isIsLeading(){
		return isLeading;
	}

	public void setIsOutbid(boolean isOutbid){
		this.isOutbid = isOutbid;
	}

	public boolean isIsOutbid(){
		return isOutbid;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setViewingTrackerSupported(boolean viewingTrackerSupported){
		this.viewingTrackerSupported = viewingTrackerSupported;
	}

	public boolean isViewingTrackerSupported(){
		return viewingTrackerSupported;
	}

	public void setCurrentAutoBid(double currentAutoBid){
		this.currentAutoBid = currentAutoBid;
	}

	public double getCurrentAutoBid(){
		return currentAutoBid;
	}

	public void setFormattedStartDate(String formattedStartDate){
		this.formattedStartDate = formattedStartDate;
	}

	public String getFormattedStartDate(){
		return formattedStartDate;
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

	public void setHasPing(boolean hasPing){
		this.hasPing = hasPing;
	}

	public boolean isHasPing(){
		return hasPing;
	}

	public void setHasContactDetails(boolean hasContactDetails){
		this.hasContactDetails = hasContactDetails;
	}

	public boolean isHasContactDetails(){
		return hasContactDetails;
	}

	public void setPhotos(List<PhotosItem> photos){
		this.photos = photos;
	}

	public List<PhotosItem> getPhotos(){
		return photos;
	}

	public void setTotalReviewCount(int totalReviewCount){
		this.totalReviewCount = totalReviewCount;
	}

	public int getTotalReviewCount(){
		return totalReviewCount;
	}

	public void setPositiveReviewCount(int positiveReviewCount){
		this.positiveReviewCount = positiveReviewCount;
	}

	public int getPositiveReviewCount(){
		return positiveReviewCount;
	}

	public void setEmbeddedContent(EmbeddedContent embeddedContent){
		this.embeddedContent = embeddedContent;
	}

	public EmbeddedContent getEmbeddedContent(){
		return embeddedContent;
	}

	public void setSuppressRelatedListings(boolean suppressRelatedListings){
		this.suppressRelatedListings = suppressRelatedListings;
	}

	public boolean isSuppressRelatedListings(){
		return suppressRelatedListings;
	}

	public void setSendPaymentInstructions(boolean sendPaymentInstructions){
		this.sendPaymentInstructions = sendPaymentInstructions;
	}

	public boolean isSendPaymentInstructions(){
		return sendPaymentInstructions;
	}

	public void setBody(String body){
		this.body = body;
	}

	public String getBody(){
		return body;
	}

	public void setAvailableToBuy(String availableToBuy){
		this.availableToBuy = availableToBuy;
	}

	public String getAvailableToBuy(){
		return availableToBuy;
	}

	public void setMotorWebBasicReport(MotorWebBasicReport motorWebBasicReport){
		this.motorWebBasicReport = motorWebBasicReport;
	}

	public MotorWebBasicReport getMotorWebBasicReport(){
		return motorWebBasicReport;
	}

	public void setCanAddToCart(boolean canAddToCart){
		this.canAddToCart = canAddToCart;
	}

	public boolean isCanAddToCart(){
		return canAddToCart;
	}

	public void setAgency(Agency agency){
		this.agency = agency;
	}

	public Agency getAgency(){
		return agency;
	}

	public void setOfferStatus(int offerStatus){
		this.offerStatus = offerStatus;
	}

	public int getOfferStatus(){
		return offerStatus;
	}

	public void setCanOffer(boolean canOffer){
		this.canOffer = canOffer;
	}

	public boolean isCanOffer(){
		return canOffer;
	}

	public void setBreadcrumbs(List<BreadcrumbsItem> breadcrumbs){
		this.breadcrumbs = breadcrumbs;
	}

	public List<BreadcrumbsItem> getBreadcrumbs(){
		return breadcrumbs;
	}

	public void setAllowsPickups(int allowsPickups){
		this.allowsPickups = allowsPickups;
	}

	public int getAllowsPickups(){
		return allowsPickups;
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

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setPercentageOff(int percentageOff){
		this.percentageOff = percentageOff;
	}

	public int getPercentageOff(){
		return percentageOff;
	}

	public void setProductSpecification(ProductSpecification productSpecification){
		this.productSpecification = productSpecification;
	}

	public ProductSpecification getProductSpecification(){
		return productSpecification;
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

	public void setHiddenAttributes(List<HiddenAttributesItem> hiddenAttributes){
		this.hiddenAttributes = hiddenAttributes;
	}

	public List<HiddenAttributesItem> getHiddenAttributes(){
		return hiddenAttributes;
	}

	public void setCanRelist(boolean canRelist){
		this.canRelist = canRelist;
	}

	public boolean isCanRelist(){
		return canRelist;
	}

	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}

	public String getCategoryName(){
		return categoryName;
	}

	public void setRegionId(int regionId){
		this.regionId = regionId;
	}

	public int getRegionId(){
		return regionId;
	}

	public void setMinimumNextBidAmount(double minimumNextBidAmount){
		this.minimumNextBidAmount = minimumNextBidAmount;
	}

	public double getMinimumNextBidAmount(){
		return minimumNextBidAmount;
	}

	public void setPriceDisplay(String priceDisplay){
		this.priceDisplay = priceDisplay;
	}

	public String getPriceDisplay(){
		return priceDisplay;
	}

	public void setSKU(String sKU){
		this.sKU = sKU;
	}

	public String getSKU(){
		return sKU;
	}

	@Override
 	public String toString(){
		return 
			"Listing{" + 
			"bidderAndWatchers = '" + bidderAndWatchers + '\'' + 
			",suburb = '" + suburb + '\'' + 
			",externalReferenceId = '" + externalReferenceId + '\'' + 
			",store = '" + store + '\'' + 
			",isFlatShippingCharge = '" + isFlatShippingCharge + '\'' + 
			",cartItemId = '" + cartItemId + '\'' + 
			",deferredPaymentDetails = '" + deferredPaymentDetails + '\'' + 
			",paymentMethods = '" + paymentMethods + '\'' + 
			",contactDetails = '" + contactDetails + '\'' + 
			",sponsorLinks = '" + sponsorLinks + '\'' + 
			",questions = '" + questions + '\'' + 
			",relistedItemId = '" + relistedItemId + '\'' + 
			",supportsQuestionsAndAnswers = '" + supportsQuestionsAndAnswers + '\'' + 
			",hasMultiple = '" + hasMultiple + '\'' + 
			",startPrice = '" + startPrice + '\'' + 
			",isClearance = '" + isClearance + '\'' + 
			",hasHomePageFeature = '" + hasHomePageFeature + '\'' + 
			",isEligibleForBuyerProtection = '" + isEligibleForBuyerProtection + '\'' + 
			",countUnprocessedSales = '" + countUnprocessedSales + '\'' + 
			",canUsePayNowInstant = '" + canUsePayNowInstant + '\'' + 
			",bids = '" + bids + '\'' + 
			",isInTradeProtected = '" + isInTradeProtected + '\'' + 
			",listingGroupId = '" + listingGroupId + '\'' + 
			",currentShippingPromotion = '" + currentShippingPromotion + '\'' + 
			",subtitle = '" + subtitle + '\'' + 
			",memberRequestInformation = '" + memberRequestInformation + '\'' + 
			",bidCount = '" + bidCount + '\'' + 
			",hasPayNow = '" + hasPayNow + '\'' + 
			",canonicalPath = '" + canonicalPath + '\'' + 
			",hasGallery = '" + hasGallery + '\'' + 
			",asAt = '" + asAt + '\'' + 
			",quantityRemaining = '" + quantityRemaining + '\'' + 
			",dealership = '" + dealership + '\'' + 
			",maxBidAmount = '" + maxBidAmount + '\'' + 
			",financeOffer = '" + financeOffer + '\'' + 
			",branding = '" + branding + '\'' + 
			",unansweredQuestionCount = '" + unansweredQuestionCount + '\'' + 
			",shippingOptions = '" + shippingOptions + '\'' + 
			",categoryPath = '" + categoryPath + '\'' + 
			",sales = '" + sales + '\'' + 
			",localSales = '" + localSales + '\'' + 
			",remainingGalleryPlusRelists = '" + remainingGalleryPlusRelists + '\'' + 
			",suburbId = '" + suburbId + '\'' + 
			",isHighlighted = '" + isHighlighted + '\'' + 
			",authenticatedMembersOnly = '" + authenticatedMembersOnly + '\'' + 
			",variantDefinition = '" + variantDefinition + '\'' + 
			",buyNowPrice = '" + buyNowPrice + '\'' + 
			",viewCount = '" + viewCount + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",isBuyNowOnly = '" + isBuyNowOnly + '\'' + 
			",photoId = '" + photoId + '\'' + 
			",over18DeclarationRequiredToBuy = '" + over18DeclarationRequiredToBuy + '\'' + 
			",donationRecipient = '" + donationRecipient + '\'' + 
			",isReserveMet = '" + isReserveMet + '\'' + 
			",reservePrice = '" + reservePrice + '\'' + 
			",isSuperFeatured = '" + isSuperFeatured + '\'' + 
			",openHomes = '" + openHomes + '\'' + 
			",contactCount = '" + contactCount + '\'' + 
			",memberProfile = '" + memberProfile + '\'' + 
			",superFeatureEndDate = '" + superFeatureEndDate + '\'' + 
			",attributes = '" + attributes + '\'' + 
			",withdrawnBySeller = '" + withdrawnBySeller + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",isClassified = '" + isClassified + '\'' + 
			",listingId = '" + listingId + '\'' + 
			",firearmsLicenseRequiredToBuy = '" + firearmsLicenseRequiredToBuy + '\'' + 
			",wasPrice = '" + wasPrice + '\'' + 
			",closedOffer = '" + closedOffer + '\'' + 
			",member = '" + member + '\'' + 
			",additionalData = '" + additionalData + '\'' + 
			",geographicLocation = '" + geographicLocation + '\'' + 
			",paymentOptions = '" + paymentOptions + '\'' + 
			",isInCart = '" + isInCart + '\'' + 
			",isFeatured = '" + isFeatured + '\'' + 
			",isOrNearOffer = '" + isOrNearOffer + '\'' + 
			",pendingOffer = '" + pendingOffer + '\'' + 
			",region = '" + region + '\'' + 
			",hasReserve = '" + hasReserve + '\'' + 
			",isOnWatchList = '" + isOnWatchList + '\'' + 
			",broadbandTechnologies = '" + broadbandTechnologies + '\'' + 
			",isLeading = '" + isLeading + '\'' + 
			",isOutbid = '" + isOutbid + '\'' + 
			",category = '" + category + '\'' + 
			",viewingTrackerSupported = '" + viewingTrackerSupported + '\'' + 
			",currentAutoBid = '" + currentAutoBid + '\'' + 
			",formattedStartDate = '" + formattedStartDate + '\'' + 
			",isNew = '" + isNew + '\'' + 
			",hasBuyNow = '" + hasBuyNow + '\'' + 
			",hasPing = '" + hasPing + '\'' + 
			",hasContactDetails = '" + hasContactDetails + '\'' + 
			",photos = '" + photos + '\'' + 
			",totalReviewCount = '" + totalReviewCount + '\'' + 
			",positiveReviewCount = '" + positiveReviewCount + '\'' + 
			",embeddedContent = '" + embeddedContent + '\'' + 
			",suppressRelatedListings = '" + suppressRelatedListings + '\'' + 
			",sendPaymentInstructions = '" + sendPaymentInstructions + '\'' + 
			",body = '" + body + '\'' + 
			",availableToBuy = '" + availableToBuy + '\'' + 
			",motorWebBasicReport = '" + motorWebBasicReport + '\'' + 
			",canAddToCart = '" + canAddToCart + '\'' + 
			",agency = '" + agency + '\'' + 
			",offerStatus = '" + offerStatus + '\'' + 
			",canOffer = '" + canOffer + '\'' + 
			",breadcrumbs = '" + breadcrumbs + '\'' + 
			",allowsPickups = '" + allowsPickups + '\'' + 
			",title = '" + title + '\'' + 
			",isBold = '" + isBold + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",percentageOff = '" + percentageOff + '\'' + 
			",productSpecification = '" + productSpecification + '\'' + 
			",reserveState = '" + reserveState + '\'' + 
			",noteDate = '" + noteDate + '\'' + 
			",hiddenAttributes = '" + hiddenAttributes + '\'' + 
			",canRelist = '" + canRelist + '\'' + 
			",categoryName = '" + categoryName + '\'' + 
			",regionId = '" + regionId + '\'' + 
			",minimumNextBidAmount = '" + minimumNextBidAmount + '\'' + 
			",priceDisplay = '" + priceDisplay + '\'' + 
			",sKU = '" + sKU + '\'' + 
			"}";
		}
}