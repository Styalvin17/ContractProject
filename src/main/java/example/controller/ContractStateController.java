package example.controller;

import com.alibaba.fastjson.JSON;

import example.myclass.ContractState;
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
@RequestMapping(value = "ContractState")
public class ContractStateController {

    @RequestMapping(value = "detail", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String update(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);

        ContractState data1 = new ContractState();

        String date = "2009-07-16-19:20:50"; // <input type="datetime-local"> 输入参数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        try {
            Date dt = sdf.parse(date);
            data1.setEndTime(new Timestamp(dt.getTime()));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        data1.setContractName("contract1");
        data1.setContractState("1,2,3");

        System.out.println("data1:");
        System.out.println(JSON.toJSONString(data1));

        return JSON.toJSONString(data1);
    }

    @RequestMapping(value = "list", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String list(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);
        List<ContractState> temp = new ArrayList<ContractState>();
        ContractState data1 = new ContractState();
        ContractState data2 = new ContractState();

        String date = "2009-07-16-19:20:50"; // <input type="datetime-local"> 输入参数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        try {
            Date dt = sdf.parse(date);
            data1.setEndTime(new Timestamp(dt.getTime()));
            data2.setEndTime(new Timestamp(dt.getTime()));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        data1.setContractName("contract1");
        data1.setContractState("1,2,3");

        data2.setContractName("contract2");
        data2.setContractState("1,2");

        temp.add(data1);
        temp.add(data2);

        System.out.println(JSON.toJSONString(temp));

        return JSON.toJSONString(temp);
    }
}
