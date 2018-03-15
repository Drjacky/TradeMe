package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CurrentShippingPromotion{

	@SerializedName("Threshold")
	private int threshold;

	@SerializedName("ThresholdType")
	private int thresholdType;

	public void setThreshold(int threshold){
		this.threshold = threshold;
	}

	public int getThreshold(){
		return threshold;
	}

	public void setThresholdType(int thresholdType){
		this.thresholdType = thresholdType;
	}

	public int getThresholdType(){
		return thresholdType;
	}

	@Override
 	public String toString(){
		return 
			"CurrentShippingPromotion{" + 
			"threshold = '" + threshold + '\'' + 
			",thresholdType = '" + thresholdType + '\'' + 
			"}";
		}
}