package student_oleg_kozlov.lesson_9.level_7.Task_27;

// Task_27
class MyListNode {
    private MyListNode pointerPrev;
    private MyClass data;
    private MyListNode pointerNext;

    public MyListNode getPointerPrev() {
        return pointerPrev;
    }

    public void setPointerPrev(MyListNode pointerPrev) {
        this.pointerPrev = pointerPrev;
    }

    public MyClass getData() {
        return data;
    }

    public void setData(MyClass data) {
        this.data = data;
    }

    public MyListNode getPointerNext() {
        return pointerNext;
    }

    public void setPointerNext(MyListNode pointerNext) {
        this.pointerNext = pointerNext;
    }

    public MyListNode(MyListNode pointerPrev, MyClass data, MyListNode pointerNext) {
        this.pointerPrev = pointerPrev;
        this.data = data;
        this.pointerNext = pointerNext;
    }

    @Override
    public String toString() {
        return "MyListNode{" +
                "pointerPrev=" + pointerPrev +
                ", data=" + data +
                ", pointerNext=" + pointerNext +
                '}';
    }
}
