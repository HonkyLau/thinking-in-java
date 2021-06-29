package tij4.containers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * map遍历的几种方式
 *
 * @author liuhongji
 */
public class MapEach {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        map.put("4", "D");

        // entrySet + for
        for (Map.Entry<String, String> entry :
                map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // iterator
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + ":" + next.getValue());
        }

        // keySet
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String key;
            String value;
            key = it.next().toString();
            value = map.get(key);
            System.out.println(key + "--" + value);
        }


    }
}
