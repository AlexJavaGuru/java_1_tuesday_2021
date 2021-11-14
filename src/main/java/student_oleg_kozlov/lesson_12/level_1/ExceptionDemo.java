package student_oleg_kozlov.lesson_12.level_1;

// Task_5
class ExceptionDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (i == 1) {
                try {
                    throw new Exception("Message for Exception: step 2");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    throw new IllegalStateException("Message for IllegalStateException: step 3");
                } catch (Exception e) {
                    e.printStackTrace();
                    try {
                        throw new Exception("Message for Exception: step 3", e);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
}
