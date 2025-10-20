    class Mahasiswa {
    private String nama;
    private int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }
}

public class soal11 {
    public static void main(String[] args) {
        Mahasiswa[] data = {
            new Mahasiswa("King Zaki", 95),
            new Mahasiswa("Prince Ardi", 85),
            new Mahasiswa("Ajudan Farrash", 60)
        };

        for (Mahasiswa m : data) {
            System.out.println("Nama: " + m.getNama() + " - Nilai: " + m.getNilai());
        }

        Mahasiswa tertinggi = data[0];
        for (Mahasiswa m : data) {
            if (m.getNilai() > tertinggi.getNilai()) {
                tertinggi = m;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi: " 
            + tertinggi.getNama() + " (" + tertinggi.getNilai() + ")");
    }
}

