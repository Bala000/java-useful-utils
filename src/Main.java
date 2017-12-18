import java.util.*;

public class Main {

    static class Vote implements Comparable
    {
        public int id;
        public String name;


        public Vote(String name)
        {
            this.id = (int) ((Math.random())*10);
            this.name = name;

        }

        @Override
        public int hashCode() {
            return this.name.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return this.name.equals(obj);
        }

        @Override
        public int compareTo(Object o) {
            Vote j = (Vote)o;
            return name.compareTo(j.name);
        }

        @Override
        public String toString() {
            return "id: "+id+", name: "+name;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");

        /*List<Vote> voteLists = new ArrayList<>();
        voteLists.add(new Vote("Bala", ))*/
        HashMap<Vote,Integer> map = new HashMap<>();
        map.put(new Vote("Bala"),20);
        map.put(new Vote("Abanish"),40);
        map.put(new Vote("Arun"),30);
        map.put(new Vote("Kings"),25);

        System.out.println("Before");
        for (Map.Entry<Vote,Integer> entry: map.entrySet())
        {
            System.out.println("Key = "+entry.getKey()+"; Value = "+entry.getValue());
        }

        TreeMap<Vote,Integer> sortedMap = new TreeMap(map);

        System.out.println("After");
        for (Map.Entry<Vote,Integer> entry: sortedMap.entrySet())
        {
            System.out.println("Key = "+entry.getKey()+"; Value = "+entry.getValue());
        }

        ArrayList<Map.Entry<Vote,Integer>> entryArrayList = new ArrayList<>(map.entrySet());
        Collections.sort(entryArrayList, new Comparator<Map.Entry<Vote, Integer>>() {
            @Override
            public int compare(Map.Entry<Vote, Integer> o1, Map.Entry<Vote, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        LinkedHashMap<Vote, Integer> linkedHashMap = new LinkedHashMap<Vote, Integer>();
        for(Map.Entry<Vote, Integer> entry : entryArrayList)
        {
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println("After");
        for (Map.Entry<Vote,Integer> entry: linkedHashMap.entrySet())
        {
            System.out.println("Key = "+entry.getKey()+"; Value = "+entry.getValue());
        }
    }
}
