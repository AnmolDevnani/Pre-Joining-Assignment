import java.util.*;

class Map1 {
public static void main(String args[]) {
HashMap<String , Double> m1 = new HashMap<>();
m1.put("idli" , 30.0);		m1.put("dosa",40.0);
m1.put("vada", 30.0);		m1.put("dosa" , 50.0);
m1.putIfAbsent("burger",70.0);

System.out.println(m1);
System.out.println(m1.get("idli"));
System.out.println(m1.get("pasta"));


LinkedHashMap<String , Double> m2 = new LinkedHashMap<>();
m2.put("idli" , 30.0);		m2.put("dosa",40.0);
m2.put("vada", 30.0);		m2.put("dosa" , 50.0);
m2.putIfAbsent("burger",70.0);

System.out.println(m2);

TreeMap<String , Double> m3 = new TreeMap<>();
m3.put("idli" , 30.0);		m3.put("dosa",40.0);
m3.put("vada", 30.0);		m3.put("dosa" , 50.0);
m3.putIfAbsent("burger",70.0);

System.out.println(m3);
}
}	