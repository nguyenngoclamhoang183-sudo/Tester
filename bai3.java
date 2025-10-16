import java.util.Scanner;
class Htron{
    private int dai;
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap r : ");
        dai=sc.nextInt();
        sc.close();
    }
    public double chuvi(){
        return dai*2*3.14;
    }
    public double dientich(){
        return dai*dai*3.14;
    }
    public void xuat(){
        System.out.println("hinh trong co r: "+dai+"chu vi :"+chuvi()+"dien tich:"+dientich());
    }
}
public class bai3 {
    public static void main(String [] args){
        Htron htron=new Htron();
        htron.nhap();
        htron.xuat();
    }
}

