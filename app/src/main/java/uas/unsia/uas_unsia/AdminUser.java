package uas.unsia.uas_unsia;

/**
 * Kelas AdminUser yang mewarisi kelas User.
 * - Pewarisan: Kelas ini mewarisi dari kelas User, menggunakan fitur dan metode dasar yang didefinisikan di kelas User.
 * - Polimorfisme: Metode authenticate di-override untuk nambahin pemeriksaan khusus untuk admin dengan ngecek bahwa email berakhir dengan "@admin.com".
 * Ini memperlihatkan polimorfisme, di mana kelas anak mengubah perilaku metode warisan.
 */
public class AdminUser extends User {
    public AdminUser(String email, String password) {
        super(email, password);
    }

    @Override
    public boolean authenticate(String email, String password) {
        return super.authenticate(email, password) && email.endsWith("@admin.com");
    }
}
