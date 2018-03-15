package ir.hosseinabbasi.trademe.data.db.model.listing;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SalesItem{

	@SerializedName("SoldDate")
	private String soldDate;

	@SerializedName("DeliveryDetailsSent")
	private boolean deliveryDetailsSent;

	@SerializedName("IsDeferredPaymentAvailable")
	private boolean isDeferredPaymentAvailable;

	@SerializedName("HasPaymentBeenReceived")
	private boolean hasPaymentBeenReceived;

	@SerializedName("DeferredPaymentId")
	private String deferredPaymentId;

	@SerializedName("DeliveryAddress")
	private DeliveryAddress deliveryAddress;

	@SerializedName("Buyer")
	private Buyer buyer;

	@SerializedName("HasPaidByCreditCard")
	private boolean hasPaidByCreditCard;

	@SerializedName("TradeMeShippingMessage")
	private String tradeMeShippingMessage;

	@SerializedName("IsTradeMeShippingAvailable")
	private boolean isTradeMeShippingAvailable;

	@SerializedName("PurchaseId")
	private int purchaseId;

	@SerializedName("CreditCardPaymentDate")
	private String creditCardPaymentDate;

	@SerializedName("SubtotalPrice")
	private double subtotalPrice;

	@SerializedName("BuyerDispute")
	private BuyerDispute buyerDispute;

	@SerializedName("TradeMeShippingBookingId")
	private int tradeMeShippingBookingId;

	@SerializedName("Status")
	private int status;

	@SerializedName("CreditCardLastFourDigits")
	private String creditCardLastFourDigits;

	@SerializedName("ShippingType")
	private int shippingType;

	@SerializedName("HasSellerPlacedFeedback")
	private boolean hasSellerPlacedFeedback;

	@SerializedName("PaymentMethodUsed")
	private String paymentMethodUsed;

	@SerializedName("PaymentDate")
	private String paymentDate;

	@SerializedName("MessageFromBuyer")
	private String messageFromBuyer;

	@SerializedName("ReferenceNumber")
	private String referenceNumber;

	@SerializedName("Method")
	private int method;

	@SerializedName("CreditCardType")
	private String creditCardType;

	@SerializedName("OrderId")
	private int orderId;

	@SerializedName("TotalSalePrice")
	private double totalSalePrice;

	@SerializedName("QuantitySold")
	private int quantitySold;

	@SerializedName("TradeMeShippingDeliveryAddress")
	private TradeMeShippingDeliveryAddress tradeMeShippingDeliveryAddress;

	@SerializedName("PingPaymentDetails")
	private PingPaymentDetails pingPaymentDetails;

	@SerializedName("StatusDate")
	private String statusDate;

	@SerializedName("SelectedShipping")
	private String selectedShipping;

	@SerializedName("ShippingPrice")
	private double shippingPrice;

	@SerializedName("Price")
	private double price;

	@SerializedName("TotalShippingPrice")
	private double totalShippingPrice;

	@SerializedName("PaymentDetails")
	private PaymentDetails paymentDetails;

	@SerializedName("PaymentInstructions")
	private String paymentInstructions;

	@SerializedName("IsPaymentPending")
	private boolean isPaymentPending;

	@SerializedName("HasBuyerPlacedFeedback")
	private boolean hasBuyerPlacedFeedback;

	public void setSoldDate(String soldDate){
		this.soldDate = soldDate;
	}

	public String getSoldDate(){
		return soldDate;
	}

	public void setDeliveryDetailsSent(boolean deliveryDetailsSent){
		this.deliveryDetailsSent = deliveryDetailsSent;
	}

	public boolean isDeliveryDetailsSent(){
		return deliveryDetailsSent;
	}

	public void setIsDeferredPaymentAvailable(boolean isDeferredPaymentAvailable){
		this.isDeferredPaymentAvailable = isDeferredPaymentAvailable;
	}

	public boolean isIsDeferredPaymentAvailable(){
		return isDeferredPaymentAvailable;
	}

	public void setHasPaymentBeenReceived(boolean hasPaymentBeenReceived){
		this.hasPaymentBeenReceived = hasPaymentBeenReceived;
	}

	public boolean isHasPaymentBeenReceived(){
		return hasPaymentBeenReceived;
	}

	public void setDeferredPaymentId(String deferredPaymentId){
		this.deferredPaymentId = deferredPaymentId;
	}

	public String getDeferredPaymentId(){
		return deferredPaymentId;
	}

	public void setDeliveryAddress(DeliveryAddress deliveryAddress){
		this.deliveryAddress = deliveryAddress;
	}

	public DeliveryAddress getDeliveryAddress(){
		return deliveryAddress;
	}

	public void setBuyer(Buyer buyer){
		this.buyer = buyer;
	}

	public Buyer getBuyer(){
		return buyer;
	}

	public void setHasPaidByCreditCard(boolean hasPaidByCreditCard){
		this.hasPaidByCreditCard = hasPaidByCreditCard;
	}

	public boolean isHasPaidByCreditCard(){
		return hasPaidByCreditCard;
	}

	public void setTradeMeShippingMessage(String tradeMeShippingMessage){
		this.tradeMeShippingMessage = tradeMeShippingMessage;
	}

	public String getTradeMeShippingMessage(){
		return tradeMeShippingMessage;
	}

	public void setIsTradeMeShippingAvailable(boolean isTradeMeShippingAvailable){
		this.isTradeMeShippingAvailable = isTradeMeShippingAvailable;
	}

	public boolean isIsTradeMeShippingAvailable(){
		return isTradeMeShippingAvailable;
	}

	public void setPurchaseId(int purchaseId){
		this.purchaseId = purchaseId;
	}

	public int getPurchaseId(){
		return purchaseId;
	}

	public void setCreditCardPaymentDate(String creditCardPaymentDate){
		this.creditCardPaymentDate = creditCardPaymentDate;
	}

	public String getCreditCardPaymentDate(){
		return creditCardPaymentDate;
	}

	public void setSubtotalPrice(double subtotalPrice){
		this.subtotalPrice = subtotalPrice;
	}

	public double getSubtotalPrice(){
		return subtotalPrice;
	}

	public void setBuyerDispute(BuyerDispute buyerDispute){
		this.buyerDispute = buyerDispute;
	}

	public BuyerDispute getBuyerDispute(){
		return buyerDispute;
	}

	public void setTradeMeShippingBookingId(int tradeMeShippingBookingId){
		this.tradeMeShippingBookingId = tradeMeShippingBookingId;
	}

	public int getTradeMeShippingBookingId(){
		return tradeMeShippingBookingId;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public void setCreditCardLastFourDigits(String creditCardLastFourDigits){
		this.creditCardLastFourDigits = creditCardLastFourDigits;
	}

	public String getCreditCardLastFourDigits(){
		return creditCardLastFourDigits;
	}

	public void setShippingType(int shippingType){
		this.shippingType = shippingType;
	}

	public int getShippingType(){
		return shippingType;
	}

	public void setHasSellerPlacedFeedback(boolean hasSellerPlacedFeedback){
		this.hasSellerPlacedFeedback = hasSellerPlacedFeedback;
	}

	public boolean isHasSellerPlacedFeedback(){
		return hasSellerPlacedFeedback;
	}

	public void setPaymentMethodUsed(String paymentMethodUsed){
		this.paymentMethodUsed = paymentMethodUsed;
	}

	public String getPaymentMethodUsed(){
		return paymentMethodUsed;
	}

	public void setPaymentDate(String paymentDate){
		this.paymentDate = paymentDate;
	}

	public String getPaymentDate(){
		return paymentDate;
	}

	public void setMessageFromBuyer(String messageFromBuyer){
		this.messageFromBuyer = messageFromBuyer;
	}

	public String getMessageFromBuyer(){
		return messageFromBuyer;
	}

	public void setReferenceNumber(String referenceNumber){
		this.referenceNumber = referenceNumber;
	}

	public String getReferenceNumber(){
		return referenceNumber;
	}

	public void setMethod(int method){
		this.method = method;
	}

	public int getMethod(){
		return method;
	}

	public void setCreditCardType(String creditCardType){
		this.creditCardType = creditCardType;
	}

	public String getCreditCardType(){
		return creditCardType;
	}

	public void setOrderId(int orderId){
		this.orderId = orderId;
	}

	public int getOrderId(){
		return orderId;
	}

	public void setTotalSalePrice(double totalSalePrice){
		this.totalSalePrice = totalSalePrice;
	}

	public double getTotalSalePrice(){
		return totalSalePrice;
	}

	public void setQuantitySold(int quantitySold){
		this.quantitySold = quantitySold;
	}

	public int getQuantitySold(){
		return quantitySold;
	}

	public void setTradeMeShippingDeliveryAddress(TradeMeShippingDeliveryAddress tradeMeShippingDeliveryAddress){
		this.tradeMeShippingDeliveryAddress = tradeMeShippingDeliveryAddress;
	}

	public TradeMeShippingDeliveryAddress getTradeMeShippingDeliveryAddress(){
		return tradeMeShippingDeliveryAddress;
	}

	public void setPingPaymentDetails(PingPaymentDetails pingPaymentDetails){
		this.pingPaymentDetails = pingPaymentDetails;
	}

	public PingPaymentDetails getPingPaymentDetails(){
		return pingPaymentDetails;
	}

	public void setStatusDate(String statusDate){
		this.statusDate = statusDate;
	}

	public String getStatusDate(){
		return statusDate;
	}

	public void setSelectedShipping(String selectedShipping){
		this.selectedShipping = selectedShipping;
	}

	public String getSelectedShipping(){
		return selectedShipping;
	}

	public void setShippingPrice(double shippingPrice){
		this.shippingPrice = shippingPrice;
	}

	public double getShippingPrice(){
		return shippingPrice;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setTotalShippingPrice(double totalShippingPrice){
		this.totalShippingPrice = totalShippingPrice;
	}

	public double getTotalShippingPrice(){
		return totalShippingPrice;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails){
		this.paymentDetails = paymentDetails;
	}

	public PaymentDetails getPaymentDetails(){
		return paymentDetails;
	}

	public void setPaymentInstructions(String paymentInstructions){
		this.paymentInstructions = paymentInstructions;
	}

	public String getPaymentInstructions(){
		return paymentInstructions;
	}

	public void setIsPaymentPending(boolean isPaymentPending){
		this.isPaymentPending = isPaymentPending;
	}

	public boolean isIsPaymentPending(){
		return isPaymentPending;
	}

	public void setHasBuyerPlacedFeedback(boolean hasBuyerPlacedFeedback){
		this.hasBuyerPlacedFeedback = hasBuyerPlacedFeedback;
	}

	public boolean isHasBuyerPlacedFeedback(){
		return hasBuyerPlacedFeedback;
	}

	@Override
 	public String toString(){
		return 
			"SalesItem{" + 
			"soldDate = '" + soldDate + '\'' + 
			",deliveryDetailsSent = '" + deliveryDetailsSent + '\'' + 
			",isDeferredPaymentAvailable = '" + isDeferredPaymentAvailable + '\'' + 
			",hasPaymentBeenReceived = '" + hasPaymentBeenReceived + '\'' + 
			",deferredPaymentId = '" + deferredPaymentId + '\'' + 
			",deliveryAddress = '" + deliveryAddress + '\'' + 
			",buyer = '" + buyer + '\'' + 
			",hasPaidByCreditCard = '" + hasPaidByCreditCard + '\'' + 
			",tradeMeShippingMessage = '" + tradeMeShippingMessage + '\'' + 
			",isTradeMeShippingAvailable = '" + isTradeMeShippingAvailable + '\'' + 
			",purchaseId = '" + purchaseId + '\'' + 
			",creditCardPaymentDate = '" + creditCardPaymentDate + '\'' + 
			",subtotalPrice = '" + subtotalPrice + '\'' + 
			",buyerDispute = '" + buyerDispute + '\'' + 
			",tradeMeShippingBookingId = '" + tradeMeShippingBookingId + '\'' + 
			",status = '" + status + '\'' + 
			",creditCardLastFourDigits = '" + creditCardLastFourDigits + '\'' + 
			",shippingType = '" + shippingType + '\'' + 
			",hasSellerPlacedFeedback = '" + hasSellerPlacedFeedback + '\'' + 
			",paymentMethodUsed = '" + paymentMethodUsed + '\'' + 
			",paymentDate = '" + paymentDate + '\'' + 
			",messageFromBuyer = '" + messageFromBuyer + '\'' + 
			",referenceNumber = '" + referenceNumber + '\'' + 
			",method = '" + method + '\'' + 
			",creditCardType = '" + creditCardType + '\'' + 
			",orderId = '" + orderId + '\'' + 
			",totalSalePrice = '" + totalSalePrice + '\'' + 
			",quantitySold = '" + quantitySold + '\'' + 
			",tradeMeShippingDeliveryAddress = '" + tradeMeShippingDeliveryAddress + '\'' + 
			",pingPaymentDetails = '" + pingPaymentDetails + '\'' + 
			",statusDate = '" + statusDate + '\'' + 
			",selectedShipping = '" + selectedShipping + '\'' + 
			",shippingPrice = '" + shippingPrice + '\'' + 
			",price = '" + price + '\'' + 
			",totalShippingPrice = '" + totalShippingPrice + '\'' + 
			",paymentDetails = '" + paymentDetails + '\'' + 
			",paymentInstructions = '" + paymentInstructions + '\'' + 
			",isPaymentPending = '" + isPaymentPending + '\'' + 
			",hasBuyerPlacedFeedback = '" + hasBuyerPlacedFeedback + '\'' + 
			"}";
		}
}