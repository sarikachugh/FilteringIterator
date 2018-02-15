package sf.crom.filteringapp;

public class OddObject implements IObjectTest {

	public boolean test(Object o) {
		if (o instanceof Integer && (Integer) o % 2 != 0) {
			return true;
		}
		return false;
	}

}
