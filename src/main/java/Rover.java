public class Rover {
	public static final String EAST = "E"; //东
	public static final String NORTH = "N"; //北
	public static final String SOUTH = "S"; //南
	public static final String WEST  = "W"; //西

	private Area area;
	private int curX = 0;
	private int curY = 0;
	private String direction;
	public void land(Area area, int x, int y, String direction) throws Exception {
		if (!area.containsPointWithX(x)) {
			throw new Exception("X=" + x + " is out of area");
		}
		if (!area.containsPointWithY(y)) {
			throw new Exception("Y=" + y + " is out of area");
		}
		this.area = area;
		this.curX = x;
		this.curY = y;
		this.direction = direction;
	}

	public String getPosition() {
		return curX + curY + direction;
	}

	public void move() throws Exception {
		if (NORTH.equals(direction)) {
			curY++;
		} else if (SOUTH.equals(direction)) {
			curY--;
		} else if (EAST.equals(direction)) {
			curX++;
		} else if (WEST.equals(direction)) {
			curX--;
		}

		if (!area.containsPointWithX(curX)) {
			throw new Exception("不能移动到区域外");
		}

		if (!area.containsPointWithY(curY)) {
			throw new Exception("不能移动到区域外");
		}
	}

	public void turnLeft() {
		if (NORTH.equals(direction)) {
    		direction = WEST;
		} else if (SOUTH.equals(direction)) {
			direction = EAST;
		} else if (EAST.equals(direction)) {
			direction = NORTH;
		} else if (WEST.equals(direction)) {
			direction = SOUTH;
		}
	}

    public void turnRight() {
    	if (NORTH.equals(direction)) {
    		direction = EAST;
		} else if (SOUTH.equals(direction)) {
			direction = WEST;
		} else if (EAST.equals(direction)) {
			direction = SOUTH;
		} else if (WEST.equals(direction)) {
			direction = NORTH;
		}
	}
}
