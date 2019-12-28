public class Area {
	private int areX = 0;
	private int areaY = 0;
	public Area(int areX, int areaY) {
		this.areX = areX;
		this.areaY = areaY;
	}
	public int getAreX() {
		return areX;
	}
	public void setAreX(int areX) {
		this.areX = areX;
	}
	public int getAreaY() {
		return areaY;
	}
	public void setAreaY(int areaY) {
		this.areaY = areaY;
	}
	
	public boolean containsPointWithX(int x) {
		return (0 <= x) && (x <= areX);
	}
	
	public boolean containsPointWithY(int y) {
		return (0 <= y) && (y <= areaY);
	}
}
