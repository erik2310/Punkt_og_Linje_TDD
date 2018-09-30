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

    @Test
    public void testpunkt1getX() throws Exception {

        Punkt punkt1 = new Punkt(3, 0);

        Assert.assertEquals(3, punkt1.getX(), 0);

    }

    @Test
    public void testpunkt1getY() throws Exception {

        Punkt punkt1 = new Punkt(3, 0);

        Assert.assertEquals(0, punkt1.getY(), 0);

    }

    @Test
    public void testpunkt2getX() throws Exception {

        Punkt punkt2 = new Punkt(0, 4);

        Assert.assertEquals(0, punkt2.getX(), 0);

    }

}
