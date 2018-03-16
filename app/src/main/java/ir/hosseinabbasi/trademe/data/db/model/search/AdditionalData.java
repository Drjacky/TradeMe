package ir.hosseinabbasi.trademe.data.db.model.search;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AdditionalData implements Parcelable {

	@SerializedName("BulletPoints")
	private List<String> bulletPoints;

	@SerializedName("Tags")
	private List<TagsItem> tags;

	public void setBulletPoints(List<String> bulletPoints){
		this.bulletPoints = bulletPoints;
	}

	public List<String> getBulletPoints(){
		return bulletPoints;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	@Override
	public String toString(){
		return
				"AdditionalData{" +
						"bulletPoints = '" + bulletPoints + '\'' +
						",tags = '" + tags + '\'' +
						"}";
	}

	protected AdditionalData(Parcel in) {
		if (in.readByte() == 0x01) {
			bulletPoints = new ArrayList<String>();
			in.readList(bulletPoints, String.class.getClassLoader());
		} else {
			bulletPoints = null;
		}
		if (in.readByte() == 0x01) {
			tags = new ArrayList<TagsItem>();
			in.readList(tags, TagsItem.class.getClassLoader());
		} else {
			tags = null;
		}
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		if (bulletPoints == null) {
			dest.writeByte((byte) (0x00));
		} else {
			dest.writeByte((byte) (0x01));
			dest.writeList(bulletPoints);
		}
		if (tags == null) {
			dest.writeByte((byte) (0x00));
		} else {
			dest.writeByte((byte) (0x01));
			dest.writeList(tags);
		}
	}

	@SuppressWarnings("unused")
	public static final Parcelable.Creator<AdditionalData> CREATOR = new Parcelable.Creator<AdditionalData>() {
		@Override
		public AdditionalData createFromParcel(Parcel in) {
			return new AdditionalData(in);
		}

		@Override
		public AdditionalData[] newArray(int size) {
			return new AdditionalData[size];
		}
	};
}