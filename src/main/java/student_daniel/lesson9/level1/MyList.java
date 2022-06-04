package student_daniel.lesson9.level1;

public interface MyList {
    //Task 3
    //Get list size
    int size();

    //Get full list of items
    void getFullList();

    //Get single item by ID
    void getItemByID(int id);

    //Get single/multiple items by value
    void getItemsByValue(String value);

    //Add single item to the list
    void addItem(int id, String value);

    //Replace item by ID
    void replaceItemByID(int id, String value);

    //Replace item value with new value
    void replaceOldValueToNew(String oldValue, String newValue);

    //Clear single item by ID
    void clearItemByID(int id);

    //Clear items by value
    void clearItemsByValue();

    //Clear all
    void clearAll();
}
