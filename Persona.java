
public abstract class Persona {

	protected String nombre;
	protected Double salario_bruto_mensual;
	protected Double salario_neto_mensual;
	protected Double salario_bruto_anual;
	protected Double salario_neto_anual;
	
	public Persona (String nombre,Double salario_bruto_mensual) {
		this.nombre=nombre;
		this.salario_bruto_mensual=salario_bruto_mensual;
		this.salario_neto_mensual=salarioNeto();
		this.salario_bruto_anual=(this.salario_bruto_mensual*12);
		this.salario_neto_anual=(this.salario_neto_mensual*12);
		
	}
	
	public String toString() {
		return "Persona [nombre=" + nombre + ", salario_bruto_mensual=" + salario_bruto_mensual
				+ ", salario_neto_mensual=" + salario_neto_mensual + ", salario_bruto_anual=" + salario_bruto_anual
				+ ", salario_neto_anual=" + salario_neto_anual + "]";
	}

	public void bonusDiez() {
		
		if(this instanceof Boss) {
			this.salario_bruto_anual = this.salario_bruto_anual+(this.salario_bruto_anual*0.1);
			this.salario_neto_anual = this.salario_neto_anual+(this.salario_neto_anual*0.1);
		}else if(this instanceof Manager) {
			this.salario_bruto_anual = this.salario_bruto_anual+(this.salario_bruto_anual*0.1);
			this.salario_neto_anual = this.salario_neto_anual+(this.salario_neto_anual*0.1);
		}else if(this instanceof Senior) {
			this.salario_bruto_anual = this.salario_bruto_anual+(this.salario_bruto_anual*0.1);
			this.salario_neto_anual = this.salario_neto_anual+(this.salario_neto_anual*0.1);
		}else if(this instanceof Mid) {
			this.salario_bruto_anual = this.salario_bruto_anual+(this.salario_bruto_anual*0.1);
			this.salario_neto_anual = this.salario_neto_anual+(this.salario_neto_anual*0.1);
		}else if(this instanceof Junior) {
			this.salario_bruto_anual = this.salario_bruto_anual+(this.salario_bruto_anual*0.1);
			this.salario_neto_anual = this.salario_neto_anual+(this.salario_neto_anual*0.1);
		}else {
			System.out.println("No se puede dar bonus a "+this.nombre);
		}
		
	}
	
	public Double salarioNeto() {
		Double salario = 0.0;
		
		if(this instanceof Boss) {
			salario = this.salario_bruto_mensual-(this.salario_bruto_mensual*0.32);
		}else if(this instanceof Manager) {
			salario = this.salario_bruto_mensual-(this.salario_bruto_mensual*0.26);
		}else if(this instanceof Senior) {
			salario = this.salario_bruto_mensual-(this.salario_bruto_mensual*0.24);
		}else if(this instanceof Mid) {
			salario = this.salario_bruto_mensual-(this.salario_bruto_mensual*0.15);
		}else if(this instanceof Junior) {
			salario = this.salario_bruto_mensual-(this.salario_bruto_mensual*0.02);
		}
		
		return salario;
	}
	
	public Double comprobarSalario(){
		
		Double salario = 0.0;
		
		if(this instanceof Boss) {
			if(this.salario_bruto_mensual<8000) {
				salario = 8000.0;
			}else {
				salario = this.salario_bruto_mensual;
			}
		}else if(this instanceof Manager) {
			if(this.salario_bruto_mensual<=3000 || this.salario_bruto_mensual>=5000) {
				salario = 3001.0;
			}else {
				salario = this.salario_bruto_mensual;
			}
		}else if(this instanceof Senior) {
			if(this.salario_bruto_mensual<=2700 || this.salario_bruto_mensual>=4000) {
				salario = 2701.0;
			}else {
				salario = this.salario_bruto_mensual;
			}
		}else if(this instanceof Mid) {
			if(this.salario_bruto_mensual<=1800 || this.salario_bruto_mensual>=2500) {
				salario = 1801.0;
			}else {
				salario = this.salario_bruto_mensual;
			}
		}else if(this instanceof Junior) {
			if(this.salario_bruto_mensual<=900 || this.salario_bruto_mensual>=1600) {
				salario = 901.0;
			}else {
				salario = this.salario_bruto_mensual;
			}
		}else if(this instanceof Volunteer) {
			if(this.salario_bruto_mensual>=0) {
				salario = 0.0;
			}
		}
		
		return salario;
		
	}
	
	
	
}
