package example.controller;

import com.alibaba.fastjson.JSON;

import example.myclass.Contract;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "Contract")
public class ContractController {

    @RequestMapping(value = "detail", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String update(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);

        Contract data1 = new Contract();

        String date = "2009-07-16-19:20:50"; // <input type="datetime-local"> 输入参数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        try {
            Date dt = sdf.parse(date);
            data1.setBeginTime(new Timestamp(dt.getTime()));
            data1.setEndTime(new Timestamp(dt.getTime()));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        data1.setContractContent("abc");
        data1.setContractId("1234");
        data1.setContractName("contract1");
        data1.setCustomer("customer1");
        data1.setUsername("user1");

        return JSON.toJSONString(data1);
    }

    @RequestMapping(value = "list", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String list(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);
        List<Contract> temp = new ArrayList<Contract>();
        Contract data1 = new Contract();
        Contract data2 = new Contract();
        Contract data3 = new Contract();

        String date = "2009-07-16-19:20:50"; // <input type="datetime-local"> 输入参数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        try {
            Date dt = sdf.parse(date);
            data1.setBeginTime(new Timestamp(dt.getTime()));
            data2.setBeginTime(new Timestamp(dt.getTime()));
            data3.setBeginTime(new Timestamp(dt.getTime()));
            data1.setEndTime(new Timestamp(dt.getTime()));
            data2.setEndTime(new Timestamp(dt.getTime()));
            data3.setEndTime(new Timestamp(dt.getTime()));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        data1.setContractContent("abc");
        data1.setContractId("1234");
        data1.setContractName("contract1");
        data1.setCustomer("customer1");
        data1.setUsername("user1");

        data2.setContractContent("dfds");
        data2.setContractId("444");
        data2.setContractName("contract2");
        data2.setCustomer("customer2");
        data2.setUsername("user2");

        data3.setContractContent("qwer");
        data3.setContractId("543");
        data3.setContractName("contract3");
        data3.setCustomer("customer3");
        data3.setUsername("user3");

        temp.add(data1);
        temp.add(data2);
        temp.add(data3);

        System.out.println(JSON.toJSONString(temp));

        return JSON.toJSONString(temp);
    }
}
