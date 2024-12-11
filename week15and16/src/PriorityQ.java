import java.util.Comparator;

public class PriorityQ<K,V> extends AbstractPriorityQueue<K,V>{
	private PositionalList<Entry<K,V>> list = new LinkedPositionalList<>();
	
	public PriorityQ(){
		super();
	}
	
	public PriorityQ(Comparator<K> comp) {
		super(comp);
	}
	
	@Override 
	public int size() {
		return list.size();
	}
	
	private Position<Entry<K,V>> findMin(){
		Position<Entry<K,V>> small = list.first();
		for (Position<Entry<K,V>> walk : list.positions())
			if (compare(walk.getElement(), small.getElement()) < 0)
				small = walk;
		return small;
	}
	
	@Override
	public Entry<K,V> insert(K key, V value) throws IllegalArgumentException{
		checkKey(key);
		Entry<K, V> entry = new PQEntry<>(key, value);
		list.addLast(entry);
		return entry;
	}
	
	@Override
	public Entry<K,V> min(){
		if (list.isEmpty())
			return null;
		return findMin().getElement();
	}
	
	@Override
	public Entry<K,V> removeMin(){
		if (list.isEmpty())
			return null;
		return list.remove(findMin());
	}


}
