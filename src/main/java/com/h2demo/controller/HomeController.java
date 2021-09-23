package com.h2demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.h2demo.dao.AlienRepo;
import com.h2demo.model.Alien;

@RestController
public class HomeController {
	@Autowired
	AlienRepo arepo;
	
	@GetMapping("/")
	public ModelAndView returnHome()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home.jsp");
		return mv; 
		
	}
	@PostMapping("/addalien")
	public Alien getHome(Alien alien)
	{
		arepo.save(alien);
		return alien;
	}
	@GetMapping("/getalien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid)
	{
		Optional<Alien> alien = arepo.findById(aid);	
		return alien;
	}
	@DeleteMapping("/alien/{aid}")
	public String deleteNow(@PathVariable("aid") int aid)
	{
		Alien a = arepo.getOne(aid);
		arepo.delete(a);
		return "Ok deleted";
	}
	
	
	@GetMapping("/aliens")
	@ResponseBody
	public List<Alien> showAll()
	{
	  return arepo.findAll();
	}
	
//	@RequestMapping("/aliens")
//	public void showall()
//	{
//		System.out.println("Hello");
//	}
}
