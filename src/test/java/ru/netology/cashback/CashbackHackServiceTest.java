package ru.netology.cashback;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void testCommonCase() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1705), 295);
        Assert.assertEquals(service.remain(880), 120);
        Assert.assertEquals(service.remain(10), 990);
    }

    @Test
    public void testEdgeCases() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(3999), 1);
        Assert.assertEquals(service.remain(999), 1);
        Assert.assertEquals(service.remain(4001), 999);
        Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void testRoundAmount() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1000), 0);
        Assert.assertEquals(service.remain(20000), 0);
    }
}
