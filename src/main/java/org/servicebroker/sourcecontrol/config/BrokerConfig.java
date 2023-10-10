package org.servicebroker.sourcecontrol.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * Created by lena on 2017-05-16.
 */

@Configuration
@EnableJpaRepositories("org.servicebroker.sourcecontrol.repository")
@EntityScan(value = "org.servicebroker.sourcecontrol.model")
@ComponentScan(basePackages = { "org.openpaas.servicebroker", "org.servicebroker"})
public class BrokerConfig {

}
