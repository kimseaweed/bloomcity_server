package com.vueProject.bloomcityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class BloomCityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloomCityServerApplication.class, args);
    }

}
