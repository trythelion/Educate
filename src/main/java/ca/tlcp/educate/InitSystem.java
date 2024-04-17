package ca.tlcp.educate;

import ca.tlcp.educate.server.ServerSettings;
import ca.tlcp.educate.user.User;
import ca.tlcp.educate.user.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.*;
import java.util.Optional;
import java.util.Properties;

@Controller
public class InitSystem {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init() throws IOException {
        Optional<User> adminUserOptional = userRepository.getUserByUsername("admin");

        if (adminUserOptional.isEmpty()) {
            User user = new User("admin", "admin");
            userRepository.save(user);
        }
        File serverConfig = new File("server.properties");
        if (!serverConfig.exists()) {
            serverConfig.createNewFile();
        }
        ServerSettings.loadSettings();
    }

}
