// This string is autogenerated by ChangeAppSettings.sh, do not change spaces amount anywhere
package de.schwardtnet.alienblaster;

import android.app.Activity;
import android.content.Context;

class Globals {
	public static String ApplicationName = "AlienBlaster";

	// Should be zip file
	public static String DataDownloadUrl = "http://sites.google.com/site/xpelyax/Home/alienblaster110_data.zip?attredirects=0%26d=1|http://sitesproxy.goapk.com/site/xpelyax/Home/alienblaster110_data.zip"; // This string is autogenerated by ChangeAppSettings.sh, do not change spaces amount

	// Set this value to true if you're planning to render 3D using OpenGL - it eats some GFX resources, so disabled for 2D
	public static boolean NeedDepthBuffer = false;

	// Set this value to true if you're planning to render 3D using OpenGL - it eats some GFX resources, so disabled for 2D
	public static boolean HorizontalOrientation = true;
	
	// Readme text to be shown on download page
	public static String ReadmeText = "^You can press \"Home\" now - the data will be downloaded in background^In game press \"Menu\" for secondary fire, \"Volume Up/Down\" to cycle weapons".replace("^","\n");
	
	public static boolean AppUsesMouse = false;

	public static boolean AppNeedsArrowKeys = true;

	public static boolean AppUsesJoystick = false;
	
	public static boolean AppUsesMultitouch = false;

	// Phone-specific config
	// It will download app data to /sdcard/alienblaster if set to true,
	// otherwise it will download it to /data/data/de.schwardtnet.alienblaster/files
	public static boolean DownloadToSdcard = false;
	public static boolean PhoneHasTrackball = false;
	public static boolean PhoneHasArrowKeys = false;
	public static boolean UseAccelerometerAsArrowKeys = false;
	public static boolean UseTouchscreenKeyboard = false;
}

class LoadLibrary {
	public LoadLibrary() { System.loadLibrary("sdl"); System.loadLibrary("sdl_mixer"); System.loadLibrary("sdl_image"); };
}
