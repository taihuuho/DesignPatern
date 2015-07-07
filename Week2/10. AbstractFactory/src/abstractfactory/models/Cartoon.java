package abstractfactory.models;

public class Cartoon extends Box {

	@Override
	public void setPrice(float price) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setType(String type) {
           type = "Cartoon"	;	
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 0.5f;
	}

}
