package wang.kylinking.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: wang.kylinking.controller
 * @description: 用户信息控制层
 * @author: Kylin
 * @create: 2020-09-03 10:08
 * @Version: 1.0.0
 **/
@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("getPort")
    public String getPort(){
        return "hello --> " + port;
    }

}
