package ir.hosseinabbasi.trademe.data.db.model.search;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PromotionsItem{

	@SerializedName("ImageUri")
	private String imageUri;

	public void setImageUri(String imageUri){
		this.imageUri = imageUri;
	}

	public String getImageUri(){
		return imageUri;
	}

	@Override
 	public String toString(){
		return 
			"PromotionsItem{" + 
			"imageUri = '" + imageUri + '\'' + 
			"}";
		}
}