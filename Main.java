import java.util.*;
import java.util.Scanner;
//class 1
public class Main {
    static int x;
    static int skor;
    //main
    //method 1
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String q[] = new String[5];
        String[] a = new String[5];
        String[] b = new String[5];
        String[] c = new String[5];
        String[] ans = new String[5];
        String[] validletter = new String[3];

        validletter[0] = "a";
        validletter[1] = "b";
        validletter[2] = "c";
        //-----Question-----
        q[0]="Siapa presiden ketiga di Indonesia?";
        q[1]="Planet mana yang memiliki gravitasi paling besar?";
        q[2]="Tahun berapa film Titanic keluar?";
        q[3]="Apa kepanjangan dari HTML?";
        q[4]="'Kota Kembang' adalah sebutan untuk kota?";

        //Choice (0)
        a[0] = "Soekarno";
        b[0] = "Gusdur";
        c[0] = "BJ Habibie";
        //Choice (1)
        a[1] = "Yupiter";
        b[1] = "Uranus";
        c[1] = "Mars";
        //Choice (2)
        a[2] = "1993";
        b[2] = "1995";
        c[2] = "1997";
        //Choice (3)
        a[3] = "Hyper Text Markup Language";
        b[3] = "Hyper Text Marking Language";
        c[3] = "Hyperlinks and Text Markup Language";
        //Choice (4)
        a[4] = "Jakarta";
        b[4] = "Bandung";
        c[4] = "Surabaya";
        //Answer (0)
        ans[0] = "c";
        ans[1] = "a";
        ans[2] = "c";
        ans[3] = "a";
        ans[4] = "b";

        System.out.println(">>>>Selamat Datang di Trivia Quiz<<<<\n");
        System.out.println("Level Mudah\n");
        //loop dan kondisi
        for (x = 0; x < 5; x++) {

            try{
                System.out.println(x+1 + ". " + q[x]);
                System.out.println("A. " + a[x]);
                System.out.println("B. " + b[x]);
                System.out.println("C. " + c[x]);
                System.out.print("Masukkan Jawaban Anda: ");
                String myanswer = s.nextLine();
                System.out.print("\n");

                if (myanswer.equalsIgnoreCase("a") || myanswer.equalsIgnoreCase("b") || myanswer.equalsIgnoreCase("c")){
                    if (myanswer.equalsIgnoreCase(ans[x])){
                        skor++;

                    }

                }else if (myanswer.equalsIgnoreCase("") || myanswer.equalsIgnoreCase(" ")){
                    throw new BlankAnsException();

                }else if (myanswer.equalsIgnoreCase("0") || myanswer.equalsIgnoreCase("1") || myanswer.equalsIgnoreCase("2") || myanswer.equalsIgnoreCase("3")){
                    throw new Exception("Nomor atau Huruf Lain Tidak Valid\n");
                }

                else {
                    throw new InvalidLetterException();
                }

            } catch(InvalidLetterException ile){
                System.out.println(ile.getMessage());
                --x;

            }
            catch(BlankAnsException bae){
                System.out.println(bae.getMessage());
                --x;

            }
            catch(Exception e){
                System.out.println(e.getMessage());
                --x;

            }
        }

        int skorAkhir = 0;
        for (int i = 0; i<1; i++) // untuk melewati semua nilai
        {
            boolean salahBenar = false;
            if (skor == 10) // Jika nilainya adalah pertanyaan pertama
            {
                skorAkhir = 0;  // skorAkhir menjadi nol
            }
            else if (skor == 20 && salahBenar == false) // Jika nilai 20 dan salah menjawab
            {
                skorAkhir = 10; // Nilai terakhir adalah 0
            }
            else if (skor == 30 && salahBenar == false) // Jika nilai 30 dan salah menjawab
            {
                skorAkhir = 20; // Nilai terakhir adalah 20
            }
            else if (skor == 40 && salahBenar == false) // Jika nilai 40 dan salah menjawab
            {
                skorAkhir = 30; // Nilai terakhir adalah 50
            }
            else if (skor ==50 && salahBenar == false) // Jika nilainya 50 dan mereka salah
            {
                skorAkhir = 40; // Nilai terakhir tetap 50
            }
            else if (skor == 60 && salahBenar == false)
            {
                skorAkhir = 50;
            }
            else if (skor == 70 && salahBenar == false)
            {
                skorAkhir = 60;
            }
            else if (skor == 80 && salahBenar == false)
            {
                skorAkhir = 70;
            }
            else if (skor == 90 && salahBenar == false)
            {
                skorAkhir = 80;
            }
            else if (skor == 100 && salahBenar == false)
            {
                skorAkhir = 90;
            }
            else if (skor == 100 && salahBenar == true)
            {
                skorAkhir = 100;
            }
        }


        System.out.println("Kamu Mendapat Nilai: " + skor*20);



        if(skor*20 >= 80) {
            System.out.println(" Tekan enter untuk mulai Level Menengah");
            s.nextLine();
            Main Lvlnormal = new Main();
            Lvlnormal.Levelnormal();
        } else {
            System.out.println("Skor Anda tidak mencukupi untuk ke Level selanjutnya");
        }


        if(skor*20 >= 160) {
            System.out.println("Tekan enter untuk mulai Level Sulit");
            s.nextLine();
            Main lvlHard = new Main();
            lvlHard.Levelhard();
        }else {
            System.out.println("Skor Anda tidak mencukupi untuk ke Level selanjutnya");
        }

        if (skor*20 >= 240){
            System.out.println("Nilai anda "+ skor*20 + " Anda dinyatakan Lulus");
        } else {
            System.out.println("GAME OVER");
        }

    }




    public void Levelnormal(){
        Scanner s = new Scanner(System.in);
        String q[] = new String[5];
        String[] a = new String[5];
        String[] b = new String[5];
        String[] c = new String[5];
        String[] ans = new String[5];
        String[] validletter = new String[3];



        validletter[0] = "a";
        validletter[1] = "b";
        validletter[2] = "c";
        //-----Question-----
        q[0]="Rumah adat di Jawa Tengah adalah?";
        q[1]="Puncak tertinggi di Indonesia adalah?";
        q[2]="Bulan pertama dalam penanggalan Hijriah adalah?";
        q[3]="Wilayah di Indonesia yang tidak dilalui garis katulistiwa adalah?";
        q[4]="Event olahraga olimpiade dilaksanakan berapa tahun sekali?";

        //Choice (0)
        a[0] = "Rumah adat Joglo";
        b[0] = "Rumah adat Panggung";
        c[0] = "Rumah adat Kebaya";
        //Choice (1)
        a[1] = "Gunung Semeru";
        b[1] = "Puncak Jaya";
        c[1] = "Puncak Mandala";
        //Choice (2)
        a[2] = "Muharram";
        b[2] = "Syawal";
        c[2] = "Syaban";
        //Choice (3)
        a[3] = "Sumatera";
        b[3] = "Sulawesi";
        c[3] = "Papua";
        //Choice (4)
        a[4] = "3 Tahun Sekali";
        b[4] = "4 Tahun Sekali";
        c[4] = "5 Tahun Sekali";
        //Answer (0)
        ans[0] = "a";
        ans[1] = "b";
        ans[2] = "a";
        ans[3] = "c";
        ans[4] = "b";

        System.out.println("\n >>>>Selamat Datang di Trivia Quiz<<<<\n");
        System.out.println("Level Menengah\n");
        //loop dan kondisi
        for (x = 0; x < 5; x++) {

            try{
                System.out.println(x+1 + ". " + q[x]);
                System.out.println("A. " + a[x]);
                System.out.println("B. " + b[x]);
                System.out.println("C. " + c[x]);
                System.out.print("Masukkan Jawaban Anda: ");
                String myanswer = s.nextLine();
                System.out.print("\n");



                if (myanswer.equalsIgnoreCase("a") || myanswer.equalsIgnoreCase("b") || myanswer.equalsIgnoreCase("c")){
                    if (myanswer.equalsIgnoreCase(ans[x])){
                        skor++;

                    }

                }else if (myanswer.equalsIgnoreCase("") || myanswer.equalsIgnoreCase(" ")){
                    throw new BlankAnsException();

                }else if (myanswer.equalsIgnoreCase("0") || myanswer.equalsIgnoreCase("1") || myanswer.equalsIgnoreCase("2") || myanswer.equalsIgnoreCase("3")){
                    throw new Exception("Nomor atau Huruf Lain Tidak Valid\n");
                }

                else {
                    throw new InvalidLetterException();
                }

            } catch(InvalidLetterException ile){
                System.out.println(ile.getMessage());
                --x;

            }
            catch(BlankAnsException bae){
                System.out.println(bae.getMessage());
                --x;

            }
            catch(Exception e){
                System.out.println(e.getMessage());
                --x;

            }

        }


        System.out.println("Kamu Mendapat Nilai: " + skor*20);



    }

    public void Levelhard(){

        Scanner s = new Scanner(System.in);
        String q[] = new String[5];
        String[] a = new String[5];
        String[] b = new String[5];
        String[] c = new String[5];
        String[] ans = new String[5];
        String[] validletter = new String[3];

        validletter[0] = "a";
        validletter[1] = "b";
        validletter[2] = "c";
        //-----Question-----
        q[0]="Cagar Alam Ujung Kulon terdapat di provinsi?";
        q[1]="Pada tahun 2014, jumlah provinsi yang ada di Indonesia adalah?";
        q[2]="18:3(5-4+1)?";
        q[3]="Jaringan komputer dengan cakupan geografis paling luas hingga menjangkau pulau lain adalah?WAN";
        q[4]="Aplikasi pengolah angka yang merupakan Keluarga GNOME Office adalah?Gnumeric";

        //Choice (0)
        a[0] = "Surabaya";
        b[0] = "Solo";
        c[0] = "Banten";
        //Choice (1)
        a[1] = "33";
        b[1] = "35";
        c[1] = "34";
        //Choice (2)
        a[2] = "3";
        b[2] = "12";
        c[2] = "18";
        //Choice (3)
        a[3] = "LAN";
        b[3] = "WAN";
        c[3] = "SAN";
        //Choice (4)
        a[4] = "GNumeric";
        b[4] = "GWord";
        c[4] = "GWriter";
        //Answer (0)
        ans[0] = "c";
        ans[1] = "c";
        ans[2] = "a";
        ans[3] = "b";
        ans[4] = "a";

        System.out.println(">>>>Selamat Datang di Trivia Quiz<<<<\n");
        System.out.println("Level Sulit\n");
        //loop dan kondisi
        for (x = 0; x < 5; x++) {

            try{
                System.out.println(x+1 + ". " + q[x]);
                System.out.println("A. " + a[x]);
                System.out.println("B. " + b[x]);
                System.out.println("C. " + c[x]);
                System.out.print("Masukkan Jawaban Anda: ");
                String myanswer = s.nextLine();
                System.out.print("\n");

                if (myanswer.equalsIgnoreCase("a") || myanswer.equalsIgnoreCase("b") || myanswer.equalsIgnoreCase("c")){
                    if (myanswer.equalsIgnoreCase(ans[x])){
                        skor++;

                    }

                }else if (myanswer.equalsIgnoreCase("") || myanswer.equalsIgnoreCase(" ")){
                    throw new BlankAnsException();

                }else if (myanswer.equalsIgnoreCase("0") || myanswer.equalsIgnoreCase("1") || myanswer.equalsIgnoreCase("2") || myanswer.equalsIgnoreCase("3")){
                    throw new Exception("Nomor atau Huruf Lain Tidak Valid\n");
                }

                else {
                    throw new InvalidLetterException();
                }

            } catch(InvalidLetterException ile){
                System.out.println(ile.getMessage());
                --x;

            }
            catch(BlankAnsException bae){
                System.out.println(bae.getMessage());
                --x;

            }
            catch(Exception e){
                System.out.println(e.getMessage());
                --x;

            }
        }

        System.out.println("Kamu Mendapat Nilai: " + skor*20);

    }

    int skor (int skor, boolean salahBenar){
        int skorAkhir = 0;
        for (int i = 0; i<10; i++) // untuk melewati semua nilai
        {
            if (skor == 10) // Jika nilainya adalah pertanyaan pertama
            {
                skorAkhir = 0;  // skorAkhir menjadi nol
            }
            else if (skor == 20 && salahBenar == false) // Jika nilai 20 dan salah menjawab
            {
                skorAkhir = 10; // Nilai terakhir adalah 0
            }
            else if (skor == 30 && salahBenar == false) // Jika nilai 30 dan salah menjawab
            {
                skorAkhir = 20; // Nilai terakhir adalah 20
            }
            else if (skor == 40 && salahBenar == false) // Jika nilai 40 dan salah menjawab
            {
                skorAkhir = 30; // Nilai terakhir adalah 50
            }
            else if (skor ==50 && salahBenar == false) // Jika nilainya 50 dan mereka salah
            {
                skorAkhir = 40; // Nilai terakhir tetap 50
            }
            else if (skor == 60 && salahBenar == false)
            {
                skorAkhir = 50;
            }
            else if (skor == 70 && salahBenar == false)
            {
                skorAkhir = 60;
            }
            else if (skor == 80 && salahBenar == false)
            {
                skorAkhir = 70;
            }
            else if (skor == 90 && salahBenar == false)
            {
                skorAkhir = 80;
            }
            else if (skor == 100 && salahBenar == false)
            {
                skorAkhir = 90;
            }
            else if (skor == 100 && salahBenar == true)
            {
                skorAkhir = 100;
            }
        }
        return skorAkhir; // mengembalikan nilaiAkhir
    }

}

class BlankAnsException extends Exception {
    public BlankAnsException(){
        super ("Blank.... kamu tidak menjawab\n");
    }

}

class InvalidLetterException extends Exception{
    public InvalidLetterException(){
        super("Inputan salah... pilihan hanya A, B, or C\n");
    }

}





