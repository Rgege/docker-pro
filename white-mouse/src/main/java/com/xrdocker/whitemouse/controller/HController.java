package com.xrdocker.whitemouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/H/")
public class HController {

    @GetMapping("a")
    public String index(){
        return "aftest";
    }

    @GetMapping("sayHello")
    @ResponseBody
    public String sayHello(){
        return "hello ~~~~~~~~";
    }

    @GetMapping("jstack")
    @ResponseBody
    public String jstack(){
        for (Map.Entry<Thread, StackTraceElement[]> stackTrace : Thread.getAllStackTraces().entrySet()) {
            Thread thread = (Thread) stackTrace.getKey();
            StackTraceElement[] stack = (StackTraceElement[]) stackTrace.getValue();
            if (thread.equals(Thread.currentThread())) {
                continue;
            }
            System.out.println("\n线程：" + thread.getName() + "\n");
            for (StackTraceElement element : stack) {
                System.out.println("\t" + element + "\n");
            }
        }
        return "1";
    }
}
