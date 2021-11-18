package student_oleg_kozlov.lesson_12.level_2;

import java.util.Optional;

// Task_10
interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
