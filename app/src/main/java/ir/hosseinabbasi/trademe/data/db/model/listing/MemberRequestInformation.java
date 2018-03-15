package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class MemberRequestInformation{

	@SerializedName("RequestOfferStatus")
	private int requestOfferStatus;

	@SerializedName("RequestRelistStatus")
	private int requestRelistStatus;

	public void setRequestOfferStatus(int requestOfferStatus){
		this.requestOfferStatus = requestOfferStatus;
	}

	public int getRequestOfferStatus(){
		return requestOfferStatus;
	}

	public void setRequestRelistStatus(int requestRelistStatus){
		this.requestRelistStatus = requestRelistStatus;
	}

	public int getRequestRelistStatus(){
		return requestRelistStatus;
	}

	@Override
 	public String toString(){
		return 
			"MemberRequestInformation{" + 
			"requestOfferStatus = '" + requestOfferStatus + '\'' + 
			",requestRelistStatus = '" + requestRelistStatus + '\'' + 
			"}";
		}
}