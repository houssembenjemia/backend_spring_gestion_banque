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

import com.grokonez.jwtauthentication.model.Createur;
import com.grokonez.jwtauthentication.repository.CreateurRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/api")
public class CreateurController {
	@Autowired
	private CreateurRepository em;
	
	@GetMapping(path="/Createur")
	public @ResponseBody  List<Createur> getAllCreateur(){
		return em.findAll();
	}
	
	
	
	@GetMapping(path="/Createur/{id}")
	public @ResponseBody  Optional<Createur> getCreateurid(@PathVariable("id") Integer id){
		return em.findById(id);
	}
	
	@DeleteMapping(path="/Createur/{id}")
	public @ResponseBody  Boolean deleteCreateur(@PathVariable("id") Integer id){
		
		 em.deleteById(id);
		 return true;
		
	}
	
	
	@PostMapping(path="/Createur")
	public @ResponseBody  Createur addCreateur(@RequestBody  Createur p){
		 return em.save(p);
	
		
	}
	
	@PutMapping("/Createur")
	public @ResponseBody Createur updateCreateur(@RequestBody Createur p) {

		
		return em.save(p);

		 
	}

}
