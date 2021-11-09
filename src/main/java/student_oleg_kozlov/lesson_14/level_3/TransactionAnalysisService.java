package student_oleg_kozlov.lesson_14.level_3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

// Task_19, Task_21, Task_22, Task_23, Task_24, Task_25, Task_26, Task_27, Task_28, Task_29, Task_30, Task_31
// Task_32, Task_33, Task_34, Task_35, Task_36, Task_37, Task_38
class TransactionAnalysisService {
    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .collect(toList());
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(toList());
    }

    public List<Transaction> sortTransactionsByValueAsc(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(t -> t.getValue()))
                .collect(toList());
    }

    public List<Transaction> sortTransactionsByValueDesc(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(toList());
    }

    public List<Transaction> findTransactionsIn2011AndSortByValueAsc(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(t -> t.getValue()))
                .collect(toList());
    }

    public List<Integer> findAllYearsForCompletedTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(toList());
    }

    public List<Integer> findUniqueYearsForCompletedTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(toList());
    }

    public List<String> findUniqueTradersNamesForCompletedTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .collect(toList());
    }

    public List<String> findUniqueTradersCitiesForCompletedTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(toList());
    }

    public List<String> findTradersFromCambridgeForCompletedTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .map(Trader::getName)
                .distinct()
                .collect(toList());
    }

    public List<String> findTraderNamesFromCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> cityToFind.equals(trader.getCity()))
                .map(Trader::getName)
                .distinct()
                .collect(toList());
    }

    public boolean isAnyTraderBasedInMilan(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .anyMatch(city -> city.equals("Milan"));
    }

    public boolean isAnyTraderBasedInCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
    }

    public Optional<Integer> findMaxValueInTransactions(List<Transaction> transactions) {
        return Optional.of(transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.comparing(Integer::valueOf))
                .orElse(0));
    }

    public Optional<Integer> findMinValueInTransactions(List<Transaction> transactions) {
        return Optional.of(transactions.stream()
                .map(Transaction::getValue)
                .min(Comparator.comparing(Integer::valueOf))
                .orElse(0));
    }

    public String getTraderNamesAscWithCommas(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted(Comparator.comparing(String::valueOf))
                .map(Object::toString)
                .distinct()
                .collect(Collectors.joining(","));
    }

    public String getUniqueCitiesAscWithCommas(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .sorted(Comparator.comparing(String::valueOf))
                .map(Object::toString)
                .distinct()
                .collect(Collectors.joining(","));
    }

}
