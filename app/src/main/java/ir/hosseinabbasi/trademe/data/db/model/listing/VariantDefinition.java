package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class VariantDefinition{

	@SerializedName("Variants")
	private List<VariantsItem> variants;

	@SerializedName("OptionSets")
	private List<OptionSetsItem> optionSets;

	public void setVariants(List<VariantsItem> variants){
		this.variants = variants;
	}

	public List<VariantsItem> getVariants(){
		return variants;
	}

	public void setOptionSets(List<OptionSetsItem> optionSets){
		this.optionSets = optionSets;
	}

	public List<OptionSetsItem> getOptionSets(){
		return optionSets;
	}

	@Override
 	public String toString(){
		return 
			"VariantDefinition{" + 
			"variants = '" + variants + '\'' + 
			",optionSets = '" + optionSets + '\'' + 
			"}";
		}
}