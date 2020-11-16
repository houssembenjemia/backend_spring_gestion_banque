package com.grokonez.jwtauthentication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.model.Admin;
import com.grokonez.jwtauthentication.repository.AdminRepository;

@RestController()
@RequestMapping("/api")
public class AdminController {
	@Autowired
	private AdminRepository em;
	
	@GetMapping(path="/Admin")
	public @ResponseBody  List<Admin> getAllAdmin(){
		return em.findAll();
	}
	
	
	
	@GetMapping(path="/Admin/{idadmin}")
	public @ResponseBody  Optional<Admin> getAdminid(@PathVariable("idadmin") Integer idadmin){
		return em.findById(idadmin);
	}
	
	@DeleteMapping(path="/Admin/{idadmin}")
	public @ResponseBody  Boolean deleteAdmin(@PathVariable("idadmin") Integer idadmin){
		
		 em.deleteById(idadmin);
		 return true;
		
	}
	
	
	@PostMapping(path="/Admin")
	public @ResponseBody  Admin addAdmin(@RequestBody  Admin p){
		 return em.save(p);
	
		
	}
	
	@PutMapping("/Admin")
	public @ResponseBody Admin updateAdmin(@RequestBody Admin p) {

		
		return em.save(p);

		 
	}

}
