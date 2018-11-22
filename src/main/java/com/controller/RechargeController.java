package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.RechargeDao;
import com.model.Recharge;



@Controller
public class RechargeController {

	@Autowired
	RechargeDao rdao;
	@RequestMapping("/recharge")
	public ModelAndView save(@ModelAttribute Recharge r) {
		int i = 0;
		int amount = rdao.findAmount(r.getPhoneNo());
		if(amount-r.getAmount()>0) {
			i =  rdao.updateRecharge(r,amount);
			rdao.saveRecharge(r);
		}
		if(i>0)
			return new ModelAndView("successful");
		else
			return new ModelAndView("unsuccessful");
	}
	@RequestMapping(value = "/confrim", method = RequestMethod.GET)
		public ModelAndView confirm(@ModelAttribute Recharge r) {
		ModelAndView mv = new ModelAndView("confirm");
		mv.addObject("msg",r);
		return mv;
	}
	
	 @RequestMapping(value="/find")  
	    public ModelAndView showform2(@ModelAttribute Recharge p){ 
	        return new ModelAndView("find","command",new Recharge());  
	    }
	    /* It provides list of employees in model object */  
	    @RequestMapping("/search")  
	    public ModelAndView viewemp(@ModelAttribute("phone") Recharge phone){  
	        List<Recharge> list=rdao.getTransaction(phone); 
	        for(Recharge r:list) {
	        	System.out.println(r.toString());
	        }
	        return new ModelAndView("search","list",list);  
	    } 
	
	
}
