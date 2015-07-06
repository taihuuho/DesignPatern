package abstractfactory.pattern;

import abstractfactory.models.Bag;
import abstractfactory.models.Box;
import abstractfactory.models.Wrapper;

public abstract class GiftPackageFactory {
	
	public abstract Box getBox();
	public abstract Bag getBag();
	public abstract Wrapper getWrapper();

}
