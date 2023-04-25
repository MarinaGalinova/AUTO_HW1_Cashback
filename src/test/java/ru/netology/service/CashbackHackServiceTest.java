package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class CashbackHackServiceTest {
        CashbackHackService service = new CashbackHackService();

        @org.junit.Test
        public void SpentUnder1000() {
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
        public void Spent1000() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;

            Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void SpentOver1000() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1100;
            int actual = service.remain(amount);
            int expected = 900;

            Assert.assertEquals(expected, actual);

        }
        @Test
        public void Spent0() {
            CashbackHackService service = new CashbackHackService();
            int amount = 0;
            int actual = service.remain(amount);
            int expected = 1000;

            Assert.assertEquals(expected, actual);

        }

    }