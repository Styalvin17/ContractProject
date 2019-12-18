package example.controller;

import com.alibaba.fastjson.JSON;

import example.myclass.Right;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "Right")
public class RightController {

    @RequestMapping(value = "update", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String update(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);

        return "update success";
    }

    @RequestMapping(value = "list", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String list(HttpServletRequest request, @RequestBody String requestbody) throws UnsupportedEncodingException {
        System.out.println("test");
        System.out.println(requestbody);
        List<Right> temp = new ArrayList<Right>();
        Right data1 = new Right();
        Right data2 = new Right();
        data1.setUsername("user1");
        data1.setRolename("role1");
        data1.setDescription("123");
        data2.setUsername("user2");
        data2.setRolename("role2");
        data2.setDescription("321");

        temp.add(data1);
        temp.add(data2);
//        String testJson = "{\"listRequest\":\"success\"}";
        System.out.println(JSON.toJSONString(temp));
//        String jsonresult = JSON.toJSONString(temp);
//        String result = new String(jsonresult.getBytes("ISO8859-1"),"utf-8");

        return JSON.toJSONString(temp);
    }
}
