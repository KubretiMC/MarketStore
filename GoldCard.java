
public class GoldCard extends Card{
	public GoldCard(double turnOver, double purchaseValue) {
		super(turnOver, purchaseValue);
		this.setDiscountRate(turnOver);
		this.setDiscount();
		this.setTotal();
	}

	@Override
	public void setDiscountRate(double discountRate) {	
		if (turnover > 100 && turnover<1000) super.setDiscountRate(turnover/100+2);
        else if (turnover >1000) super.setDiscountRate(10);
        else super.setDiscountRate(2);

	}
}
