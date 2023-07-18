package day06.solved;
import java.util.Arrays;
import java.util.List;

public class ConvertToList {
    
    public static void main(String[] args) {
        ConvertToList convertToList = new ConvertToList();
        convertToList.convertAndPrint();
    }
    
    String[] deptNames = new String[3];
    
    public ConvertToList() {
        deptNames[0] = "CSE";
        deptNames[1] = "EEE";
        deptNames[2] = "MECH";
    }
    
    public void convertAndPrint() {
        List<String> list = Arrays.asList(deptNames);
        System.out.println(list);
    }
}
