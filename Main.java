public class Main{
 public static void main(String[] args){
  Database db=new Database();
  db.createTable("employee");
  db.insert("employee","1|John|50000");
  db.selectAll("employee");
 }
}
