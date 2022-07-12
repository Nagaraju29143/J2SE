package training.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CustomHashMapDemo<K,V> {
	static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; //16
    static final int MAXIMUM_CAPACITY = 1 << 30;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    static final int TREEIFY_THRESHOLD = 8;
    static final int UNTREEIFY_THRESHOLD = 6;
    static final int MIN_TREEIFY_CAPACITY = 64;
    int threshold;
    final float loadFactor;
	transient Node<K,V>[] table;
	transient int size;
	transient int modCount;
	
	public CustomHashMapDemo() {
        this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
    }
	
	 
	public V put(K key, V value) {
        return putVal(hash(key), key, value, false, true);
    }
	
	static final int hash(Object key) {
        int h;
        h = key.hashCode();
        //System.out.println(key.hashCode());
        //System.out.println(h >>> 16);
      System.out.println("below is the generated hashcode");
      System.out.println((h = key.hashCode()) ^ (h >>> 16));
        
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
	
	final V putVal(int hash, K key, V value, boolean onlyIfAbsent,boolean evict) {
      Node<K,V>[] tab; Node<K,V> p; int n, i;
      if ((tab = table) == null || (n = tab.length) == 0)
       n = (tab = resize()).length;
      
      int index= hash & (n - 1)  ;
      System.out.println(index+" is the index for key:"+hash);
      
    if ((p = tab[i = hash & (n - 1)  ]) == null)
      tab[i] = newNode(hash, key, value, null);
   else {
       Node<K,V> e; K k;
     if (p.hash == hash &&
         ((k = p.key) == key || (key != null && key.equals(k))))
         e = p;
    /* else if (p instanceof TreeNode)
         e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);*/
     else {
         for (int binCount = 0; ; ++binCount) {
             if ((e = p.next) == null) {
                 p.next = newNode(hash, key, value, null);
                 if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                     treeifyBin(tab, hash);
                 break;
             }
             if (e.hash == hash &&
                 ((k = e.key) == key || (key != null && key.equals(k))))
                 break;
             p = e;
         }
     }
     if (e != null) { // existing mapping for key
         V oldValue = e.value;
         if (!onlyIfAbsent || oldValue == null)
             e.value = value;
         afterNodeAccess(e);
         return oldValue;
     }
 }
 ++modCount;
 if (++size > threshold)
     resize();
 afterNodeInsertion(evict);
 return null;
}
	
	 void afterNodeAccess(Node<K,V> p) { }
	 void afterNodeInsertion(boolean evict) { }
	final void treeifyBin(Node<K,V>[] tab, int hash) {
        int n, index; Node<K,V> e;
        if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
            resize();
        /*else if ((e = tab[index = (n - 1) & hash]) != null) {
            TreeNode<K,V> hd = null, tl = null;
            do {
                TreeNode<K,V> p = replacementTreeNode(e, null);
                if (tl == null)
                    hd = p;
                else {
                    p.prev = tl;
                    tl.next = p;
                }
                tl = p;
            } while ((e = e.next) != null);
            if ((tab[index] = hd) != null)
                hd.treeify(tab);
        }*/
    }
	
	static class Node<K,V> implements Map.Entry<K,V> {
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey()        { return key; }
        public final V getValue()      { return value; }
        public final String toString() { return key + "=" + value; }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;
            if (o instanceof Map.Entry) {
                Map.Entry<?,?> e = (Map.Entry<?,?>)o;
                if (Objects.equals(key, e.getKey()) &&
                    Objects.equals(value, e.getValue()))
                    return true;
            }
            return false;
        }
    }	
	   final Node<K,V>[] resize() {
	        Node<K,V>[] oldTab = table;
	        int oldCap = (oldTab == null) ? 0 : oldTab.length;
	        int oldThr = threshold;
	        int newCap, newThr = 0;
	        if (oldCap > 0) {
	            if (oldCap >= MAXIMUM_CAPACITY) {
	                threshold = Integer.MAX_VALUE;
	                return oldTab;
	            }
	            else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
	                     oldCap >= DEFAULT_INITIAL_CAPACITY)
	                newThr = oldThr << 1; // double threshold
	        }
	        else if (oldThr > 0) // initial capacity was placed in threshold
	            newCap = oldThr;
	        else {               // zero initial threshold signifies using defaults
	            newCap = DEFAULT_INITIAL_CAPACITY;
	            newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
	        }
	        if (newThr == 0) {
	            float ft = (float)newCap * loadFactor;
	            newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
	                      (int)ft : Integer.MAX_VALUE);
	        }
	        threshold = newThr;
	        @SuppressWarnings({"rawtypes","unchecked"})
	        Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
	        table = newTab;
	        if (oldTab != null) {
	            for (int j = 0; j < oldCap; ++j) {
	                Node<K,V> e;
	                if ((e = oldTab[j]) != null) {
	                    oldTab[j] = null;
	                    if (e.next == null)
	                        newTab[e.hash & (newCap - 1)] = e;
	                    /*else if (e instanceof TreeNode)
	                        ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);*/
	                    else { // preserve order
	                        Node<K,V> loHead = null, loTail = null;
	                        Node<K,V> hiHead = null, hiTail = null;
	                        Node<K,V> next;
	                        do {
	                            next = e.next;
	                            if ((e.hash & oldCap) == 0) {
	                                if (loTail == null)
	                                    loHead = e;
	                                else
	                                    loTail.next = e;
	                                loTail = e;
	                            }
	                            else {
	                                if (hiTail == null)
	                                    hiHead = e;
	                                else
	                                    hiTail.next = e;
	                                hiTail = e;
	                            }
	                        } while ((e = next) != null);
	                        if (loTail != null) {
	                            loTail.next = null;
	                            newTab[j] = loHead;
	                        }
	                        if (hiTail != null) {
	                            hiTail.next = null;
	                            newTab[j + oldCap] = hiHead;
	                        }
	                    }
	                }
	            }
	        }
	        return newTab;
	    }
	   
	   Node<K,V> newNode(int hash, K key, V value, Node<K,V> next) {
	        return new Node<>(hash, key, value, next);
	    }

	
	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		
		/*map.put(10,"ten");
		map.put(20,"twenty");
		map.put(30,"thirty");
		map.put(30,"thirty");*/
		
		Customer c1=new Customer(100,"ten",25); //116
		Customer c2=new Customer(200,"test",30);
		Customer c3=new Customer(300,"hari",29);
		Customer c4=new Customer(200,"test",30);
		Customer c5=new Customer(200,"test",30);
		Customer c6=new Customer(200,"test",30);
		
		
		/*map.put(c1, c1); //hash(c1)-366707353-->9
		map.put(c2, c2); //hash(c2)-1829157786-->10
		map.put(c3, c3); //hash(c3)-2018677104-->0
		map.put(c4, c4); //hash(c4)-1311071082-->10
		map.put(c5, c5); //hash(c5)-118353219-->3
		map.put(c6, c6); //hash(c6)-1550066273-->1*/
		
		map.put(c1, c1); //hash(c1)-116-->3
		map.put(c2, c2); //hash(c2)-116-->4
		map.put(c3, c3); //hash(c3)-104-->8
		map.put(c4, c4); //hash(c4)-116-->4
		map.put(c5, c5); //hash(c5)-116-->4
		map.put(c6, c6); //hash(c6)-116-->4
		
		
		System.out.println(map);
		

	}

}
