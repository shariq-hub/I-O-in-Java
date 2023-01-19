package I.O;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Scanner;

public class SomeBasics {

    public static void main(String[] args) {

        
        // Scanner scanner=new Scanner(System.in);
        // String s1=scanner.nextLine();
        //Creating or Writing the Data
         try {
        // byte[] b1=s1.getBytes();
        // OutputStream outputStream=new FileOutputStream("text1.txt",false);
        // outputStream.write(b1);
        // outputStream.flush();
        // outputStream.close();
        // scanner.close();

        //Reading the Data
        // InputStream inputStream=new FileInputStream("text1.txt");
        // byte[] b2=new byte[inputStream.available()];
        // inputStream.read(b2);
        // String s2=new String(b2);
        // System.out.println("After Read Data is "+s2);
        // inputStream.close();
        



        //ByteArrayInputStream to Read the Data
        // byte []array={1,2,3,4,5};
        // ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(array);
        // System.out.println("The Bytes Reading from the Input Stream : ");
        // for(int i=0; i<array.length; i++){
            
        //     int data=byteArrayInputStream.read();
        //     System.out.println("data : "+data);
        // }
        // byteArrayInputStream.close();


        //In ByteArrayOutputStream maintains an internal array of bytes to store the data.
        // String data = "This is a line of text inside the string.";
        // ByteArrayOutputStream out = new ByteArrayOutputStream();
        // byte[] array = data.getBytes();

        // Writes data to the output stream
        // out.write(array);

        // Retrieves data from the output stream in string format
        // String streamData = out.toString();
        // System.out.println("Output stream: " + streamData);

        // out.close();





    //Basically, the ObjectOutputStream converts Java objects into corresponding streams. This is known as serialization. Those converted streams can be stored in files or transferred through networks.

    //   Dog dog=new Dog("Labrador", "Tysonn");
    //   FileOutputStream fileOutputStream=new FileOutputStream("File.txt");
    //   ObjectOutputStream objectoutputStream=new ObjectOutputStream(fileOutputStream);
    //   objectoutputStream.writeObject(dog);

    //   FileInputStream fileInputStream=new FileInputStream("File.txt");
    //   ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
      
    //   Dog newDog=(Dog)objectInputStream.readObject();

    //   System.out.println("Dog name is "+newDog.name);
    //   System.out.println("Type is :"+newDog.breed);
    //   objectoutputStream.close();
    //   objectInputStream.close();
      
      


        } catch (Exception e) {
            System.out.println("Some Error Occurr!!"+e.getMessage());
        }
        
    }
}


class Dog implements Serializable

{
    String breed;
    String name;
    public Dog(String breed,String name){
        this.name=name;
        this.breed=breed;
    }

}
