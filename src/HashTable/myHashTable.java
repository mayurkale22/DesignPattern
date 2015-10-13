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

    void add() {

    }

}
