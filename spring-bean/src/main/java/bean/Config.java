package bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config {

    // 1. 通过 @Bean 方式定义

    /**
     * 通过 Java 注解的方式，定义了一个 Bean
     */
    @Bean(name = {"user", "xiaomage-user"})
    public User user() {
        User user = new User();
        user.setName("li");
        return user;
    }
}
