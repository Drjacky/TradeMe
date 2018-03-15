package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Value{

	@SerializedName("PhotoId")
	private int photoId;

	@SerializedName("Medium")
	private String medium;

	@SerializedName("Gallery")
	private String gallery;

	@SerializedName("Large")
	private String large;

	@SerializedName("List")
	private String list;

	@SerializedName("PlusSize")
	private String plusSize;

	@SerializedName("OriginalHeight")
	private int originalHeight;

	@SerializedName("Thumbnail")
	private String thumbnail;

	@SerializedName("FullSize")
	private String fullSize;

	@SerializedName("OriginalWidth")
	private int originalWidth;

	public void setPhotoId(int photoId){
		this.photoId = photoId;
	}

	public int getPhotoId(){
		return photoId;
	}

	public void setMedium(String medium){
		this.medium = medium;
	}

	public String getMedium(){
		return medium;
	}

	public void setGallery(String gallery){
		this.gallery = gallery;
	}

	public String getGallery(){
		return gallery;
	}

	public void setLarge(String large){
		this.large = large;
	}

	public String getLarge(){
		return large;
	}

	public void setList(String list){
		this.list = list;
	}

	public String getList(){
		return list;
	}

	public void setPlusSize(String plusSize){
		this.plusSize = plusSize;
	}

	public String getPlusSize(){
		return plusSize;
	}

	public void setOriginalHeight(int originalHeight){
		this.originalHeight = originalHeight;
	}

	public int getOriginalHeight(){
		return originalHeight;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public void setFullSize(String fullSize){
		this.fullSize = fullSize;
	}

	public String getFullSize(){
		return fullSize;
	}

	public void setOriginalWidth(int originalWidth){
		this.originalWidth = originalWidth;
	}

	public int getOriginalWidth(){
		return originalWidth;
	}

	@Override
 	public String toString(){
		return 
			"Value{" + 
			"photoId = '" + photoId + '\'' + 
			",medium = '" + medium + '\'' + 
			",gallery = '" + gallery + '\'' + 
			",large = '" + large + '\'' + 
			",list = '" + list + '\'' + 
			",plusSize = '" + plusSize + '\'' + 
			",originalHeight = '" + originalHeight + '\'' + 
			",thumbnail = '" + thumbnail + '\'' + 
			",fullSize = '" + fullSize + '\'' + 
			",originalWidth = '" + originalWidth + '\'' + 
			"}";
		}
}