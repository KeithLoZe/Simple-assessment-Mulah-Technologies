import java.util.HashMap;
import java.util.Map;

public class TableProcessor {

    public static void main(String[] args) {
        Map<String, Integer> tableData = new HashMap<>();
        tableData.put("A5", 5);
        tableData.put("A7", 7);
        tableData.put("A12", 12);
        tableData.put("A13", 13);
        tableData.put("A15", 15);
        tableData.put("A20", 20);

        System.out.println("Table 2:");
        System.out.printf("Category\tValue%n");
        System.out.printf("Alpha\t%d%n", tableData.get("A5") + tableData.get("A20"));
        System.out.printf("Beta\t%d%n", tableData.get("A15") / tableData.get("A7"));
        System.out.printf("Charlie\t%d%n", tableData.get("A13") * tableData.get("A12"));
    }
}