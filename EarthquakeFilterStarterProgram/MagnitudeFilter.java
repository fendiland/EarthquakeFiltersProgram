
/**
 * Write a description of MagnitudeFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagnitudeFilter implements Filter {

    private double minMag;
    private double maxMag;
    private String name;
    public MagnitudeFilter(double min, double max) {
        minMag = min;
        maxMag = max;
        
    }
    
    public boolean satisfies(QuakeEntry qe) {
        double mag = qe.getMagnitude();
        double mag1 = 0;
        if(mag >= minMag && mag <= maxMag) {
            return true;
        }
        return false;
    }
    
    public String getName() {
        return name;
    }
}
