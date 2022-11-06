public class App {
    public static void main(String[] args) throws Exception {
        WomanCalculator womanCalculator = new WomanCalculator();
        womanCalculator.hesapla();
        womanCalculator.gameOver();
 
        GameCalculator gameCalculator = new OlderCalculator(); 
        gameCalculator.hesapla();

    }
}
