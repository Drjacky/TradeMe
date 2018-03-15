package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DeferredPaymentDetails{

	@SerializedName("Eligibility")
	private Eligibility eligibility;

	@SerializedName("PaymentInterval")
	private String paymentInterval;

	@SerializedName("NumberOfPayments")
	private int numberOfPayments;

	@SerializedName("Provider")
	private int provider;

	public void setEligibility(Eligibility eligibility){
		this.eligibility = eligibility;
	}

	public Eligibility getEligibility(){
		return eligibility;
	}

	public void setPaymentInterval(String paymentInterval){
		this.paymentInterval = paymentInterval;
	}

	public String getPaymentInterval(){
		return paymentInterval;
	}

	public void setNumberOfPayments(int numberOfPayments){
		this.numberOfPayments = numberOfPayments;
	}

	public int getNumberOfPayments(){
		return numberOfPayments;
	}

	public void setProvider(int provider){
		this.provider = provider;
	}

	public int getProvider(){
		return provider;
	}

	@Override
 	public String toString(){
		return 
			"DeferredPaymentDetails{" + 
			"eligibility = '" + eligibility + '\'' + 
			",paymentInterval = '" + paymentInterval + '\'' + 
			",numberOfPayments = '" + numberOfPayments + '\'' + 
			",provider = '" + provider + '\'' + 
			"}";
		}
}