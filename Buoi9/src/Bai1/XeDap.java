
package Bai1;

public class XeDap extends PhuongTienDiChuyen{

    public XeDap(){
        
    }

    public XeDap(String loaiPhuongTien, HangSanXuat hagSanXuat) {
        super(loaiPhuongTien, hagSanXuat);
    }

    @Override
    public String toString() {
        return "XeDap{" +super.toString()+ ", Van toc: "+this.layVanToc()+"km/h }";
    }
    
    @Override
    public double layVanToc() {
        return 5f;
    }
    
}
