package ir.hosseinabbasi.trademe.data.db.model.search;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class MemberProfile{

	@SerializedName("Quote")
	private String quote;

	@SerializedName("Occupation")
	private String occupation;

	@SerializedName("IsEnabled")
	private boolean isEnabled;

	@SerializedName("FirstName")
	private String firstName;

	@SerializedName("Biography")
	private String biography;

	@SerializedName("Store")
	private Store store;

	@SerializedName("Photo")
	private String photo;

	@SerializedName("DateRemoved")
	private String dateRemoved;

	@SerializedName("Member")
	private Member member;

	@SerializedName("FavouriteId")
	private int favouriteId;

	public void setQuote(String quote){
		this.quote = quote;
	}

	public String getQuote(){
		return quote;
	}

	public void setOccupation(String occupation){
		this.occupation = occupation;
	}

	public String getOccupation(){
		return occupation;
	}

	public void setIsEnabled(boolean isEnabled){
		this.isEnabled = isEnabled;
	}

	public boolean isIsEnabled(){
		return isEnabled;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setBiography(String biography){
		this.biography = biography;
	}

	public String getBiography(){
		return biography;
	}

	public void setStore(Store store){
		this.store = store;
	}

	public Store getStore(){
		return store;
	}

	public void setPhoto(String photo){
		this.photo = photo;
	}

	public String getPhoto(){
		return photo;
	}

	public void setDateRemoved(String dateRemoved){
		this.dateRemoved = dateRemoved;
	}

	public String getDateRemoved(){
		return dateRemoved;
	}

	public void setMember(Member member){
		this.member = member;
	}

	public Member getMember(){
		return member;
	}

	public void setFavouriteId(int favouriteId){
		this.favouriteId = favouriteId;
	}

	public int getFavouriteId(){
		return favouriteId;
	}

	@Override
 	public String toString(){
		return 
			"MemberProfile{" + 
			"quote = '" + quote + '\'' + 
			",occupation = '" + occupation + '\'' + 
			",isEnabled = '" + isEnabled + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",biography = '" + biography + '\'' + 
			",store = '" + store + '\'' + 
			",photo = '" + photo + '\'' + 
			",dateRemoved = '" + dateRemoved + '\'' + 
			",member = '" + member + '\'' + 
			",favouriteId = '" + favouriteId + '\'' + 
			"}";
		}
}