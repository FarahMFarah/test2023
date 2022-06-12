import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;



public class testex01 extends TestCase	 {


	
	public void testformeTriangleEqual() {
		
		Ex01 f=new Ex01("Rectangle",1,1);
		assertEquals(f.getName(), f.Myidentity("Rectangle"));
		
		
	}

	public void testFormeTriangleNotSame() {
		Ex01 f = new Ex01("iso",1, 1);
		assertNotSame(f.getName(), f.Myidentity("Rectangle"));
		}
	
	
}
