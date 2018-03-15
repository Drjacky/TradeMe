package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class LocalSales{

	@SerializedName("LinkToQV")
	private String linkToQV;

	@SerializedName("RecentSales")
	private List<RecentSalesItem> recentSales;

	@SerializedName("SalesRegionName")
	private String salesRegionName;

	@SerializedName("AveragePrice")
	private int averagePrice;

	public void setLinkToQV(String linkToQV){
		this.linkToQV = linkToQV;
	}

	public String getLinkToQV(){
		return linkToQV;
	}

	public void setRecentSales(List<RecentSalesItem> recentSales){
		this.recentSales = recentSales;
	}

	public List<RecentSalesItem> getRecentSales(){
		return recentSales;
	}

	public void setSalesRegionName(String salesRegionName){
		this.salesRegionName = salesRegionName;
	}

	public String getSalesRegionName(){
		return salesRegionName;
	}

	public void setAveragePrice(int averagePrice){
		this.averagePrice = averagePrice;
	}

	public int getAveragePrice(){
		return averagePrice;
	}

	@Override
 	public String toString(){
		return 
			"LocalSales{" + 
			"linkToQV = '" + linkToQV + '\'' + 
			",recentSales = '" + recentSales + '\'' + 
			",salesRegionName = '" + salesRegionName + '\'' + 
			",averagePrice = '" + averagePrice + '\'' + 
			"}";
		}
}