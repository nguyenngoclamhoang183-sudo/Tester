import java.util.Scanner;
import java.util.Arrays;
class mang{
    Scanner sc=new Scanner(System.in);
    private int []a;
    private int n;
    public mang(){
        this.n=0;
        this.a=new int [0];
    }
    public mang(int n,int [] a){
        this.n = n;
        this.a=new int [n];
        for (int i = 0; i < n; i++) {
            this.a[i] =a[i];
        }
    }
    public mang(mang b){
        this.n = b.n;
        this.a = Arrays.copyOf(b.a, b.n);
    }
    public void nhap(){
        
        System.out.print("nhap n = ");
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

    }
    public void xuat(){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public int max(){
        int max=a[0];
        for(int i=1;i<n;i++){
            if(max<a[i])
                max=a[i];
        }
        return max;
    }
    public void sort(){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public int tongchan(){
        int tong=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                tong=tong+a[i];
            }
        }
        return tong;
    }
    public int tongle(){
        int tong=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                tong=tong+a[i];
            }
        }
        return tong;
    }   
    public boolean isprime(int a){
        if (a < 2) return false;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0)  
                return false;
        }
        return true;
    }
    public int tongngto(){
        int tong=0;
        for(int i=0;i<a.length;i++){
            if(isprime(a[i]))
                tong=tong+a[i];
        }
        return tong;
    } 
    public void them(int x) {
        a = Arrays.copyOf(a, a.length + 1);
        a[n]=x;       
        n++;
    }
    public void xoaphantuk(int k) {
        for (int i = k; i < n; i++) {
            a[i]=a[i+1];
        }
        a = Arrays.copyOf(a, a.length -1); 
        n--;   
    }

    public int vitri(int x){
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }
    public int[] getMang() {
    return a;
    }
    public void setMang(int[] x) {
        this.a = Arrays.copyOf(x, x.length);
        this.n = x.length;
    }
}
public class bai7 {
    public static void main(String []args){
        mang m = new mang();
        m.nhap();
        System.out.println("mang vua nhap: ");
        m.xuat();
        System.out.println("\ngia tri lon nhat: " + m.max());
        m.sort();
        System.out.println("mang sau khi sap xep: ");
        m.xuat();
        System.out.println("tong chan trong mang : "+m.tongchan());
        System.out.println("tong le trong mang : "+m.tongle());
        System.out.println("tong ngto trong mang : "+m.tongngto());
        Scanner scn=new Scanner(System.in);
        System.out.print("nhap x");
        int x=scn.nextInt();
        m.them(x);
        System.out.println("mang sau khi them");
        m.xuat();
        System.out.println("nhap k");
        int k=scn.nextInt();
        m.xoaphantuk(k);
        System.out.println("mang sau khi xoa");
        m.xuat();
        m.vitri(3);
        scn.close();
    }
}
