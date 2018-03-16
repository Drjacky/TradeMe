package ir.hosseinabbasi.trademe.data.db.model.search;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Search{

	@SerializedName("Parameters")
	private List<ParametersItem> parameters;

	@SerializedName("PageSize")
	private int pageSize;

	@SerializedName("MemberProfile")
	private MemberProfile memberProfile;

	@SerializedName("Breadcrumbs")
	private List<BreadcrumbsItem> breadcrumbs;

	@SerializedName("FavouriteType")
	private int favouriteType;

	@SerializedName("TotalCountTruncated")
	private boolean totalCountTruncated;

	@SerializedName("Page")
	private int page;

	@SerializedName("SuperFeatures")
	private List<SuperFeaturesItem> superFeatures;

	@SerializedName("FavouriteId")
	private int favouriteId;

	@SerializedName("FoundCategories")
	private List<FoundCategoriesItem> foundCategories;

	@SerializedName("Ads")
	private List<AdsItem> ads;

	@SerializedName("TotalCount")
	private int totalCount;

	@SerializedName("DidYouMean")
	private String didYouMean;

	@SerializedName("CanonicalPath")
	private String canonicalPath;

	@SerializedName("SearchQueryId")
	private String searchQueryId;

	@SerializedName("List")
	private List<ListItem> list;

	@SerializedName("SortOrders")
	private List<SortOrdersItem> sortOrders;

	@SerializedName("DealPromotionInfo")
	private DealPromotionInfo dealPromotionInfo;

	public void setParameters(List<ParametersItem> parameters){
		this.parameters = parameters;
	}

	public List<ParametersItem> getParameters(){
		return parameters;
	}

	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}

	public int getPageSize(){
		return pageSize;
	}

	public void setMemberProfile(MemberProfile memberProfile){
		this.memberProfile = memberProfile;
	}

	public MemberProfile getMemberProfile(){
		return memberProfile;
	}

	public void setBreadcrumbs(List<BreadcrumbsItem> breadcrumbs){
		this.breadcrumbs = breadcrumbs;
	}

	public List<BreadcrumbsItem> getBreadcrumbs(){
		return breadcrumbs;
	}

	public void setFavouriteType(int favouriteType){
		this.favouriteType = favouriteType;
	}

	public int getFavouriteType(){
		return favouriteType;
	}

	public void setTotalCountTruncated(boolean totalCountTruncated){
		this.totalCountTruncated = totalCountTruncated;
	}

	public boolean isTotalCountTruncated(){
		return totalCountTruncated;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setSuperFeatures(List<SuperFeaturesItem> superFeatures){
		this.superFeatures = superFeatures;
	}

	public List<SuperFeaturesItem> getSuperFeatures(){
		return superFeatures;
	}

	public void setFavouriteId(int favouriteId){
		this.favouriteId = favouriteId;
	}

	public int getFavouriteId(){
		return favouriteId;
	}

	public void setFoundCategories(List<FoundCategoriesItem> foundCategories){
		this.foundCategories = foundCategories;
	}

	public List<FoundCategoriesItem> getFoundCategories(){
		return foundCategories;
	}

	public void setAds(List<AdsItem> ads){
		this.ads = ads;
	}

	public List<AdsItem> getAds(){
		return ads;
	}

	public void setTotalCount(int totalCount){
		this.totalCount = totalCount;
	}

	public int getTotalCount(){
		return totalCount;
	}

	public void setDidYouMean(String didYouMean){
		this.didYouMean = didYouMean;
	}

	public String getDidYouMean(){
		return didYouMean;
	}

	public void setCanonicalPath(String canonicalPath){
		this.canonicalPath = canonicalPath;
	}

	public String getCanonicalPath(){
		return canonicalPath;
	}

	public void setSearchQueryId(String searchQueryId){
		this.searchQueryId = searchQueryId;
	}

	public String getSearchQueryId(){
		return searchQueryId;
	}

	public void setList(List<ListItem> list){
		this.list = list;
	}

	public List<ListItem> getList(){
		return list;
	}

	public void setSortOrders(List<SortOrdersItem> sortOrders){
		this.sortOrders = sortOrders;
	}

	public List<SortOrdersItem> getSortOrders(){
		return sortOrders;
	}

	public void setDealPromotionInfo(DealPromotionInfo dealPromotionInfo){
		this.dealPromotionInfo = dealPromotionInfo;
	}

	public DealPromotionInfo getDealPromotionInfo(){
		return dealPromotionInfo;
	}

	@Override
 	public String toString(){
		return 
			"Search{" + 
			"parameters = '" + parameters + '\'' + 
			",pageSize = '" + pageSize + '\'' + 
			",memberProfile = '" + memberProfile + '\'' + 
			",breadcrumbs = '" + breadcrumbs + '\'' + 
			",favouriteType = '" + favouriteType + '\'' + 
			",totalCountTruncated = '" + totalCountTruncated + '\'' + 
			",page = '" + page + '\'' + 
			",superFeatures = '" + superFeatures + '\'' + 
			",favouriteId = '" + favouriteId + '\'' + 
			",foundCategories = '" + foundCategories + '\'' + 
			",ads = '" + ads + '\'' + 
			",totalCount = '" + totalCount + '\'' + 
			",didYouMean = '" + didYouMean + '\'' + 
			",canonicalPath = '" + canonicalPath + '\'' + 
			",searchQueryId = '" + searchQueryId + '\'' + 
			",list = '" + list + '\'' + 
			",sortOrders = '" + sortOrders + '\'' + 
			",dealPromotionInfo = '" + dealPromotionInfo + '\'' + 
			"}";
		}
}