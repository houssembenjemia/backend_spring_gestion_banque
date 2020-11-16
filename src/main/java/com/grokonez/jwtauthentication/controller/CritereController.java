package com.grokonez.jwtauthentication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.model.Critere;
import com.grokonez.jwtauthentication.repository.CritereRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/api")
public class CritereController {
	@Autowired
	private CritereRepository em;
	
	@GetMapping(path="/Critere")
	public @ResponseBody  List<Critere> getAllCritere(){
		return em.findAll();
	}
	
	
	
	@GetMapping(path="/Critere/{id}")
	public @ResponseBody  Optional<Critere> getCritereid(@PathVariable("id") Integer id){
		return em.findById(id);
	}
	
	@DeleteMapping(path="/Critere/{id}")
	public @ResponseBody  Boolean deleteCritere(@PathVariable("id") Integer id){
		
		 em.deleteById(id);
		 return true;
		
	}
	
	
	@PostMapping(path="/Critere")
	public @ResponseBody  Critere addCritere(@RequestBody  Critere p){
		 return em.save(p);
	
		
	}
	
	@PutMapping("/Critere")
	public @ResponseBody Critere updateCritere(@RequestBody Critere p) {

		
		return em.save(p);

		 
	}

}
