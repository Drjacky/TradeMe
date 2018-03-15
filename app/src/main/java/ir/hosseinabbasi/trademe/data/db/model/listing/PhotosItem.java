package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PhotosItem{

	@SerializedName("Value")
	private Value value;

	@SerializedName("Key")
	private int key;

	public void setValue(Value value){
		this.value = value;
	}

	public Value getValue(){
		return value;
	}

	public void setKey(int key){
		this.key = key;
	}

	public int getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"PhotosItem{" + 
			"value = '" + value + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}