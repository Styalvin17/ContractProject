package example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


import example.myclass.finalizatips;
import example.myclass.pending;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
@RequestMapping("/temphome")
public class testController {
    @RequestMapping(value="/login",method= RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest request){
        System.out.println("login");
        System.out.println(request.toString());

        return "1,2,3,4,5,6,7,8,9,10,11";

    }
    @RequestMapping(value="/register",method= RequestMethod.POST)
    @ResponseBody
    public String register(HttpServletRequest request){
        System.out.println("register");
        System.out.println(request.toString());

        return "success";

    }
    @RequestMapping(value="/content",method= RequestMethod.POST)
    @ResponseBody
    public String content(HttpServletRequest request){
        System.out.println("content");
        return "success";

    }
    @RequestMapping(value="/finalizecommit",method= RequestMethod.POST)
    @ResponseBody
    public String finalizecommit(HttpServletRequest request){
        System.out.println("finalizecommit");
        System.out.println(request.toString());

        return "success";

    }
    @RequestMapping(value="/finalize",method= RequestMethod.POST)
    @ResponseBody
    public String finalize(HttpServletRequest request){
        System.out.println("finalize");
        return "success";

    }
    @RequestMapping(value="/pending",method= RequestMethod.POST)
    @ResponseBody
    public String pending(HttpServletRequest request){

        List<pending> pend=new ArrayList<pending>();
        System.out.println("pending");
        pending p1=new pending();
        pending p2=new pending();
        pending p3=new pending();
        pending p4=new pending();
        p1.Contractname="Contractname1";
        p1.begintime="begintime1";
        p1.toedit="toedit1";
        p2.Contractname="Contractname2";
        p2.begintime="begintime2";
        p2.toedit="toedit2";
        p3.Contractname="Contractname3";
        p3.begintime="begintime3";
        p3.toedit="toedit3";
        p4.Contractname="Contractname3";
        p4.begintime="begintime3";
        p4.toedit="toedit3";
        pend.add(p1);
        pend.add(p2);
        pend.add(p3);
        pend.add(p4);
        System.out.println(JSON.toJSONString(pend));
        return JSON.toJSONString(pend);

    }
    @RequestMapping(value="/finalizatips",method= RequestMethod.POST)
    @ResponseBody
    public String finalizatips(HttpServletRequest request){

        List<finalizatips> finalizatips=new ArrayList<finalizatips>();
        System.out.println("finalizatips");
        finalizatips f1=new finalizatips();
        finalizatips f2=new finalizatips();
        finalizatips f3=new finalizatips();

        f1.Username="username1";
        f1.tips="tips1";
        f2.Username="username2";
        f2.tips="tips2";
        f3.Username="username3";
        f3.tips="tips3";

        finalizatips.add(f1);
        finalizatips.add(f2);
        finalizatips.add(f3);

        System.out.println(JSON.toJSONString(finalizatips));
        return JSON.toJSONString(finalizatips);

    }
    @RequestMapping(value="/approvelist",method= RequestMethod.POST)
    @ResponseBody
    public String approvelist(HttpServletRequest request){

        List<pending> pend=new ArrayList<pending>();
        System.out.println("approvelist");
        pending p1=new pending();
        pending p2=new pending();
        pending p3=new pending();
        pending p4=new pending();
        p1.Contractname="Contractname1";
        p1.begintime="begintime1";
        p1.toedit="toedit1";
        p2.Contractname="Contractname2";
        p2.begintime="begintime2";
        p2.toedit="toedit2";
        p3.Contractname="Contractname3";
        p3.begintime="begintime3";
        p3.toedit="toedit3";
        p4.Contractname="Contractname3";
        p4.begintime="begintime3";
        p4.toedit="toedit3";
        pend.add(p1);
        pend.add(p2);
        pend.add(p3);
        pend.add(p4);
        System.out.println(JSON.toJSONString(pend));
        return JSON.toJSONString(pend);

    }
    @RequestMapping(value="/signlist",method= RequestMethod.POST)
    @ResponseBody
    public String signlist(HttpServletRequest request){

        List<pending> pend=new ArrayList<pending>();
        System.out.println("signlist");
        pending p1=new pending();
        pending p2=new pending();
        pending p3=new pending();
        pending p4=new pending();
        p1.Contractname="Contractname1";
        p1.begintime="begintime1";
        p1.toedit="toedit1";
        p2.Contractname="Contractname2";
        p2.begintime="begintime2";
        p2.toedit="toedit2";
        p3.Contractname="Contractname3";
        p3.begintime="begintime3";
        p3.toedit="toedit3";
        p4.Contractname="Contractname3";
        p4.begintime="begintime3";
        p4.toedit="toedit3";
        pend.add(p1);
        pend.add(p2);
        pend.add(p3);
        pend.add(p4);
        System.out.println(JSON.toJSONString(pend));
        return JSON.toJSONString(pend);

    }
    @RequestMapping(value="/approve",method= RequestMethod.POST)
    @ResponseBody
    public String approve(HttpServletRequest request){
        System.out.println("approve");
        return "success";

    }
    @RequestMapping(value="/sign",method= RequestMethod.POST)
    @ResponseBody
    public String sign(HttpServletRequest request){
        System.out.println("sign");
        return "success";

    }
    @RequestMapping(value="/approvecommit",method= RequestMethod.POST)
    @ResponseBody
    public String commitapprove(HttpServletRequest request){
        System.out.println("approvecommit");
        return "success";

    }
    @RequestMapping(value="/signcommit",method= RequestMethod.POST)
    @ResponseBody
    public String commitsign(HttpServletRequest request){
        System.out.println("signcommit");
        return "success";

    }

}
