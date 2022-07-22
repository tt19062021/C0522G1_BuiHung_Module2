package SS15_IO_TextFile.Exercise.exercise2.controller;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        File file = new File("src/SS15_IO_TextFile/Exercise/exercise2/data/countrydata.txt");
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert fileReader != null;

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try{
            String list;
            String[] info;
            while((list = bufferedReader.readLine()) != null){
                info = list.split(",");
                System.out.println(Arrays.toString(info));
            }
            bufferedReader.close();
        }catch (IOException e){
            e.getMessage();
        }
    }
}
