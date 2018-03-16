package ir.hosseinabbasi.trademe.data.db.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;

@Generated("com.robohorse.robopojogenerator")
public class Root extends RealmObject{

	@SerializedName("Path")
	private String path;

	@SerializedName("IsLeaf")
	private boolean isLeaf;

	@SerializedName("Subcategories")
	private RealmList<SubcategoriesItem> subcategories;

	@SerializedName("Number")
	private String number;

	@SerializedName("Name")
	private String name;

	@SerializedName("Count")
	private int count;

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

	public void setSubcategories(RealmList<SubcategoriesItem> subcategories){
		this.subcategories = subcategories;
	}

	public RealmList<SubcategoriesItem> getSubcategories(){
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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
			",count = '" + count + '\'' +
			"}";
		}
}