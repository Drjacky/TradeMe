package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class BuyerDispute{

	@SerializedName("DisputeStatus")
	private int disputeStatus;

	public void setDisputeStatus(int disputeStatus){
		this.disputeStatus = disputeStatus;
	}

	public int getDisputeStatus(){
		return disputeStatus;
	}

	@Override
 	public String toString(){
		return 
			"BuyerDispute{" + 
			"disputeStatus = '" + disputeStatus + '\'' + 
			"}";
		}
}