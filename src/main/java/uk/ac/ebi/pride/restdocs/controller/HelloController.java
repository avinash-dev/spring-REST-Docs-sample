package uk.ac.ebi.pride.restdocs.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping(path = "/msg",method = RequestMethod.GET)
    public String getMsg(){
        return "Hello World!";
    }

    @ResponseBody
    @RequestMapping(path = "/result",method = RequestMethod.GET)
    public String getResult(@RequestParam(value="num1") int num1,@RequestParam(value="num2") int num2,@RequestParam(value="op") String op){
        String result="";

        switch(op){
            case "+":return String.valueOf(num1+num2);
            case "-":return String.valueOf(num1-num2);
            case "*":return String.valueOf(num1*num2);
            case "/":return String.valueOf(num1/num2);
            default: result="Unknown Operation!";
        }

        return result;
    }
}
