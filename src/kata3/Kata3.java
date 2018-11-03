package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram <String>histogram = new Histogram();
        for(int i = 0; i <= 10; i++){
            histogram.increment("gmail.com");
        }
        for(int i = 0; i <= 6; i++){
            histogram.increment("ull.es");
        }
        for(int i = 0; i <= 3; i++){
            histogram.increment("ulpgc.es");
        }
        new HistogramDisplay(histogram).execute();
    } 
}
