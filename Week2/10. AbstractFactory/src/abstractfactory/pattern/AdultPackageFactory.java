package abstractfactory.pattern;


import abstractfactory.models.Bag;
import abstractfactory.models.Box;
import abstractfactory.models.PlainPaper;
import abstractfactory.models.EverydayValue;
import abstractfactory.models.ResuableShopper;
import abstractfactory.models.Wrapper;

public class AdultPackageFactory extends GiftPackageFactory {

	@Override
	public Box getBox() {
		// TODO Auto-generated method stub
		return new PlainPaper();
	}

	@Override
	public Bag getBag() {
		// TODO Auto-generated method stub
		return new ResuableShopper();
	}

	@Override
	public Wrapper getWrapper() {
		// TODO Auto-generated method stub
		return new EverydayValue();
	}

}
