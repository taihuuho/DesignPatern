package abstractfactory.models;

public class HolidaySurprise extends Wrapper {

	@Override
	public void setPrice(float price) {
      	
	}

	@Override
	public void setType(String type) {
		   type = "HolidaySurprise";	
		
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 0.25f;
	}

}
