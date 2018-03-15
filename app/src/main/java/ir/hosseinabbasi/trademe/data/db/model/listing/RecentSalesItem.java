package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class RecentSalesItem{

	@SerializedName("Address")
	private String address;

	@SerializedName("ListingId")
	private String listingId;

	@SerializedName("SalePrice")
	private int salePrice;

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setListingId(String listingId){
		this.listingId = listingId;
	}

	public String getListingId(){
		return listingId;
	}

	public void setSalePrice(int salePrice){
		this.salePrice = salePrice;
	}

	public int getSalePrice(){
		return salePrice;
	}

	@Override
 	public String toString(){
		return 
			"RecentSalesItem{" + 
			"address = '" + address + '\'' + 
			",listingId = '" + listingId + '\'' + 
			",salePrice = '" + salePrice + '\'' + 
			"}";
		}
}