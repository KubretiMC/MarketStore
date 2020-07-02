
public class SilverCard extends Card {
	public SilverCard(double turnOver, double purchaseValue) {
		super(turnOver, purchaseValue);
		this.setDiscountRate(turnOver);
		this.setDiscount();
		this.setTotal();
	}

	
	@Override
	public void setDiscountRate(double discountRate) {	
		if (turnover > 300) super.setDiscountRate(3.5);
		else super.setDiscountRate(2);

	}
}
