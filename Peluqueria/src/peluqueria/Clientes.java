package peluqueria;
import java.util.*;

public class Clientes extends Contactos{

	private int numSocio;
	private int puntos;
	
	
	Clientes(int dni, String nombre, String direccion, String poblacion, String codigoPostal, String email, String telefono, Date fechaAlta, Date fechaBaja, int numSocio, int puntos){
		
		super(dni, nombre, direccion, poblacion, codigoPostal, email, telefono, fechaAlta, fechaBaja);
		
		this.numSocio=numSocio;
		this.puntos=puntos;
		
	}
	
	public int getNumSocio() {
		
		return numSocio;
	}
	
	public void setNumSocio(int numSocio) {
		
		this.numSocio=numSocio;
	}
	
	public int getPuntos() {
		
		return puntos;
	}
	
	public void setPuntos(int puntos) {
		
		this.puntos=puntos;
	}
}
