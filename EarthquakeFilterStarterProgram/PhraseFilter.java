
/**
 * Write a description of PhraseFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhraseFilter implements Filter {

    private String indication;
    private String phrase;
    private String name;
    public PhraseFilter(String request, String phr) {
        indication = request;
        phrase = phr;
        
    }
    
    public boolean satisfies(QuakeEntry qe) {
        String title = qe.getInfo();
        if(indication == "start" && title.startsWith(phrase)) {
                return true;
                
        }
        if(indication == "end" && title.endsWith(phrase)) {
                return true;
        }
            
        else if(indication == "any" && title.contains(phrase)) {
                return true;
        }
        return false;
    }
    
    //public String getName() {
        //return name;
    //}
}
