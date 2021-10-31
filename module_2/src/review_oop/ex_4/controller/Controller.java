package review_oop.ex_4.controller;

import review_oop.ex_4.model.ExperienceCandidate;
import review_oop.ex_4.model.Fresher;
import review_oop.ex_4.model.Intern;
import review_oop.ex_4.service.ExperiencesCandidateServiceImpl;
import review_oop.ex_4.service.FresherServiceImpl;
import review_oop.ex_4.service.InternServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private InternServiceImpl internService = new InternServiceImpl();
    private FresherServiceImpl fresherService = new FresherServiceImpl();
    private ExperiencesCandidateServiceImpl experiencesCandidateService = new ExperiencesCandidateServiceImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.displayMainMenu();

    }

    private void displayMainMenu() {
        int choice;
        do {
            System.out.println("--------💗💗💗💗💗💗💗💗💗💗💗💗💗💗💗💗💗💗---------");
            System.out.println("CANDIDATE MANAGEMENT SYSTEM\n" +
                    "1.Experience\n" +
                    "2.Fresher\n" +
                    "3.Internship\n" +
                    "4.Searching\n" +
                    "0.Exit");
            System.out.println("--------💗💗💗💗💗💗💗💗💗💗💗💗💗💗💗💗💗💗---------");
            choice = choiceNumber(5);
            switch (choice) {
                case 1:
                    displayExperienceMenu();
                    break;
                case 2:
                    displayFresherMenu();
                    break;
                case 3:
                    displayInternMenu();
                    break;
                case 4:
                    displaySearchMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again!");
            }
        } while (choice != 0);
    }

    private void displaySearchMenu() {
        System.out.println("Enter the type of candidate you want to search?");
        System.out.println("0.Experience\n" +
                "1.Fresher\n" +
                "2.Internship\n" +
                "Enter your choice");
        scanner.nextLine();
        int candidateType = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First name or Last name you want to search");
        String keyword = scanner.nextLine();
        switch (candidateType) {
            case 0:
                List<ExperienceCandidate> experienceListSearch = experiencesCandidateService.searchCandidate(keyword);
                for (ExperienceCandidate experienceCandidate : experienceListSearch) {
                    System.out.println(experienceCandidate);
                }
                break;
            case 1:
                List<Fresher> fresherListSearch = fresherService.searchCandidate(keyword);
                for (Fresher fresher : fresherListSearch) {
                    System.out.println(fresher);
                }
                break;
            case 2:
                List<Intern> internList = internService.searchCandidate(keyword);
                for (Intern intern : internList) {
                    System.out.println(intern);
                }
                break;
            default:
                System.out.println("Please try again!");
        }

    }

    private void displayInternMenu() {
        int choiceIntern;
        do {
            System.out.println("--------😍😍😍😍😍👧👧👧👧----------");
            System.out.println("INTERN MENU\n" +
                    "1.Add new\n" +
                    "2.Show all\n" +
                    "3.Delete\n" +
                    "4.Update\n" +
                    "5.Back to main menu\n" +
                    "0.Exit");
            System.out.println("--------😍😍😍😍😍👧👧👧👧----------");
            choiceIntern = choiceNumber(6);
            switch (choiceIntern) {
                case 1:
                    addNewIntern();
                    break;
                case 2:
                    showAllIntern();
                    break;
                case 3:
                    deleteByIdIntern();
                    break;
                case 4:
                    updateIntern();
                    break;
                case 5:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again!");
            }
        } while (choiceIntern != 0);

    }

    private void updateIntern() {
        showAllIntern();
        System.out.println("Please enter the id of candidate you want to update");
        scanner.nextLine();
        int idUpdate = Integer.parseInt(scanner.nextLine());
        Intern intern = internService.findById(idUpdate);
        System.out.println(intern);
        System.out.println("Enter FirstName update of Candidate");
        String firstName = scanner.nextLine();
        System.out.println("Enter LastName update of Candidate");
        String lastName = scanner.nextLine();
        System.out.println("Enter Birthday year update of Candidate");
        int birthdate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address update of  Candidate");
        String address = scanner.nextLine();
        System.out.println("Enter phone Number update of Candidate");
        String phone = scanner.nextLine();
        System.out.println("Enter Email update of Candidate");
        String email = scanner.nextLine();
        System.out.println("Enter Majors Date update of Candidate");
        String majors = scanner.nextLine();
        System.out.println("Enter Semester Rank update of Candidate");
        String semester = scanner.nextLine();
        System.out.println("Enter UniversityName update of  Candidate");
        String university = scanner.nextLine();
        intern.setFirstName(firstName);
        intern.setLastName(lastName);
        intern.setBirthdate(birthdate);
        intern.setAddress(address);
        intern.setPhone(phone);
        intern.setEmail(email);
        intern.setMajors(majors);
        intern.setSemester(semester);
        intern.setUniversityName(university);
        System.out.println("Updated Successfully");
        showAllIntern();
    }

    private void showAllIntern() {
        List<Intern> internList = internService.getAll();
        System.out.println("FRESHER LIST");
        for (Intern intern : internList) {
            System.out.println(intern.showInfo());
        }
    }

    private void deleteByIdIntern() {
        System.out.println("Please enter the id of candidate you want to delete");
        scanner.nextLine();
        int idDelete = Integer.parseInt(scanner.nextLine());
        System.err.println("Do you sure to delete?\n" +
                "1. Yes\n" +
                "2. No");
        int flag = scanner.nextInt();
        switch (flag) {
            case 1:
                internService.deleteById(idDelete);
                System.out.println("Deleted successfully");
                showAllIntern();
                break;
            case 2:
                displayInternMenu();
                break;
            default:
                System.out.println("Please enter 1 or 2 😍");
        }
    }

    private void addNewIntern() {
        System.out.println("Enter Id of Candidate");
        scanner.nextLine();
        int idCandidate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter FirstName of Candidate");
        String firstName = scanner.nextLine();
        System.out.println("Enter LastName of Candidate");
        String lastName = scanner.nextLine();
        System.out.println("Enter Birthday year of Candidate");
        int birthdate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address of Candidate");
        String address = scanner.nextLine();
        System.out.println("Enter phone Number of Candidate");
        String phone = scanner.nextLine();
        System.out.println("Enter Email of Candidate");
        String email = scanner.nextLine();
        System.out.println("Enter Majors of Candidate");
        String majors = scanner.nextLine();
        System.out.println("Enter Semester of Candidate");
        String semester = scanner.nextLine();
        System.out.println("Enter University name of Candidate");
        String universityName = scanner.nextLine();
        Intern intern = new Intern(
                idCandidate,
                firstName,
                lastName,
                birthdate,
                address,
                phone,
                email,
                2,
                majors,
                semester,
                universityName
        );
        internService.addCandidate(intern);
        showAllIntern();
    }

    private void displayFresherMenu() {
        int choiceFresher;
        do {
            System.out.println("--------😍😍😍😍😍😍👧👧👧👧----------");
            System.out.println("FRESHER MENU\n" +
                    "1.Add new\n" +
                    "2.Show all\n" +
                    "3.Delete\n" +
                    "4.Update\n" +
                    "5.Back to main menu\n" +
                    "0.Exit");
            System.out.println("--------😍😍😍😍😍😍👧👧👧👧----------");
            choiceFresher = choiceNumber(6);
            switch (choiceFresher) {
                case 1:
                    addNewFresher();
                    break;
                case 2:
                    showAllFreshers();
                    break;
                case 3:
                    deleteByIdFresher();
                    break;
                case 4:
                    updateFresher();
                    break;
                case 5:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again!");
            }
        } while (choiceFresher != 0);
    }

    private void updateFresher() {
        showAllFreshers();
        System.out.println("Please enter the id of candidate you want to update");
        scanner.nextLine();
        int idUpdate = Integer.parseInt(scanner.nextLine());
        Fresher fresher = fresherService.findById(idUpdate);
        System.out.println(fresher);
        System.out.println("Enter FirstName update of Candidate");
        String firstName = scanner.nextLine();
        System.out.println("Enter LastName update of Candidate");
        String lastName = scanner.nextLine();
        System.out.println("Enter Birthday year update of Candidate");
        int birthdate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address update of  Candidate");
        String address = scanner.nextLine();
        System.out.println("Enter phone Number update of Candidate");
        String phone = scanner.nextLine();
        System.out.println("Enter Email update of Candidate");
        String email = scanner.nextLine();
        System.out.println("Enter Graduation Date update of Candidate");
        String graduationDate = scanner.nextLine();
        System.out.println("Enter Graduation Rank update of Candidate");
        String graduationRank = scanner.nextLine();
        System.out.println("Enter Education update of  Candidate");
        String education = scanner.nextLine();
        fresher.setFirstName(firstName);
        fresher.setLastName(lastName);
        fresher.setBirthdate(birthdate);
        fresher.setAddress(address);
        fresher.setPhone(phone);
        fresher.setEmail(email);
        fresher.setGraduationDate(graduationDate);
        fresher.setGraduationRank(graduationRank);
        fresher.setEducation(education);
        System.out.println("Updated Successfully");
        showAllFreshers();
    }

    private void deleteByIdFresher() {
        System.out.println("Please enter the id of candidate you want to delete");
        scanner.nextLine();
        int idDelete = Integer.parseInt(scanner.nextLine());
        System.err.println("Do you sure to delete?\n" +
                "1. Yes\n" +
                "2. No");
        int flag = scanner.nextInt();
        switch (flag) {
            case 1:
                fresherService.deleteById(idDelete);
                System.out.println("Deleted successfully");
                showAllFreshers();
                break;
            case 2:
                displayFresherMenu();
                break;
            default:
                System.out.println("Please enter 1 or 2 😍");
        }

    }

    private void showAllFreshers() {
        List<Fresher> fresherList = fresherService.getAll();
        System.out.println("FRESHER LIST");
        int count = 1;
        for (Fresher fresher : fresherList) {
            System.out.println(count + ": " + fresher.showInfo());
            count++;
        }
    }

    private void addNewFresher() {
        System.out.println("Enter Id of Candidate");
        scanner.nextLine();
        int idCandidate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter FirstName of Candidate");
        String firstName = scanner.nextLine();
        System.out.println("Enter LastName of Candidate");
        String lastName = scanner.nextLine();
        System.out.println("Enter Birthday year of Candidate");
        int birthdate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address of Candidate");
        String address = scanner.nextLine();
        System.out.println("Enter phone Number of Candidate");
        String phone = scanner.nextLine();
        System.out.println("Enter Email of Candidate");
        String email = scanner.nextLine();
        System.out.println("Enter Graduation Date of Candidate");
        String graduationDate = scanner.nextLine();
        System.out.println("Enter Graduation Rank of Candidate");
        String graduationRank = scanner.nextLine();
        System.out.println("Enter Education of Candidate");
        String education = scanner.nextLine();
        Fresher fresher = new Fresher(
                idCandidate,
                firstName,
                lastName,
                birthdate,
                address,
                phone,
                email,
                1,
                graduationDate,
                graduationRank,
                education
        );
        fresherService.addCandidate(fresher);
        showAllFreshers();
    }

    private void displayExperienceMenu() {
        int choiceExperience;
        do {
            System.out.println("--------😍😍😍😍👧👧👧----------");
            System.out.println("EXPERIENCE MENU\n" +
                    "1.Add new\n" +
                    "2.Show all\n" +
                    "3.Delete\n" +
                    "4.Update\n" +
                    "5.Back to main menu\n" +
                    "0.Exit");
            System.out.println("--------😍😍😍😍👧👧👧----------");
            choiceExperience = choiceNumber(6);
            switch (choiceExperience) {
                case 1:
                    addNewExperience();
                    break;
                case 2:
                    showAllExperience();
                    break;
                case 3:
                    deleteByIdExperience();
                    break;
                case 4:
                    updateExperience();
                    break;
                case 5:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again!");
            }
        } while (choiceExperience != 0);


    }

    private void updateExperience() {
        showAllExperience();
        System.out.println("Please enter the id of candidate you want to update!");
        scanner.nextLine();
        int idUpdate = Integer.parseInt(scanner.nextLine());
        ExperienceCandidate experienceCandidate = experiencesCandidateService.findById(idUpdate);
        System.out.println(experienceCandidate);
        System.out.println("Enter FirstName update of Candidate");
        String firstName = scanner.nextLine();
        System.out.println("Enter LastName update of Candidate");
        String lastName = scanner.nextLine();
        System.out.println("Enter Birthday year update of Candidate");
        int birthdate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address update of  Candidate");
        String address = scanner.nextLine();
        System.out.println("Enter phone Number update of Candidate");
        String phone = scanner.nextLine();
        System.out.println("Enter Email update of Candidate");
        String email = scanner.nextLine();
        System.out.println("Enter Epx In year Date update of Candidate");
        int expInYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Professional skill update of Candidate");
        String proKill = scanner.nextLine();
        experienceCandidate.setFirstName(firstName);
        experienceCandidate.setLastName(lastName);
        experienceCandidate.setBirthdate(birthdate);
        experienceCandidate.setAddress(address);
        experienceCandidate.setPhone(phone);
        experienceCandidate.setEmail(email);
        experienceCandidate.setExpInYear(expInYear);
        experienceCandidate.setProKill(proKill);
        System.out.println("Updated Successfully");
        showAllFreshers();

    }

    private void deleteByIdExperience() {
        System.out.println("Please enter the id of candidate you want to delete");
        scanner.nextLine();
        int idDelete = Integer.parseInt(scanner.nextLine());
        System.err.println("Do you sure to delete?\n" +
                "1. Yes\n" +
                "2. No");
        int flag = scanner.nextInt();
        switch (flag) {
            case 1:
                experiencesCandidateService.deleteById(idDelete);
                System.out.println("Deleted successfully");
                showAllExperience();
                break;
            case 2:
                displayExperienceMenu();
                break;
            default:
                System.out.println("Please enter 1 or 2 😍");
        }
    }

    private void showAllExperience() {
        List<ExperienceCandidate> experienceCandidateList = experiencesCandidateService.getAll();
        System.out.println("EXPERIENCE LIST");
        for (ExperienceCandidate experienceCandidate : experienceCandidateList) {
            System.out.println(experienceCandidate.showInfo());
        }
    }

    private void addNewExperience() {
        System.out.println("Enter Id of Candidate");
        scanner.nextLine();
        int idCandidate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter FirstName of Candidate");
        String firstName = scanner.nextLine();
        System.out.println("Enter LastName of Candidate");
        String lastName = scanner.nextLine();
        System.out.println("Enter Birthday year of Candidate");
        int birthdate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address of Candidate");
        String address = scanner.nextLine();
        System.out.println("Enter phone Number of Candidate");
        String phone = scanner.nextLine();
        System.out.println("Enter Email of Candidate");
        String email = scanner.nextLine();
        System.out.println("Enter Exp In Year of Candidate");
        int expInYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Professional skill of Candidate");
        String proSkill = scanner.nextLine();
        ExperienceCandidate experienceCandidate = new ExperienceCandidate(
                idCandidate,
                firstName,
                lastName,
                birthdate,
                address,
                phone,
                email,
                0,
                expInYear,
                proSkill
        );
        experiencesCandidateService.addCandidate(experienceCandidate);
        showAllExperience();
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
