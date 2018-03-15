package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ProductSpecification{

	@SerializedName("Brand")
	private String brand;

	@SerializedName("GTIN")
	private String gTIN;

	@SerializedName("ManufacturerCode")
	private String manufacturerCode;

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	public void setGTIN(String gTIN){
		this.gTIN = gTIN;
	}

	public String getGTIN(){
		return gTIN;
	}

	public void setManufacturerCode(String manufacturerCode){
		this.manufacturerCode = manufacturerCode;
	}

	public String getManufacturerCode(){
		return manufacturerCode;
	}

	@Override
 	public String toString(){
		return 
			"ProductSpecification{" + 
			"brand = '" + brand + '\'' + 
			",gTIN = '" + gTIN + '\'' + 
			",manufacturerCode = '" + manufacturerCode + '\'' + 
			"}";
		}
}