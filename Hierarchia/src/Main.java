
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student("Grzegorz", "Brzêczyszczykiewicz", 1925, "M", 45);
		System.out.println(student.toString());
		
		Wykladowca wykladowca = new Wykladowca("Zdzichu", "Pêdziwiatr", 1337, "M", "Doktorek");
		System.out.println(wykladowca.toString());
		
		Stypendysta stypendysta = new Stypendysta("Mateusz", "Prostolinijny", 1322, "M", 322, 322);
		System.out.println(stypendysta.toString());

		Osoba osoba = new Osoba("Noname", "Random", 234, "Unknown");
		System.out.println(osoba.toString());
		
		student.setImie("Cos");
		student.setIndeks(357);
		System.out.println(student.toString());
	}

}
