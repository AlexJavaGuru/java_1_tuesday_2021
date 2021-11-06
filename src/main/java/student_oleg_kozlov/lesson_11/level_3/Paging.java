package student_oleg_kozlov.lesson_11.level_3;

// Task_39
public class Paging {
    private int pageToShow;
    private int itemsOnPage;

    public Paging() {
        this.pageToShow = 0;
        this.itemsOnPage = 0;
    }

    public Paging(int pageToShow, int itemsOnPage) {
        this.pageToShow = pageToShow;
        this.itemsOnPage = itemsOnPage;
    }

    public int getPageToShow() {
        return pageToShow;
    }

    public int getItemsOnPage() {
        return itemsOnPage;
    }
}
