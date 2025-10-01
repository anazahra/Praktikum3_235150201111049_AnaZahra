# Praktikum3_235150201111049_AnaZahra

## Penjelasan singkat implementasi state di aplikasi

Dalam aplikasi berbasis Jetpack Compose, state digunakan untuk menyimpan dan mengelola nilai yang dapat berubah selama aplikasi berjalan, misalnya jumlah counter, status tombol Follow/Unfollow, atau warna sebuah Box. Dengan menggunakan remember { mutableStateOf(...) }, nilai tersebut akan tersimpan di memori komposisi sehingga UI bisa langsung merespons perubahan state tanpa perlu dipanggil ulang secara manual. Contohnya, ketika pengguna menekan tombol tambah pada aplikasi Counter, nilai state akan bertambah, dan secara otomatis teks yang menampilkan jumlah akan ikut berubah sesuai state terbaru. Dengan pendekatan ini, hubungan antara data (state) dan tampilan (UI) menjadi lebih sederhana, reaktif, dan konsisten

## Analisis singkat: mengapa UI Compose lebih sederhana dibandingkan XML tradisional untuk kasus ini

UI Compose lebih sederhana dibandingkan XML tradisional karena deklarasi antarmuka dan logika aplikasi digabung dalam satu tempat dengan cara deklaratif. Pada XML tradisional, kita harus membuat layout terpisah di file XML, kemudian mencari referensinya menggunakan findViewById, lalu menghubungkannya dengan kode Java/Kotlin secara manual. Hal ini membuat kode lebih panjang dan rentan error. Sementara di Compose, kita cukup mendeklarasikan UI langsung di dalam fungsi @Composable, dan setiap perubahan state akan otomatis memicu pembaruan tampilan tanpa perlu pemanggilan ulang eksplisit. Dengan pendekatan ini, pengembangan lebih cepat, kode lebih ringkas, mudah dibaca, dan lebih mudah digunakan kembali (reusable)
