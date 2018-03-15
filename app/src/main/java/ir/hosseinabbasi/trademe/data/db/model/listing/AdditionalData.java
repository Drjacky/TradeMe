package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AdditionalData{

	@SerializedName("BulletPoints")
	private List<String> bulletPoints;

	@SerializedName("Tags")
	private List<TagsItem> tags;

	public void setBulletPoints(List<String> bulletPoints){
		this.bulletPoints = bulletPoints;
	}

	public List<String> getBulletPoints(){
		return bulletPoints;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"AdditionalData{" + 
			"bulletPoints = '" + bulletPoints + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}