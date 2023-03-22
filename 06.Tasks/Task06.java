import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import javax.sound.sampled.SourceDataLine;

public class Task06 {
    public static void main(String[] args) {
        Set2 set2 = new Set2();
        set2.add(1);
        System.out.println(set2.contains(1));
        set2.clear();
        set2.print();
        set2.add(5);
        set2.add(6);
        set2.add(7);
        System.out.println(set2.get(2));
        System.out.println(set2.toString());
    
    }
}
class Set2 {
    private TreeMap<Integer, Object> maps = new TreeMap<>();

    public void add(int x) {
        maps.put(x, null);
    }
    public void print() {
        System.out.println(maps.keySet());
    }
    public void clear() {
        maps.clear();
    }
    public Boolean contains(int x) {
        return maps.containsKey(x);
    }
    public void myRemove (int num) {
        maps.remove(num);
    }
    public int size() {
        return maps.size();
    }
    public int get(int index) {
        return (int)maps.keySet().toArray()[index];
    }
    public String toString () {
        return maps.keySet().toString().replace("[", "").replace("]", "").replace(",", "");
    }

}
