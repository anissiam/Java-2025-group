package oop.files;

import java.io.*;

public class Files {
    public static void main(String[] args) {


        // File
        File myFile = new File("myFile.txt");
      //  System.out.println(myFile.getAbsolutePath());
        if (!myFile.exists()){
            try {
                myFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //myFile.delete();
        //myFile.isFile();
        //myFile.isDirectory();

        //operation File   //read write
        ////////////////////////////////Char Stream/////////////////////////////////////////


     /*   try {
            FileReader fileReader = new FileReader(myFile);
            //System.out.println((char) fileReader.read());
            int c = fileReader.read();

            while (c!=-1){
                System.out.print((char) c);
                c = fileReader.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/


        /*char[] myChars = {'a', 'n', 'i', 's'};
        try {
           FileWriter  fileWriter = new FileWriter(myFile );
            fileWriter.write("Hello  ");
            fileWriter.write(80);
            fileWriter.write(" ");

            fileWriter.write(myChars);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/



        ////////////////////////////////Byte Stream/////////////////////////////////////////
       /* try {
            FileInputStream fileInputStream = new FileInputStream(myFile);
            int c = fileInputStream.read();
            while (c!=-1){
                System.out.print((char) c);
                c = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

*/


        /*try {
            FileOutputStream fileOutputStream = new FileOutputStream(myFile);
            byte[] mytext = "Hello from java class".getBytes();
            fileOutputStream.write(mytext);
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

/// //////////////////////////Object Stream/////////////////////////////////////

        try {
            FileInputStream fileInputStream = new FileInputStream(myFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person person = (Person) objectInputStream.readObject();
            System.out.println(person.toString());

            objectInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



      /*  Person person = new Person("Anis", 32, "male");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(myFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


    }
}
