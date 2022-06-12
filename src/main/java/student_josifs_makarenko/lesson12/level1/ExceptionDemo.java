package student_josifs_makarenko.lesson12.level1;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 3;
        while (i <= 3 && i > 0) {
            switch (i) {
                case 1:
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                case 2:
                    try {
                        throw new Exception("~message~");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                case 3:
                    try {
                        throw new IllegalStateException("~message~");
                    } catch (Exception e) {
                        e.printStackTrace();
                        try {
                            throw new RuntimeException();
                        } catch (Exception ignored) {}
                    }

                case 0:
                    break;
            }
            i--;
        }
    }
}

