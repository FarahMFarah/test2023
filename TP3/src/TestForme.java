
import junit.framework.TestCase;

public class TestForme extends TestCase{
public void testFormeTriangleEqual() {
Forme f = new Forme("Rectangle",1, 1);
assertEquals(f.getName(), f.MyIdentity("Rectangle"));
}
public void testFormeTriangleNotSame() {
Forme f = new Forme("iso",1, 1);
assertNotSame(f.getName(), f.MyIdentity("Rectangle"));
}
}