package ir.hosseinabbasi.trademe.data.db.model.search;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Branding implements Parcelable {

	@SerializedName("LargeSquareLogo")
	private String largeSquareLogo;

	@SerializedName("StrokeColor")
	private String strokeColor;

	@SerializedName("OfficeLocation")
	private String officeLocation;

	@SerializedName("TextColor")
	private String textColor;

	@SerializedName("LargeBannerURL")
	private String largeBannerURL;

	@SerializedName("LargeWideLogo")
	private String largeWideLogo;

	@SerializedName("BackgroundColor")
	private String backgroundColor;

	@SerializedName("DisableBanner")
	private boolean disableBanner;

	public void setLargeSquareLogo(String largeSquareLogo){
		this.largeSquareLogo = largeSquareLogo;
	}

	public String getLargeSquareLogo(){
		return largeSquareLogo;
	}

	public void setStrokeColor(String strokeColor){
		this.strokeColor = strokeColor;
	}

	public String getStrokeColor(){
		return strokeColor;
	}

	public void setOfficeLocation(String officeLocation){
		this.officeLocation = officeLocation;
	}

	public String getOfficeLocation(){
		return officeLocation;
	}

	public void setTextColor(String textColor){
		this.textColor = textColor;
	}

	public String getTextColor(){
		return textColor;
	}

	public void setLargeBannerURL(String largeBannerURL){
		this.largeBannerURL = largeBannerURL;
	}

	public String getLargeBannerURL(){
		return largeBannerURL;
	}

	public void setLargeWideLogo(String largeWideLogo){
		this.largeWideLogo = largeWideLogo;
	}

	public String getLargeWideLogo(){
		return largeWideLogo;
	}

	public void setBackgroundColor(String backgroundColor){
		this.backgroundColor = backgroundColor;
	}

	public String getBackgroundColor(){
		return backgroundColor;
	}

	public void setDisableBanner(boolean disableBanner){
		this.disableBanner = disableBanner;
	}

	public boolean isDisableBanner(){
		return disableBanner;
	}

	@Override
	public String toString(){
		return
				"Branding{" +
						"largeSquareLogo = '" + largeSquareLogo + '\'' +
						",strokeColor = '" + strokeColor + '\'' +
						",officeLocation = '" + officeLocation + '\'' +
						",textColor = '" + textColor + '\'' +
						",largeBannerURL = '" + largeBannerURL + '\'' +
						",largeWideLogo = '" + largeWideLogo + '\'' +
						",backgroundColor = '" + backgroundColor + '\'' +
						",disableBanner = '" + disableBanner + '\'' +
						"}";
	}

	protected Branding(Parcel in) {
		largeSquareLogo = in.readString();
		strokeColor = in.readString();
		officeLocation = in.readString();
		textColor = in.readString();
		largeBannerURL = in.readString();
		largeWideLogo = in.readString();
		backgroundColor = in.readString();
		disableBanner = in.readByte() != 0x00;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(largeSquareLogo);
		dest.writeString(strokeColor);
		dest.writeString(officeLocation);
		dest.writeString(textColor);
		dest.writeString(largeBannerURL);
		dest.writeString(largeWideLogo);
		dest.writeString(backgroundColor);
		dest.writeByte((byte) (disableBanner ? 0x01 : 0x00));
	}

	@SuppressWarnings("unused")
	public static final Parcelable.Creator<Branding> CREATOR = new Parcelable.Creator<Branding>() {
		@Override
		public Branding createFromParcel(Parcel in) {
			return new Branding(in);
		}

		@Override
		public Branding[] newArray(int size) {
			return new Branding[size];
		}
	};
}