import java.util.Arrays;
import java.util.Scanner;
class DSSV{
    private Scanner cin=new Scanner(System.in);
    private SinhVien []sv;
    public int n;
    public DSSV(){
        this.n=0;
        this.sv=new SinhVien [0];
    }
    public DSSV(SinhVien []a,int n){
        this.n=n;
        this.sv=new SinhVien [n];
        for(int i=0;i<n;i++)
            this.sv[i]=a[i];
    }
    public void nhap(){
        System.out.print("nhap n = ");
        n=cin.nextInt();
        sv=new SinhVien[n];
        for(int i=0;i<n;i++){
            sv[i]=new SinhVien();
            sv[i].nhap();
        }
    }
    public void xuat() {
        System.out.printf("%-10s %-10s %-10s %-10s %-5s %-10s\n", "Ma", "Ho", "Ten", "Gioi tinh", "Tuoi","Ngay sinh");
        for(int i=0; i<n; i++){
            sv[i].xuat();
        }
    }

    //THEM SV
    public void them(){
        sv=Arrays.copyOf(sv,n+1);
        sv[n]=new SinhVien();
        sv[n].nhap();
        n++;
    }
    public void them(SinhVien sv1){
        n=sv.length;
        sv=Arrays.copyOf(sv,n+1);
        sv[n]=new SinhVien(sv1);
        n++;
    }
    //TIM KIEM MA SV
    public void TimKiemMa(){
        System.out.print("nhap ma : ");
        String find=cin.next();
        SinhVien kq=TimKiemMaDS(find);
        if(kq!=null){
            System.out.println("tim thay sinh vien ma :"+find);
        }
        else{
            System.out.println("khong tim thay ma sinh vien "+find);
        }
    }
    public SinhVien TimKiemMaDS(String sv1){
        for(int i=0;i<n;i++){
            if(sv[i].ma.equalsIgnoreCase(sv1))
                return sv[i];
        }
        return null;
    }
    //Tim kiem tra ve chi so
    public int timkiem(String sv1){
        for(int i=0;i<n;i++){
            if(sv[i].ma.equalsIgnoreCase(sv1)) {
                return i;
            }
        }
        return -1;
    }

    //TIM KIEM HO SV
    public void TimKiemHo(){
        System.out.print("nhap ho : ");
        String find=cin.next().trim();
        SinhVien []kq=TimKiemHoDS(find);
        if(kq.length>0){
            System.out.println("tim thay sinh vien ho :"+find);
            System.out.printf("%-10s %-10s %-10s %-10s %-5s %-12s\n",
                          "Ma", "Ho", "Ten", "Gioi tinh", "Tuoi","Ngay sinh");
            for(SinhVien svfind:kq)
                svfind.xuat();
        }
        else{
            System.out.println("khong tim thay ho sinh vien "+find);
        }
    }
    public SinhVien[] TimKiemHoDS(String ho){
        int k=0;
        SinhVien [] DanhsachHo=new SinhVien[0];
        for(int i=0;i<sv.length;i++){
            if(sv[i].ho.equalsIgnoreCase(ho)){
                DanhsachHo=Arrays.copyOf(DanhsachHo,k);
                DanhsachHo[k]=sv[i];
                k++;
            }
        }
        return DanhsachHo;
    }
    //TIM KIEM TEN SV
    public void TimKiemTen(){
        System.out.print("nhap ten : ");
        String find=cin.next().trim();
        SinhVien []kq=TimKiemTen(find);
        if(kq.length>0){
            System.out.println("tim thay sinh vien ten :"+find);
            System.out.printf("%-10s %-10s %-10s %-10s %-5s %-12s\n",
                          "Ma", "Ho", "Ten", "Gioi tinh", "Tuoi","Ngay sinh");
            for(SinhVien svfind:kq)
                svfind.xuat();
        }
        else{
            System.out.println("khong tim thay ten sinh vien "+find);
        }
    }
    public SinhVien[] TimKiemTen(String s){
        int n=0;
        SinhVien [] DanhsachTen=new SinhVien[0];
        for(int i=0;i<sv.length;i++){
            if(sv[i].ten.equalsIgnoreCase(s)){
                n++;
                DanhsachTen=Arrays.copyOf(DanhsachTen,n);
                DanhsachTen[n-1]=sv[i];
            }
        }
        return DanhsachTen;
    } 
    //XOA SV
    public void Xoa() {
        System.out.print("Nhap ma sinh vien muon xoa: ");
        int k=-1;
        String find=cin.next();
        for (int i=0;i<n;i++) {
            if (sv[i].ma.equalsIgnoreCase(find)) {
                k=i;
                break;
            }
        }
        if (k==-1) {
            System.out.println("Khong tim thay sinh vien co ma: " + find);
            return;
        }
        for (int i=k;i<n-1;i++) {
            sv[i]=sv[i+1];
        }
        n--;
        sv = Arrays.copyOf(sv, n);
        System.out.println("Da xoa sinh vien co ma: " + find);
    }
    public void Xoa(String ma){
        int k=-1;
        for (int i=0;i<n;i++) {
            if (sv[i].ma.equalsIgnoreCase(ma)) {
                k=i;
                break;
            }
        }
        if (k==-1) {
            System.out.println("Khong tim thay sinh vien co ma: "+ma);
            return;
        }
        for (int i=k;i<n-1;i++) {
            sv[i]=sv[i+1];
        }
        n--;
        sv = Arrays.copyOf(sv, n);
        System.out.println("Da xoa sinh vien co ma: " +ma);
    }

    //Sua SV
    public void Sua() {
        System.out.print("Nhap ma sinh vien muon sua: ");
        int k=-1;
        String find=cin.next();
        for (int i=0;i<n;i++) {
            if (sv[i].ma.equalsIgnoreCase(find)) {
                k=i;
                break;
            }
        }
        if (k==-1) {
            System.out.println("Khong tim thay sinh vien co ma: " + find);
            return;
        }
        sv[k].nhap();
    }
    public void SuaTS(String s) {
        int k=-1;
        for (int i=0;i<n;i++) {
            if (sv[i].ma.equalsIgnoreCase(s)) {
                k=i;
                break;
            }
        }
        if (k==-1) {
            System.out.println("Khong tim thay sinh vien co ma: "+s);
            return;
        }
        sv[k].nhap();
    }
    public void ThongKeGioiTinh(){
        int nam =0,nu = 0;
        for(int i=0;i<n;i++){
            if(sv[i].gioitinh.equalsIgnoreCase("nam")){
                nam++;
            }
            else{
                nu++;
            }
        }
        System.out.println("so luong nam la : "+nam);
        System.out.println("so luong nu la : "+nu);
    }
    
    public int[] ThongKeTuoi(){
        int [] tuoi=new int[8];
        for(int i=0;i<n;i++){
            tuoi[25-sv[i].tuoi]++;
        }
        for(int i = 0 ; i < 8 ; i++){
                System.out.println("so luong hoc sinh co do tuoi "+(25 - i) + " : " + tuoi[i] + "hoc sinh");
        }
        return tuoi;
    }
}

