package ru.bse71.learnup.spring.boot.hello.config;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Description
 *
 * @author bse71
 * Created on 11.08.2021
 * @since
 */
@Getter
@ToString
@Configuration
@PropertySource("classpath:application.yml")
@EnableConfigurationProperties
public class Properties {

    @Value("${my-config.super-param}")
    private int superParam;

    @Value("${my-config.mega-param:default}")
    private String megaParam;


}
