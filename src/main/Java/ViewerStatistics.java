import java.util.List;

public class ViewerStatistics {
    public int averageAge(List<Viewer> list) {
        int sum = 0;
        for (Viewer v : list) {
            sum += v.getAge();
        }
        return sum/list.size();
    }
}
