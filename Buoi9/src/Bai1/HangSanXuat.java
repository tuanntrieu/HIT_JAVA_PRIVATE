
package Bai1;
 
public class HangSanXuat {
    private String tenHangSanXuat;
    private String tenQuocGia;
    
    public HangSanXuat(){
        
    }

    public HangSanXuat(String tenHangSanXuat, String tenQuocGia) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }
    

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTemQuocGia() {
        return tenQuocGia;
    }

    public void setTemQuocGia(String temQuocGia) {
        this.tenQuocGia = temQuocGia;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" + "tenHangSanXuat=" + tenHangSanXuat + ", tenQuocGia=" + tenQuocGia + '}';
    }
    
    
}
