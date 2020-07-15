package org.lht.boot.cloud.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class CloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminApplication.class, args);
    }

}
