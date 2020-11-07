package com.AppwebJeff.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.AppwebJeff.Model.cat_pais;
import com.AppwebJeff.interfacesServices.I_cat_pais;


@Controller
@RequestMapping
public class controladorPais {


	@Autowired 
    private I_cat_pais service;
	

	
	@GetMapping("/listarPaises")
	public String listar(Model model) {
		List<cat_pais>cat_paisjeff=service.listar();
		model.addAttribute("catatalogo_pais",cat_paisjeff);
		
		return "listarCatPais";
	
	}

	@GetMapping("/agregarPais")
    public String agregar(Model model){
        model.addAttribute("cat_pais", new cat_pais());
        return "formCatPais";
    }
	
	
    @PostMapping("/aguardarPais")
    public String save(@Valid cat_pais cf, BindingResult result, Model model){
    	
    	
        	
        	if(result.hasErrors())
        	{
        		return "formCatPais";
        	}
        	
    	service.save(cf);
        return "redirect:/listarPaises";
    }
    
    
    @GetMapping("/editarPais/{ID_PAIS}")
    public String editar(@PathVariable int ID_PAIS, Model model){
        Optional<cat_pais>Idpais =service.listarId(ID_PAIS);
        model.addAttribute("cat_pais", Idpais);
        return "formCatPais";
    }
                                                                                                                                                      
    @GetMapping("/eliminarPais/{ID_PAIS}")
    public String delete(@PathVariable int ID_PAIS, Model model){
    	service.delete(ID_PAIS);
       return "redirect:/listarPaises";
    }
}
