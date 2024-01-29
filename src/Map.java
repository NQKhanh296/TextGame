import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Map {
    private HashMap<Integer,String> rooms=  new HashMap<>();
    private int start=0;


    public Map(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line=br.readLine())!=null){
                int roomID = Integer.parseInt(line.substring(0,1));
                String roomName = line.substring(10);
                rooms.put(roomID,roomName);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }
}
