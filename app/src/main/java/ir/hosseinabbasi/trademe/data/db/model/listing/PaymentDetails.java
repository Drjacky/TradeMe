package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PaymentDetails{

	@SerializedName("PaymentMethodFee")
	private double paymentMethodFee;

	@SerializedName("PaymentType")
	private int paymentType;

	@SerializedName("RefundCollection")
	private List<RefundCollectionItem> refundCollection;

	@SerializedName("IsPaymentPending")
	private boolean isPaymentPending;

	@SerializedName("PaymentAmount")
	private double paymentAmount;

	public void setPaymentMethodFee(double paymentMethodFee){
		this.paymentMethodFee = paymentMethodFee;
	}

	public double getPaymentMethodFee(){
		return paymentMethodFee;
	}

	public void setPaymentType(int paymentType){
		this.paymentType = paymentType;
	}

	public int getPaymentType(){
		return paymentType;
	}

	public void setRefundCollection(List<RefundCollectionItem> refundCollection){
		this.refundCollection = refundCollection;
	}

	public List<RefundCollectionItem> getRefundCollection(){
		return refundCollection;
	}

	public void setIsPaymentPending(boolean isPaymentPending){
		this.isPaymentPending = isPaymentPending;
	}

	public boolean isIsPaymentPending(){
		return isPaymentPending;
	}

	public void setPaymentAmount(double paymentAmount){
		this.paymentAmount = paymentAmount;
	}

	public double getPaymentAmount(){
		return paymentAmount;
	}

	@Override
 	public String toString(){
		return 
			"PaymentDetails{" + 
			"paymentMethodFee = '" + paymentMethodFee + '\'' + 
			",paymentType = '" + paymentType + '\'' + 
			",refundCollection = '" + refundCollection + '\'' + 
			",isPaymentPending = '" + isPaymentPending + '\'' + 
			",paymentAmount = '" + paymentAmount + '\'' + 
			"}";
		}
}