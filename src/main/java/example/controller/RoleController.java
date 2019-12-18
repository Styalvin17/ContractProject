package example.controller;

import com.alibaba.fastjson.JSON;

import example.myclass.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "Role")
public class RoleController {

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
    public @ResponseBody String list(HttpServletRequest request, @RequestBody String requestbody) throws UnsupportedEncodingException {
        System.out.println("test");
        System.out.println(requestbody);
        List<Role> temp = new ArrayList<Role>();
        Role data1 = new Role();
        Role data2 = new Role();
        data1.setRolename("role1");
        data1.setDescription("role is able to control data");
        data1.setFunctions("起草合同,定稿合同,新增用户");
        data2.setRolename("role2");
        data2.setDescription("role is able to control data");
        data2.setFunctions("新增用户,删除用户");
        temp.add(data1);
        temp.add(data2);
//        String testJson = "{\"listRequest\":\"success\"}";
        System.out.println(JSON.toJSONString(temp));
//        String jsonresult = JSON.toJSONString(temp);
//        String result = new String(jsonresult.getBytes("ISO8859-1"),"utf-8");

        return JSON.toJSONString(temp);
    }
}
