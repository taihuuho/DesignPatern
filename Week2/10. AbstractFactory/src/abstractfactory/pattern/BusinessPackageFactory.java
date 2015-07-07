package abstractfactory.pattern;

import abstractfactory.models.Bag;
import abstractfactory.models.Box;
import abstractfactory.models.HardPlastic;
import abstractfactory.models.HolidaySurprise;
import abstractfactory.models.MerchantCollection;
import abstractfactory.models.Wrapper;

public class BusinessPackageFactory  extends GiftPackageFactory  {

	@Override
	public Box getBox() {
		// TODO Auto-generated method stub
		return new HardPlastic();
	}

	@Override
	public Bag getBag() {
		// TODO Auto-generated method stub
		return new MerchantCollection();
	}

	@Override
	public Wrapper getWrapper() {
		// TODO Auto-generated method stub
		return new HolidaySurprise();
	}

}
