
package Bai1;

import java.util.ArrayList;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<PhuongTienDiChuyen> list=new ArrayList<>();
        list.add(new MayBay("Xang","May Bay",new HangSanXuat("Boeing","USA")));
        list.add(new XeOto("Xang","Oto",new HangSanXuat("Vinmart","VietNam")));
        list.add(new XeDap("Xe Dap",new HangSanXuat("Thong Nhat","VietNam")));
        double max=list.get(0).layVanToc();
        for(int i=0;i<list.size();i++){
           max=Math.max(list.get(i).layVanToc(), max);
        }
        for(int i=0;i<list.size();i++){
           if(max==list.get(i).layVanToc()){
               System.out.println("Loaiphuong tien co van toc lon nhat:\n"+list.get(i));
           }
        }
    }
}
