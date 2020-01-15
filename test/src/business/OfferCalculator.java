package business;

import java.util.ArrayList;

import data.Excursion;
import data.Hotel;
import data.Offre;

public class OfferCalculator {
	
	public void initExcursions(int intensity, Offre offre){
		ArrayList<Excursion> excursions = new ArrayList<Excursion>();
		Excursion e1 = new Excursion();
		Excursion e2 = new Excursion();
		Excursion e3 = new Excursion();
		Excursion e4 = new Excursion();
		
		switch(intensity) {
		case 1:
			e1.setBeach(true);
			e2.setBeach(true);
			e3.setBeach(true);
			e4.setBeach(true);
			break;
		case 2:
			e1.setBeach(true);
			e2.setBeach(true);
			break;
		case 3:
			e2.setBeach(true);
			break;
		default:break;
		}
		excursions.add(e1);
		excursions.add(e2);
		excursions.add(e3);
		excursions.add(e4);
		offre.setExcursions(excursions);
	}
	
	public ArrayList<Offre> initOffer(ArrayList<Hotel> hotels, int intensity) {
		ArrayList<Offre> offres = new ArrayList<Offre>();
		for(Hotel hotel: hotels) {
			Offre offre = new Offre();
			offre.setHotel(hotel);
			initExcursions(intensity, offre);
			offres.add(offre);
		}
		return offres;
	}
	
}
