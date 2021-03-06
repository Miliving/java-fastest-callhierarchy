package kacirekj.fastcallhierarchy.datastructures;

import java.util.HashMap;
import java.util.Map;

public class OneToOneHashMap<Key, Value> {
    protected Map<Key, Value> map = new HashMap<>();
    private StringBuilder sb = new StringBuilder();

    public Map<Key, Value> getMap() {
        return map;
    }

    @Override
    public String toString() {
        sb.setLength(0); // flush
        for(Map.Entry<Key, Value> entry : map.entrySet()) {
            sb.append(entry.getKey().toString()).append("\n");
        }
        return sb.toString();
    }
}
