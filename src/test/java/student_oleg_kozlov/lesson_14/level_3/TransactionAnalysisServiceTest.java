package student_oleg_kozlov.lesson_14.level_3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

// Task_19, Task_21, Task_22, Task_23, Task_24, Task_25, Task_26, Task_27, Task_28, Task_29, Task_30, Task_31
// Task_32, Task_33, Task_34, Task_35, Task_36, Task_37, Task_38
public class TransactionAnalysisServiceTest {
    TransactionAnalysisService analysisService = new TransactionAnalysisService();
    List<Transaction> data = new TransactionTestData().getTransactions();
    
    @Test
    public void shouldFindTransactionsIn2011() {
        List<Transaction> expected = getExpected(0,2);
        assertArrayEquals(expected.toArray(), analysisService.findTransactionsIn2011(data).toArray());
    }

    @Test
    public void shouldFindTransactionsIn2011ByYear() {
        List<Transaction> expected = getExpected(0,2);
        assertArrayEquals(expected.toArray(), analysisService.findTransactionsByYear(data, 2011).toArray());
    }

    @Test
    public void shouldFindTransactionsIn2012ByYear() {
        List<Transaction> expected = getExpected(1,3,4,5);
        assertArrayEquals(expected.toArray(), analysisService.findTransactionsByYear(data, 2012).toArray());
    }

    @Test
    public void shouldFindTransactionsIn2013ByYear() {
        List<Transaction> expected = getExpected();
        assertArrayEquals(expected.toArray(), analysisService.findTransactionsByYear(data, 2013).toArray());
    }

    @Test
    public void shouldSortTransactionsByValueAsc() {
        List<Transaction> expected = getExpected(0,2,4,3,5,1);
        assertArrayEquals(expected.toArray(), analysisService.sortTransactionsByValueAsc(data).toArray());
    }

    @Test
    public void shouldSortTransactionsByValueDesc() {
        List<Transaction> expected = getExpected(1,5,3,4,2,0);
        assertArrayEquals(expected.toArray(), analysisService.sortTransactionsByValueDesc(data).toArray());
    }

    @Test
    public void shouldFindTransactionsIn2011AndSortByValueAsc() {
        List<Transaction> expected = getExpected(0,2);
        assertArrayEquals(expected.toArray(), analysisService.findTransactionsIn2011AndSortByValueAsc(data).toArray());
    }

    @Test
    public void shouldFindAllYearsForCompletedTransactions() {
        List<Integer> expected = new ArrayList<>();
        for (Transaction transaction : data) {
            expected.add(transaction.getYear());
        }
        assertArrayEquals(expected.toArray(), analysisService.findAllYearsForCompletedTransactions(data).toArray());
    }

    @Test
    public void shouldFindUniqueYearsForCompletedTransactions() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2011);
        expected.add(2012);
        assertArrayEquals(expected.toArray(), analysisService.findUniqueYearsForCompletedTransactions(data).toArray());
    }

    @Test
    public void shouldFindUniqueTradersNamesForCompletedTransactions() {
        List<String> expected = new ArrayList<>();
        expected.add("Brian");
        expected.add("Raoul");
        expected.add("Mario");
        expected.add("Alan");
        assertArrayEquals(expected.toArray(), analysisService.findUniqueTradersNamesForCompletedTransactions(data).toArray());
    }

    @Test
    public void shouldFindUniqueTradersCitiesForCompletedTransactions() {
        List<String> expected = new ArrayList<>();
        expected.add("Cambridge");
        expected.add("Milan");
        assertArrayEquals(expected.toArray(), analysisService.findUniqueTradersCitiesForCompletedTransactions(data).toArray());
    }

    @Test
    public void shouldFindTradersFromCambridgeForCompletedTransactions() {
        List<String> expected = new ArrayList<>();
        expected.add("Brian");
        expected.add("Raoul");
        expected.add("Alan");
        assertArrayEquals(expected.toArray(), analysisService.findTradersFromCambridgeForCompletedTransactions(data).toArray());
    }

    @Test
    public void shouldFindTraderNamesFromCityCambridgeByParameter() {
        List<String> expected = new ArrayList<>();
        expected.add("Brian");
        expected.add("Raoul");
        expected.add("Alan");
        assertArrayEquals(expected.toArray(), analysisService.findTraderNamesFromCity(data, "Cambridge").toArray());
    }

    @Test
    public void shouldFindTraderNamesFromCityMilanByParameter() {
        List<String> expected = new ArrayList<>();
        expected.add("Mario");
        assertArrayEquals(expected.toArray(), analysisService.findTraderNamesFromCity(data, "Milan").toArray());
    }

    @Test
    public void shouldReturnTrueIfSomeTraderWorksInMilan() {
        assertTrue(analysisService.isAnyTraderBasedInMilan(data));
    }

    @Test
    public void shouldReturnTrueIfSomeTraderWorksInMilanByParameter() {
        assertTrue(analysisService.isAnyTraderBasedInCity(data, "Milan"));
    }

    @Test
    public void shouldReturnTrueIfSomeTraderWorksInCambridgeByParameter() {
        assertTrue(analysisService.isAnyTraderBasedInCity(data, "Cambridge"));
    }

    @Test
    public void shouldReturnFalseIfTraderDoesNotWorkInLondonByParameter() {
        assertFalse(analysisService.isAnyTraderBasedInCity(data, "London"));
    }

    @Test
    public void shouldReturnMaxValueFromProvidedTransactions() {
        assertEquals(Optional.of(1000), analysisService.findMaxValueInTransactions(data));
    }

    @Test
    public void shouldReturnZeroIfNoTransactionsProvidedForMaxFinding() {
        assertEquals(Optional.of(0), analysisService.findMaxValueInTransactions(getExpected()));
    }

    @Test
    public void shouldReturnMinValueFromProvidedTransactions() {
        assertEquals(Optional.of(300), analysisService.findMinValueInTransactions(data));
    }

    @Test
    public void shouldReturnZeroIfNoTransactionsProvidedForMinFinding() {
        assertEquals(Optional.of(0), analysisService.findMinValueInTransactions(getExpected()));
    }

    @Test
    public void shouldReturnTraderNamesAscWithCommas() {
        assertEquals("Alan,Brian,Mario,Raoul", analysisService.getTraderNamesAscWithCommas(data));
    }

    @Test
    public void shouldReturnUniqueCitiesAscWithCommas() {
        assertEquals("Cambridge,Milan", analysisService.getUniqueCitiesAscWithCommas(data));
    }

    private List<Transaction> getExpected(int... indexes) {
        List<Transaction> result = new ArrayList<>();
        for (int index : indexes) {
            result.add(data.get(index));
        }
        return result;
    }
}