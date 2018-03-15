package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SponsorLinksItem{

	@SerializedName("Type")
	private int type;

	@SerializedName("Link")
	private String link;

	@SerializedName("Name")
	private String name;

	public void setType(int type){
		this.type = type;
	}

	public int getType(){
		return type;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
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
			"SponsorLinksItem{" + 
			"type = '" + type + '\'' + 
			",link = '" + link + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}