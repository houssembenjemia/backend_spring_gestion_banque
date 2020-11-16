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

import com.grokonez.jwtauthentication.model.Checklist;
import com.grokonez.jwtauthentication.repository.ChecklistRepository;

@CrossOrigin
@RestController
@RequestMapping(path="/api")
public class ChecklistController {
	@Autowired
	private ChecklistRepository em;
	
	@GetMapping(path="/Checklist")
	public @ResponseBody  List<Checklist> getAllChecklist(){
		return em.findAll();
	}
	
	
	
	@GetMapping(path="/Checklist/{id}")
	public @ResponseBody  Optional<Checklist> getChecklistid(@PathVariable("id") Long id){
		return em.findById(id);
	}
	
	@DeleteMapping(path="/Checklist/{id}")
	public @ResponseBody  Boolean deleteChecklist(@PathVariable("id") Long id){
		
		 em.deleteById(id);
		 return true;
		
	}
	
	
	@PostMapping(path="/Checklist")
	public @ResponseBody  Checklist addChecklist(@RequestBody  Checklist p){
		 return em.save(p);
	
		
	}
	

	 @PutMapping("/checklist/{idchecklist}")
	  Checklist replaceChecklist(@RequestBody Checklist newChecklist, @PathVariable Long  idchecklist) {

		   return em.findById(idchecklist)
		      .map(checklist -> {
		    	  checklist.setLibelle(newChecklist.getLibelle());
		    	  checklist.setCritere(newChecklist.getCritere());
		    	  checklist.setCas_de_figure(newChecklist.getCas_de_figure());
		    	  checklist.setDocument_exiges(newChecklist.getDocument_exiges());
		    	  checklist.setAutres_documents(newChecklist.getAutres_documents());


		        return em.save(checklist);
		      })
		      .orElseGet(() -> {
		    	  newChecklist.setIdchecklist(idchecklist);
		       return em.save(newChecklist);
		      });
		  }
	 
		
	

}
