package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ShippingOptionsItem{

	@SerializedName("Type")
	private int type;

	@SerializedName("Price")
	private double price;

	@SerializedName("ShippingId")
	private int shippingId;

	@SerializedName("Method")
	private String method;

	public void setType(int type){
		this.type = type;
	}

	public int getType(){
		return type;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setShippingId(int shippingId){
		this.shippingId = shippingId;
	}

	public int getShippingId(){
		return shippingId;
	}

	public void setMethod(String method){
		this.method = method;
	}

	public String getMethod(){
		return method;
	}

	@Override
 	public String toString(){
		return 
			"ShippingOptionsItem{" + 
			"type = '" + type + '\'' + 
			",price = '" + price + '\'' + 
			",shippingId = '" + shippingId + '\'' + 
			",method = '" + method + '\'' + 
			"}";
		}
}