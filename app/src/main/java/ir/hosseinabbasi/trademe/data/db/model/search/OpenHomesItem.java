package ir.hosseinabbasi.trademe.data.db.model.search;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class OpenHomesItem implements Parcelable {

	@SerializedName("Start")
	private String start;

	@SerializedName("End")
	private String end;

	public void setStart(String start){
		this.start = start;
	}

	public String getStart(){
		return start;
	}

	public void setEnd(String end){
		this.end = end;
	}

	public String getEnd(){
		return end;
	}

	@Override
	public String toString(){
		return
				"OpenHomesItem{" +
						"start = '" + start + '\'' +
						",end = '" + end + '\'' +
						"}";
	}

	protected OpenHomesItem(Parcel in) {
		start = in.readString();
		end = in.readString();
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(start);
		dest.writeString(end);
	}

	@SuppressWarnings("unused")
	public static final Parcelable.Creator<OpenHomesItem> CREATOR = new Parcelable.Creator<OpenHomesItem>() {
		@Override
		public OpenHomesItem createFromParcel(Parcel in) {
			return new OpenHomesItem(in);
		}

		@Override
		public OpenHomesItem[] newArray(int size) {
			return new OpenHomesItem[size];
		}
	};
}