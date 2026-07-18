import java.util.*;
public class Database{
 private final Map<String,List<String>> tables=new HashMap<>();
 public void createTable(String n){tables.putIfAbsent(n,new ArrayList<>());}
 public void insert(String t,String row){tables.get(t).add(row);}
 public void selectAll(String t){for(String r:tables.getOrDefault(t,List.of()))System.out.println(r);}
}
