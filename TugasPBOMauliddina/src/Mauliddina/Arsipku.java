package Mauliddina;


public class Arsipku implements Biodata, Nilai {
    public static void main(String[] args) {
        Arsipku ps = new Arsipku ();
        ps.tampilNama();
        ps.tampilTempatLahir();
        ps.tampilHobi();
        ps.tampilNilaiAgama();
        ps.tampilNilaiBahasaIndonesia();
        ps.tampilNilaiMatematika();
    }

    @Override
    public void tampilNama() {
        System.out.println("Namaku Maullid Dina Damayanti");
    }

    @Override
    public void tampilTempatLahir() {
        System.out.println("Tempat Tanggal Lahir 19 - 05 - 2003");
    }

    @Override
    public void tampilHobi() {
        System.out.println("Hobiku Menggambar");
    }

    @Override
    public void tampilNilaiAgama() {
        System.out.println("Nilai Agama : 100");
    }

    @Override
    public void tampilNilaiBahasaIndonesia() {
        System.out.println("Nilai Bahasa Indonesia : 100");
    }

    @Override
    public void tampilNilaiMatematika() {
        System.out.println("Nilai Matematika");
    }
    
}
