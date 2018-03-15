package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class FundSource{

	@SerializedName("AvailableBalance")
	private double availableBalance;

	@SerializedName("FundSources")
	private List<FundSourcesItem> fundSources;

	public void setAvailableBalance(double availableBalance){
		this.availableBalance = availableBalance;
	}

	public double getAvailableBalance(){
		return availableBalance;
	}

	public void setFundSources(List<FundSourcesItem> fundSources){
		this.fundSources = fundSources;
	}

	public List<FundSourcesItem> getFundSources(){
		return fundSources;
	}

	@Override
 	public String toString(){
		return 
			"FundSource{" + 
			"availableBalance = '" + availableBalance + '\'' + 
			",fundSources = '" + fundSources + '\'' + 
			"}";
		}
}