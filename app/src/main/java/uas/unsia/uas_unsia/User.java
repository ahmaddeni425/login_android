package uas.unsia.uas_unsia;

/**
 * Kelas User ngimplementasi interface Authenticatable, nunjukkin gimana penerapan Abstraksi dan Enkapsulasi dalam OOP.
 *
 * - Abstraksi: Melalui implementasi interface Authenticatable, kelas User mendefinisikan spesifik ngasih tau cara kerja metode authenticate.
 *   Ini memungkinkan kelas User untuk menyembunyikan kompleksitas internal cara memverifikasi autentikasi, hanya mengekspos
 *   fungsionalitas yang diperlukan melalui interface, jadi detail implementasi autentikasi tidak diketahui atau diakses oleh pengguna kelas ini.
 *
 * - Enkapsulasi: Kelas ini menggunakan private fields untuk email dan password, ngebatasin bagaimana akses langsung ke data sensitif ini.
 *   Akses ke data ini cuma bisa dilakukan melalui metode publik, yaitu authenticate, yang memberikan kontrol ketat atas cara data ini digunakan.
 *   Ini membantu menjaga integritas data dengan mencegah manipulasi yang tidak sah dari luar kelas.
 *
 * Penggunaan kedua konsep ini meningkatkan keamanan dan modularitas kode, memungkinkan pengembangan dan pemeliharaan yang lebih mudah serta penggunaan looping kode.
 */
public class User implements Authenticatable {
    private String email;    // Field private untuk menyimpan email pengguna
    private String password; // Field private untuk menyimpan password pengguna

    // Constructor untuk menginisialisasi user dengan email dan password
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Metode dari interface Authenticatable untuk memverifikasi autentikasi pengguna
    @Override
    public boolean authenticate(String email, String password) {
        // Membandingkan email dan password yang diberikan dengan yang disimpan
        return this.email.equals(email) && this.password.equals(password);
    }
}
