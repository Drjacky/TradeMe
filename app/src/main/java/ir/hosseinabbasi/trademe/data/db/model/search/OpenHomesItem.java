package ir.hosseinabbasi.trademe.data.db.model.search;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class OpenHomesItem{

	@SerializedName("Start")
	private String start;

	@SerializedName("End")
	private String end;

	public void setStart(String start){
		this.start = start;
	}

	public String getStart(){
		return start;
	}

	public void setEnd(String end){
		this.end = end;
	}

	public String getEnd(){
		return end;
	}

	@Override
 	public String toString(){
		return 
			"OpenHomesItem{" + 
			"start = '" + start + '\'' + 
			",end = '" + end + '\'' + 
			"}";
		}
}