
public class Ex01 {

	private String name;
	private float x;
	private float y;
	
	
	public Ex01(String name, float x, float y) {
		
		this.name = name;
		this.x = x;
		this.y = y;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}
	
	
	
	public String Myidentity(String name) {
		
		this.name=name;
		return name;
	}
	
	
	
	
	
	
}
