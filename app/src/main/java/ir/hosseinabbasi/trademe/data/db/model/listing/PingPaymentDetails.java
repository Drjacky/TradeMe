package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PingPaymentDetails{

	@SerializedName("FundSource")
	private FundSource fundSource;

	@SerializedName("BalanceAmount")
	private double balanceAmount;

	@SerializedName("TopupAmount")
	private double topupAmount;

	public void setFundSource(FundSource fundSource){
		this.fundSource = fundSource;
	}

	public FundSource getFundSource(){
		return fundSource;
	}

	public void setBalanceAmount(double balanceAmount){
		this.balanceAmount = balanceAmount;
	}

	public double getBalanceAmount(){
		return balanceAmount;
	}

	public void setTopupAmount(double topupAmount){
		this.topupAmount = topupAmount;
	}

	public double getTopupAmount(){
		return topupAmount;
	}

	@Override
 	public String toString(){
		return 
			"PingPaymentDetails{" + 
			"fundSource = '" + fundSource + '\'' + 
			",balanceAmount = '" + balanceAmount + '\'' + 
			",topupAmount = '" + topupAmount + '\'' + 
			"}";
		}
}