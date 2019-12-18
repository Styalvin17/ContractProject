package example.controller;

import com.alibaba.fastjson.JSON;
import example.myclass.listRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "User")
public class UserListController {

    @RequestMapping(value = "add", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String add(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);

        return "add success";
    }

    @RequestMapping(value = "delete", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String delete(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);

        return "delete success";
    }

    @RequestMapping(value = "update", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String update(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);

        return "update success";
    }

    @RequestMapping(value = "list", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String list(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);
        List<listRequest> temp = new ArrayList<listRequest>();
        listRequest data1 = new listRequest();
        listRequest data2 = new listRequest();
        data1.setUsername("user1");
        data1.setPassword("123456");
        data2.setUsername("user2");
        data2.setPassword("654321");
        data1.setTemp("777");
        data2.setTemp("888");

        temp.add(data1);
        temp.add(data2);
//        String testJson = "{\"listRequest\":\"success\"}";
        System.out.println(JSON.toJSONString(temp));

        return JSON.toJSONString(temp);
    }
}
