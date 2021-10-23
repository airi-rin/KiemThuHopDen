import org.junit.Assert;
import org.junit.Test;

public class TestEx {
    @Test
    public void Test1_1() {
        String actual = Ex.function(0,12, true);
        Assert.assertEquals("Không", actual);
    }

    @Test
    public void Test1_2() {
        String actual = Ex.function(1,12, true);
        Assert.assertEquals("Không", actual);
    }

    @Test
    public void Test1_3() {
        String actual = Ex.function(20,12, true);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test1_4() {
        String actual = Ex.function(100,12, true);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test1_5() {
        String actual = Ex.function(20,0, true);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test1_6() {
        String actual = Ex.function(20, 0.1f, true);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test1_7() {
        String actual = Ex.function(20,23.9f, true);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test1_8() {
        String actual = Ex.function(20,24, true);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test1_9() {
        String actual = Ex.function(20,12, false);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test2_1() {
        String actual = Ex.function(9,1, true);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test2_2() {
        String actual = Ex.function(30,2, false);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test2_3() {
        String actual = Ex.function(9,13, true);
        Assert.assertEquals("Không", actual);
    }

    @Test
    public void Test3_1() {
        String actual = Ex.function(-1,12, true);
        Assert.assertEquals("Lỗi input", actual);
    }

    @Test
    public void Test3_2() {
        String actual = Ex.function(9,-1, true);
        Assert.assertEquals("Lỗi input", actual);
    }

    @Test
    public void Test3_3() {
        String actual = Ex.function(9,1, true);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test3_4() {
        String actual = Ex.function(9,1, false);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test3_5() {
        String actual = Ex.function(9,2, true);
        Assert.assertEquals("Không", actual);
    }

    @Test
    public void Test3_6() {
        String actual = Ex.function(9,2, false);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test3_7() {
        String actual = Ex.function(9,13, true);
        Assert.assertEquals("Không", actual);
    }

    @Test
    public void Test3_8() {
        String actual = Ex.function(9,13, false);
        Assert.assertEquals("Không", actual);
    }

    @Test
    public void Test3_9() {
        String actual = Ex.function(9,30, true);
        Assert.assertEquals("Lỗi input", actual);
    }

    @Test
    public void Test3_10() {
        String actual = Ex.function(30,-1, true);
        Assert.assertEquals("Lỗi input", actual);
    }

    @Test
    public void Test3_11() {
        String actual = Ex.function(30,1, true);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test3_12() {
        String actual = Ex.function(30,2, true);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test3_13() {
        String actual = Ex.function(30,13, true);
        Assert.assertEquals("Được", actual);
    }

    @Test
    public void Test3_14() {
        String actual = Ex.function(30,30, true);
        Assert.assertEquals("Lỗi input", actual);
    }
}
