import java.util.*;

public class Treemap1 {
    public static void main(String[] args){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter key-value pairs key as integer and value as string: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter key: ");
            int key = scanner.nextInt();
            System.out.print("Enter value: ");
            String value = scanner.next();
            treeMap.put(key, value);
        }
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        treeMap.forEach((key, value) -> System.out.println(key + " => " + value));

        for (Integer key : treeMap.keySet()) {
            System.out.println(key + " => " + treeMap.get(key));
        }
    }
}

