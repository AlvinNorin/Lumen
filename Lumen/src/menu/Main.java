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
	
	static boolean start = false;
	
	public static void update() {
		if (!start) {
			load();
			start = true;
		}
		Menu.update();
		Settings.update();
		singleplayer.Dev.update();
	}
	
	public static void load() {
		GUI.MenuWork.Load();
		Button.loadTextures();
		Text.load();
		GUI.Texture.load("dirt", "PNG", "res/textures/dirt.png");
	}
	
}
