package ir.hosseinabbasi.trademe.data.db.model.search;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class OptionsItem{

	@SerializedName("Value")
	private String value;

	@SerializedName("Display")
	private String display;

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public void setDisplay(String display){
		this.display = display;
	}

	public String getDisplay(){
		return display;
	}

	@Override
 	public String toString(){
		return 
			"OptionsItem{" + 
			"value = '" + value + '\'' + 
			",display = '" + display + '\'' + 
			"}";
		}
}