import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sai.sri\\IdeaProjects\\Assignement-11\\WordCount\\src\\Input.txt");
        ArrayList<String> str = new ArrayList<>();
        Map<String,Integer> a=new HashMap<>();
        try {
            FileReader abc=new FileReader(file);
            BufferedReader br = new BufferedReader(abc);
            String s;
            while ((s = br.readLine()) != null) {
                str.add(s);
            }
        } catch (IOException e) {
            System.out.println("No Words in the Input File.");
        }
        for (String i : str) {
            if(a.containsKey(i))
                a.put(i,a.get(i)+1);
            else
                a.put(i,1);
        }
        for(Map.Entry<String,Integer> c:a.entrySet()){
            System.out.println(c.getKey()+"--> "+c.getValue());
        }
    }
}