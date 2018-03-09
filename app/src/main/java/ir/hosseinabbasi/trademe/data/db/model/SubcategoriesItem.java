package ir.hosseinabbasi.trademe.data.db.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SubcategoriesItem{

	@SerializedName("Path")
	private String path;

	@SerializedName("CanBeSecondCategory")
	private boolean canBeSecondCategory;

	@SerializedName("HasClassifieds")
	private boolean hasClassifieds;

	@SerializedName("IsLeaf")
	private boolean isLeaf;

	@SerializedName("Subcategories")
	private List<SubcategoriesItem> subcategories;

	@SerializedName("Number")
	private String number;

	@SerializedName("CanHaveSecondCategory")
	private boolean canHaveSecondCategory;

	@SerializedName("Name")
	private String name;

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setCanBeSecondCategory(boolean canBeSecondCategory){
		this.canBeSecondCategory = canBeSecondCategory;
	}

	public boolean isCanBeSecondCategory(){
		return canBeSecondCategory;
	}

	public void setHasClassifieds(boolean hasClassifieds){
		this.hasClassifieds = hasClassifieds;
	}

	public boolean isHasClassifieds(){
		return hasClassifieds;
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

	public void setCanHaveSecondCategory(boolean canHaveSecondCategory){
		this.canHaveSecondCategory = canHaveSecondCategory;
	}

	public boolean isCanHaveSecondCategory(){
		return canHaveSecondCategory;
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
			"SubcategoriesItem{" + 
			"path = '" + path + '\'' + 
			",canBeSecondCategory = '" + canBeSecondCategory + '\'' + 
			",hasClassifieds = '" + hasClassifieds + '\'' + 
			",isLeaf = '" + isLeaf + '\'' + 
			",subcategories = '" + subcategories + '\'' + 
			",number = '" + number + '\'' + 
			",canHaveSecondCategory = '" + canHaveSecondCategory + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}