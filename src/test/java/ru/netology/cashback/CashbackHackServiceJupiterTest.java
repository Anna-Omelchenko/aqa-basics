package ru.netology.cashback;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceJupiterTest {

    @Test
    public void testCommonCase() {
        CashbackHackService service = new CashbackHackService();
        Assertions.assertEquals(295, service.remain(1705));
        Assertions.assertEquals(120, service.remain(880));
        Assertions.assertEquals(990, service.remain(10));
    }

    @Test
    public void testEdgeCases() {
        CashbackHackService service = new CashbackHackService();
        Assertions.assertEquals(1, service.remain(3999));
        Assertions.assertEquals(1, service.remain(999));
        Assertions.assertEquals(999, service.remain(4001));
        Assertions.assertEquals(999, service.remain(1));
    }

    @Test
    public void testRoundAmount() {
        CashbackHackService service = new CashbackHackService();
        Assertions.assertEquals(0, service.remain(1000));
        Assertions.assertEquals(0, service.remain(20000));
    }
}
