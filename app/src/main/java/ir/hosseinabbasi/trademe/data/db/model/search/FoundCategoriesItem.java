package ir.hosseinabbasi.trademe.data.db.model.search;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class FoundCategoriesItem{

	@SerializedName("CategoryId")
	private int categoryId;

	@SerializedName("IsLeaf")
	private boolean isLeaf;

	@SerializedName("Category")
	private String category;

	@SerializedName("IsRestricted")
	private boolean isRestricted;

	@SerializedName("CanonicalPath")
	private String canonicalPath;

	@SerializedName("Count")
	private int count;

	@SerializedName("Name")
	private String name;

	public void setCategoryId(int categoryId){
		this.categoryId = categoryId;
	}

	public int getCategoryId(){
		return categoryId;
	}

	public void setIsLeaf(boolean isLeaf){
		this.isLeaf = isLeaf;
	}

	public boolean isIsLeaf(){
		return isLeaf;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setIsRestricted(boolean isRestricted){
		this.isRestricted = isRestricted;
	}

	public boolean isIsRestricted(){
		return isRestricted;
	}

	public void setCanonicalPath(String canonicalPath){
		this.canonicalPath = canonicalPath;
	}

	public String getCanonicalPath(){
		return canonicalPath;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"FoundCategoriesItem{" + 
			"categoryId = '" + categoryId + '\'' + 
			",isLeaf = '" + isLeaf + '\'' + 
			",category = '" + category + '\'' + 
			",isRestricted = '" + isRestricted + '\'' + 
			",canonicalPath = '" + canonicalPath + '\'' + 
			",count = '" + count + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}