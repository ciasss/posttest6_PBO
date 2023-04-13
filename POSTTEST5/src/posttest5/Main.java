/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest5;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Lagu> arrPlaylist = new ArrayList<Lagu>();
        Scanner input=new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("     ♪♬ WELCOME TO MUSIC APP ♪♬   ");
        System.out.println("====================================");
        System.out.println("Masukkan Nama Playlist: ");
        String namaPlaylist = input.nextLine();
        boolean tes=true;
        while(tes){
            System.out.println("====================================");
            System.out.println("\tPLAYLIST "+namaPlaylist);
            System.out.println("====================================");
            System.out.println("[1] Tambah Lagu");
            System.out.println("[2] Hapus Lagu");
            System.out.println("[3] Daftar Lagu Playlist "+namaPlaylist);
            System.out.println("[4] Putar Playlist");
            System.out.println("[5] Exit");
            System.out.println("====================================");
            System.out.println("Masukkan Pilihan: ");
            int pilihan=input.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.println("====================================");
                    System.out.println("     ♪♬ Tambah Lagu Playlist ♪♬   ");
                    System.out.println("====================================");
                    System.out.println("Masukkan judul lagu: ");
                    input.nextLine();
                    String jdlLagu=input.nextLine();
                    System.out.println("Masukkan nama penyanyi: ");
                    String penyanyi=input.nextLine();
                    do{
                        try{
                            System.out.println("Masukkan durasi: ");
                            String durasi=input.nextLine();
                        }catch (InvalidDurasiException invalidDurasi{
                            System.out.print(invalidDurasi.toString());
                            System.out.print("Masukkan durasi dengan format \"menit:detik\".\n");
                        }
                    }
                    
                    do{
                        try{
                            System.out.println("Masukkan rating(1-5): ");
                            String rating=input.nextLine();
                        }catch (InvalidRatingException invalidRating{
                            System.out.print(invalidRating.toString());
                        }
                    }
                    
                    Lagu objLagu = new Lagu(jdlLagu,penyanyi, durasi, rating);
                    arrPlaylist.add(objLagu);
                    System.out.println("\nlagu '"+jdlLagu+"' telah ditambahkan ke playlist "+namaPlaylist+"...\n");
                    break;
                case 2:
                    if(arrPlaylist.size() == 0){
                        System.out.println("Tidak ada lagu dalam playlist "+namaPlaylist+" yang tersedia...");
                        break;
                    }
                    else{
                        System.out.println("====================================");
                        System.out.println("        Daftar Lagu Playlist        ");
                        System.out.println("====================================");
                        System.out.println("Judul\tPenyanyi\tDurasi\tRating");
                        System.out.println("====================================");
                        for(Lagu i:arrPlaylist){ 
                            i.tampilLagu();
                        }
                        System.out.println("\nMasukkan urutan lagu yang ingin di hapus: ");
                        int inputUrutan=input.nextInt();
                      
                        if(inputUrutan<=0 || inputUrutan>arrPlaylist.size())
                        {
                            System.out.println("Lagu yang dimasukkan tidak ada!!!");
                        }else{
                        arrPlaylist.remove(inputUrutan-1);
                        System.out.println("Lagu telah terhapus...");
                        }
                        break;
                    }
                       
                case 3:
                    if(arrPlaylist.size()==0){
                        System.out.println("Tidak ada lagu dalam playlist "+namaPlaylist+" yang tersedia...");
                        break;
                    }else{
                        System.out.println("====================================");
                        System.out.println("        Daftar Lagu Playlist        ");
                        System.out.println("====================================");
                        System.out.println("Judul\tPenyanyi\tDurasi\tRating");
                        System.out.println("====================================");
                        for(Lagu i:arrPlaylist){
                            i.tampilLagu();
                        }
                        break;
                    }
                case 4: 
                    if(arrPlaylist.size()==0){
                        System.out.println("Tidak ada lagu dalam playlist "+namaPlaylist+" yang tersedia...");
                        break;
                    }
                    else{
                        System.out.println("====================================");
                        System.out.println("        Daftar Lagu Playlist        ");
                        System.out.println("====================================");
                        System.out.println("Judul\tPenyanyi\tDurasi\tRating");
                        System.out.println("====================================");
                        for(Lagu i:arrPlaylist){ 
                            i.tampilLagu();
                        }
                        System.out.println("\n~~Lagu yang sedang diputar~~");
                        arrPlaylist.get(0).tampilLagu();
                        ListIterator<Lagu> j=arrPlaylist.listIterator();//This is iterator and helps us to iterate to a linked list.
                        j.next();
                        boolean forward=true;
                        boolean finished=false; 
                        boolean Tess=true;
                        while(Tess){
                            System.out.println("====================================");
                            System.out.println("    [1] Putar lagu selanjutnya");
                            System.out.println("    [2] Putar lagu sebelumnya");
                            System.out.println("    [3] Putar ulang lagu");
                            System.out.println("    [4] Stop playlist");
                            System.out.println("====================================");
                            System.out.println("Masukkan pilihan: ");
                            
                            int pilihann = input.nextInt();
                            switch(pilihann){
                                case 1:
                                    if(!forward){
                                        if(j.hasNext()){
                                            j.next();
                                        }
                                        forward=true;
                                    }
                                    if(finished==true){
                                        j.previous();
                                        finished=false;
                                    }
                                    if(j.hasNext()){
                                    System.out.println("Lagu sedang diputar...");
                                    j.next().tampilLagu();
                                    }else{
                                        System.out.println("Playlist telah selesai....");
                                        finished=true;
                                    }
                                    break;
                                case 2:  
                                    if(forward){
                                        if(j.hasPrevious()){
                                            j.previous();
                                        }
                                    forward=false;
                                    }
                                    if(finished==true){
                                        j.next();
                                        finished=false;
                                    }
                                    if(j.hasPrevious()){
                                        System.out.println("Lagu sedang diputar...");
                                        j.previous().tampilLagu();
                                    }else{
                                        System.out.println("Playlist telah selesai....");
                                        finished=true;
                                    }
                                    break;
                                case 3:
                                    if(forward){
                                        System.out.println("Lagu diputar kembali...");
                                        j.previous().tampilLagu();
                                        forward=false;
                                    }
                                    if(!forward){   
                                        System.out.println("Lagu diputar kembali...");
                                        j.next().tampilLagu();
                                        forward=true;
                                    } 
                                    break;
                                case 4:
                                    System.out.println("Playlist berhenti...");
                                    Tess=false;
                                    break;
                                default:
                                    System.out.println("Masukkan pilihan dengan benar!!! Masukkan ulang inputan!");
                                    Tess=true;
                                    break;
                            }   
                        }
                    }
                    break;
            case 5:
                System.out.println("*************************************");
                System.out.println("`~~~~~~~~~~PROGRAM SELESAI~~~~~~~~~~~");
                System.out.println("*************************************");
                tes=false;
                break;
            default:
                System.out.println("Masukkan pilihan dengan benar!!! Masukkan ulang inputan!");
                tes=true;
                break;          
            }
        }
    }
    
}
