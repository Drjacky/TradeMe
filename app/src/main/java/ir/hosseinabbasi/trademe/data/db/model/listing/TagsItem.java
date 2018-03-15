package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class TagsItem{

	@SerializedName("Name")
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"TagsItem{" + 
			"name = '" + name + '\'' + 
			"}";
		}
}