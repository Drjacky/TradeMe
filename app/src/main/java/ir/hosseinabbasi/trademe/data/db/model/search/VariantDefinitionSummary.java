package ir.hosseinabbasi.trademe.data.db.model.search;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class VariantDefinitionSummary{

	@SerializedName("HasDiscountPercentRange")
	private boolean hasDiscountPercentRange;

	@SerializedName("AllDiscounted")
	private boolean allDiscounted;

	@SerializedName("PriceHigh")
	private double priceHigh;

	@SerializedName("Price")
	private double price;

	@SerializedName("PriceLow")
	private double priceLow;

	@SerializedName("DiscountPercentLow")
	private int discountPercentLow;

	@SerializedName("DiscountPercent")
	private int discountPercent;

	@SerializedName("AllOnClearance")
	private boolean allOnClearance;

	@SerializedName("HasPriceRange")
	private boolean hasPriceRange;

	@SerializedName("DiscountPercentHigh")
	private int discountPercentHigh;

	public void setHasDiscountPercentRange(boolean hasDiscountPercentRange){
		this.hasDiscountPercentRange = hasDiscountPercentRange;
	}

	public boolean isHasDiscountPercentRange(){
		return hasDiscountPercentRange;
	}

	public void setAllDiscounted(boolean allDiscounted){
		this.allDiscounted = allDiscounted;
	}

	public boolean isAllDiscounted(){
		return allDiscounted;
	}

	public void setPriceHigh(double priceHigh){
		this.priceHigh = priceHigh;
	}

	public double getPriceHigh(){
		return priceHigh;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setPriceLow(double priceLow){
		this.priceLow = priceLow;
	}

	public double getPriceLow(){
		return priceLow;
	}

	public void setDiscountPercentLow(int discountPercentLow){
		this.discountPercentLow = discountPercentLow;
	}

	public int getDiscountPercentLow(){
		return discountPercentLow;
	}

	public void setDiscountPercent(int discountPercent){
		this.discountPercent = discountPercent;
	}

	public int getDiscountPercent(){
		return discountPercent;
	}

	public void setAllOnClearance(boolean allOnClearance){
		this.allOnClearance = allOnClearance;
	}

	public boolean isAllOnClearance(){
		return allOnClearance;
	}

	public void setHasPriceRange(boolean hasPriceRange){
		this.hasPriceRange = hasPriceRange;
	}

	public boolean isHasPriceRange(){
		return hasPriceRange;
	}

	public void setDiscountPercentHigh(int discountPercentHigh){
		this.discountPercentHigh = discountPercentHigh;
	}

	public int getDiscountPercentHigh(){
		return discountPercentHigh;
	}

	@Override
 	public String toString(){
		return 
			"VariantDefinitionSummary{" + 
			"hasDiscountPercentRange = '" + hasDiscountPercentRange + '\'' + 
			",allDiscounted = '" + allDiscounted + '\'' + 
			",priceHigh = '" + priceHigh + '\'' + 
			",price = '" + price + '\'' + 
			",priceLow = '" + priceLow + '\'' + 
			",discountPercentLow = '" + discountPercentLow + '\'' + 
			",discountPercent = '" + discountPercent + '\'' + 
			",allOnClearance = '" + allOnClearance + '\'' + 
			",hasPriceRange = '" + hasPriceRange + '\'' + 
			",discountPercentHigh = '" + discountPercentHigh + '\'' + 
			"}";
		}
}