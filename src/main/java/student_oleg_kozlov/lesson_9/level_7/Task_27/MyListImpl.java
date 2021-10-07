package student_oleg_kozlov.lesson_9.level_7.Task_27;

// Task_27
class MyListImpl implements MyList {

    private MyListNode headNode;
    private MyListNode tailNode;
    private int length;

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isInList(MyClass element) {
        if (element == null) {
            return false;
        }
        MyListNode node = headNode;
        while (node != null) {
            if (node.getData().equals(element)) {
                return true;
            }
            node = node.getPointerNext();
        }
        return false;
    }

    @Override
    public int appearanceCount(MyClass element) {
        if (element == null) {
            return 0;
        }
        int result = 0;
        MyListNode node = headNode;
        while (node != null) {
            if (node.getData().equals(element)) {
                result++;
            }
            node = node.getPointerNext();
        }
        return result;
    }

    @Override
    public MyClass get(int index) {
        if (length == 0 || index > (length - 1)) {
            return null;
        }
        MyListNode node = getNodeByIndex(index);
        return (node != null) ? node.getData() : null;
    }

    @Override
    public void add(MyClass element) {
        if (element == null) {
            return;
        }
        MyListNode currentTail = tailNode;
        MyListNode newNode = new MyListNode(currentTail, element, null);
        tailNode = newNode;
        if (currentTail == null) {
            headNode = newNode;
        } else {
            currentTail.setPointerNext(newNode);
        }
        length++;
    }

    @Override
    public void add(int index, MyClass element) {
        if (element == null || index > (length - 1)) {
            return;
        }
        MyListNode currNode = getNodeByIndex(index);
        MyListNode prevNode = currNode.getPointerPrev();
        MyListNode newNode = new MyListNode(prevNode, element, currNode);
        currNode.setPointerPrev(newNode);
        if (prevNode == null) {
            headNode = newNode;
        } else {
            prevNode.setPointerNext(newNode);
        }
        length++;
    }

    @Override
    public void replace(int index, MyClass element) {
        if (element == null || index > (length - 1)) {
            return;
        }
        MyListNode node = getNodeByIndex(index);
        node.setData(element);
    }

    @Override
    public void replace(MyClass before, MyClass after) {
        if (before == null || after == null) {
            return;
        }
        MyListNode node = headNode;
        while (node != null) {
            if (node.getData().equals(before)) {
                node.setData(after);
            }
            node = node.getPointerNext();
        }
    }

    @Override
    public void remove(MyClass element) {
        if (element == null) {
            return;
        }
        MyListNode next;
        for (MyListNode x = headNode; x != null; x = next) {
            next = x.getPointerNext();
            if (x.getData().equals(element)) {
                removeNode(x);
            }
        }
    }

    @Override
    public void remove(int index) {
        if (index > (length - 1)) {
            return;
        }
        removeNode(getNodeByIndex(index));
    }

    @Override
    public void clear() {
        MyListNode next;
        for (MyListNode x = headNode; x != null; x = next) {
            next = x.getPointerNext();
            x.setData(null);
            x.setPointerNext(null);
            x.setPointerPrev(null);
        }
        headNode = tailNode = null;
        length = 0;
    }

    @Override
    public void sort(String order) {
        if (!order.equals("ASC") && !order.equals("DESC")) {
            return;
        }

        boolean isSorted = false;
        if (order.equals("ASC")) {
            while (!isSorted) {
                isSorted = sortOneCycle(1);
            }
        } else {
            while (!isSorted) {
                isSorted = sortOneCycle(-1);
            }
        }
    }

    @Override
    public boolean isEqual(MyList other) {
        if (other == null || length != other.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!this.get(i).equals(other.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printElements() {
        if (length == 0) {
            System.out.println("List is empty");
            return;
        }
        MyListNode node = headNode;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getPointerNext();
        }
    }

    private MyListNode getNodeByIndex(int index) {
        boolean doBackward = index > (length / 2);
        MyListNode node = (doBackward) ? tailNode : headNode;
        int counter = (doBackward) ? length - 1 : 0;

        while (node != null) {
            if (doBackward) {
                if (counter == length / 2) {
                    break;
                }
            } else {
                if (counter > length / 2) {
                    break;
                }
            }
            if (index == counter) {
                return node;
            }
            if (doBackward) {
                node = node.getPointerPrev();
                counter--;
            } else {
                node = node.getPointerNext();
                counter++;
            }
        }
        return null;
    }

    private void removeNode(MyListNode nodeToRemove) {
        if (nodeToRemove == null) {
            return;
        }
        MyListNode prevNode = nodeToRemove.getPointerPrev();
        MyListNode nextNode = nodeToRemove.getPointerNext();

        if (prevNode == null) {
            headNode = nextNode;
        } else {
            prevNode.setPointerNext(nextNode);
            nodeToRemove.setPointerPrev(null);
        }

        if (nextNode == null) {
            tailNode = prevNode;
        } else {
            nextNode.setPointerPrev(prevNode);
            nodeToRemove.setPointerNext(null);
        }

        nodeToRemove.setData(null);
        length--;
    }

    private boolean sortOneCycle(int compareToOut) {
        if (compareToOut > 1 || compareToOut < -1) {
            return false;
        }

        MyClass tempElement;
        MyClass currElement;
        MyClass nextElement;

        boolean isSorted = true;
        for (int i = 0; i < length - 1; i++) {
            currElement = this.get(i);
            nextElement = this.get(i + 1);
            if (currElement.compareTo(nextElement) == compareToOut) {
                tempElement = nextElement;
                this.replace(i + 1, currElement);
                this.replace(i, tempElement);
                isSorted = false;
            }
        }
        return isSorted;
    }
}
