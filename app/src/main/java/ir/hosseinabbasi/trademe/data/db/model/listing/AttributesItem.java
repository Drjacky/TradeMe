package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AttributesItem{

	@SerializedName("Options")
	private List<OptionsItem> options;

	@SerializedName("EncodedValue")
	private String encodedValue;

	@SerializedName("Type")
	private int type;

	@SerializedName("DisplayValue")
	private String displayValue;

	@SerializedName("DisplayName")
	private String displayName;

	@SerializedName("Value")
	private String value;

	@SerializedName("IsRequiredForSell")
	private boolean isRequiredForSell;

	@SerializedName("Range")
	private Range range;

	@SerializedName("Name")
	private String name;

	public void setOptions(List<OptionsItem> options){
		this.options = options;
	}

	public List<OptionsItem> getOptions(){
		return options;
	}

	public void setEncodedValue(String encodedValue){
		this.encodedValue = encodedValue;
	}

	public String getEncodedValue(){
		return encodedValue;
	}

	public void setType(int type){
		this.type = type;
	}

	public int getType(){
		return type;
	}

	public void setDisplayValue(String displayValue){
		this.displayValue = displayValue;
	}

	public String getDisplayValue(){
		return displayValue;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public void setIsRequiredForSell(boolean isRequiredForSell){
		this.isRequiredForSell = isRequiredForSell;
	}

	public boolean isIsRequiredForSell(){
		return isRequiredForSell;
	}

	public void setRange(Range range){
		this.range = range;
	}

	public Range getRange(){
		return range;
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
			"AttributesItem{" + 
			"options = '" + options + '\'' + 
			",encodedValue = '" + encodedValue + '\'' + 
			",type = '" + type + '\'' + 
			",displayValue = '" + displayValue + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",value = '" + value + '\'' + 
			",isRequiredForSell = '" + isRequiredForSell + '\'' + 
			",range = '" + range + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}