package com.br.starfilms.controller;


import com.br.starfilms.model.entity.Login;
import javax.servlet.http.HttpServlet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author JAICKE
 */
@Controller
public class LoginController extends HttpServlet {  
    
    
    @RequestMapping("/index")
    public String Login(){
        return "/index";
    }
    
    @RequestMapping("/loginfail")
    public String loginFail(){
        return "/loginfail";
    }
    
    @RequestMapping("/efetualogin")
    public String efetuaLogin(Login login){       
        
        if(login.getUser().equalsIgnoreCase("stos") && login.getPass().equalsIgnoreCase("stos2018")){
            return "redirect:filme/listar";
        }else{
           return "redirect:/loginfail"; 
        }
        
        
    }

    
}
