import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BufferedReader str= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите число персон");
        int k =sc.nextInt();
        String[] sss = new String[k];
        Person man = new Person();
        for (int i =0; i<k; i++) {
            String l = str.readLine();
            sss[i] = man.email+" "+man.login+" "+man.password+" "+man.age;
            System.out.println(sss[i]);
        }


    }
}
