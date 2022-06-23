package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqr.csv")

    public void shoulCalc(int expected, int x, int y) {
        SqrService service = new SqrService();

        int actual = service.calculate(196, 580);
       // int expected = 11;

        Assertions.assertEquals(expected, actual);

    }
}