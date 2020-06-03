package hcmute.edu.vn.foody_07;

public class Food {

    private String Tenmon;
    private String Mota;
    private int Hinhanh;

    public Food() {

    }

    public Food(String tenmon, String mota, int hinhanh) {
        Tenmon = tenmon;
        Mota = mota;
        Hinhanh = hinhanh;
    }

    public String getTenmon() {
        return Tenmon;
    }

    public void setTenmon(String tenmon) {
        Tenmon = tenmon;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public int getHinhanh() {
        return Hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        Hinhanh = hinhanh;
    }
}
