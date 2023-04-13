package laythongtinvaduyetthumuc;

import java.io.File;
import java.util.Scanner;

public class Test {
    File file;

    public Test(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThi() {
//        kiem tra file co the thuc thi
        return this.file.canExecute();
    }

    public boolean kiemTraDoc() {
//        kiem tra file co the thuc thi
        return this.file.canRead();
    }

    public boolean kiemTraGhi() {
//        kiem tra file co the thuc thi
        return this.file.canWrite();
    }

    public void inDuongDan() {
//        in duong dan
        System.out.println(this.file.getAbsolutePath());
    }

    public void inTen() {
//        in ten
        System.out.println(this.file.getName());
    }

    public void kiemTraLaiThuMucHoacTapTin() {
//        in duong dan
        if (this.file.isDirectory()) {
            System.out.println("day la thu muc");
        } else if (this.file.isFile()) {
            System.out.println("day la tap tin");

        }
    }

    public void inDanhSachCacFileCon() {
        if (this.file.isDirectory()) {
            System.out.println("cac tap tin con/thu muc con la");
            File[] mangCon = this.file.listFiles();
            for (File file1 : mangCon) {
                System.out.println(file1.getAbsolutePath());
            }
        } else if (this.file.isFile()) {
            System.out.println("day la tap tin khong co du lieu con ben trong");

        }
    }

    public void inCayThuMuc() {
        this.inChitietCayThuMuc(this.file,1);
    }

    public void inChitietCayThuMuc(File f,int bac) {
        System.out.print("|");
         for (int i = 0;i<bac;i++) {
             System.out.println("/t");
         }
        System.out.println("|___");
             System.out.println(f.getName());
             if (f.canRead()&&f.isDirectory()) {
                 File[] mangCon = f.listFiles();
                 for (File fx : mangCon) {
                     inChitietCayThuMuc(fx, bac + 1);
                 }
             }

         }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        System.out.println("Nhap ten file");
        String tenFile = sc.nextLine();
        Test vdf = new Test(tenFile);
        do {
            System.out.println("Menu");
            System.out.println("1:kiem tra file co the thuc thi");
            System.out.println("2:kiem tra file co the doc");
            System.out.println("3:kiem tra file co the ghi");
            System.out.println("4:in duong dan");
            System.out.println("5:in ten file");
            System.out.println("6:kiem tra file la thu muc hoac tap tin");
            System.out.println("7:in ra danh sach cac file con");
            System.out.println("8:in ra cay thu muc");
            System.out.println("0:thoat khoi chuong trinh");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    System.out.println(vdf.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println(vdf.kiemTraDoc());
                    break;
                case 3:
                    System.out.println(vdf.kiemTraGhi());
                    break;
                case 4:
                    vdf.inDuongDan();
                    break;
                case 5:
                    vdf.inTen();
                    break;
                case 6:
                    vdf.kiemTraLaiThuMucHoacTapTin();
                    break;
                case 7:
                    vdf.inDanhSachCacFileCon();
                    break;
                case 8:
                    vdf.inCayThuMuc();
                    break;
                default:
                    break;
            }
            sc.nextLine();
        } while (luachon != 0);
    }
}
