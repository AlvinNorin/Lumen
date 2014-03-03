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

import game.Screen;

import org.lwjgl.input.Keyboard;

import sound.Sound;

/**
 * @author alvin
 */
public class Dev {
	
	static boolean update = false;
	
	static int x = 0;
	static int y = 0;
	
	public static void update() {
		if (update) {
			Sound.random("random", 1f, "OGG", "res/sound/music/records", 11);
			//object.Floor.draw(0, 0, 128, 128, "dirt", Color.white, 64);
			//_3D.Kernel.drawPolygon(256, 256, 0, 256, 512, 0, 512, 512, -16, -0, -0, -0, +1, +1, +1);
			//_3D.Kernel.drawPolygon(512, 512, 0, 512, 256, 0, 256, 256, -16, +1, +1, +1, -0, -0, -0);
			_3D.Kernel.drawPolygon(x, y, 32, x, y+256, 64, x+256, y+256, 16, -0, -0, -0, -0, +1, +1);
			//_3D.Kernel.init();
			//_3D.Kernel.update(0);
			if (Keyboard.isKeyDown(Keyboard.KEY_W)){
				y+=1;
				game.Main.Sleep(1);
			} if (Keyboard.isKeyDown(Keyboard.KEY_S)){
				y-=1;
				game.Main.Sleep(1);
			} if (Keyboard.isKeyDown(Keyboard.KEY_D)){
				x+=1;
				game.Main.Sleep(1);
			} if (Keyboard.isKeyDown(Keyboard.KEY_A)){
				x-=1;
				game.Main.Sleep(1);
			}
		}
	}
	
	public static void start() {
		update = true;
	}
	
	public static void destroy() {
		update = false;
	}
	
}
