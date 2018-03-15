package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class VariantsItem{

	@SerializedName("Photos")
	private List<PhotosItem> photos;

	@SerializedName("Options")
	private List<OptionsItem> options;

	@SerializedName("Price")
	private double price;

	@SerializedName("Attributes")
	private List<AttributesItem> attributes;

	@SerializedName("Quantity")
	private int quantity;

	@SerializedName("ListingId")
	private int listingId;

	@SerializedName("SKU")
	private String sKU;

	@SerializedName("WasPrice")
	private double wasPrice;

	@SerializedName("IsClearance")
	private boolean isClearance;

	@SerializedName("ProductSpecification")
	private ProductSpecification productSpecification;

	public void setPhotos(List<PhotosItem> photos){
		this.photos = photos;
	}

	public List<PhotosItem> getPhotos(){
		return photos;
	}

	public void setOptions(List<OptionsItem> options){
		this.options = options;
	}

	public List<OptionsItem> getOptions(){
		return options;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setAttributes(List<AttributesItem> attributes){
		this.attributes = attributes;
	}

	public List<AttributesItem> getAttributes(){
		return attributes;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setListingId(int listingId){
		this.listingId = listingId;
	}

	public int getListingId(){
		return listingId;
	}

	public void setSKU(String sKU){
		this.sKU = sKU;
	}

	public String getSKU(){
		return sKU;
	}

	public void setWasPrice(double wasPrice){
		this.wasPrice = wasPrice;
	}

	public double getWasPrice(){
		return wasPrice;
	}

	public void setIsClearance(boolean isClearance){
		this.isClearance = isClearance;
	}

	public boolean isIsClearance(){
		return isClearance;
	}

	public void setProductSpecification(ProductSpecification productSpecification){
		this.productSpecification = productSpecification;
	}

	public ProductSpecification getProductSpecification(){
		return productSpecification;
	}

	@Override
 	public String toString(){
		return 
			"VariantsItem{" + 
			"photos = '" + photos + '\'' + 
			",options = '" + options + '\'' + 
			",price = '" + price + '\'' + 
			",attributes = '" + attributes + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",listingId = '" + listingId + '\'' + 
			",sKU = '" + sKU + '\'' + 
			",wasPrice = '" + wasPrice + '\'' + 
			",isClearance = '" + isClearance + '\'' + 
			",productSpecification = '" + productSpecification + '\'' + 
			"}";
		}
}