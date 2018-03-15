package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class RecipientsItem{

	@SerializedName("Member")
	private Member member;

	@SerializedName("Decision")
	private int decision;

	public void setMember(Member member){
		this.member = member;
	}

	public Member getMember(){
		return member;
	}

	public void setDecision(int decision){
		this.decision = decision;
	}

	public int getDecision(){
		return decision;
	}

	@Override
 	public String toString(){
		return 
			"RecipientsItem{" + 
			"member = '" + member + '\'' + 
			",decision = '" + decision + '\'' + 
			"}";
		}
}