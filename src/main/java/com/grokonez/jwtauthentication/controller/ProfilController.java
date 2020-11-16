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

import com.grokonez.jwtauthentication.model.Profil;
import com.grokonez.jwtauthentication.repository.ProfilRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/api")
public class ProfilController {
	@Autowired
	private ProfilRepository em;
	
	@GetMapping(path="/Profil")
	public @ResponseBody  List<Profil> getAllProfil(){
		return em.findAll();
	}
	
	
	
	@GetMapping(path="/Profil/{id}")
	public @ResponseBody  Optional<Profil> getProfilid(@PathVariable("id") Integer id){
		return em.findById(id);
	}
	
	@DeleteMapping(path="/Profil/{id}")
	public @ResponseBody  Boolean deleteProfil(@PathVariable("id") Integer id){
		
		 em.deleteById(id);
		 return true;
		
	}
	
	
	@PostMapping(path="/Profil")
	public @ResponseBody  Profil addProfil(@RequestBody  Profil p){
		 return em.save(p);
	
		
	}
	
	@PutMapping("/Profil")
	public @ResponseBody Profil updateProfil(@RequestBody Profil p) {

		
		return em.save(p);

		 
	}

}
