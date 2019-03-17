package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<EntryNested> entries;

    public TableNested() {
        entries = new ArrayList();
    }



    public void put(K k, V v)
    {
        if (keyExists(k)) {
            remove(k);
        }
        entries.add(new EntryNested<>(k, v));
    }

    public V get(K k){
        V retVal = null;
        for (int i = 0; i < entries.size(); i++) {
            EntryNested entry = entries.get(i);
            if (entry.getKey().equals(k)) {
                retVal = (V) entry.getValue();
            }
        }
        return retVal;
    }

    public Boolean keyExists(K k) {
        Boolean retVal = false;
        for (int i = 0; i < entries.size(); i++) {
            EntryNested entry = entries.get(i);
            if (entry.getKey().equals(k)) {
                retVal = true;
            }
        }

        return retVal;
    }

    public void remove(K k) {
        for (int i = 0; i < entries.size(); i++) {
            EntryNested entry = entries.get(i);
            if (entry.getKey().equals(k)) {
                entries.remove(i);
            }
        }

    }



    public class EntryNested<K, V> {
        private K key;
        private V value;

        public EntryNested(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }



    }

}
