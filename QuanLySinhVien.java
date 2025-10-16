import java.util.Scanner;
class QuanLySinhVien {
    public void menu(){
        DSSV ds = new DSSV(); 
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("========= MENU =========");
            System.out.println("1. Xem DSSV");
            System.out.println("2. Them SV");
            System.out.println("3. Xoa SV");
            System.out.println("4. Sua thong tin SV");
            System.out.println("5. Tim kiem");
            System.out.println("6. Thong ke");
            System.out.println("7. Nhap");
            System.out.println("8. Thoat/Nghi");
            System.out.print("Moi ban chon (1-7): ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    ds.xuat();
                    break;
                case 2:
                    ds.them();
                    break;
                case 3:
                    ds.Xoa();
                    break;
                case 4:
                    ds.Sua();
                    break;
                case 5:
                    int chon;
                    do{
                        System.out.println("ban muon tim kiem ");
                        System.out.println("1. Ho");
                        System.out.println("2. Ten");
                        System.out.println("3. Ma");
                        System.out.println("4. Ngay thang nam sinh");
                        System.out.println("nhap 0 de ket thuc");
                        chon=sc.nextInt();
                        sc.nextLine();
                        switch (chon){
                            case 1:
                                ds.TimKiemHo();
                                break;
                            case 2:
                                ds.TimKiemTen();
                                break;
                            case 3:
                                ds.TimKiemMa();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("lua chon ko hop le");
                        }
                    }while(chon!=0);
                    break;
                case 6:
                    ds.ThongKeGioiTinh();
                    ds.ThongKeTuoi();
                    break;
                case 7:
                    ds.nhap();
                    break;
                case 8:
                    System.out.println("thoat chuong trinh");
                    break;
                default:
                    System.out.println("lua chon ko hop le");
            }
            System.out.println();
        }while (choice!=8);
        sc.close();
    }
}

