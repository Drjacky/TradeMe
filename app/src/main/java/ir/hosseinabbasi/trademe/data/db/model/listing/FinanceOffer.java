package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class FinanceOffer{

	@SerializedName("TermInMonths")
	private int termInMonths;

	@SerializedName("EstablishmentFee")
	private double establishmentFee;

	@SerializedName("MonthlyFee")
	private double monthlyFee;

	@SerializedName("DepositPercent")
	private int depositPercent;

	@SerializedName("InterestType")
	private int interestType;

	@SerializedName("ContainsAdditionalConditions")
	private boolean containsAdditionalConditions;

	@SerializedName("ListingId")
	private int listingId;

	@SerializedName("WeeklyPayment")
	private double weeklyPayment;

	@SerializedName("OfferDescription")
	private String offerDescription;

	@SerializedName("OfferDisclaimer")
	private String offerDisclaimer;

	@SerializedName("InterestRate")
	private double interestRate;

	@SerializedName("TotalPayment")
	private double totalPayment;

	public void setTermInMonths(int termInMonths){
		this.termInMonths = termInMonths;
	}

	public int getTermInMonths(){
		return termInMonths;
	}

	public void setEstablishmentFee(double establishmentFee){
		this.establishmentFee = establishmentFee;
	}

	public double getEstablishmentFee(){
		return establishmentFee;
	}

	public void setMonthlyFee(double monthlyFee){
		this.monthlyFee = monthlyFee;
	}

	public double getMonthlyFee(){
		return monthlyFee;
	}

	public void setDepositPercent(int depositPercent){
		this.depositPercent = depositPercent;
	}

	public int getDepositPercent(){
		return depositPercent;
	}

	public void setInterestType(int interestType){
		this.interestType = interestType;
	}

	public int getInterestType(){
		return interestType;
	}

	public void setContainsAdditionalConditions(boolean containsAdditionalConditions){
		this.containsAdditionalConditions = containsAdditionalConditions;
	}

	public boolean isContainsAdditionalConditions(){
		return containsAdditionalConditions;
	}

	public void setListingId(int listingId){
		this.listingId = listingId;
	}

	public int getListingId(){
		return listingId;
	}

	public void setWeeklyPayment(double weeklyPayment){
		this.weeklyPayment = weeklyPayment;
	}

	public double getWeeklyPayment(){
		return weeklyPayment;
	}

	public void setOfferDescription(String offerDescription){
		this.offerDescription = offerDescription;
	}

	public String getOfferDescription(){
		return offerDescription;
	}

	public void setOfferDisclaimer(String offerDisclaimer){
		this.offerDisclaimer = offerDisclaimer;
	}

	public String getOfferDisclaimer(){
		return offerDisclaimer;
	}

	public void setInterestRate(double interestRate){
		this.interestRate = interestRate;
	}

	public double getInterestRate(){
		return interestRate;
	}

	public void setTotalPayment(double totalPayment){
		this.totalPayment = totalPayment;
	}

	public double getTotalPayment(){
		return totalPayment;
	}

	@Override
 	public String toString(){
		return 
			"FinanceOffer{" + 
			"termInMonths = '" + termInMonths + '\'' + 
			",establishmentFee = '" + establishmentFee + '\'' + 
			",monthlyFee = '" + monthlyFee + '\'' + 
			",depositPercent = '" + depositPercent + '\'' + 
			",interestType = '" + interestType + '\'' + 
			",containsAdditionalConditions = '" + containsAdditionalConditions + '\'' + 
			",listingId = '" + listingId + '\'' + 
			",weeklyPayment = '" + weeklyPayment + '\'' + 
			",offerDescription = '" + offerDescription + '\'' + 
			",offerDisclaimer = '" + offerDisclaimer + '\'' + 
			",interestRate = '" + interestRate + '\'' + 
			",totalPayment = '" + totalPayment + '\'' + 
			"}";
		}
}