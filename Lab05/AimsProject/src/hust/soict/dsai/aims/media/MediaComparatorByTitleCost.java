package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	public MediaComparatorByTitleCost() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compare(Media m1, Media m2) {
		if(m1.getTitle().equals(m2.getTitle())) {
			return Float.compare(m1.getCost(),m2.getCost());
		}
		return m1.getTitle().compareTo(m2.getTitle());
	}
}
