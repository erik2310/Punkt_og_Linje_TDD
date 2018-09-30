import org.junit.Assert;
import org.junit.Test;

public class TestIt {

    @Test
    public void testLength() throws Exception {

        Punkt punkt1 = new Punkt(3, 0);
        Punkt punkt2 = new Punkt(0, 4);

        Linie linie = new Linie(punkt1, punkt2);

        Assert.assertEquals(5, linie.length(), 0);

    }

}
