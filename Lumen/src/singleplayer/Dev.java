/**
 *	**	**	**	**	**	**	**	**
 * 	Dev.java
 * 	singleplayer
 *	**	**	**	**	**	**	**	**
 *
 * 	Author		:		alvin
 * 	Year		:		2013
 * 	Time		:		7:34:48 PM
 * 
 *	**	**	**	**	**	**	**	**
 */
package singleplayer;

import game.Main;
import game.Screen;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;

import sound.Sound;
import time.Time;

/**
 * @author alvin
 */
public class Dev {
	public static enum dir{
		front,
		back,
		left,
		right
	}
	
	public static dir direction = dir.front;
	
	static boolean update = false;
	
	static float x = 0;
	static float y = 0;
	static float deltaTime;
	
	public static void update() {
		if (update) {
			deltaTime = (float)time.Time.getDelta() / 1000;
			Sound.random("record", 1f, "OGG", "res/sound/music/records", 11);
			GUI.Background.drawAdvanced("grass", 256, 256);
			float speed = deltaTime * 75;
			//object.Floor.draw(0, 0, 128, 128, "dirt", Color.white, 64);
			//_3D.Kernel.drawPolygon(256, 256, 0, 256, 512, 0, 512, 512, -16, -0, -0, -0, +1, +1, +1);
			//_3D.Kernel.drawPolygon(512, 512, 0, 512, 256, 0, 256, 256, -16, +1, +1, +1, -0, -0, -0);
			//_3D.Kernel.drawPolygon(x, y, 32, x, y+256, 64, x+256, y+256, 16, -0, -0, -0, -0, +1, +1);
			if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
				y+=speed;
				direction = dir.back;
			} else if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
				y-=speed;
				direction = dir.front;
			} else if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
				x+=speed;
				direction = dir.right;
			} else if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
				x-=speed;
				direction = dir.left;
			}
			
			switch (direction) {
			case front:
				_3D.Kernel.drawPolygon(x, y, x, y+64, x+64, y+64, "gubbe_front", 0, 0, 0, 1, 1, 1, Color.white);
				_3D.Kernel.drawPolygon(x+64, y+64, x+64, y, x, y, "gubbe_front", 1, 1, 1, 0, 0, 0, Color.white);
				//_3D.Kernel.drawPolygon(x, y+13, x, y+32, x+64, y+32, "gubbe_front", 0, 0.32f, 0, 0.5f, 1, 0.5f, Color.black);
				//_3D.Kernel.drawPolygon(x+64, y+32, x+64, y+13, x, y+13, "gubbe_front", 1, 0.5f, 1, 0.32f, 0, 0.32f, Color.black);
				break;
				
			case back:
				_3D.Kernel.drawPolygon(x, y, x, y+64, x+64, y+64, "gubbe_back", 0, 0, 0, 1, 1, 1, Color.white);
				_3D.Kernel.drawPolygon(x+64, y+64, x+64, y, x, y, "gubbe_back", 1, 1, 1, 0, 0, 0, Color.white);
				break;
				
			case right:
				_3D.Kernel.drawPolygon(x, y, x, y+64, x+64, y+64, "gubbe_side", 0, 0, 0, 1, 1, 1, Color.white);
				_3D.Kernel.drawPolygon(x+64, y+64, x+64, y, x, y, "gubbe_side", 1, 1, 1, 0, 0, 0, Color.white);
				break;
				
			case left:
				_3D.Kernel.drawPolygon(x, y, x, y+64, x+64, y+64, "gubbe_side", 1, 0, 1, 1, 0, 1, Color.white);
				_3D.Kernel.drawPolygon(x+64, y+64, x+64, y, x, y, "gubbe_side", 0, 1, 0, 0, 1, 0, Color.white);
				break;
				
			}
		}
	}
	
	public static void start() {
		update = true;
		Sound.random_begin = false;
	}
	
	public static void destroy() {
		update = false;
	}
	
}
