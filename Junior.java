
public class Junior extends Employee {

	public Junior (String nombre,Double salario_bruto_mensual) {
		super(nombre,salario_bruto_mensual);
		this.salario_bruto_mensual=this.comprobarSalario()-(this.comprobarSalario()*0.15);
		this.salario_neto_mensual=this.salarioNeto();
		this.salario_bruto_anual=(this.salario_bruto_mensual*12);
		this.salario_neto_anual=(this.salario_neto_mensual*12);
	}
	
}
