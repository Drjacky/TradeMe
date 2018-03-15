package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ListingCounts{

	@SerializedName("Cars")
	private int cars;

	@SerializedName("Bikes")
	private int bikes;

	@SerializedName("Boats")
	private int boats;

	@SerializedName("Total")
	private int total;

	public void setCars(int cars){
		this.cars = cars;
	}

	public int getCars(){
		return cars;
	}

	public void setBikes(int bikes){
		this.bikes = bikes;
	}

	public int getBikes(){
		return bikes;
	}

	public void setBoats(int boats){
		this.boats = boats;
	}

	public int getBoats(){
		return boats;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	@Override
 	public String toString(){
		return 
			"ListingCounts{" + 
			"cars = '" + cars + '\'' + 
			",bikes = '" + bikes + '\'' + 
			",boats = '" + boats + '\'' + 
			",total = '" + total + '\'' + 
			"}";
		}
}