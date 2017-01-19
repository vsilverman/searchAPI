import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 This class allows executing external command 
 */

/**
 * @author Vlad
 *
 */
public class AppleSearchAPI {
	
	public static String[] envp = null; 
	public static File dir = null;
//	public static String path ="c:\\Program Files\\Git\\mingw64\\bin\\";
	public static String path ="d:\\workspace-eclipse-4.5\\AppleTests\\Scripts\\";
//	public static String command = "curl.exe";
	public static String command = "iTunes-searchAPI.cmd";
//	public static String params = "--help";
	public static String params = "";
	
	BufferedReader in, pInput;
	
	public void exec(String cmd) {
		String sin = null;
		try {
			System.out.println("Command: " + cmd);
			Process p = Runtime.getRuntime().exec(cmd, envp, dir);
			pInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((sin = pInput.readLine()) != null) {
				System.out.println(sin);
			}
			pInput.close();
		}
		catch (IOException ioe) {
			System.out.println(ioe.getStackTrace());
			System.exit(-1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String MyCmd = path + command + " " + params;
		if (args.length < 1) {
			System.out.println("Usage: java AppleSearchAPI commandName");
			System.out.println("Running demo version with default params");
		}
		else {
			MyCmd = args[0];
		}
		
		AppleSearchAPI mc = new AppleSearchAPI();
		mc.exec(MyCmd);
	}
}
