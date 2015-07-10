package observer;

import java.util.List;

public interface Observer {
	public void update(String action, String item, List<String> items);
}