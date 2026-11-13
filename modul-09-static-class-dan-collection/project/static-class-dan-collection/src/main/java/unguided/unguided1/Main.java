package unguided.unguided1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Model> listModel = new ArrayList<>();
        listModel.add(new Model("Logistic Regression", 0.82, 12));
        listModel.add(new Model("Random Forest", 0.91, 45));
        listModel.add(new Model("SVM", 0.87, 60));
        listModel.add(new Model("KNN", 0.79, 5));
        listModel.add(new Model("Decision Tree", 0.84, 8));

        // 1. Jumlah eksperimen yang tercatat (static method)
        System.out.println("Jumlah eksperimen: " + Model.getJumlahEksperimen());
        System.out.println();

        // 2. Daftar model yang diurutkan berdasarkan akurasi tertinggi (Comparable)
        Collections.sort(listModel);
        System.out.println("Sorted by akurasi");
        listModel.forEach(System.out::println);
        System.out.println();

        // 3. Daftar model yang diurutkan berdasarkan waktu training tercepat (Comparator)
        Collections.sort(listModel, new WaktuTrainingComparator());
        System.out.println("Sorted by waktu training");
        listModel.forEach(System.out::println);
        System.out.println();

        // 4. Daftar model dengan akurasi minimal 0.85 (filtering menggunakan ekspresi lambda)
        System.out.println("Model dengan akurasi minimal 0.85");
        listModel.stream()
                .filter(m -> m.getAkurasi() >= 0.85)
                .forEach(System.out::println);
        System.out.println();

        // 5. Data model dengan nama "KNN" (pencarian menggunakan ekspresi lambda, tampilkan null jika tidak ditemukan)
        System.out.println("Pencarian model KNN");
        Model target = listModel.stream()
                .filter(m -> m.getNama().equalsIgnoreCase("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(target);
    }
}

