package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class OptionsItem{

	@SerializedName("Value")
	private String value;

	@SerializedName("Name")
	private String name;

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
			"OptionsItem{" + 
			"value = '" + value + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}