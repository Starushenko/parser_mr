import java.util.List;
public class BookStatistic {
    private final List<String> topWords;
    private final int uniqWords;

    public BookStatistic(List<String> topWords, int uniqWords) {
        this.topWords = topWords;
        this.uniqWords = uniqWords;
    }

    @Override
    public String toString() {
        return "BookStatistic{" +
               "topWords=" + topWords +
               ", uniqWords=" + uniqWords +
               '}';
    }
}