package Table;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry> entries;

    public Table() {
        entries = new ArrayList();
    }

    public V get(K k) {
        V retVal = null;
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getKey().equals(k)) {
                retVal = (V) entry.getValue();
            }
        }
        return retVal;
    }

    public void put(K k, V v) {
        if (keyExists(k)) {
            remove(k);
        }
        entries.add(new Entry<>(k, v));

    }

    public Boolean keyExists(K k) {
        Boolean retVal = false;
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getKey().equals(k)) {
                retVal = true;
            }
        }

        return retVal;
    }

    public void remove(K k) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getKey().equals(k)) {
                entries.remove(i);
            }
        }

    }
}
