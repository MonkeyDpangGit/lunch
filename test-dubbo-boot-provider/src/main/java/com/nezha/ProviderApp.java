package com.nezha;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ProviderApp {

    public static void main( String[] args ) {
        new SpringApplicationBuilder(ProviderApp.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
