package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * <p>This class does most of the heavy lifting.&nbsp;The application is primarily for users
 * who aren't confident enough using command prompt to troubleshoot issues, so we'll
 * try to sanitise the process of using command prompt to get the information we're
 * looking for.&nbsp;Just keep it to information we absolutely need in order for the
 * application to run.</p>
 *
 * <p>With love,</p>
 * <p>Naomi.</p>
 */


public class CommandLineHandler {
    public void commandLineHandler() {

    }

    /**
     * runSystemCommand is modified from https://gist.github.com/madan712/4509039
     * @param command This value is acquired through the methods
     */
    private static void runSystemCommand(String command) {
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = "";
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the user's router's IP address so we can eliminate the Router as a point of failure.
     * This method is used by the IPSheriff to rustle up some data.
     *
     * @return returns the IP address as a string.
     */
    public static String getRouterIP() {
        String routerIP = "ipconfig | findstr /i " + "\"" + "Gateway" + "\"";
        runSystemCommand(routerIP);

        return "zoinks!";
    }

    public static void pingIP(String testIP) {

    }
}
