package kata3;

public class Kata3 {
    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        HistogramDisplay histo = new HistogramDisplay("HistogramDisplay", histogram);
        histo.execute();
    }
    
}