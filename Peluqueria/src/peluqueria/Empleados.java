package peluqueria;
import java.util.*;

public class Empleados extends Contactos {

	private long numSegSocial;
	private double salario;
	private String categoria;
	private String especialidades;
	private Date vacaciones;
	private Date bajas;
	private ArrayList<Date> listaVacaciones;
	private ArrayList<Date> listaBajas;
	private long ccc;
	
	
	Empleados(int dni, String nombre, String direccion, String poblacion, String codigoPostal, String email, String telefono, Date fechaAlta, Date fechaBaja, long numSegSocial, double salario, String categoria, String especialidades, Date vacaciones, Date bajas, long ccc ){
		
		super(dni, nombre, direccion, poblacion, codigoPostal, email, telefono, fechaAlta, fechaBaja);
		
		this.numSegSocial=numSegSocial;
		this.salario=salario;
		this.categoria=categoria;
		this.especialidades=especialidades;
		this.vacaciones=vacaciones;
		this.bajas=bajas;
		this.ccc=ccc;
	}
	
	public long getNumSegSocial() {
		
		return numSegSocial;
	}
	
	public void setNumSegSocial(long numSegSocial) {
		
		this.numSegSocial=numSegSocial;
	}
	
	public double getSalario() {
		
		return salario;
	}
	
	public void setSalario(double salario) {
		
		this.salario=salario;
	}
	
	public String getCategoria() {
		
		return categoria;
	}
	
	public void setCategoria (String categoria) {
		
		this.categoria=categoria;
	}
	
	public String getEspecialidades() {
		
		return especialidades;
	}
	
	public void setEspecialidades(String especialidades) {
		
		this.especialidades=especialidades;
	}
	
	public Date getVacaciones() {
		
		return vacaciones;
	}
	
	public void setVacaciones(Date vacaciones) {
		
		this.vacaciones=vacaciones;
		
	}
	
	public Date getBajas() {
		
		return bajas;
	}
	
	public void setBajas(Date bajas) {
		
		this.bajas=bajas;
		
	}
	
	public long getCCC() {
		
		return ccc;
	}
	
	public void setCCC(long ccc) {
		
		this.ccc=ccc;
	}
	
	public void pideVacaciones(Date vacaciones) {
		
		listaVacaciones.add(vacaciones);
	}
	
	public void pideBajas(Date bajas) {
		
		listaBajas.add(bajas);
	}
	
	public void quitaVacaciones(Date vacaciones) {
		
		listaVacaciones.remove(vacaciones);
	}
	
	public void quitaBajas(Date bajas) {
		
		listaBajas.remove(bajas);
	}
	
	public void listaVacaciones() {
		
		for (int i=0; i<listaVacaciones.size(); i++) {
			
			System.out.println("Dia de vacaciones: "+ i + listaVacaciones.get(i).toString());
		}
	}
}
