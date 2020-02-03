package version_1;

public class Sport {
	public static final int TENNIS = 0;
	public static final int NATATION = 1;
	public static final int ATHLETISME = 2;
	public static final int VOLLEY = 3;
	public static final int RUGBY = 4;
	public static final int BASKET = 5;
	public static final int RANDONNEE = 6;
	public static final int NBSport = 7;
	
	public static String nom(int sport) {
		switch (sport) {
		case TENNIS:
			return "Tennis";
		case NATATION:
			return "Natation";
		case ATHLETISME:
			return "Athletisme";
		case VOLLEY:
			return "Volley";
		case RUGBY:
			return "Volley";
		case BASKET:
			return "Basket";
		case RANDONNEE:
			return "Randonnee";
		default:
			return null;
		}

	}
	public static String nomV2(int sport) {
		switch (sport) {
		case 0:
			return "Escalade";
		case 1:
			return "Natation";
		case 2:
			return "Athletisme";
		case 3:
			return "Muscu";
		case 4:
			return "Volley";
		case 5:
			return "Basket";
		case 6:
			return "Randonnee";
		default:
			return null;
		}
	}
//	
//	if (sport == TENNIS)
//			return "Tennis";
//		if (sport == NATATION)
//			return "Natation";
//		if (sport == ATHLETISME)
//			return "Athletisme";
//		if (sport == VOLLEY)
//			return "Volley";
//		if (sport == RUGBY)
//			return "Rugby";
//		if (sport == BASKET)
//			return "Basket";
//		if (sport == RANDONNEE)
//			return "Randonnee";
//		return null;
//
	
}
