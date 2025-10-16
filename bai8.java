    import java.util.Scanner;
    class chuoi{
        private Scanner sc=new Scanner(System.in);
        private String s;
        public chuoi(){
            this.s=("");
        }
        public chuoi(String s){
            this.s=s;
        }
        public chuoi(chuoi d){
            s=d.s;
        }
        public void nhap(){
            
            System.out.print("nhap chuoi :");
            s=sc.nextLine();
        }
        public void xuat(){
            System.out.println("chuoi la "+s);
        }
        public void tungtu(){
            int dem;
            if(s==null||s.trim().isEmpty()){
                dem=0;
            }
            else 
                dem=1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '&& i<s.length()-1 && s.charAt(i+1)!=' '){
                    dem++;
                }         
            }
            System.out.println("so luong tu : "+dem);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=' ')
                    System.out.print(s.charAt(i));
                else
                    System.out.print("\n");
            }
            System.out.print("\n");
        }
        public void vitrik(int k){
            String left=s.substring(0,k);
            System.out.println(left);
            String right=s.substring(s.length()-k);
            System.out.println(right);
        }
        public void vitrintoik(int k,int n){
            int temp=1;
            while(temp<=n){
                System.out.print(s.charAt(k-1));
                k++;
                temp++;
            }
        }
    public void xoakhoangtrang() {
    s = s.trim();                   
    s = s.replaceAll("\\s+", " ");  
    System.out.println("Chuoi sau khi xoa khoang trang thua: " + s);
    }
    public String getChuoi() {
        return s;
    }
    public void setChuoi(String x) {
        this.s=x;
    }
}
    
    public class bai8 {
        public static void main(String []args){
            chuoi a=new chuoi();
            a.nhap();
            a.xuat();
            a.xoakhoangtrang();
            a.tungtu();
            Scanner cin=new Scanner(System.in);
            System.out.print("nhap k ");
            int k=cin.nextInt();
            a.vitrik(k);
            System.out.print("nhap x ");
            int x=cin.nextInt();
            a.vitrintoik(k, x);
            cin.close();
        }
    }
