package ir.hosseinabbasi.trademe.data.db.model.search;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ParametersItem{

	@SerializedName("Options")
	private List<OptionsItem> options;

	@SerializedName("Type")
	private int type;

	@SerializedName("MutualExclusionGroup")
	private String mutualExclusionGroup;

	@SerializedName("DisplayName")
	private String displayName;

	@SerializedName("ExternalOptionsKey")
	private String externalOptionsKey;

	@SerializedName("DependentOn")
	private String dependentOn;

	@SerializedName("LowerBoundName")
	private String lowerBoundName;

	@SerializedName("UpperBoundName")
	private String upperBoundName;

	@SerializedName("DependentParameter")
	private DependentParameter dependentParameter;

	@SerializedName("Name")
	private String name;

	@SerializedName("AllowsMultipleValues")
	private boolean allowsMultipleValues;

	public void setOptions(List<OptionsItem> options){
		this.options = options;
	}

	public List<OptionsItem> getOptions(){
		return options;
	}

	public void setType(int type){
		this.type = type;
	}

	public int getType(){
		return type;
	}

	public void setMutualExclusionGroup(String mutualExclusionGroup){
		this.mutualExclusionGroup = mutualExclusionGroup;
	}

	public String getMutualExclusionGroup(){
		return mutualExclusionGroup;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setExternalOptionsKey(String externalOptionsKey){
		this.externalOptionsKey = externalOptionsKey;
	}

	public String getExternalOptionsKey(){
		return externalOptionsKey;
	}

	public void setDependentOn(String dependentOn){
		this.dependentOn = dependentOn;
	}

	public String getDependentOn(){
		return dependentOn;
	}

	public void setLowerBoundName(String lowerBoundName){
		this.lowerBoundName = lowerBoundName;
	}

	public String getLowerBoundName(){
		return lowerBoundName;
	}

	public void setUpperBoundName(String upperBoundName){
		this.upperBoundName = upperBoundName;
	}

	public String getUpperBoundName(){
		return upperBoundName;
	}

	public void setDependentParameter(DependentParameter dependentParameter){
		this.dependentParameter = dependentParameter;
	}

	public DependentParameter getDependentParameter(){
		return dependentParameter;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAllowsMultipleValues(boolean allowsMultipleValues){
		this.allowsMultipleValues = allowsMultipleValues;
	}

	public boolean isAllowsMultipleValues(){
		return allowsMultipleValues;
	}

	@Override
 	public String toString(){
		return 
			"ParametersItem{" + 
			"options = '" + options + '\'' + 
			",type = '" + type + '\'' + 
			",mutualExclusionGroup = '" + mutualExclusionGroup + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",externalOptionsKey = '" + externalOptionsKey + '\'' + 
			",dependentOn = '" + dependentOn + '\'' + 
			",lowerBoundName = '" + lowerBoundName + '\'' + 
			",upperBoundName = '" + upperBoundName + '\'' + 
			",dependentParameter = '" + dependentParameter + '\'' + 
			",name = '" + name + '\'' + 
			",allowsMultipleValues = '" + allowsMultipleValues + '\'' + 
			"}";
		}
}