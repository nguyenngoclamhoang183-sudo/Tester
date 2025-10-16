import java.util.Scanner;
class songuyen{
    public int value;
    public songuyen(){
        this.value=1;
    }
    public songuyen(int x){
        this.value=x;
    }
    public songuyen(songuyen d){
        value=d.value;
    }
    public boolean sochan(){
        return value%2==0;
    }
    public boolean isprime(int value){
        if (value <= 1) return false;
        for(int i=2;i<=Math.sqrt(value);i++){
            if(value%i==0)
                return false;
        }
        return true;
    }
    public void xuat(){
        System.out.println("gia tri : "+value);
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        value=sc.nextInt();
        sc.close();
    }
    public int giatri(){
        return value;
    }
    public void tongN(){
        int tong=0;
        for(int i=1;i<=value;i++){
            System.out.print(+i);
            tong=tong+i;
        }
        System.out.println("\ntong la "+tong);
    }
    public int tongchan(){
        int tong =0;
        for(int i=1;i<=value;i++){
            if(i%2==0){
                System.out.print(+i);                   
                tong=tong+i;
            }
        }
        
        return tong;
    }
    public int tongle(){
        int tong =0;
        for(int i=1;i<=value;i++){
            if(i%2!=0){                    
                
                tong=tong+i;
            }
        }
        return tong;
    }
    public int tongngto(){
            int tong =0;
            for(int i=1;i<=value;i++){
                if(isprime(i)){
                    tong=tong+i;
                }
            }
            return tong;
        }
    public void N_nguyento(){
        int temp=2;            
        int i=1;
        while(i<=value){
            if(isprime(temp)){
                System.out.print(+temp);
                i++;
            }
            temp++;
        }
    }
    public int getSonguyen(){
        return value;
    }
    public void setSonguyen(int x){
        this.value=x;
    }
}
public class bai6 {
    public static void main(String [] args){
        System.out.print("nhap gia tri ");
        songuyen a=new songuyen();
        a.nhap();
        a.xuat();    
        System.out.println("tong chan la ="+a.tongchan());
        System.out.println("tong le la ="+a.tongle());
        System.out.println("\ntong chan la ="+a.tongngto());
        a.N_nguyento();
    }
}
