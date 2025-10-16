import java.util.Scanner;
class HCN{
    private int dai;
    private int rong;
    public HCN(){
        this.dai=1;
        this.rong=1;
    }    
    public HCN(int dai,int rong){
        this.dai=dai;
        this.rong=rong;
    } 
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap dai : ");
        dai=sc.nextInt();
        System.out.print("nhap rong : ");
        rong=sc.nextInt();
        sc.close();
    }
    public int ChuVi(){
        return (dai+rong)*2;
    }
    public int DienTich(){
        return dai*rong;
    }
    public void xuat(){
        System.out.println("HCN co dai: "+dai+",rong: "+rong+"chu vi :"+ChuVi()+"dien tich:"+DienTich());
    }
}
public class bai2 {
    public static void main(String [] args){
        HCN hcn=new HCN();
        hcn.nhap();
        hcn.xuat();
    }
}

