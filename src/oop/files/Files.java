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
        //Char stream

        try {
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



    }
}
