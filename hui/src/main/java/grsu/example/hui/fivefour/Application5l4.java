package grsu.example.hui.fivefour;

class Книга {

	private String Автор;
	private String Название;
	private Жанр _жанр;
	private int Год_издания;

	public Книга() {
		this.Автор = "Автор";
		this.Название = "Название";
		this._жанр = null;
		this.Год_издания = 0;
	}

	public String getАвтор() {
		return Автор;
	}

	public void setАвтор(String Автор) {
		this.Автор = Автор;
	}

	public String getНазвание() {
		return Название;
	}

	public void setНазвание(String Название) {
		this.Название = Название;
	}

	public Жанр get_жанр() {
		return _жанр;
	}

	public void set_жанр(Жанр _жанр) {
		this._жанр = _жанр;

	}

	public int getГод_издания() {
		return Год_издания;
	}

	public void setГод_издания(int Год_издания) {
		this.Год_издания = Год_издания;
	}

}

enum Жанр {

	УЧЕБНАЯ_ЛИТЕРАТУРА

	, НАУЧНАЯ_ФАНТАСТИКА, ФЭНТЕЗИ, УЖАСЫ, ДЕТЕКТИВЫ, КЛАССИКА, ДЕТСКАЯ_ЛИТЕРАТУРА
}

public class Application5l4 {
	public static void main(String[] args) {
		Книга ч = new Книга();
		ч.setАвтор("Г.Гессе");
		ч.setНазвание("Кнульп");
		ч.set_жанр(Жанр.valueOf("ФЭНТЕЗИ"));
		ч.setГод_издания(1915);
		System.out.println("Книга:" + "\n" + "Автор: " + ч.getАвтор() + "\n" + "Название: " + ч.getНазвание() + "\n"
				+ "Жанр: " + ч.get_жанр() + "\n" + "Год издания: " + ч.getГод_издания());
	}

}
