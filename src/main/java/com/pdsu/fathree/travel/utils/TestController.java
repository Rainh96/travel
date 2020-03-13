package com.pdsu.fathree.travel.utils;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "重新做成的第一个github项目");
        mav.setViewName("/first.jsp");
        return mav;

    }
}