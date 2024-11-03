/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmicalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input berat badan
        System.out.print("Masukkan berat badan (dalam kg): ");
        double beratBadan = scanner.nextDouble();

        // Meminta input tinggi badan
        System.out.print("Masukkan tinggi badan (dalam meter): ");
        double tinggiBadan = scanner.nextDouble();

        // Membuat objek BMICalculator
        BMICalculator bmiCalculator = new BMICalculator(beratBadan, tinggiBadan);

        // Menghitung dan menampilkan hasil BMI
        double bmi = bmiCalculator.hitungBMI();
        System.out.println("BMI Anda adalah: "+ bmi);
        System.out.println("Kategori: " + bmiCalculator.kategoriBMI());

        // Menutup scanner
        scanner.close();
    }
}
