package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class OptionSetsItem{

	@SerializedName("Values")
	private List<String> values;

	@SerializedName("Name")
	private String name;

	public void setValues(List<String> values){
		this.values = values;
	}

	public List<String> getValues(){
		return values;
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
			"OptionSetsItem{" + 
			"values = '" + values + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}