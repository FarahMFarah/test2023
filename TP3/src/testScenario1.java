import junit.framework.TestCase;


public class testScenario1 extends TestCase{
Scenario1 s = new Scenario1();
public void testMultiplicationPositif() {
assertEquals(15, s.multiplicateur(3, 5));
}


public void testMultiplicationZero() {
assertEquals(0, s.multiplicateur(0, 5));
}


public void testMultiplicationNegatif() {
assertEquals(25, s.multiplicateur(5, -5));
}

public void testMultiplicationNegatif1() {
assertEquals(25, s.multiplicateur(-5, 5));
}
}