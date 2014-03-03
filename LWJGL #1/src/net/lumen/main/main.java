/**
 * 
 */
package net.lumen.main;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

/**
 * @author alvin
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display.setTitle("");
		Display.setResizable(true);
		try {
			Display.setDisplayMode(new DisplayMode(1280, 800));
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Display.setVSyncEnabled(true);
		try {
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		glViewport(0, 0, Display.getWidth(), Display.getHeight());
		glDisable(GL_DEPTH_TEST);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
		glClearColor(0f, 0f, 0f, 0f);
		while (!Display.isCloseRequested()) {
			Display.update();
			Display.sync(60);
		}
	}

}
