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

import com.grokonez.jwtauthentication.model.Document;
import com.grokonez.jwtauthentication.repository.DocumentRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/api")
public class DocumentController {
	@Autowired
	private DocumentRepository em;
	
	@GetMapping(path="/Document")
	public @ResponseBody  List<Document> getAllDocument(){
		return em.findAll();
	}
	
	
	
	@GetMapping(path="/Document/{id}")
	public @ResponseBody  Optional<Document> getDocumentid(@PathVariable("id") Integer id){
		return em.findById(id);
	}
	
	@DeleteMapping(path="/Document/{id}")
	public @ResponseBody  Boolean deleteDocument(@PathVariable("id") Integer id){
		
		 em.deleteById(id);
		 return true;
		
	}
	
	
	@PostMapping(path="/Document")
	public @ResponseBody  Document addDocument(@RequestBody  Document p){
		 return em.save(p);
	
		
	}
	
	@PutMapping("/Document")
	public @ResponseBody Document updateDocument(@RequestBody Document p) {

		
		return em.save(p);

		 
	}

}
