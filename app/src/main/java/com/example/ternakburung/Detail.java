package com.example.ternakburung;

public class Detail {
    private String kode;
    private String tanggal;
    private String kandang;
    private String jantan;
    private String betina;
    private int gambar;

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getBetina() {
        return betina;
    }

    public void setBetina(String betina) {
        this.betina = betina;
    }

    public String getKandang() {
        return kandang;
    }

    public void setKandang(String kandang) {
        this.kandang = kandang;
    }

    public String getJantan() {
        return jantan;
    }

    public void setJantan(String jantan) {
        this.jantan = jantan;
    }


    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
