package com.revature.service;

import com.revature.pojo.Loan;

public class LoanServiceImpl implements LoanService {

	Calculator calc = new CalcImpl();
	
	
	@Override
	public Double calculateMonthlyPaymentAmount(Loan loan) {
		
		return null;
	}

	@Override
	public Double makeScheduledPayment(Loan loan) {
		
		return null;
	}

}
