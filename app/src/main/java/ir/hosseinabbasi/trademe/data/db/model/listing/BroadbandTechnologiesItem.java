package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class BroadbandTechnologiesItem{

	@SerializedName("Availability")
	private String availability;

	@SerializedName("Completion")
	private String completion;

	@SerializedName("MinUp")
	private double minUp;

	@SerializedName("MaxUp")
	private double maxUp;

	@SerializedName("MaxDown")
	private double maxDown;

	@SerializedName("Name")
	private String name;

	@SerializedName("MinDown")
	private double minDown;

	public void setAvailability(String availability){
		this.availability = availability;
	}

	public String getAvailability(){
		return availability;
	}

	public void setCompletion(String completion){
		this.completion = completion;
	}

	public String getCompletion(){
		return completion;
	}

	public void setMinUp(double minUp){
		this.minUp = minUp;
	}

	public double getMinUp(){
		return minUp;
	}

	public void setMaxUp(double maxUp){
		this.maxUp = maxUp;
	}

	public double getMaxUp(){
		return maxUp;
	}

	public void setMaxDown(double maxDown){
		this.maxDown = maxDown;
	}

	public double getMaxDown(){
		return maxDown;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setMinDown(double minDown){
		this.minDown = minDown;
	}

	public double getMinDown(){
		return minDown;
	}

	@Override
 	public String toString(){
		return 
			"BroadbandTechnologiesItem{" + 
			"availability = '" + availability + '\'' + 
			",completion = '" + completion + '\'' + 
			",minUp = '" + minUp + '\'' + 
			",maxUp = '" + maxUp + '\'' + 
			",maxDown = '" + maxDown + '\'' + 
			",name = '" + name + '\'' + 
			",minDown = '" + minDown + '\'' + 
			"}";
		}
}