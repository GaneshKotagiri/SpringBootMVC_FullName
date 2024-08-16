package com.chopchop.springbootwebidname;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/home")
    public String home(){
        System.out.println("this is the home method in the machine");
        return "index.jsp";
    }
//    @RequestMapping("/Data")
//    public String data(HttpServletRequest req, HttpSession session) {
//        System.out.println("this is the Data method in the machine");
//        entity entity=new entity();
//
//
//        String fname=req.getParameter("fname");
//        String sname=req.getParameter("sname");
//
//        String fullname=fname+sname;
//        System.out.println(fullname);
//        session.setAttribute("fullname",fullname);
//
//        return "result";
//    }
    @RequestMapping("/Data")
    public String data(@RequestParam("fname") String fname,@RequestParam("sname") String sname, ModelAndView mv) {
        System.out.println("this is the Data method in the machine");
        entity entity=new entity();

        entity.setFname(fname);
        entity.setFname(sname);
        mv.addObject("entity", entity);
        mv.setViewName("fullname");
        return "result";
    }
}
