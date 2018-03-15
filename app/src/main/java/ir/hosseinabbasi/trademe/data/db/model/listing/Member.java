package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Member{

	@SerializedName("Email")
	private String email;

	@SerializedName("IsTopSeller")
	private boolean isTopSeller;

	@SerializedName("Suburb")
	private String suburb;

	@SerializedName("IsAuthenticated")
	private boolean isAuthenticated;

	@SerializedName("Photo")
	private String photo;

	@SerializedName("IsDealer")
	private boolean isDealer;

	@SerializedName("IsInTrade")
	private boolean isInTrade;

	@SerializedName("DateAddressVerified")
	private String dateAddressVerified;

	@SerializedName("ImportChargesMayApply")
	private boolean importChargesMayApply;

	@SerializedName("MemberId")
	private int memberId;

	@SerializedName("UniqueNegative")
	private int uniqueNegative;

	@SerializedName("DateJoined")
	private String dateJoined;

	@SerializedName("UniquePositive")
	private int uniquePositive;

	@SerializedName("FeedbackCount")
	private int feedbackCount;

	@SerializedName("IsAddressVerified")
	private boolean isAddressVerified;

	@SerializedName("Region")
	private String region;

	@SerializedName("Nickname")
	private String nickname;

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setIsTopSeller(boolean isTopSeller){
		this.isTopSeller = isTopSeller;
	}

	public boolean isIsTopSeller(){
		return isTopSeller;
	}

	public void setSuburb(String suburb){
		this.suburb = suburb;
	}

	public String getSuburb(){
		return suburb;
	}

	public void setIsAuthenticated(boolean isAuthenticated){
		this.isAuthenticated = isAuthenticated;
	}

	public boolean isIsAuthenticated(){
		return isAuthenticated;
	}

	public void setPhoto(String photo){
		this.photo = photo;
	}

	public String getPhoto(){
		return photo;
	}

	public void setIsDealer(boolean isDealer){
		this.isDealer = isDealer;
	}

	public boolean isIsDealer(){
		return isDealer;
	}

	public void setIsInTrade(boolean isInTrade){
		this.isInTrade = isInTrade;
	}

	public boolean isIsInTrade(){
		return isInTrade;
	}

	public void setDateAddressVerified(String dateAddressVerified){
		this.dateAddressVerified = dateAddressVerified;
	}

	public String getDateAddressVerified(){
		return dateAddressVerified;
	}

	public void setImportChargesMayApply(boolean importChargesMayApply){
		this.importChargesMayApply = importChargesMayApply;
	}

	public boolean isImportChargesMayApply(){
		return importChargesMayApply;
	}

	public void setMemberId(int memberId){
		this.memberId = memberId;
	}

	public int getMemberId(){
		return memberId;
	}

	public void setUniqueNegative(int uniqueNegative){
		this.uniqueNegative = uniqueNegative;
	}

	public int getUniqueNegative(){
		return uniqueNegative;
	}

	public void setDateJoined(String dateJoined){
		this.dateJoined = dateJoined;
	}

	public String getDateJoined(){
		return dateJoined;
	}

	public void setUniquePositive(int uniquePositive){
		this.uniquePositive = uniquePositive;
	}

	public int getUniquePositive(){
		return uniquePositive;
	}

	public void setFeedbackCount(int feedbackCount){
		this.feedbackCount = feedbackCount;
	}

	public int getFeedbackCount(){
		return feedbackCount;
	}

	public void setIsAddressVerified(boolean isAddressVerified){
		this.isAddressVerified = isAddressVerified;
	}

	public boolean isIsAddressVerified(){
		return isAddressVerified;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getNickname(){
		return nickname;
	}

	@Override
 	public String toString(){
		return 
			"Member{" + 
			"email = '" + email + '\'' + 
			",isTopSeller = '" + isTopSeller + '\'' + 
			",suburb = '" + suburb + '\'' + 
			",isAuthenticated = '" + isAuthenticated + '\'' + 
			",photo = '" + photo + '\'' + 
			",isDealer = '" + isDealer + '\'' + 
			",isInTrade = '" + isInTrade + '\'' + 
			",dateAddressVerified = '" + dateAddressVerified + '\'' + 
			",importChargesMayApply = '" + importChargesMayApply + '\'' + 
			",memberId = '" + memberId + '\'' + 
			",uniqueNegative = '" + uniqueNegative + '\'' + 
			",dateJoined = '" + dateJoined + '\'' + 
			",uniquePositive = '" + uniquePositive + '\'' + 
			",feedbackCount = '" + feedbackCount + '\'' + 
			",isAddressVerified = '" + isAddressVerified + '\'' + 
			",region = '" + region + '\'' + 
			",nickname = '" + nickname + '\'' + 
			"}";
		}
}