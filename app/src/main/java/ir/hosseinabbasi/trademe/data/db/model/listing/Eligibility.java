package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Eligibility{

	@SerializedName("MaximumTransactionValue")
	private double maximumTransactionValue;

	@SerializedName("MinimumTransactionValue")
	private double minimumTransactionValue;

	public void setMaximumTransactionValue(double maximumTransactionValue){
		this.maximumTransactionValue = maximumTransactionValue;
	}

	public double getMaximumTransactionValue(){
		return maximumTransactionValue;
	}

	public void setMinimumTransactionValue(double minimumTransactionValue){
		this.minimumTransactionValue = minimumTransactionValue;
	}

	public double getMinimumTransactionValue(){
		return minimumTransactionValue;
	}

	@Override
 	public String toString(){
		return 
			"Eligibility{" + 
			"maximumTransactionValue = '" + maximumTransactionValue + '\'' + 
			",minimumTransactionValue = '" + minimumTransactionValue + '\'' + 
			"}";
		}
}