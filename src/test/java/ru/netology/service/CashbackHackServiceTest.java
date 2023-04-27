package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void spent1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void spentOver1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void spent0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);

    }

}