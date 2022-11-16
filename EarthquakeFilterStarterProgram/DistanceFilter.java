
/**
 * Write a description of DistanceFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistanceFilter implements Filter {

    private Location loc;
    private double maxDist;
    private String name;
    public DistanceFilter(Location locat, double max) {
        loc = locat;
        maxDist = max;
        
    }
    
    public boolean satisfies(QuakeEntry qe) {
        Location l = qe.getLocation();
        if(l.distanceTo(loc) < maxDist) {
            return true;
        }
        return false;
    }
    
    //public String getName() {
        //return name;
    //}
}