package com.jobs.domain;

public class BossEmployee extends Employee{


    public BossEmployee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
        super(name, address, phone,salaryPerMonth,paymentRate);	
    }
    
    @Override
    public void pay() {
        totalPaid=paymentRate.pay(salaryPerMonth);
    }
    
}
