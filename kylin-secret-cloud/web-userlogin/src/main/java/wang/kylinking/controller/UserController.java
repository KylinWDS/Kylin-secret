package wang.kylinking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: wang.kylinking.controller
 * @description: 用户信息控制器
 * @author: Kylin
 * @create: 2020-09-03 10:42
 * @Version: 1.0.0
 **/
@RestController
public class UserController {

    @Resource
    RestTemplate restTemplate;

    @GetMapping("getPort")
    public String getServerPort(){

        String result = restTemplate.getForObject("http://SERVER-USERLOGIN/getPort",String.class);
        return result;
    }

}
