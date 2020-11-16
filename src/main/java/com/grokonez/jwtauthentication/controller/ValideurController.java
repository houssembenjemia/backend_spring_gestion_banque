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

import com.grokonez.jwtauthentication.model.Valideur;
import com.grokonez.jwtauthentication.repository.ValideurRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/api")
public class ValideurController {
	@Autowired
	private ValideurRepository em;
	
	@GetMapping(path="/Valideur")
	public @ResponseBody  List<Valideur> getAllValideur(){
		return em.findAll();
	}
	
	
	
	@GetMapping(path="/Valideur/{id}")
	public @ResponseBody  Optional<Valideur> getValideurid(@PathVariable("id") Integer id){
		return em.findById(id);
	}
	
	@DeleteMapping(path="/Valideur/{id}")
	public @ResponseBody  Boolean deleteValideur(@PathVariable("id") Integer id){
		
		 em.deleteById(id);
		 return true;
		
	}
	
	
	@PostMapping(path="/Valideur")
	public @ResponseBody  Valideur addValideur(@RequestBody  Valideur p){
		 return em.save(p);
	
		
	}
	
	@PutMapping("/Valideur")
	public @ResponseBody Valideur updateValideur(@RequestBody Valideur p) {

		
		return em.save(p);

		 
	}

}
