/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmicalculator;

/**
 *
 * @author User
 */
public class BMICalculator {
    double beratBadan;
    double tinggiBadan;

    // Konstruktor
    public BMICalculator(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    // Metode untuk menghitung BMI
    public double hitungBMI() {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    // Metode untuk menentukan kategori BMI
    public String kategoriBMI() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            return "Kekurangan berat badan";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Kelebihan berat badan";
        } else {
            return "Obesitas";
        }
    }
}
