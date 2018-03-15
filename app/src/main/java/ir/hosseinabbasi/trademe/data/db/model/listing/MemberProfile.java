package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class MemberProfile{

	@SerializedName("Quote")
	private String quote;

	@SerializedName("Occupation")
	private String occupation;

	@SerializedName("Biography")
	private String biography;

	@SerializedName("Photo")
	private String photo;

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

	public void setBiography(String biography){
		this.biography = biography;
	}

	public String getBiography(){
		return biography;
	}

	public void setPhoto(String photo){
		this.photo = photo;
	}

	public String getPhoto(){
		return photo;
	}

	@Override
 	public String toString(){
		return 
			"MemberProfile{" + 
			"quote = '" + quote + '\'' + 
			",occupation = '" + occupation + '\'' + 
			",biography = '" + biography + '\'' + 
			",photo = '" + photo + '\'' + 
			"}";
		}
}