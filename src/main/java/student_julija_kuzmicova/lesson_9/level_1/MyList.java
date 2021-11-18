package student_julija_kuzmicova.lesson_9.level_1;

//Task_3
interface MyList {

    //узнать длину списка
    int sizeList();

    //показать какие элементы в нем
    void printList();

    //проверить есть ли искомый элемент в списке
    boolean isInList(String elementForSearch);

    //добавить элемент в список
    void addElementToList(String element);

    //поменять элемент в списке
    void replaceElement(String elementOne, String elementTwo);

    //удалить элемент из списка
    void removeElement(String element);

    //скопировать список
    void copyList();

    //очистить список
    void clearList();

    //отсортировать элементы в списке
    void sortList();
}
