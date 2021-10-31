package student_josifs_makarenko.lesson_7.level7;
//task_13
public class WordServiceTest {
    public static void main(String[] args) {
        wordServiceTest();
    }

    static void wordServiceTest() {
        WordService wordService = new WordService();
        String text = "Sometimes I think about drink some coffee Mmmmm coffee I <3 coffee";
        check(wordService.findMostFrequentWordAfter(text).equals("coffee") &&
                wordService.findMostFrequentWordAfter(text).equals(wordService.findMostFrequentWordBefore(text)), "WordServiceTest");
    }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK!" +
                    "\n" +
                    "░░░░░░░░░░░░░██\n" +
                    "░░░░░░░░░░░░█░░█\n" +
                    "░░░░░░░░░░░░█░░█\n" +
                    "░░░░░░░░░░░█░░░█\n" +
                    "░░░░░░░░░░█░░░░█\n" +
                    "████████▄▄█░░░░░███████████▄\n" +
                    "▓▓▓▓▓▓▓█░░░░░░░░░░░░░░░░░░░█\n" +
                    "▓▓▓▓▓▓▓█░░█░░░█▀█░█▀▀░█▀█░░░█\n" +
                    "▓▓▓▓▓▓▓█▀▀█▀▀░█▀▄░█▀░░█▀▀░░░█\n" +
                    "▓▓▓▓▓▓▓█░░█░░░▀░▀░▀▀▀░▀░░░░█\n" +
                    "▓▓▓▓▓▓▓█░░░░░░░░░░░░░░░░░░█\n" +
                    "▓▓▓▓▓▓▓█████░░░░░░░░░░░░░█\n" +
                    "███████▀░░░░▀▀██████████▀");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER!");
            System.out.println("""
                    ░░░░░▄▄▄▀▀▀▀▀▀▀▀▀▄▄▄░░░░░░░░░
                    ░░░▄▀░░░░░░░░░░░░░░░▀▀▄▄░░░░░
                    ░░▄▀░░░░░░░░░░░░░░░░░░░░▀▄░░░
                    ░▄▀░░░░░░░░░░░░░░░░░░░░░░░█░░
                    ░█░░░░░░░░░░░░░░░░░░░░░░░░░█░
                    ▐░░░░░░░░░░░░░░░░░░░░░░░░░░░█
                    █░░░░▀▀█▄▄▄░░░▄▌░░░░░░░░░░░░▐
                    ▌░░░░░▌░██▀█▀▀░░░▄▄▄▄▄░░░░▌░▐
                    ▌░░░░░▀▄▄▄▀░░░░░░▌░▀███▄▄▀░░▐
                    ▌░░░░░░░░░░░░░░░░░▀▄▄▄▄▀░░░▄▌
                    ▐░░░░▐▀░░░░░░░░░░░░░░░░░░░▄▀░
                    ░█░░░▌░░▄▀▀▀▄▄▄░░░░░░░░░░▄▀░░
                    ░░█░░▀░░░░▄▄▄▄░▀▀▌░░▌░░░█░░░░
                    ░░░▀▄░░░░░░░░░▀░░░▄▀░░▄▀░░░░░
                    ░░░░░▀▄▄▄░░░░░░░░░▄▄▀▀░░░░░░░
                    ░░░░░░░░▐▀▀▀▀▀▀▀▀▀░░░░░░░░░░░
                    ░░░░░░░░█░░░░░░░░░░░░░░░░░░░░
                    █▀▀█ █▀▀█ █▀▀ 　 █░░█ █▀▀█ █░░█
                    █▄▄█ █▄▄▀ █▀▀ 　 █▄▄█ █░░█ █░░█
                    ▀░░▀ ▀░▀▀ ▀▀▀ 　 ▄▄▄█ ▀▀▀▀ ░▀▀▀
                    ▒█░▄▀ ▀█▀ ▒█▀▀▄ ▒█▀▀▄ ▀█▀ ▒█▄░▒█ ▒█▀▀█
                    ▒█▀▄░ ▒█░ ▒█░▒█ ▒█░▒█ ▒█░ ▒█▒█▒█ ▒█░▄▄
                    ▒█░▒█ ▄█▄ ▒█▄▄▀ ▒█▄▄▀ ▄█▄ ▒█░░▀█ ▒█▄▄█
                    ▒█▀▄▀█ ▒█▀▀▀ ▀█
                    ▒█▒█▒█ ▒█▀▀▀ █▀
                    ▒█░░▒█ ▒█▄▄▄ ▄░""");
        }
    }
}
