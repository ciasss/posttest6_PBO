/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

public class Lagu {
    private String Judul;
    private String Penyanyi;
    private String Durasi;
    private String Rating;
    
    public Lagu(String Judul, String Penyanyi, String Durasi, String Rating) {
        this.Judul = Judul;
        this.Penyanyi = Penyanyi;
        this.Durasi = Durasi;
        this.Rating = Rating;
    }
    public void tampilLagu(){
        System.out.println(this.getJudul()+"\t\t"+this.getPenyanyi()+"\t\t"+this.getDurasi()+"\t\t"+this.getRating());
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getPenyanyi() {
        return Penyanyi;
    }

    public void setPenyanyi(String Penyanyi) {
        this.Penyanyi = Penyanyi;
    }

    public String getDurasi() {
        return Durasi;
    }

    public void setDurasi(String Durasi) {
        this.Durasi = Durasi;
    }
    
    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }
}