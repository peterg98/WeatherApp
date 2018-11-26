package Rain;

// Purpose: Creates the raindrops

import java.awt.Color;
import java.awt.Graphics;

public class Rain
{
	private int velocity; // How fast the raindrops fall
	public int x; // The (x, y) positions of the raindrops
	public int y;
	private int length = 15; // The size of the raindrops

	public Rain(int x, int y, int v)
	{
		this.x = x;
		this.y = y;
		this.velocity = v;
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.drawLine(x, y, x, y + length);
		y += length + velocity;
	}

}


