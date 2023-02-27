package loricode.conexion;

import org.springframework.stereotype.Service;

@Service
public class FactoryConexion implements IFactoryConexion {

	public String getConexion() {
		return "en otro modulo de la app";
	}
	
}
