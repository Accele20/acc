public class App {
    public static void main(String[] args) throws InterruptedException{
        while (true) {
            Thread.sleep(1000);
            System.out.println("R:(" + (int)(Math.random()*100%100)+","+ (int)(Math.random()*100%100) + ")");
        }
    }
}
