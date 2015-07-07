package abstractfactory.models;

public class HardPlastic extends Box {
	
	
	@Override
	public void setPrice(float price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setType(String type) {
		type ="HardPlastic";
		
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 1.0f;
	}

}
