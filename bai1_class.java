
import java.util.Scanner;
class diem{
    private int x;
    private int y;
    public diem(){
        this.x=0;
        this.y=0;
    }
    public diem(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap x : ");
        x=sc.nextInt();
        System.out.print("nhap y : ");
        y=sc.nextInt();
        sc.close();
    }
    public void xuat(){
        System.out.println("("+x+","+y+")");
    }
    public void dichuyen(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
public class bai1_class {
    public static void main(String [] args){
        diem d1=new diem();
        System.out.print("diem luc dau : ");
        d1.xuat();
        d1.nhap();
        d1.xuat();
        Scanner dt =new Scanner(System.in);
        System.out.print("nhap muon di chuyen x ");
        int dx =dt.nextInt();
        System.out.print("nhap muon di chuyen y ");
        int dy=dt.nextInt();
        d1.dichuyen(dx,dy);
        d1.xuat();
        dt.close();
    }
    
}
