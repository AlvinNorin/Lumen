/**
 *	**	**	**	**	**	**	**	**
 * 	Update.java
 * 	menu
 *	**	**	**	**	**	**	**	**
 *
 * 	Author		:		Alvin
 * 	Year		:		2013
 * 	Time		:		21:52:42
 * 
 *	**	**	**	**	**	**	**	**
 */
package menu;

import GUI.Button;
import game.Text;

/**
 * @author Alvin
 */
public class Main {
	
	static boolean load = false;
	
	public static void update() {
		if (!load) {
			load();
		}
		FB.update();
		Settings.update();
		singleplayer.Dev.update();
	}
	
	public static void load() {
		load = true;
	}
	
}
