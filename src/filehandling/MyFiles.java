package filehandling;

import java.io.*;
import java.util.Scanner;

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

    public static void writeUsingOutputStream() throws IOException{
        File fl = new File("/home/aniruddha/Desktop", "my.txt");

        OutputStream os = new FileOutputStream(fl);
        os.write("HEllo from byte stream".getBytes());
        os.close();
    }

    public static void readUsingInputStream() throws  IOException{
        File fl = new File("/home/aniruddha/Desktop", "my.txt");

        InputStream is = new FileInputStream(fl);
        StringBuilder bldr = new StringBuilder();

        while(true) {
            int byt = is.read();
            if(byt == -1) {
                break;
            }else {
                bldr.append((char)byt);
            }
        }
        System.out.println(bldr.toString());
        is.close();
    }

    public static void bridgeClasses() {

        Scanner scn = new Scanner(System.in);
        int num1 = Integer.parseInt(scn.next());
        int num2 = Integer.parseInt(scn.next());

        System.out.println( " Addition is "+(num1+num2));

        Console con = System.console();
        System.out.println(con.readLine());

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

        try {
            writeUsingOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            readUsingInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        bridgeClasses();
    }
}
