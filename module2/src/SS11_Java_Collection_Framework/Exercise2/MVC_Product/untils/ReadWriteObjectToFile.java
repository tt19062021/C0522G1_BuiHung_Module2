package SS11_Java_Collection_Framework.Exercise2.MVC_Product.untils;

import SS11_Java_Collection_Framework.Exercise2.MVC_Product.model.Product;
import SS16_IO_BinaryFile_Serialization.Pratice.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteObjectToFile {
    public static void writeToFile(String path, List<Product> products){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path){

        List<Product> products = null;
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
