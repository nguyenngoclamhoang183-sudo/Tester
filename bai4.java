
import java.util.Scanner;
class sinhvien{
    private String msv;
    private String ho;
    private String ten;
    private String lop;
    private int diem1;
    private int diem2;
    private int diem3;
    public sinhvien() {
        this.msv = "";
        this.ho = "";
        this.ten = "";
        this.lop = "";
        this.diem1 = 0;
        this.diem2 = 0;
        this.diem3 = 0;
    }
    public sinhvien(String msv, String ho, String ten, String lop,
                    int diem1, int diem2, int diem3) {
        this.msv = msv;
        this.ho = ho;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
     public sinhvien(sinhvien sv) {
        this.msv = sv.msv;
        this.ho = sv.ho;
        this.ten = sv.ten;
        this.lop = sv.lop;
        this.diem1 = sv.diem1;
        this.diem2 = sv.diem2;
        this.diem3 = sv.diem3;
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap ten : ");
        ten=sc.nextLine();
        System.out.print("nhap ho : ");
        ho=sc.nextLine();
        System.out.print("nhap msv : ");
        msv=sc.nextLine();
        System.out.print("nhap lop : ");
        lop=sc.nextLine();
        System.out.print("nhap diem 1 : ");
        diem1=sc.nextInt();
        System.out.print("nhap diem 2 : ");
        diem2=sc.nextInt();
        System.out.print("nhap diem 3 : ");
        diem3=sc.nextInt();
        sc.close();
    }

    public void dtb(){
        float dtb= (float)(diem1+diem2+diem3)/3;
        System.out.println("DTB: "+dtb);
    }
    public void rank(){
        float diemtb=(float)(diem1+diem2+diem3)/3;
        if(diemtb>8)
            System.out.println("hsg");
        else if(diemtb>5)
            System.out.println("hsk");
        else 
            System.out.println("hstb");
    }
    public void xuat(){
       System.out.println("msv: " + msv +
                    "\n ho ten: " + ten +
                   "\n ho ten: " + ten +
                   "\n lop: " + lop +
                   "\n diem 1: " + diem1 +
                   "\n diem 2: " + diem2 +
                   "\n diem 3: " + diem3);
    }
    public String getHo(){
        return ho;
    }
    public void setHo(String x){
        this.ho=x;
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String x){
        this.ten=x;
    }
    public String getMssv(){
        return msv;
    }
    public void setMssv(String x){
        this.msv=x;
    }
    public String getLop(){
        return lop;
    }
    public void setX(String x){
        this.lop=x;
    }
    public int getDiem1(){
        return diem1;
    }
    public void setDiem1(int x){
        this.diem1=x;
    }
    public int getDiem2(){
        return diem2;
    }
    public void setDiem2(int x){
        this.diem2=x;
    }
    public int getDiem3(){
        return diem3;
    }
    public void setDiem3(int x){
        this.diem3=x;
    }

}
public class bai4 {
    public static void main (String [] args){
        sinhvien sv=new sinhvien();
        sv.nhap();
        sv.xuat();
        sv.rank();
    }
}
