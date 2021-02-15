import java.util.HashMap;
import java.util.Set;

public class HashMatique {

    public void trackList() {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Long Kiss Goodnight", "I swear i'll never wipe these lips....");
        userMap.put("Colorado Knight", "Dusty winds, cold night, everybody waits for the...");
        userMap.put("Tiki shots", "blue water, girls are hotter, dam otters...");
        userMap.put("Java Blues", "i been up 24..........days straight, thats just the start of it...");

        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println("Track: "+key);
            System.out.println("Lyrics: "+userMap.get(key));    
        }
    }
}