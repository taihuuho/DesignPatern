package abstractfactory.pattern;

import abstractfactory.models.Bag;
import abstractfactory.models.Box;
import abstractfactory.models.Cartoon;
import abstractfactory.models.HappyKid;
import abstractfactory.models.Micky;
import abstractfactory.models.Wrapper;

public class KidPackageFactory  extends GiftPackageFactory  {

	@Override
	public Box getBox() {
		// TODO Auto-generated method stub
		return new Cartoon();
	}

	@Override
	public Bag getBag() {
		// TODO Auto-generated method stub
		return new Micky();
	}

	@Override
	public Wrapper getWrapper() {
		// TODO Auto-generated method stub
		return new HappyKid();
	}

}
