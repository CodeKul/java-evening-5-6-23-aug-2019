package filehandling;

import java.io.*;

public class MyFiles {

    public void fileInfo() {
        File file = new File("/home/aniruddha/Desktop/my.txt");
        System.out.println("Is Available "+file.exists());
        System.out.println("Is File "+file.isFile());

        File flDsk = new File("/home/aniruddha/Desktop/");
        if(flDsk.isDirectory()) {
           File[] desktopFiles =  flDsk.listFiles();
           for( File fl : desktopFiles) {
               File f = new File(
                       flDsk,
                       ""+System.currentTimeMillis() +".txt"
               );
               try {
                   f.mkdir();
               } catch (Exception e) {
                   e.printStackTrace();
               }

               System.out.println(
                        (fl.isDirectory() ?  " * "+fl.getName() : " - " + fl.getName())
               );
               System.out.println( " File Size - " + (fl.length()));
           }
        }
    }


    public void writeUsingWriter() throws IOException {
        File fl = new File("/home/aniruddha/Desktop", "my.txt");

        Writer writer = new FileWriter(fl);
        writer.write("Hi this is codekul java class, file handling session");
        writer.close();
    }

    public void readUsingReader() throws IOException {
        File fl = new File("/home/aniruddha/Desktop", "my.txt");

        char []arr = new char[(int) fl.length()];
        Reader reader = new FileReader(fl);
        reader.read(arr);
        reader.close();

        System.out.println("File Data is "+new String(arr));
    }

    public static void main(String[] args) {

        MyFiles files = new MyFiles();
//        files.fileInfo();
//
        try {
            files.writeUsingWriter();
            files.readUsingReader();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
