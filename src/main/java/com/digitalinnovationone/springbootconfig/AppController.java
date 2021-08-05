package com.digitalinnovationone.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

        @Value("${app.message}")
        private String appMessage;

        @Value("${ENV_DB_URL:NENHUMA}")
        private String dbEnvironmentVariable;

        @GetMapping("/")
        public String getAppMessage(){
            return appMessage;
        }

        @GetMapping("/envVariable")
        public String dbEnvironmentVariable() {
            return "A seguinte variável de ambiente é passada: " + dbEnvironmentVariable;
        }
}
