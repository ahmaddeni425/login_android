package uas.unsia.uas_unsia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * MainActivity mengextend AppCompatActivity, bahwa ini adalah Pewarisan dalam OOP.
 * Kelas ini sebagai controller untuk UI, ngelola interaksi pengguna dengan aplikasi.
 *
 * - Pewarisan: MainActivity mengextend AppCompatActivity, ngambil metode dan properti dari kelas dasar
 *   yang dikasih oleh Android SDK untuk dikelola dalam lifecycle activity, interaksi UI, dll.
 *
 * - Abstraksi: Menggunakan interface Authenticatable melalui objek 'user' dengan menyembunyikan detail implementasi
 *   dari metode autentikasi pengguna/user, memungkinkan MainActivity bisa interaksi dengan Authenticatable
 *   tanpa harus tahu detail khusus mengenai gimana autentikasi dilakukan.
 *
 * - Enkapsulasi: Objek 'user' dari jenis Authenticatable dikapsulasi dalam MainActivity, ngejaga detail
 *   autentikasi tersembunyi dari komponen lain. MainActivity nyediakan antarmuka (UI controls) yang memungkinkan
 *   pengguna berinteraksi dengan objek ini tanpa harus mengakses atau memodifikasi langsung properti internalnya.
 *
 * - Polimorfisme: Metode 'authenticate' yang diimplementasikan di User yang bisa jadi berbeda jika ada lebih dari satu
 *   jenis User, bisa diimplementasikan polimorfik. Contoh ini sederhana, tapi struktur kodenya bisa
 *   untuk substitusi perilaku authenticate tanpa ngubah cara MainActivity gunainnya.
 */
public class MainActivity extends AppCompatActivity {
    // Inisialisasi user dengan AdminUser untuk menguji autentikasi khusus admin.
    private Authenticatable user = new AdminUser("ahmad@admin.com", "123");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailInput = findViewById(R.id.email);
        EditText passwordInput = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(view -> {
            String email = emailInput.getText().toString();
            String password = passwordInput.getText().toString();
            if (user.authenticate(email, password)) {
                setContentView(R.layout.activity_welcome);
            } else {
                Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
