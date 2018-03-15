package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class EmbeddedContent{

	@SerializedName("YouTubeVideoKey")
	private String youTubeVideoKey;

	@SerializedName("MatterportKey")
	private String matterportKey;

	public void setYouTubeVideoKey(String youTubeVideoKey){
		this.youTubeVideoKey = youTubeVideoKey;
	}

	public String getYouTubeVideoKey(){
		return youTubeVideoKey;
	}

	public void setMatterportKey(String matterportKey){
		this.matterportKey = matterportKey;
	}

	public String getMatterportKey(){
		return matterportKey;
	}

	@Override
 	public String toString(){
		return 
			"EmbeddedContent{" + 
			"youTubeVideoKey = '" + youTubeVideoKey + '\'' + 
			",matterportKey = '" + matterportKey + '\'' + 
			"}";
		}
}