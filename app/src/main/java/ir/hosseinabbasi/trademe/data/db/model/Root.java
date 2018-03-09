package ir.hosseinabbasi.trademe.data.db.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Root{

	@SerializedName("Path")
	private String path;

	@SerializedName("IsLeaf")
	private boolean isLeaf;

	@SerializedName("Subcategories")
	private List<SubcategoriesItem> subcategories;

	@SerializedName("Number")
	private String number;

	@SerializedName("Name")
	private String name;

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setIsLeaf(boolean isLeaf){
		this.isLeaf = isLeaf;
	}

	public boolean isIsLeaf(){
		return isLeaf;
	}

	public void setSubcategories(List<SubcategoriesItem> subcategories){
		this.subcategories = subcategories;
	}

	public List<SubcategoriesItem> getSubcategories(){
		return subcategories;
	}

	public void setNumber(String number){
		this.number = number;
	}

	public String getNumber(){
		return number;
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
			"Root{" + 
			"path = '" + path + '\'' + 
			",isLeaf = '" + isLeaf + '\'' + 
			",subcategories = '" + subcategories + '\'' + 
			",number = '" + number + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}