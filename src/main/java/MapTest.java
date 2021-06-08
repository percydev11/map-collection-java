import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        //Print all entries
        System.out.println(staff);

        //Remove an entry
        staff.remove("567-24-2546");

        //Replace an entry
        staff.put("456-62-5527", new Employee("Francesca Miller"));

        //Look up a value
        System.out.println(staff.get("157-62-7935"));

        //Iterate through all entries
        for(Map.Entry<String, Employee> entry : staff.entrySet()){
            String key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println("key= " + key + ", value= " + value.getName());
        }
    }
}
