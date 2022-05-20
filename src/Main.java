import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int day;
        String month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month of birth : ");
        month = sc.next();
        month = month.toLowerCase();
        System.out.println("Enter the day of birth : ");
        day = sc.nextInt();

        /*switch (month) {
            case "january":
                if (day >= 1 && day <= 21) {
                    System.out.println("Your zodiac sign is Capricorn");
                } else if (day >= 22 && day <= 31) {
                    System.out.println("Your zodiac sign is Aquarius");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            case "february":
                if (day >= 1 && day <= 19) {
                    System.out.println("Your sign is Aquarius");
                } else if (day >= 20 && day <= 29) {
                    System.out.println("Your sign is Pisces");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            case "march":
                if (day >= 1 && day <= 20) {
                    System.out.println("Your sign is Pisces");
                } else if (day >= 21 && day <= 31) {
                    System.out.println("Your sign is Aries");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            case "april":
                if (day >= 1 && day <= 20) {
                    System.out.println("Your sign is Aries");
                } else if (day >= 21 && day <= 30) {
                    System.out.println("Your sign is Taurus");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            case "may":
                if (day >= 1 && day <= 21) {
                    System.out.println("Your sign is Taurus");
                } else if (day >= 22 && day <= 31) {
                    System.out.println("Your sign is Gemini");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            case "june":
                if (day >= 1 && day <= 22) {
                    System.out.println("Your sign is Gemini");
                } else if (day >= 23 && day <= 30) {
                    System.out.println("Your sign is Cancer");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            case "july":
                if (day >= 1 && day <= 22) {
                    System.out.println("Your sign is Cancer");
                } else if (day >= 23 && day <= 31) {
                    System.out.println("Your sign is Leo");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            case "august":
                if (day >= 1 && day <= 22) {
                    System.out.println("Your sign is Leo");
                } else if (day >= 23 && day <= 31) {
                    System.out.println("Your sign is Virgo");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            case "september":
                if (day >= 1 && day <= 22) {
                    System.out.println("Your sign is Virgo");
                } else if (day >= 23 && day <= 30) {
                    System.out.println("Your sign is Libra");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            case "october":
                if (day >= 1 && day <= 22) {
                    System.out.println("Your sign is Libra");
                } else if (day >= 23 && day <= 31) {
                    System.out.println("Your sign is Scorpio");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            case "november":
                if (day >= 1 && day <= 21) {
                    System.out.println("Your sign is Scorpio");
                } else if (day >= 22 && day <= 30) {
                    System.out.println("Your sign is Sagittarius");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            case "december":
                if (day >= 1 && day <= 21) {
                    System.out.println("Your sign is Sagittarius");
                } else if (day >= 22 && day <= 31) {
                    System.out.println("Your sign is Capricorn");
                } else {
                    System.out.println("Invalid input");
                }
                break;
            default:
                System.out.println("Invalid month");
        }*/

        if (month.equals("january")) {
            if (day >= 1 && day <= 21) {
                System.out.println("Your zodiac sign is Capricorn");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Your zodiac sign is Aquarius");
            } else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("february")) {
            if (day >= 1 && day <= 19) {
                System.out.println("Your sign is Aquarius");
            } else if (day >= 20 && day <= 29) {
                System.out.println("Your sign is Pisces");
            } else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("march")) {
            if (day >= 1 && day <= 20) {
                System.out.println("Your sign is Pisces");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Your sign is Aries");
            } else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("april")) {
            if (day >= 1 && day <= 20) {
                System.out.println("Your sign is Aries");
            } else if (day >= 21 && day <= 30) {
                System.out.println("Your sign is Taurus");
            } else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("may")) {
            if (day >= 1 && day <= 21) {
                System.out.println("Your sign is Taurus");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Your sign is Gemini");
            } else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("june")) {
            if (day >= 1 && day <= 22) {
                System.out.println("Your sign is Gemini");
            } else if (day >= 23 && day <= 30) {
                System.out.println("Your sign is Cancer");
            } else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("july")) {
            if (day >= 1 && day <= 22) {
                System.out.println("Your sign is Cancer");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Your sign is Leo");
            } else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("august")) {
            if (day >= 1 && day <= 22) {
                System.out.println("Your sign is Leo");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Your sign is Virgo");
            } else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("september")) {
            if (day >= 1 && day <= 22) {
                System.out.println("Your sign is Virgo");
            } else if (day >= 23 && day <= 30) {
                System.out.println("Your sign is Libra");
            } else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("october")) {
            if (day >= 1 && day <= 22) {
                System.out.println("Your sign is Libra");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Your sign is Scorpio");
            } else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("november")) {
            if (day >= 1 && day <= 21) {
                System.out.println("Your sign is Scorpio");
            } else if (day >= 22 && day <= 30) {
                System.out.println("Your sign is Sagittarius");
            } else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("december")) {
            if (day >= 1 && day <= 21) {
                System.out.println("Your sign is Sagittarius");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Your sign is Capricorn");
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid month");
        }
    }
}
