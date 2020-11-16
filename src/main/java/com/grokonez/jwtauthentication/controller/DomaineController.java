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

import com.grokonez.jwtauthentication.model.Domaine;
import com.grokonez.jwtauthentication.repository.DomaineRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/api")
public class DomaineController {
	@Autowired
	private DomaineRepository em;
	
	@GetMapping(path="/Domaine")
	public @ResponseBody  List<Domaine> getAllDomaine(){
		return em.findAll();
	}
	
	
	
	@GetMapping(path="/Domaine/{id}")
	public @ResponseBody  Optional<Domaine> getDomaineid(@PathVariable("iddomaine") Integer id){
		return em.findById(id);
	}
	
	@DeleteMapping(path="/Domaine/{id}")
	public @ResponseBody  Boolean deleteDomaine(@PathVariable("id") Integer id){
		
		 em.deleteById(id);
		 return true;
		
	}
	
	
	@PostMapping(path="/Domaine")
	public @ResponseBody  Domaine addDomaine(@RequestBody  Domaine p){
		 return em.save(p);
	
		
	}
	
	@PutMapping("/Domaine")
	public @ResponseBody Domaine updateDomaine(@RequestBody Domaine p) {

		
		return em.save(p);

		 
	}

}
