import java.util.*;
import java.util.Map.Entry;

public class Main {

//    public ArrayList<String> returnCollection(ArrayList<String> arr ){
//        return arr;
//    }

    public static void main(String[] args) {

////        ArrayList
//        ArrayList<String> arrList = new ArrayList();
//        arrList.add("Added String");
//        arrList.add(1, "String element");
//        arrList.get(0);
//        arrList.set(0, "Changed String");
//        arrList.remove(0);
//        arrList.remove("Changed String");
////        LinkedList
//        LinkedList<Integer> linkedList = new LinkedList();
//        linkedList.add(2); // add by element
//        linkedList.add(1, 122);
//        linkedList.get(0); // get by Index
//        linkedList.getFirst();
//        linkedList.getLast();
//        linkedList.set(1, 123); // set by Index element
//        linkedList.remove();
//        Integer dellInteger = 123;
//        boolean tmp = linkedList.remove(dellInteger);
//        Integer tmp2 = linkedList.remove(2);
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        Set
//        HashSet<Long> setList = new HashSet();
//        setList.add(321L);
//        setList.add(3221L);
//        setList.add(3231L);
//        setList.add(321L);
//        Iterator iterator = setList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//Hash Map
//        Map map = new HashMap<String, List<Integer>>();
//        map.put("list", linkedList);
//        map.put("one", 1);
//        List list2 = new LinkedList<Integer>();
//        list2.add(321);
//        list2.add(31);
//        list2.add(3221);
//
//        map.put("two", list2);
//
//        String key = "two";
////        LinkedList listTmp = (LinkedList) map.get(key);
//
//        map.remove("one");
//
//
//        Set keys = map.keySet();
//
//        for (Object o : keys) {
//            System.out.println(o);
//        }
//
//        Iterator iterator = map.entrySet().iterator();
//
//        while (iterator.hasNext()) {
//            Entry entry = (Entry) iterator.next();
//            String keyTmp = (String) entry.getKey();
//            LinkedList<Integer> listTmp = (LinkedList<Integer>) entry.getValue();
//
//            System.out.println("Key is : " + keyTmp + ", Value is: " + listTmp);
//        }
//
//        for (Object o : map.keySet()) {
//            System.out.println(o);
//            System.out.println(map.get(o));
//        }

//      TreeMap
        TreeMap<Integer, String> integerTreeMap = new TreeMap();
        integerTreeMap.put(243, "Value 243");
        integerTreeMap.put(143, "Value 143");
        integerTreeMap.put(3243, "Value 3243");
        integerTreeMap.put(273, "Value 273");
        integerTreeMap.put(43, "Value 43");

        System.out.println(integerTreeMap);


        class sortByRoll implements Comparator<String> {
            // Used for sorting in ascending order of
            // roll number
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        }


        TreeMap<String, String> stringTreeMap = new TreeMap();
        stringTreeMap.put("bqwerty", "Value 243");
        stringTreeMap.put("ahgf", "Value 143");
        stringTreeMap.put("etbvcdx", "Value 3243");
        stringTreeMap.put("dvrcdxs", "Value 273");
        stringTreeMap.put("crcedxs", "Value 43");

        System.out.println(stringTreeMap);




    }
}
