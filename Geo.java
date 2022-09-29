public class Geo  implements Contavel{
	private double latitude;
	private double longitude;
	private int totalGeo=0;
	
	public Geo(double latitude, double longitude) {
		totalGeo++;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public static double distancia(Geo g1, Geo g2){
		
		double lat1 = g1.getLatitude();
		double lon1 = g1.getLongitude();

		double lat2 = g2.getLatitude();
		double lon2 = g2.getLongitude();

		
		Double latDistance = Math.toRadians(lat2-lat1);
		Double lonDistance = Math.toRadians(lon2-lon1);
		Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + 
		Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * 
		Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		Double distancia = 6371 * c;

		return distancia;
	}

	public static double distanciaP(Geo geo1, Geo geo2) {
        double lat1 = Math.toRadians(geo1.getLatitude());
        double lat2 = Math.toRadians(geo2.getLatitude());
        double lon1 = Math.toRadians(geo1.getLongitude());
        double lon2 = Math.toRadians(geo2.getLongitude());
        
        double diflat = (lat1-lat2)/2;
        double diflon = (lon1-lon2)/2;
        
        double d = Math.pow(Math.sin(diflat),2)+
                   Math.pow(Math.sin(diflon),2)*
                   Math.cos(lat1) * Math.cos(lat2);
        
        d = 2 * 6371 * Math.asin(Math.sqrt(d));
                
        return d;   
    }   

	public static double distanciaL(Geo g1, Geo g2){
		
		double lat1 = Math.toRadians(g1.getLatitude());
		double lon1 = Math.toRadians(g1.getLongitude());

		double lat2 = Math.toRadians(g2.getLatitude());
		double lon2 = Math.toRadians(g2.getLongitude());

		double distancia = 2*6371*Math.asin(Math.sqrt(Math.pow(Math.sin((lat2-lat1)/2),2)+Math.cos(lat1)*Math.cos(lat2)*Math.pow(Math.sin((lon2-lon1)/2),2)));
		return distancia;
	}

	public int getTotalObj()
	{
		return totalGeo;
	}
}
