package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

        @Test
   public void spentUnder1000() {
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
    public void spent1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void spentOver1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void spent0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }

}