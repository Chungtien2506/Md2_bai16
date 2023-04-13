package xoa;

import java.io.File;

public class Main {
    public  static  void  xoaFile(File fx){
        if (fx.isFile()){
//            xoa neu la tap tin
            System.out.println("da xoa"+fx.getAbsolutePath());
            fx.delete();
        }else  if (fx.isDirectory()){
//            lay cac file con
            File[] mangCon = fx.listFiles();
            for (File f :mangCon){
//                xoa file con
                xoaFile(f);
            }
//            xoa thu muc sau khi da xoa cac file con
            System.out.println("da xoa"+fx.getAbsolutePath());
            fx.delete();

        }
    }
    public static void main(String[] args) {
        File fo = new File("D:\\MODULE_2\\Module2_bai16\\fo");
        File fo_1 = new File("D:\\MODULE_2\\Module2_bai16\\fo_1");
        File f = new File("D:\\MODULE_2\\Module2_bai16\\vidu.txt");
        fo.deleteOnExit();// xoa k duoc vi chua thu muc va tap tin
//        fo_1.deleteOnExit(); //xoa duoc vi la thu muc rong
//        f.deleteOnExit();// xoa duoc vi la tap tin
//        System.out.println(f.delete());
//         Main.xoaFile(fo);
// su dung class files
    }
}
