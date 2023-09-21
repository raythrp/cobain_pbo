package latihan;
import java.util.Scanner;
public class PersegiPanjang {
    private float panjang;
    private float lebar;

    public PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
    }

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    public float getLuas() {
        return this.panjang * this.lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return this.lebar;
    }

    public float getPanjang() {
        return this.panjang;
    }
}
