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

import sound.Sound;

/**
 * @author alvin
 */
public class Dev {
	
	static boolean update = false;
	
	public static void update() {
		if (update) {
			Sound.random("random", 1f, "OGG", "res/sound/music/records", 11);
			//object.Floor.draw(0, 0, 128, 128, "dirt", Color.white, 64);
			_3D.Kernel.drawPolygon(0, 0, 0, 100, 100, 0);
			_3D.Kernel.init();
			_3D.Kernel.update(0);
		}
	}
	
	public static void start() {
		update = true;
	}
	
	public static void destroy() {
		update = false;
	}
	
}
