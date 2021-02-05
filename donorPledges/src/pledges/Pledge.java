package pledges;

public class Pledge {
	
	String donorName;
	Double pledgeAmt;
	int payMonths;
	int monthsPaid;
	
	public Pledge(String donorName) {
		this.donorName = donorName;
	}
	public double calculateMonthlyPayments() {
		return this.pledgeAmt/this.payMonths;
		
	}
	public double calculateRemainderToBePaid() {
		return this.calculateMonthlyPayments() * (this.payMonths - this.monthsPaid);
	}
	public Boolean isPledgeFuffiled() {
		if(this.monthsPaid == this.payMonths) {
			return true;
		}else {
			return false;
		}
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public Double getPledgeAmt() {
		return pledgeAmt;
	}
	public void setPledgeAmt(Double pledgeAmt) {
		this.pledgeAmt = pledgeAmt;
	}
	public int getPayMonths() {
		return payMonths;
	}
	public void setPayMonths(int payMonths) {
		this.payMonths = payMonths;
	}
	public int getMonthsPaid() {
		return monthsPaid;
	}
	public void setMonthsPaid(int monthsPaid) {
		this.monthsPaid = monthsPaid;
	}

}
