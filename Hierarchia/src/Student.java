
public class Student extends Osoba{
	
	private int indeks;
	
	public Student( String imie, String nazwisko, int rokUrodzenia, String plec, int indeks){
		super( imie, nazwisko, rokUrodzenia, plec );
		this.indeks = indeks;
	}

	@Override
	public String toString() {
		return "\nStudent\nIndeks: " + indeks + super.toString();
	}
	
	void setIndeks( int indeks ){
		this.indeks = indeks;
	}

	
}
