package KukuDhaba;



public class KukuHotel {

	String name;
	int  bill;
	
	public KukuHotel()
	{
		super();
	}
	
	public KukuHotel(String name, int bill) {
		super();
		this.name = name;
		this.bill = bill;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	
	public int getBill() {
		return bill;
	}
 void setBill(int bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		
		            return "*  name =" + name + "\t<-------->\t bill=  " + bill + "*";
	}

	
	}
	
	

