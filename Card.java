
abstract class Card {
	private String ownerName;
	private String ownerLastName;
	private String ownerAddress;

	protected double turnover;
	private double discountRate;
	private double discount;
	private double purchaseValue;
	private double total;
    
    
    
    public double getTotal() {
		return total;
	}

	public void setTotal() {
		this.total =  (this.getPurchaseValue()-this.getDiscount());
	}

    public Card(String ownerName, String ownerLastName, String ownerAddress, double turnOver, double purchaseValue)
    {
		 this.ownerName=ownerName;
		 this.ownerLastName=ownerLastName;
		 this.ownerAddress=ownerAddress;
		 this.turnover=turnOver;
	     this.purchaseValue=purchaseValue;    	   	
    }
	
    public Card(double turnOver, double purchaseValue)
    {
    	this.turnover=turnOver;
    	this.purchaseValue=purchaseValue;    	   	
    }
    
	protected String getOwnerName() {
		return ownerName;
	}

	protected void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerLastName() {
		return ownerLastName;
	}

	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}



	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount() {
		this.discount = ((this.getPurchaseValue()*this.getDiscountRate())/100);
	}

	public double getPurchaseValue() {
		
		return Math.floor(purchaseValue*100) / 100;
	}

	public void setPurchaseValue(int purchaseValue) {
		this.purchaseValue = purchaseValue;
	}

	protected double getDiscountRate() {
		return discountRate;
	};


	public void showInfo() {
		  System.out.println("Purchase value: $"+ getPurchaseValue());
			System.out.println("Discount rate: "+ getDiscountRate()+"%");
			System.out.println("Discount: $"+ getDiscount());
		    System.out.println("Total: $"+ getTotal());
		    System.out.println();
	}

}
