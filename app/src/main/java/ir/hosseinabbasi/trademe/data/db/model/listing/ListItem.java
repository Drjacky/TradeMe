package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ListItem{

	@SerializedName("Comment")
	private String comment;

	@SerializedName("Answer")
	private String answer;

	@SerializedName("AnswerDate")
	private String answerDate;

	@SerializedName("AskingMember")
	private AskingMember askingMember;

	@SerializedName("ListingQuestionId")
	private int listingQuestionId;

	@SerializedName("ListingId")
	private int listingId;

	@SerializedName("IsSellerComment")
	private boolean isSellerComment;

	@SerializedName("CommentDate")
	private String commentDate;

	public void setComment(String comment){
		this.comment = comment;
	}

	public String getComment(){
		return comment;
	}

	public void setAnswer(String answer){
		this.answer = answer;
	}

	public String getAnswer(){
		return answer;
	}

	public void setAnswerDate(String answerDate){
		this.answerDate = answerDate;
	}

	public String getAnswerDate(){
		return answerDate;
	}

	public void setAskingMember(AskingMember askingMember){
		this.askingMember = askingMember;
	}

	public AskingMember getAskingMember(){
		return askingMember;
	}

	public void setListingQuestionId(int listingQuestionId){
		this.listingQuestionId = listingQuestionId;
	}

	public int getListingQuestionId(){
		return listingQuestionId;
	}

	public void setListingId(int listingId){
		this.listingId = listingId;
	}

	public int getListingId(){
		return listingId;
	}

	public void setIsSellerComment(boolean isSellerComment){
		this.isSellerComment = isSellerComment;
	}

	public boolean isIsSellerComment(){
		return isSellerComment;
	}

	public void setCommentDate(String commentDate){
		this.commentDate = commentDate;
	}

	public String getCommentDate(){
		return commentDate;
	}

	@Override
 	public String toString(){
		return 
			"ListItem{" + 
			"comment = '" + comment + '\'' + 
			",answer = '" + answer + '\'' + 
			",answerDate = '" + answerDate + '\'' + 
			",askingMember = '" + askingMember + '\'' + 
			",listingQuestionId = '" + listingQuestionId + '\'' + 
			",listingId = '" + listingId + '\'' + 
			",isSellerComment = '" + isSellerComment + '\'' + 
			",commentDate = '" + commentDate + '\'' + 
			"}";
		}
}