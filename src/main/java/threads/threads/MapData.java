package threads.threads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class MapData {
    public static Map<String, List<String>> map = new HashMap<>();


    public static Map<String, List<String>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<String>> map) {
        this.map = map;
    }

    public static void addDataToMap(String key, String value) {
        List<String> list = map.get(key);
        if (list == null) {
            list = new ArrayList<>();
            map.put(key, list);
        }
        list.add(value);
        map.replace(key, list);
    }
}
