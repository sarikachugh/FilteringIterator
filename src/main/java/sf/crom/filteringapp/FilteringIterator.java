package sf.crom.filteringapp;

import java.util.Iterator;

public class FilteringIterator implements Iterator<Integer> {

	Iterator<Integer> itr;
	IObjectTest iobj;

	FilteringIterator(Iterator<Integer> itr, IObjectTest iobj) {
		this.itr = itr;
		this.iobj = iobj;
	}

	public boolean hasNext() {
		return itr.hasNext();
	}

	public Integer next() {
		Integer obj = itr.next();
		if (iobj.test(obj))
			return obj;
		return null;
	}

}
