package org.canato.billing.discount.strategy;

import org.canato.billing.bean.Receipt;
import org.canato.billing.util.CommonUtils;

/**
 * Discount strategy based on entire receipt passed.
 * 
 * @author matteo
 *
 */
public class VolumeDiscountStrategy implements DiscountStrategy<Receipt> {

	private Double threshold;
	private float amount;

	public VolumeDiscountStrategy(Double threshold, float amount) {
		super();
		this.threshold = threshold;
		this.amount = amount;
	}
	
	public boolean isApplicableOn(Receipt receipt) {
		if (receipt == null) {
			return false;
		}
		return receipt.getGrossTotal() >= threshold;
	}

	public Double getAmount(Receipt receipt) {
		if (receipt == null || !isApplicableOn(receipt)) {
			return new Double(0);
		}
		return CommonUtils.round(receipt.getGrossTotal() * amount / 100);
	}

}
