package com.hungnt2004110032.tuan5.buoi10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hungnt2004110032.tuan4.buoi8.HangThucPham;

public class WritingObject {
    
    public static void main(String[] args) throws IOException {
        
        FileOutputStream outFile = new FileOutputStream("data.dat");
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);

        HangThucPham htp = new HangThucPham("HTP01", "Mi hao hao", 21_200, new Date(), new Date());
        HangThucPham htp2 = new HangThucPham("HTP02", "Mi gau do", 51_200, new Date(), new Date());

        List<HangThucPham> list = new ArrayList<>();
        list.add(htp);
        list.add(htp2);
        objOut.writeObject(list);

        System.out.println(htp);

        objOut.close();
        
    }
}
