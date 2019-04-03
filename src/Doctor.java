
public class Doctor 
{
  private String address;
  private String name;
  private double balanceowed;
  private double payment;
  private double paid;
  private double total;
  
  public void setName(String str1)
  {
	   name = str1;
  }
  public void setAddress(String str2)
  {
	  address  = str2;
  }
 
  public void setPayment(double Str4)
  {
	  payment = Str4;
  }
  public String getAddress()
  {
	  return address;
  }
  public double getnewCharge()
  {
	  double total = balanceowed + payment;
	  return total;
  }
  public double getPaid()
  {
	  return paid;
  }
  public double getDebt()
  {
	  double debt = total - paid;
	  return debt;
  }
public void getAdress(int i) {
	// TODO Auto-generated method stub
	
}
  
}