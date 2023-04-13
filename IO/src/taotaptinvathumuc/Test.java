package taotaptinvathumuc;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
//        lưu ý trong windows dung \\
        File folder1 = new File("D:\\MODULE_2\\Module2_bai16");
//        kiem tra xem co ton tai hay khong
        System.out.println("kiem tra "+ folder1.exists());
//        tao thu muc
//         phuong thuc-mkdir:tao 1 thu muc
        File d1 = new File("D:\\MODULE_2\\Module2_bai16\\Directory_1");
        d1.mkdir();
//        phuong thuc mkdis():tao nhieu thu muc cung luc
        File d2 = new File("D:\\MODULE_2\\Module2_bai16\\Directory_2\\Directory_3\\Directory_4");
        d2.mkdirs();
//        tao tap tin(co phan mo rong:.exe,txt,doc,xls)
        File file1= new File("D:\\MODULE_2\\Module2_bai16\\Directory_1\\vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
//            khong co quyen tao tap tin
//            o cung bi day
//            duong dan bi sai
            throw new RuntimeException(e);
        }
    }

}
