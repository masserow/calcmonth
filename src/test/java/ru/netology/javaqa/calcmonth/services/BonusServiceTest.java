package ru.netology.javaqa.calcmonth.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/month.csv")
    void shouldCalcMonth(int expected, int income, int expenses, int threshold) {
        BonusService service = new BonusService();

        // подготавливаем данные:
        //int threshold = 20000;
        //int income = 10000;
        //int expenses = 3000;
        //int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
