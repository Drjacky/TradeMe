package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class RefundCollectionItem{

	@SerializedName("Destination")
	private String destination;

	@SerializedName("Amount")
	private double amount;

	public void setDestination(String destination){
		this.destination = destination;
	}

	public String getDestination(){
		return destination;
	}

	public void setAmount(double amount){
		this.amount = amount;
	}

	public double getAmount(){
		return amount;
	}

	@Override
 	public String toString(){
		return 
			"RefundCollectionItem{" + 
			"destination = '" + destination + '\'' + 
			",amount = '" + amount + '\'' + 
			"}";
		}
}