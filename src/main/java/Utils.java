public class Utils {

    private Utils(){

    }

    public static int getRandom(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
