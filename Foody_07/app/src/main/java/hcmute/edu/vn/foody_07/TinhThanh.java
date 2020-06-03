package hcmute.edu.vn.foody_07;

public class TinhThanh {
    private String Ten;
    private int Tick;
    private String Mau;

    public TinhThanh() {
    }

    public TinhThanh(String ten, int tick, String mau) {
        Ten = ten;
        Tick = tick;
        Mau = mau;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTick() {
        return Tick;
    }

    public void setTick(int tick) {
        Tick = tick;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String mau) {
        Mau = mau;
    }
}
