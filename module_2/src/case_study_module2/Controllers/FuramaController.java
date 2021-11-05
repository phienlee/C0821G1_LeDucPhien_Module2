package case_study_module2.Controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
    Scanner scanner = new Scanner(System.in);
    int choice;

    public void displayMainMenu() {
        do {
            System.out.println("*************************");
            System.out.println("FURAMA RESORT BOOKING:\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "0.Exit");
            System.out.println("*************************");
            choice = choiceNumber(6);
            switch (choice) {
                case 1:
                    menuEmployee();
                    break;
                case 2:
                    menuCustomer();
                    break;
                case 3:
                    menuFacility();
                    break;
                case 4:
                    menuBooking();
                    break;
                case 5:
                    menuPromotion();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again!");
            }
        } while (choice != 0);


    }

    private void menuPromotion() {
        do {
            System.out.println("******************\n" +
                    "PROMOTION MANAGEMENT\n" +
                    "1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Back Main Menu\n" +
                    "******************");
            choice = choiceNumber(5);
            switch (choice) {
                case 1:
                    showListCustomer();
                    break;
                case 2:
                    addNewCustomer();
                    break;
                case 3:
                    updateCustomer();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again!");
            }
        }while (choice != 0);

    }

    private void updateCustomer() {
    }

    private void addNewCustomer() {
    }

    private void showListCustomer() {
    }

    private void menuBooking() {
        do {
            System.out.println("******************\n" +
                    "BOOKING MANAGEMENT\n" +
                    "1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new contracts\n" +
                    "4.4.Display list contracts\n" +
                    "5.Edit contracts\n" +
                    "0.Exit\n" +
                    "******************");
            choice = choiceNumber(6);
            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again!");
            }
        }while (choice != 0);

    }

    private void menuFacility() {
        do {
            System.out.println("******************\n" +
                    "FACILITY MANAGEMENT\n" +
                    "1.Display list Facility\n" +
                    "2.Add new Facility\n" +
                    "3.Edit Facility\n" +
                    "4.Back Main Menu\n" +
                    "0.Exit\n" +
                    "******************");
            choice = choiceNumber(5);
            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again!");
            }
        }while (choice != 0);
    }

    private void menuCustomer() {
        do {
            System.out.println("*******************\n" +
                    "CUSTOMER MANAGEMENT\n" +
                    "1.Display list Customers\n" +
                    "2.Add new Customer\n" +
                    "3.Edit Customer\n" +
                    "4.Back Main Menu\n" +
                    "0.Exit\n" +
                    "*******************");
            choice = choiceNumber(5);
            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again!");

            }
        }while (choice != 0);

    }

    private void menuEmployee() {
        do {
            System.out.println("*****************\n" +
                    "EMPLOYEE MANAGEMENT\n" +
                    "1.Display list Employee\n" +
                    "2.Add new Employee\n" +
                    "3.Edit Employee\n" +
                    "4.Back Main Menu\n" +
                    "0.Exit\n" +
                    "*****************");

        choice = choiceNumber(5);
        switch (choice){
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                displayMainMenu();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Please try again!");
        }
        }while (choice != 0);
    }



    private int choiceNumber(int number) {
        int choice;
        boolean check;
        do {
            System.out.println("Please enter your choice 😋: ");
            choice = scanner.nextInt();
            if (choice < 0 || choice > number) {
                check = false;
                System.out.println("Please enter from 0 to " + number);
            } else {
                check = true;
            }
        } while (!check);
        return choice;
    }
}
