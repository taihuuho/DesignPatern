package abstractfactory.models;

public class HappyKid  extends Wrapper {

	@Override
	public void setPrice(float price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setType(String type) {
		type ="HappKid";
		
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 0.10f;
	}

}
