package hust.soict.globalict.aims.disc;

public class DigitalVideoDisc {
  private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDisc = 0;
	private int id;

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public DigitalVideoDisc(String title) {
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	public String toString() {
		String res = String.format("%d. DVD - %s - %s - %s - %d : %f $", this.id, this.title, this.category,
				this.director, this.length, this.cost);
		return res;
	}

	public boolean isMatch(String title) {
		return title.equals(this.title);
	}

	public boolean isMatch(int id) {
		return id == this.id;
	}
}
