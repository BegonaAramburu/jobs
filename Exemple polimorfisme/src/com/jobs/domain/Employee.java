package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}
	
	@Override
	public String getData() {
		return "Id: " + id + "; Name: " + name + "; Address: " + address + "; Tf: " + phone + "; Salary: " + salaryPerMonth + "; Payment: " + paymentRate.pay(salaryPerMonth) + ".";
	}

}


