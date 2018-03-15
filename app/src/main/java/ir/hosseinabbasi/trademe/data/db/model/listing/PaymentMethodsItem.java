package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PaymentMethodsItem{

	@SerializedName("LogoUrl")
	private String logoUrl;

	@SerializedName("Id")
	private int id;

	@SerializedName("Name")
	private String name;

	public void setLogoUrl(String logoUrl){
		this.logoUrl = logoUrl;
	}

	public String getLogoUrl(){
		return logoUrl;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"PaymentMethodsItem{" + 
			"logoUrl = '" + logoUrl + '\'' + 
			",id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}