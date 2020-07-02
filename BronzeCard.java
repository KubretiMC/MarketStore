public class BronzeCard extends Card{

	public BronzeCard(double turnOver, double purchaseValue) {
		super(turnOver, purchaseValue);
		this.setDiscountRate(turnOver);
		this.setDiscount();
		this.setTotal();
	}

	@Override
	public void setDiscountRate(double discountRate) {	
		if (turnover < 100) super.setDiscountRate(0);
        else if (turnover >= 100 & turnover <= 300) super.setDiscountRate(1);
        else super.setDiscountRate(2.5);

	}
}
