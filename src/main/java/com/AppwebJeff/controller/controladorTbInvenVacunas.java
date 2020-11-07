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

import com.AppwebJeff.Model.tb_inventario_vacunas;

import com.AppwebJeff.interfacesServices.I_inventario_vacunas;

@Controller
@RequestMapping
public class controladorTbInvenVacunas {

	@Autowired 
    private I_inventario_vacunas service;

	
	
	@GetMapping({"/tbvacu","/tbinventario"})
	public String index() 
	{
		
		return "listarTbInventarioVacunas";
	}
	
	
	@GetMapping("/inventariovacu")
	public String listar(Model model) {
		List<tb_inventario_vacunas>table_inve=service.listar();
		model.addAttribute("tb_inventario_vacunas",table_inve);
		
		return "listarTbInventarioVacunas";
	
	}
	
	
	@GetMapping("/agregarinvenntarioPer")
    public String agregar(Model model){
        model.addAttribute("tb_inventario_vacunas", new tb_inventario_vacunas());
        return "formInventario";
    }
	
	
	
    @PostMapping("/aguardarinventarioPer")
    public String save(@Valid tb_inventario_vacunas cf,BindingResult result, Model model){

    
        	if(result.hasErrors())
        	{
        		return "formInventario";
        	}
        	
    	service.save(cf);
        return "redirect:/inventariovacu";
    }
    
    @GetMapping("/editarinventarioPer/{ID_INVENTARIO_VACUNA}")
    public String editar(@PathVariable int ID_INVENTARIO_VACUNA, Model model){
        Optional<tb_inventario_vacunas>cui =service.listarId(ID_INVENTARIO_VACUNA);
        model.addAttribute("tb_inventario_vacunas", cui);
        return "formInventario";
    }
                                                                                                                                                      
    @GetMapping("/eliminarinventarioPer/{ID_INVENTARIO_VACUNA}")
    public String delete(@PathVariable int ID_INVENTARIO_VACUNA, Model model){
    	service.delete(ID_INVENTARIO_VACUNA);
       return "redirect:/inventariovacu";
    }
}
