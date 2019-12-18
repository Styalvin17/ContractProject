package example.controller;

import com.alibaba.fastjson.JSON;

import example.myclass.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "Customer")
public class CustomerController {

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
        List<Customer> temp = new ArrayList<Customer>();
        Customer data1 = new Customer();
        Customer data2 = new Customer();
        Customer data3 = new Customer();
        data1.setCustomerAccount("123456");
        data1.setCustomerAddr("here");
        data1.setCustomerBank("CCB");
        data1.setCustomerCode("777888");
        data1.setCustomerFax("MXA78520");
        data1.setCustomerId("12");
        data1.setCustomerName("John");
        data1.setCustomerTel("555-4823");

        data2.setCustomerAccount("654321");
        data2.setCustomerAddr("there");
        data2.setCustomerBank("ABC");
        data2.setCustomerCode("666888");
        data2.setCustomerFax("POI78520");
        data2.setCustomerId("15");
        data2.setCustomerName("Violet");
        data2.setCustomerTel("555-3069");

        data3.setCustomerAccount("987644");
        data3.setCustomerAddr("Fifth Avenue");
        data3.setCustomerBank("ICBC");
        data3.setCustomerCode("777888");
        data3.setCustomerFax("GHJ78520");
        data3.setCustomerId("6");
        data3.setCustomerName("Ray");
        data3.setCustomerTel("555-7528");
        temp.add(data1);
        temp.add(data2);
        temp.add(data3);
//        String testJson = "{\"listRequest\":\"success\"}";
        System.out.println(JSON.toJSONString(temp));

        return JSON.toJSONString(temp);
    }
}
