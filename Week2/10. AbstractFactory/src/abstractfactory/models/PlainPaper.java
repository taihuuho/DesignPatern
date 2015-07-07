package abstractfactory.models;

public class PlainPaper extends Box {
	@Override
	public void setPrice(float price) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setType(String type) {
		type ="PlainPaper";
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 0.25f;
	}

}
