package student_alberts_matrozis.lesson_11.level_2.UniqueWordFinder;

import java.util.Set;
import static student_alberts_matrozis.albertsUtils.Utils.*;

class UniqueWordFinderTest {

    public static void main(String[] args) {
        UniqueWordFinder test = new UniqueWordFinder();
        String text = "Lorem lorem, lorem. lorem";
        Set<String> result = test.find(text);
        System.out.println(result);
        check(result.isEmpty(), false);
    }
}
