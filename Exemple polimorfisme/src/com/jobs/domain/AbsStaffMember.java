package com.jobs.domain;

public abstract class AbsStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid=0;

	private static int COUNTER_MEMBERS = 1;

	public AbsStaffMember(String name, String address, String phone,double totalPaid) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;
                this.totalPaid = totalPaid;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

  
        public String getAddress() {
            return address;
        }

        public String getPhone() {
            return phone;
        }


        public double getTotalPaid() {
            return totalPaid;
        }

        public static int getCOUNTER_MEMBERS() {
            return COUNTER_MEMBERS;
        }


	public abstract void pay();
}
