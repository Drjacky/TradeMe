package ir.hosseinabbasi.trademe.data.db.model.search;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class GeographicLocation implements Parcelable {

	@SerializedName("Accuracy")
	private int accuracy;

	@SerializedName("Northing")
	private int northing;

	@SerializedName("Latitude")
	private double latitude;

	@SerializedName("Easting")
	private int easting;

	@SerializedName("Longitude")
	private double longitude;

	public void setAccuracy(int accuracy){
		this.accuracy = accuracy;
	}

	public int getAccuracy(){
		return accuracy;
	}

	public void setNorthing(int northing){
		this.northing = northing;
	}

	public int getNorthing(){
		return northing;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setEasting(int easting){
		this.easting = easting;
	}

	public int getEasting(){
		return easting;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}

	@Override
	public String toString(){
		return
				"GeographicLocation{" +
						"accuracy = '" + accuracy + '\'' +
						",northing = '" + northing + '\'' +
						",latitude = '" + latitude + '\'' +
						",easting = '" + easting + '\'' +
						",longitude = '" + longitude + '\'' +
						"}";
	}

	protected GeographicLocation(Parcel in) {
		accuracy = in.readInt();
		northing = in.readInt();
		latitude = in.readDouble();
		easting = in.readInt();
		longitude = in.readDouble();
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(accuracy);
		dest.writeInt(northing);
		dest.writeDouble(latitude);
		dest.writeInt(easting);
		dest.writeDouble(longitude);
	}

	@SuppressWarnings("unused")
	public static final Parcelable.Creator<GeographicLocation> CREATOR = new Parcelable.Creator<GeographicLocation>() {
		@Override
		public GeographicLocation createFromParcel(Parcel in) {
			return new GeographicLocation(in);
		}

		@Override
		public GeographicLocation[] newArray(int size) {
			return new GeographicLocation[size];
		}
	};
}