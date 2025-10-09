package com.tnsif.Application;

import com.tnsif.Framework.NormalAcc;
import com.tnsif.Framework.PrimeAcc;
import com.tnsif.Framework.Shopfactory;

public class GSShopFactory implements Shopfactory {
	
	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		PrimeAcc pri = new PrimeAcc(accNo,accNm,charges,isPrime);
		return pri;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		NormalAcc normal = new NormalAcc(accNo,accNm,charges,deliveryCharge);
		return normal;
	}


}
