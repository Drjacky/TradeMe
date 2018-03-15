package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Showroom{

	@SerializedName("BackgroundColour")
	private String backgroundColour;

	@SerializedName("Banner")
	private String banner;

	@SerializedName("Id")
	private int id;

	@SerializedName("Url")
	private String url;

	@SerializedName("Logo")
	private String logo;

	public void setBackgroundColour(String backgroundColour){
		this.backgroundColour = backgroundColour;
	}

	public String getBackgroundColour(){
		return backgroundColour;
	}

	public void setBanner(String banner){
		this.banner = banner;
	}

	public String getBanner(){
		return banner;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setLogo(String logo){
		this.logo = logo;
	}

	public String getLogo(){
		return logo;
	}

	@Override
 	public String toString(){
		return 
			"Showroom{" + 
			"backgroundColour = '" + backgroundColour + '\'' + 
			",banner = '" + banner + '\'' + 
			",id = '" + id + '\'' + 
			",url = '" + url + '\'' + 
			",logo = '" + logo + '\'' + 
			"}";
		}
}