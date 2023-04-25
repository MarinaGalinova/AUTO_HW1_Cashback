package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

        @Test
   public void SpentUnder1000() {
// подготовка
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
// выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 100;
// сравнение ожидаемого и фактического
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void Spent1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void SpentOver1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void Spent0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }

}