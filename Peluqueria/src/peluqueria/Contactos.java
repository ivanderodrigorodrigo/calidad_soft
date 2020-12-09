package peluqueria;
import java.util.*;

public class Contactos {

	private int dni;
	private String nombre;
	private String direccion;
	private String poblacion;
	private String codigoPostal;
	private String email;
	private String telefono;
	private Date fechaAlta;
	private Date fechaBaja;

	Contactos(int dni, String nombre, String direccion, String poblacion, String codigoPostal, String email, String telefono, Date fechaAlta, Date fechaBaja){
		
		this.dni=dni;
		this.nombre=nombre;
		this.direccion=direccion;
		this.poblacion=poblacion;
		this.codigoPostal=codigoPostal;
		this.email=email;
		this.telefono=telefono;
		this.fechaAlta=fechaAlta;
		this.fechaBaja=fechaBaja;
		
	}
	
	public int getDNI() {
		
		return dni;
	}
	
	public void setDNI(int dni) {
		
		this.dni=dni;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre=nombre;
	}
	
	public String getDireccion() {
		
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		
		this.direccion=direccion;
		
	}
	
	public String getPoblacion() {
		
		return poblacion;
	}
	
	public void setPoblacion(String poblacion) {
		
		this.poblacion=poblacion;
	}
	
	public String getEmail() {
		
		return email;
		
	}
	
	public void setEmail(String email) {
		
		this.email=email;
	}
	
	public String getTelefono() {
		
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		
		this.telefono=telefono;
	}
	
	public Date getFechaAlta() {
		
		return fechaAlta;
	}
	
	public void setFechaAlta(Date fechaAlta) {
		
		this.fechaAlta=fechaAlta;
	}
	
	public Date getFechaBaja() {
		
		return fechaBaja;
	}
	
	public void setFechaBaja(Date fechaBaja) {
		
		this.fechaBaja=fechaBaja;
	}
	
}
