package version_2;

public class Sports {
	public static final int TENNIS = 0;
	public static final int FOOT = 1;
	public static final int NB_SPORTS = 2;
	public static String noms[] = {"Tennis", "Foot"};

	public static String nom1(int sport) {		
		switch (sport) {
		case TENNIS:
			return "Tennis";
			
		case FOOT:
			return "Foot";
			
		default:
			return "?";
		}
	}
	
	public static String nom2(int sport) {
		if (sport == TENNIS)
			return "Tennis";
		
		if (sport == FOOT)
			return "Foot";
	
		return "?";
	}
	
	public static String nom(int sport) {
		return noms[sport];
	}

}
