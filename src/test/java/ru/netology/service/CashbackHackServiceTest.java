package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainWithCashback () {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainWithCashback1 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainWithCashback2 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1_000;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainWithCashback3 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

}