package ir.hosseinabbasi.trademe.data.db.model.listing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Questions{

	@SerializedName("TotalCount")
	private int totalCount;

	@SerializedName("PageSize")
	private int pageSize;

	@SerializedName("Page")
	private int page;

	@SerializedName("List")
	private List<ListItem> list;

	public void setTotalCount(int totalCount){
		this.totalCount = totalCount;
	}

	public int getTotalCount(){
		return totalCount;
	}

	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}

	public int getPageSize(){
		return pageSize;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setList(List<ListItem> list){
		this.list = list;
	}

	public List<ListItem> getList(){
		return list;
	}

	@Override
 	public String toString(){
		return 
			"Questions{" + 
			"totalCount = '" + totalCount + '\'' + 
			",pageSize = '" + pageSize + '\'' + 
			",page = '" + page + '\'' + 
			",list = '" + list + '\'' + 
			"}";
		}
}