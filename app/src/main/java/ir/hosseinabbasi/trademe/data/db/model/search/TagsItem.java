package ir.hosseinabbasi.trademe.data.db.model.search;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class TagsItem implements Parcelable {

	@SerializedName("Name")
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
	public String toString(){
		return
				"TagsItem{" +
						"name = '" + name + '\'' +
						"}";
	}

	protected TagsItem(Parcel in) {
		name = in.readString();
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
	}

	@SuppressWarnings("unused")
	public static final Parcelable.Creator<TagsItem> CREATOR = new Parcelable.Creator<TagsItem>() {
		@Override
		public TagsItem createFromParcel(Parcel in) {
			return new TagsItem(in);
		}

		@Override
		public TagsItem[] newArray(int size) {
			return new TagsItem[size];
		}
	};
}