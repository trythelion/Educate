package ca.tlcp.educate.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ServerSettings {

    public static Properties serverProperties = new Properties();
    private static File serverConfig = new File("server.properties");

    public static void loadSettings() throws IOException {
        serverProperties.load(new FileInputStream(serverConfig));
        if (serverProperties.isEmpty()) {
            serverProperties.setProperty("assignments", "/assignments");
        }
    }

    public static String dfAssignmentFolder() {
        return serverProperties.getProperty("assignments");
    }

}
