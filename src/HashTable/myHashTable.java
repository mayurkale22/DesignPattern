package HashTable;

/**
 * Created by mayurkale on 10/12/15.
 */


class LinkedHashEntry {
    String key;
    int value;
    LinkedHashEntry next;

    LinkedHashEntry (String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}



public class myHashTable {

    int TABLE_SIZE;
    int size;
    LinkedHashEntry[] table;


    myHashTable() {
        size = 0;
        table = new LinkedHashEntry[TABLE_SIZE];
        for (int i=0; i<TABLE_SIZE;i++)
            table[i] = null;
    }

    int getSize() {
        return size;
    }

    void makeEmpty() {
        for (int i=0; i<TABLE_SIZE;i++)
            table[i] = null;
    }


    void add(String key, int value) {
        int hash = myHash(key) % TABLE_SIZE;

        if (table[hash] == null)
            table[hash] = new LinkedHashEntry(key, value);
        else {
            LinkedHashEntry entry = table[hash];
            while (entry.next != null && !entry.key.equals(key))
                entry = entry.next;
            if (entry.key.equals(key))
                entry.value = value;
            else
                entry.next = new LinkedHashEntry(key, value);
        }
        size++;

    }

    public int get(String key)
    {
        int hash = (myHash(key) % TABLE_SIZE);
        if (table[hash] == null)
            return -1;
        else
        {
            LinkedHashEntry entry = table[hash];
            while (entry != null && !entry.key.equals(key))
                entry = entry.next;
            if (entry == null)
                return -1;
            else
                return entry.value;
        }
    }

    public void remove(String key)
    {
        int hash = (myHash( key ) % TABLE_SIZE);
        if (table[hash] != null)
        {
            LinkedHashEntry prevEntry = null;
            LinkedHashEntry entry = table[hash];
            while (entry.next != null && !entry.key.equals(key))
            {
                prevEntry = entry;
                entry = entry.next;
            }
            if (entry.key.equals(key))
            {
                if (prevEntry == null)
                    table[hash] = entry.next;
                else
                    prevEntry.next = entry.next;
                size--;
            }
        }
    }

    int myHash(String key) {
        int hashVal = key.hashCode();
        hashVal = hashVal % TABLE_SIZE;

        if (hashVal < 0)
            hashVal += TABLE_SIZE;

        return hashVal;
    }

}
