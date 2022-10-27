import com.revature.testing.Bazinga;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BazingaTest {
    static Bazinga bz;

    @BeforeClass
    public static void setup() {
        bz = new Bazinga();
    }

    @Test
    public void bazingaTest1() {
        int x = 3;
        String[] array = {"1", "2", "baz"};
        Assert.assertEquals(array, bz.bazinga(x));
    }

    @Test
    public void bazingaTest2() {
        int x = 7;
        String[] array = {"1", "2", "baz", "4", "5", "baz", "inga"};
        Assert.assertEquals(array, bz.bazinga(x));
    }

    @Test
    public void bazingaTest3() {
        int x = 21;
        String[] array = {"1", "2", "baz", "4", "5", "baz", "inga", "8", "baz", "10", "11", "baz", "13", "inga", "baz", "16", "17", "baz", "19", "20", "BAZINGA"};
        Assert.assertEquals(array, bz.bazinga(x));
    }

}
