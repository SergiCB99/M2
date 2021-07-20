
public class M2App {

	public static void main(String[] args) {
		
		Manager manager1 = new Manager ("Sergi",1000.0);
		Boss boss1 = new Boss ("Sergi",1000.0);
		Mid mid1 = new Mid ("Sergi",1000.0);
		Volunteer volunteer1 = new Volunteer ("Sergi",1000.0,true);
		
		System.out.println(manager1.toString());
		System.out.println(boss1.toString());
		System.out.println(mid1.toString());
		System.out.println(volunteer1.toString());

		mid1.bonusDiez();
		volunteer1.bonusDiez();

		System.out.println(mid1.toString());
	}
	
}
