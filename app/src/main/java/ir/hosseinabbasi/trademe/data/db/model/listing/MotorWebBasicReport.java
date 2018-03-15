package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class MotorWebBasicReport{

	@SerializedName("RegoOrVin")
	private String regoOrVin;

	@SerializedName("PartialReportUrl")
	private String partialReportUrl;

	@SerializedName("GeneratedAt")
	private String generatedAt;

	@SerializedName("ReportedStolen")
	private String reportedStolen;

	@SerializedName("Title")
	private String title;

	@SerializedName("ReRegistered")
	private String reRegistered;

	@SerializedName("Damaged")
	private String damaged;

	@SerializedName("MoneyOwing")
	private String moneyOwing;

	public void setRegoOrVin(String regoOrVin){
		this.regoOrVin = regoOrVin;
	}

	public String getRegoOrVin(){
		return regoOrVin;
	}

	public void setPartialReportUrl(String partialReportUrl){
		this.partialReportUrl = partialReportUrl;
	}

	public String getPartialReportUrl(){
		return partialReportUrl;
	}

	public void setGeneratedAt(String generatedAt){
		this.generatedAt = generatedAt;
	}

	public String getGeneratedAt(){
		return generatedAt;
	}

	public void setReportedStolen(String reportedStolen){
		this.reportedStolen = reportedStolen;
	}

	public String getReportedStolen(){
		return reportedStolen;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setReRegistered(String reRegistered){
		this.reRegistered = reRegistered;
	}

	public String getReRegistered(){
		return reRegistered;
	}

	public void setDamaged(String damaged){
		this.damaged = damaged;
	}

	public String getDamaged(){
		return damaged;
	}

	public void setMoneyOwing(String moneyOwing){
		this.moneyOwing = moneyOwing;
	}

	public String getMoneyOwing(){
		return moneyOwing;
	}

	@Override
 	public String toString(){
		return 
			"MotorWebBasicReport{" + 
			"regoOrVin = '" + regoOrVin + '\'' + 
			",partialReportUrl = '" + partialReportUrl + '\'' + 
			",generatedAt = '" + generatedAt + '\'' + 
			",reportedStolen = '" + reportedStolen + '\'' + 
			",title = '" + title + '\'' + 
			",reRegistered = '" + reRegistered + '\'' + 
			",damaged = '" + damaged + '\'' + 
			",moneyOwing = '" + moneyOwing + '\'' + 
			"}";
		}
}