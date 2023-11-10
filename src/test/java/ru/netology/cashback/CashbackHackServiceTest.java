package ru.netology.cashback;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testCommonCase() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(295, service.remain(1705));
        Assert.assertEquals(120, service.remain(880));
        Assert.assertEquals(990, service.remain(10));
    }

    @Test
    public void testEdgeCases() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(1, service.remain(3999));
        Assert.assertEquals(1, service.remain(999));
        Assert.assertEquals(999, service.remain(4001));
        Assert.assertEquals(999, service.remain(1));
    }

    @Test
    public void testRoundAmount() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0, service.remain(1000));
        Assert.assertEquals(0, service.remain(20000));
    }
}
