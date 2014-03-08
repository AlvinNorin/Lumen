/**
 *	**	**	**	**	**	**	**	**
 * 	load.java
 * 	game
 *	**	**	**	**	**	**	**	**
 *
 * 	Author		:		alvin
 * 	Year		:		2014
 * 	Time		:		10:26:27 PM
 * 
 *	**	**	**	**	**	**	**	**
 */
package game;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;

import GUI.Button;

/**
 * @author alvin
 */
public class load {
	
	static boolean load = false;
	static int step = 0;
	static Color step1 = Color.transparent, step2 = Color.transparent, step3 = Color.transparent, step4 = Color.transparent;

	public static void startup() {
		time.Time.start();
		if (!load) {
			load_startup();
		} GUI.Background.draw("stonebrick");
		GUI.Texture.draw("mojang", Color.white, ((Display.getWidth()/2)-(GUI.Texture.find("mojang").getImageWidth()/2)), ((Display.getHeight()/2)-(GUI.Texture.find("mojang").getImageHeight()/2)), 0, 0);
		GUI.Texture.draw("redstone_lamp_off", Color.black, ((Display.getWidth()/2)-(GUI.Texture.find("mojang").getImageWidth()))+128, ((Display.getHeight()/2)-(GUI.Texture.find("mojang").getImageHeight()-64)), 64, 64);
		GUI.Texture.draw("redstone_lamp_off", Color.white, ((Display.getWidth()/2)-(GUI.Texture.find("mojang").getImageWidth()))+192, ((Display.getHeight()/2)-(GUI.Texture.find("mojang").getImageHeight()-64)), 64, 64);
		GUI.Texture.draw("redstone_lamp_off", Color.white, ((Display.getWidth()/2)-(GUI.Texture.find("mojang").getImageWidth()))+256, ((Display.getHeight()/2)-(GUI.Texture.find("mojang").getImageHeight()-64)), 64, 64);
		GUI.Texture.draw("redstone_lamp_off", Color.white, ((Display.getWidth()/2)-(GUI.Texture.find("mojang").getImageWidth()))+320, ((Display.getHeight()/2)-(GUI.Texture.find("mojang").getImageHeight()-64)), 64, 64);
		GUI.Texture.draw("redstone_lamp_on", step1, ((Display.getWidth()/2)-(GUI.Texture.find("mojang").getImageWidth()))+128, ((Display.getHeight()/2)-(GUI.Texture.find("mojang").getImageHeight()-64)), 64, 64);
		GUI.Texture.draw("redstone_lamp_on", step2, ((Display.getWidth()/2)-(GUI.Texture.find("mojang").getImageWidth()))+192, ((Display.getHeight()/2)-(GUI.Texture.find("mojang").getImageHeight()-64)), 64, 64);
		GUI.Texture.draw("redstone_lamp_on", step3, ((Display.getWidth()/2)-(GUI.Texture.find("mojang").getImageWidth()))+256, ((Display.getHeight()/2)-(GUI.Texture.find("mojang").getImageHeight()-64)), 64, 64);
		GUI.Texture.draw("redstone_lamp_on", step4, ((Display.getWidth()/2)-(GUI.Texture.find("mojang").getImageWidth()))+320, ((Display.getHeight()/2)-(GUI.Texture.find("mojang").getImageHeight()-64)), 64, 64);
		game.Main.started = true;
	}
	
	public static void load_startup() {
		GUI.Texture.load("stonebrick", "PNG", "res/textures/stonebrick.png");
		GUI.Texture.load("mojang", "PNG", "res/textures/mojang.png");
		GUI.Texture.load("redstone_lamp_off", "PNG", "res/textures/redstone_lamp_off.png");
		GUI.Texture.load("redstone_lamp_on", "PNG", "res/textures/redstone_lamp_on.png");
		step1 = Color.white;
		GUI.MenuWork.Load();
		step2 = Color.white;
		Button.loadTextures();
		step3 = Color.white;
		Text.load();
		step4 = Color.white;
		GUI.Texture.load("dirt", "PNG", "res/textures/dirt.png");
		GUI.Texture.load("gubbe_front", "PNG", "res/gubbe 1.png");
		GUI.Texture.load("gubbe_side", "PNG", "res/gubbe 2.png");
		GUI.Texture.load("gubbe_back", "PNG", "res/gubbe 3.png");
		GUI.Texture.load("grass", "PNG", "res/grass.png");
		load = true;
	}
	
}
