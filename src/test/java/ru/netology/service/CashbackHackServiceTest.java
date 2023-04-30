
package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void spent1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void spentOver1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void spent0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);

    }
    @org.junit.Test
        public void spentUnder1000Junit4() {
// подготовка
            CashbackHackService service = new CashbackHackService();
            int amount = 900;
// выполнение целевого действия
            int actual = service.remain(amount);
            int expected = 100;
// сравнение ожидаемого и фактического
            Assert.assertEquals(expected, actual);
        }

    @org.junit.Test
        public void spent1000Junit4() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;

            Assert.assertEquals(expected, actual);
        }
    @org.junit.Test
        public void spentOver1000Junit4() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1100;
            int actual = service.remain(amount);
            int expected = 900;

            Assert.assertEquals(expected, actual);

        }

    @org.junit.Test
        public void spent0Junit4() {
            CashbackHackService service = new CashbackHackService();
            int amount = 0;
            int actual = service.remain(amount);
            int expected = 1000;

            Assert.assertEquals(expected, actual);

        }
          }
