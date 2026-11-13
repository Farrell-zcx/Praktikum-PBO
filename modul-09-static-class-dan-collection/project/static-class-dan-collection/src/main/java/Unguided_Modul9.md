# Unguided Modul 9 – Static, Collection, Sorting & Filtering
Seorang data scientist sedang membandingkan beberapa model *machine learning* untuk memprediksi data penjualan. Setiap model yang selesai dilatih akan dicatat hasilnya. Agar mudah dianalisis, ia meminta Anda membuat program Java sederhana untuk mengelola catatan hasil eksperimen tersebut.

## Ketentuan

1. Buatlah sebuah kelas untuk menyimpan hasil eksperimen satu model dengan atribut:
   - nama model (`String`)
   - akurasi (`double`, nilai 0 – 1)
   - waktu training dalam detik (`int`)

   Kelas ini harus memiliki *constructor*, *getter*, dan `toString()` dengan format:
   `Model=<nama>, akurasi=<akurasi>, waktu=<waktu> detik`

2. Kelas tersebut juga harus memiliki static variable yang menghitung jumlah eksperimen yang sudah dibuat (bertambah setiap kali objek baru dibuat), dan static method untuk mengambil nilai jumlah tersebut.

3. Kelas tersebut harus dapat diurutkan secara *default* berdasarkan akurasi dari yang tertinggi ke terendah, gunakan `interface Comparable`.

4. Buatlah sebuah kelas terpisah yang mengimplementasikan `Comparator` untuk mengurutkan hasil eksperimen berdasarkan waktu training dari yang tercepat ke terlama.

5. Pada *method main* (di kelas terpisah), simpan data berikut ke dalam sebuah `List` menggunakan generics:

   | Nama Model          | Akurasi | Waktu Training (detik) |
   |---------------------|---------|------------------------|
   | Logistic Regression | 0.82    | 12                     |
   | Random Forest       | 0.91    | 45                     |
   | SVM                 | 0.87    | 60                     |
   | KNN                 | 0.79    | 5                      |
   | Decision Tree       | 0.84    | 8                      |

6. Tampilkan hasil berikut secara berurutan:
   1. Jumlah eksperimen yang tercatat, gunakan *static method*.
   2. Daftar model yang diurutkan berdasarkan akurasi tertinggi** (Comparable).
   3. Daftar model yang diurutkan berdasarkan **waktu training tercepat (Comparator).
   4. Daftar model dengan akurasi minimal 0.85 (filtering menggunakan ekspresi lambda).
   5. Data model dengan nama "KNN" (pencarian menggunakan ekspresi lambda, tampilkan `null` jika tidak ditemukan).

> **Catatan:** Tentukan sendiri nama kelas dan nama file yang Anda gunakan. Pastikan output program sesuai dengan contoh pada bagian Contoh Output.

## Contoh Output

```
Jumlah eksperimen: 5

Sorted by akurasi
Model=Random Forest, akurasi=0.91, waktu=45 detik
Model=SVM, akurasi=0.87, waktu=60 detik
Model=Decision Tree, akurasi=0.84, waktu=8 detik
Model=Logistic Regression, akurasi=0.82, waktu=12 detik
Model=KNN, akurasi=0.79, waktu=5 detik

Sorted by waktu training
Model=KNN, akurasi=0.79, waktu=5 detik
Model=Decision Tree, akurasi=0.84, waktu=8 detik
Model=Logistic Regression, akurasi=0.82, waktu=12 detik
Model=Random Forest, akurasi=0.91, waktu=45 detik
Model=SVM, akurasi=0.87, waktu=60 detik

Model dengan akurasi minimal 0.85
Model=Random Forest, akurasi=0.91, waktu=45 detik
Model=SVM, akurasi=0.87, waktu=60 detik

Pencarian model KNN
Model=KNN, akurasi=0.79, waktu=5 detik
```