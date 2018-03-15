package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class BreadcrumbsItem{

	@SerializedName("CanonicalPathFragment")
	private String canonicalPathFragment;

	@SerializedName("DisplayName")
	private String displayName;

	@SerializedName("CanonicalPath")
	private String canonicalPath;

	@SerializedName("Value")
	private String value;

	@SerializedName("Name")
	private String name;

	public void setCanonicalPathFragment(String canonicalPathFragment){
		this.canonicalPathFragment = canonicalPathFragment;
	}

	public String getCanonicalPathFragment(){
		return canonicalPathFragment;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setCanonicalPath(String canonicalPath){
		this.canonicalPath = canonicalPath;
	}

	public String getCanonicalPath(){
		return canonicalPath;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
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
			"BreadcrumbsItem{" + 
			"canonicalPathFragment = '" + canonicalPathFragment + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",canonicalPath = '" + canonicalPath + '\'' + 
			",value = '" + value + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}