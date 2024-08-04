package uas.unsia.uas_unsia;

/**
 * Interface Authenticatable mengimplementasikan konsep Abstraksi dalam OOP.
 * - Abstraksi: Interface ini adalah sebuah abstraksi untuk autentikasi pengguna, menetapkan metode authenticate
 *   yang harus diimplementasikan oleh kelas yang mengadopsi interface ini. Ini memisahkan apa yang harus dilakukan (authenticate pengguna)
 *   dari bagaimana hal itu dilakukan, yang akan ditentukan oleh kelas-kelas yang mengimplementasikan metode ini.
 * Abstraksi ini membuat kode yang menggunakan objek jenis Authenticatable untuk beroperasi dengan objek apa pun
 * yang mengkonformasi ke interface ini, tanpa harus mengetahui detail implementasi spesifik dari metode tsb.
 */
public interface Authenticatable {
    boolean authenticate(String email, String password);
}
