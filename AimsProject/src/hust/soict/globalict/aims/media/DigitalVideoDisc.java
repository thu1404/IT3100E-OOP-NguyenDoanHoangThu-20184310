package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{


	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    super(title, category, director, length, cost);
  }

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	public String toString() {
		String res = String.format("%d. DVD - %s - %s - %s - %d : %f $",this.getId(),this.getTitle(),this.getCategory(),this.getDirector(),this.getLength(),this.getCost());
		return res;
	}

}
