import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        ArrayList<Viewer> viewers = new ArrayList<Viewer>();
        viewers.add(new Viewer("Samara", 8, 1));
        viewers.add(new Viewer("Jeliza-Rose", 11, 12));
        viewers.add(new Viewer("George", 18, 23));
        viewers.add(new Viewer("Bug", 16, 25));
        viewers.add(new Viewer("Emma", 13, 6));
        ViewerStatistics vs  = new ViewerStatistics();
        System.out.println(vs.averageAge(viewers));
    }
}
