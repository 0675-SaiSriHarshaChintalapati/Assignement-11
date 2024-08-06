import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\sai.sri\\IdeaProjects\\Assignement-11\\ReadAndWriteFile\\src\\Source.txt");
        String s = "";
        try {
            FileReader sr=new FileReader(file);
            BufferedReader abc = new BufferedReader(sr);
            while((s=abc.readLine())!=null){
                System.out.println(s);
            }
        } catch (Exception e){
            System.out.println("Exception caught"+e.getMessage());
        }
        
    }
}