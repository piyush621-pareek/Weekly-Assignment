class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double radiusMiles = radiusKm / 1.6; 
        
        // Formula for the volume of a sphere: V = (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        // Output the results
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}