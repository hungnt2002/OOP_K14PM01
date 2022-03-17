package com.hungnt2004110032.tuan5.buoi10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.hungnt2004110032.tuan4.buoi8.HangThucPham;

public class ReadingObject {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
            //1.
            FileInputStream inFile = new FileInputStream("data.dat");
    
            //2.
            ObjectInputStream objIn = new ObjectInputStream(inFile);
    
            //3. Read Object stream
           List<HangThucPham> list = (List) objIn.readObject();
    
           for (HangThucPham hangThucPham : list) {
               if(hangThucPham.getTenHang().trim().equalsIgnoreCase("Mi gau do"))
                    System.out.println(hangThucPham);
           }
    
           objIn.close();
        }
        
    }


