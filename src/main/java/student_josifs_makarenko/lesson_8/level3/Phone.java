package student_josifs_makarenko.lesson_8.level3;

public abstract class Phone {
    protected String firm;
    protected int price;
    protected boolean deviceOnOff;

    public String getFirm() {
        return firm;
    }

    public int getPrice() {
        return price;
    }

    public boolean isDeviceOnOff() {
        return deviceOnOff;
    }

    Phone(String firm, int price) {
        this.price =price;
        this.firm = firm;
    }
}
