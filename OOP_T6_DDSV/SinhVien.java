import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDate;
class SinhVien {
    Scanner sc=new Scanner(System.in);
    String ma;
    String ho;
    String ten;
    String gioitinh;
    String ngaysinh;
    int tuoi;
    public SinhVien() {
        this.ma = "";
        this.ho = "";
        this.ten = "";
        this.gioitinh = "";
        this.ngaysinh="";
    }
    public SinhVien(String ma,String ho,String ten,String gioitinh,int age,String ngaysinh){
        this.ma=ma;
        this.ho=ho;
        this.ten=ten;
        this.gioitinh=gioitinh;
        this.ngaysinh=ngaysinh;
    }
    public SinhVien(SinhVien a){
        this.ma=a.ma;
        this.ho=a.ho;
        this.ten=a.ten;
        this.gioitinh=a.gioitinh;
        this.ngaysinh=a.ngaysinh;
    }
    public void nhap(){
        System.out.print("nhap ma ");
        ma=sc.nextLine();
        System.out.print("nhap ho ");
        ho=sc.nextLine();
        System.out.print("nhap ten ");
        ten=sc.nextLine();
        System.out.print("nhap gioi tinh ");
        gioitinh=sc.nextLine();
        System.out.print("nhap ngay sinh ");
        ngaysinh=sc.nextLine();
        tuoi=Age(ngaysinh);
    }
    public void xuat() {
        System.out.printf("%-10s %-10s %-10s %-10s %-5d %-12s \n",
                      ma, ho, ten, gioitinh,Age(ngaysinh),ngaysinh);
        
    }

    public int Age(String namsinh){
        String[] parts = namsinh.split("/");
        int year = Integer.parseInt(parts[2]);
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;
        return age;
    }

    public String getMa(){
        return ma;
    }
    public void setMa(String ma){
        this.ma=ma;
    }
    public String getHo(){
        return ho;
    }
    public void setHo(String ho){
        this.ho=ho;
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten=ten;
    }
    public String getGioiTinh(){
        return gioitinh;
    }
    public void setGioiTinh(String gioitinh){
        this.gioitinh=gioitinh;
    }
    public String getNgaySinh(){
        return ngaysinh;
    }
    public void setNgaySinh(String ngaysinh){
        this.ngaysinh=ngaysinh;
    }
}
