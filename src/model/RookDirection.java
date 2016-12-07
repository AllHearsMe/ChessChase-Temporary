package model;

public enum RookDirection implements IDirection
{
	EAST(1, 0),
	NORTH(0, -1),
	WEST(-1, 0),
	SOUTH(0, 1);
	
	private double dx, dy;

	private RookDirection(double dx, double dy)
	{
		this.dx = dx;
		this.dy = dy;
	}

	public double getDx()
	{
		return dx;
	}

	public double getDy()
	{
		return dy;
	}
}
