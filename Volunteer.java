
public class Volunteer extends Persona {

	protected boolean ayuda;
	
	public Volunteer (String nombre,Double salario_bruto_mensual,boolean ayuda) {
		super(nombre,salario_bruto_mensual);
		this.salario_bruto_mensual=sueldoVoluntario();
		this.ayuda=ayuda;
	}
	
	public String toString() {
		return "Volunteer [ayuda=" + ayuda + ", nombre=" + nombre + ", salario_bruto_mensual=" + salario_bruto_mensual
				+ "]";
	}

	public Double sueldoVoluntario() {
		Double sueldo;
		
		if(this.ayuda == true) {
			sueldo=300.0;
		}else {
			sueldo=0.0;
		}
		
		return sueldo;
	}
	
	
	
	
}
