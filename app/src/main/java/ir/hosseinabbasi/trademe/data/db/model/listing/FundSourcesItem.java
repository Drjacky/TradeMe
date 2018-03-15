package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class FundSourcesItem{

	@SerializedName("VerificationStatus")
	private int verificationStatus;

	@SerializedName("VerificationCodeCreationDate")
	private String verificationCodeCreationDate;

	@SerializedName("Type")
	private int type;

	@SerializedName("MaskedAccountNumber")
	private String maskedAccountNumber;

	@SerializedName("Amount")
	private double amount;

	@SerializedName("Label")
	private String label;

	@SerializedName("FundSourceId")
	private int fundSourceId;

	@SerializedName("Logo")
	private String logo;

	public void setVerificationStatus(int verificationStatus){
		this.verificationStatus = verificationStatus;
	}

	public int getVerificationStatus(){
		return verificationStatus;
	}

	public void setVerificationCodeCreationDate(String verificationCodeCreationDate){
		this.verificationCodeCreationDate = verificationCodeCreationDate;
	}

	public String getVerificationCodeCreationDate(){
		return verificationCodeCreationDate;
	}

	public void setType(int type){
		this.type = type;
	}

	public int getType(){
		return type;
	}

	public void setMaskedAccountNumber(String maskedAccountNumber){
		this.maskedAccountNumber = maskedAccountNumber;
	}

	public String getMaskedAccountNumber(){
		return maskedAccountNumber;
	}

	public void setAmount(double amount){
		this.amount = amount;
	}

	public double getAmount(){
		return amount;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setFundSourceId(int fundSourceId){
		this.fundSourceId = fundSourceId;
	}

	public int getFundSourceId(){
		return fundSourceId;
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
			"FundSourcesItem{" + 
			"verificationStatus = '" + verificationStatus + '\'' + 
			",verificationCodeCreationDate = '" + verificationCodeCreationDate + '\'' + 
			",type = '" + type + '\'' + 
			",maskedAccountNumber = '" + maskedAccountNumber + '\'' + 
			",amount = '" + amount + '\'' + 
			",label = '" + label + '\'' + 
			",fundSourceId = '" + fundSourceId + '\'' + 
			",logo = '" + logo + '\'' + 
			"}";
		}
}