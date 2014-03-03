/**
 *	**	**	**	**	**	**	**	**
 * 	FB.java
 * 	menu
 *	**	**	**	**	**	**	**	**
 *
 * 	Author		:		alvin
 * 	Year		:		2014
 * 	Time		:		10:09:48 PM
 * 
 *	**	**	**	**	**	**	**	**
 */
package menu;

import java.util.Random;

import org.lwjgl.opengl.Display;

import sound.Sound;

/**
 * @author alvin
 */
public class FB {
	static boolean update = true;
	static Random r = new Random();
	public static void update() {
		if (update) {
			Sound.random("random", 1f, "OGG", "res/sound/music", 11);
			GUI.Background.draw("dirt");
			GUI.Button.draw("PLAY", "PLAY!", Display.getWidth()/2-64*3, Display.getHeight()/2-64, 3, 1, "planks_oak", 3, 128);
			if (GUI.Button.isButtonClicked("PLAY")) {
				GUI.Destroy.menus(true);
				singleplayer.Dev.start();
			}
		}
	}
	
	public static void destroy(boolean Music) {
		update = false;
	}
	
	public static void start() {
		update = true;
	}
	
}