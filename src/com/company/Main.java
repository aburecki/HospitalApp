package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int add = 1;
        final int print = 2;
        final int exit = 0;

        Scanner sc = new Scanner(System.in);
        Information info = new Information();
        Hospital hospital = new Hospital();

        int option = -1;

        while (option != exit) {
            info.programInfo();
            System.out.println("Wybierz opcje: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case exit:
                    System.out.println("Kończenie programu");
                    break;
                case add:
                    System.out.println("Dopisanie nowego pacjenta");
                    Patient patient = new Patient();
                    System.out.println("Wprowadź imię pacjenta: ");
                    patient.setName(sc.nextLine());
                    System.out.println("Wprowadź nazwisko pacjenta: ");
                    patient.setSurname(sc.nextLine());
                    System.out.println("Wprowadź pesel pacjenta");
                    patient.setPesel(sc.nextLong());
                    hospital.addPatient(patient);
                    break;

                case print:
                    System.out.println("Wyświetlenie listy zapisanych pacjentów");
                    hospital.printPatients();
                    break;
                default:
                    System.out.println("Nie rozpoznano opcji!");
            }
        }
        sc.close();
    }
}
