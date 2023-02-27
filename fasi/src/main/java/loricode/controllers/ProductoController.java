package loricode.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import loricode.conexion.IFactoryConexion;

@RestController
@RequestMapping("/api/fasi")
public class ProductoController {
	
	@Autowired
	private IFactoryConexion conexionRepository; 
	
	@GetMapping("list")
	public String listadoProducto() {
		
		return " ::: "+conexionRepository.getConexion();
    }
	
}
