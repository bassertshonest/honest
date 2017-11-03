package sample;

public class IPSheriff {
    /**
     * <p>"Howdy, I'm the IP Sheriff and I'm here to rustle up some results."</p>
     * <p>The IPSheriff executes the CommandLineHandler methods. They're basically keeping on top
     * of what methods we're going to use to test the outage. I figured it's probably better to
     * have a few trustworthy sites the user can pick and choose to launch the testing utility
     * just to make sure that it's not one site that's suffering an outage.</p>
     * <p>With love,</p>
     * <p>Naomi.</p>
     */

    /**
     * Calls the getRouterIP() method to ping the router. This method must always be active.
     */
    public static void  routerIP(){
        String deviceIP = CommandLineHandler.getRouterIP();
        CommandLineHandler.pingIP(deviceIP);
    }

    /**
     * Pings Google. Reason: Google is extremely unlikely to go out
     * @param state determines if the user has decided to ping this service
     */
    public static void googleIP(boolean state){
        if (state = true){
            String deviceIP = "8.8.8.8";
            CommandLineHandler.pingIP(deviceIP);
        } else {
            //All I wanted was insurance and a dental plan
        }
    }

    /**
     * Pings Google. Reason: Same as above. This uses the backup IP
     * @param state determines if the user has decided to ping this service
     */
    public static void googleTwoIP(boolean state){
        if (state = true){
            String deviceIP = "8.8.4.4";
            CommandLineHandler.pingIP(deviceIP);
        } else {
            //But ladies and gentlemen
        }
    }

    /**
     * Pings Netflix. Reason:
     * @param state determines if the user has decided to ping this service
     */
    public static void netflixIP(boolean state){
        if (state = true){
            String deviceIP = "";
            CommandLineHandler.pingIP(deviceIP);
        } else {
            //All they do is grow daisies at a mental can
        }
    }
    public static void bingIP(boolean state){
        if (state = true){
            String deviceIP = "";
            CommandLineHandler.pingIP(deviceIP);
        } else {
            //Get a job!
        }
    }
    public static void twitterIP(boolean state){
        if (state = true){
            String deviceIP = "";
            CommandLineHandler.pingIP(deviceIP);
        } else {
            //Easy for you to say, you're a member in some rap group, but at
        }
    }
    public static void twitterIP(boolean state){
        if (state = true){
            String deviceIP = "";
            CommandLineHandler.pingIP(deviceIP);
        } else {
            //least I stood for something
        }
    }
    public static void twitterIP(boolean state){
        if (state = true){
            String deviceIP = "";
            CommandLineHandler.pingIP(deviceIP);
        } else {
            //I'm a baby in a trash hoop who's good for nothing
        }
    }
}
