package wang.kylinking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Kylin
 */
//启动时排除自动加载数据库连接
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
@EnableEurekaClient
public class ServerUserloginApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerUserloginApplication.class, args);
    }

}
