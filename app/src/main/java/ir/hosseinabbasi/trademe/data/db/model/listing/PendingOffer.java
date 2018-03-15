package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PendingOffer{

	@SerializedName("OfferExpiryDate")
	private String offerExpiryDate;

	@SerializedName("Recipients")
	private List<RecipientsItem> recipients;

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

	public void setRecipients(List<RecipientsItem> recipients){
		this.recipients = recipients;
	}

	public List<RecipientsItem> getRecipients(){
		return recipients;
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
			"PendingOffer{" + 
			"offerExpiryDate = '" + offerExpiryDate + '\'' + 
			",recipients = '" + recipients + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",offerPrice = '" + offerPrice + '\'' + 
			"}";
		}
}