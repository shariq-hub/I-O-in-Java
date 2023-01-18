package I.O;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import javafx.css.StyleableStringProperty;

public class SomeBasics {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Write Something : ");
        String data=scanner.nextLine();
        scanner.close();
        try {
            //Writing or creating a File
            byte[] b=data.getBytes();
            OutputStream outputStream=new FileOutputStream("text1.txt");
            outputStream.write(b);
            outputStream.flush();
            outputStream.close();

            //Reading a File
            
            InputStream inputStream=new FileInputStream("text1.txt");
            byte [] b1=new byte[inputStream.available()];
            System.out.println("Data inside this file: "+inputStream.available());
            inputStream.read(b1);
            String s1=new String(b1);
            System.out.println("Data Read From the File :"+s1);
            inputStream.close();

            




        } catch (Exception e) {
        }
    }
    }



