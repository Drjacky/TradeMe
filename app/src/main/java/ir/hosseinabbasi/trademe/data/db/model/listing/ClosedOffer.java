package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ClosedOffer{

	@SerializedName("OfferExpiryDate")
	private String offerExpiryDate;

	@SerializedName("Quantity")
	private int quantity;

	@SerializedName("OfferPrice")
	private double offerPrice;

	public void setOfferExpiryDate(String offerExpiryDate){
		this.offerExpiryDate = offerExpiryDate;
	}

	public String getOfferExpiryDate(){
		return offerExpiryDate;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setOfferPrice(double offerPrice){
		this.offerPrice = offerPrice;
	}

	public double getOfferPrice(){
		return offerPrice;
	}

	@Override
 	public String toString(){
		return 
			"ClosedOffer{" + 
			"offerExpiryDate = '" + offerExpiryDate + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",offerPrice = '" + offerPrice + '\'' + 
			"}";
		}
}