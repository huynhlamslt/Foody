package hcmute.edu.vn.foody_07;

public class Store {

    private String TenQuan;
    private String DiaChi;
    private String LoaiQuan;
    private int binhluan;
    private double diem;
    private double khoangcach;
    private int soanh;
    private int hinhanh;

    public Store() {
    }

    public Store(String tenQuan, String diaChi, String loaiQuan, int binhluan, double diem, double khoangcach, int soanh, int hinhanh) {
        TenQuan = tenQuan;
        DiaChi = diaChi;
        LoaiQuan = loaiQuan;
        this.binhluan = binhluan;
        this.diem = diem;
        this.khoangcach = khoangcach;
        this.soanh = soanh;
        this.hinhanh = hinhanh;
    }

    public String getTenQuan() {
        return TenQuan;
    }

    public void setTenQuan(String tenQuan) {
        TenQuan = tenQuan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getLoaiQuan() {
        return LoaiQuan;
    }

    public void setLoaiQuan(String loaiQuan) {
        LoaiQuan = loaiQuan;
    }

    public int getBinhluan() {
        return binhluan;
    }

    public void setBinhluan(int binhluan) {
        this.binhluan = binhluan;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public double getKhoangcach() {
        return khoangcach;
    }

    public void setKhoangcach(double khoangcach) {
        this.khoangcach = khoangcach;
    }

    public int getSoanh() {
        return soanh;
    }

    public void setSoanh(int soanh) {
        this.soanh = soanh;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }
}
