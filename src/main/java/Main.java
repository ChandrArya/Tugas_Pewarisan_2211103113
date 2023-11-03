import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Xiaomi Gede = new Xiaomi();
        Iphone Chandra = new Iphone();
        Vivo Arya = new Vivo();
        Realme Pragusta = new Realme();
        int selectedPhone = 0;

        while (true) {
            System.out.println("Main Menu :");
            System.out.println("1. Select Phone");
            System.out.println("2. Manipulate Phone Data");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Select Phone :");
                    System.out.println("1. Xiaomi");
                    System.out.println("2. iPhone");
                    System.out.println("3. Vivo");
                    System.out.println("4. Realme");
                    System.out.print("Phone : ");
                    int phoneChoice = scanner.nextInt();
                    switch (phoneChoice) {
                        case 1:
                            selectedPhone = 1;
                            break;
                        case 2:
                            selectedPhone = 2;
                            break;
                        case 3:
                            selectedPhone = 3;
                            break;
                        case 4:
                            selectedPhone = 4;
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    System.out.println();
                    break;
                case 2:
                    switch (selectedPhone) {
                        case 1:
                            Gede.subMenu();
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("1. Power On");
                                    System.out.println("2. Power Off");
                                    System.out.print("Select : ");
                                    int powerChoice = scanner.nextInt();
                                    if (powerChoice == 1) {
                                        Gede.turnOnThePhone();
                                    } else if (powerChoice == 2) {
                                        Gede.turnOffThePhone();
                                    } else {
                                        System.out.println("Invalid Choice");
                                    }
                                    break;
                                case 2:
                                    if (Gede.isPowerOn()) {
                                        Gede.volumeUp();
                                        System.out.println("Volume increased. Current volume: " + Gede.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 3:
                                    if (Gede.isPowerOn()) {
                                        Gede.volumeDown();
                                        System.out.println("Volume decreased. Current volume: " + Gede.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 4:
                                    if (Gede.isPowerOn()) {
                                        System.out.println("Current Volume: " + Gede.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 5:
                                    if (Gede.isPowerOn()) {
                                        System.out.println("Power status: " + (Gede.isPowerOn() ? "On" : "Off"));
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 6:
                                    if (Gede.isPowerOn()) {
                                        Gede.makePhoneLouder();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 7:
                                    if (Gede.isPowerOn()) {
                                        Gede.makePhoneSilent();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }
                            break;
                        case 2:
                            Chandra.subMenu();
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("1. Power On");
                                    System.out.println("2. Power Off");
                                    System.out.print("Select : ");
                                    int powerChoice = scanner.nextInt();
                                    if (powerChoice == 1) {
                                        Chandra.turnOnThePhone();
                                    } else if (powerChoice == 2) {
                                        Chandra.turnOffThePhone();
                                    } else {
                                        System.out.println("Invalid Choice");
                                    }
                                    break;
                                case 2:
                                    if (Chandra.isPowerOn()) {
                                        Chandra.volumeUp();
                                        System.out.println("Volume increased. Current volume: " + Chandra.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 3:
                                    if (Chandra.isPowerOn()) {
                                        Chandra.volumeDown();
                                        System.out.println("Volume decreased. Current volume: " + Chandra.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 4:
                                    if (Chandra.isPowerOn()) {
                                        System.out.println("Current Volume: " + Chandra.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 5:
                                    if (Chandra.isPowerOn()) {
                                        System.out.println("Power status: " + (Chandra.isPowerOn() ? "On" : "Off"));
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 6:
                                    if (Chandra.isPowerOn()) {
                                        Chandra.makePhoneLouder();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 7:
                                    if (Chandra.isPowerOn()) {
                                        Chandra.makePhoneSilent();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }
                            break;
                        case 3:
                            Arya.subMenu();
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("1. Power On");
                                    System.out.println("2. Power Off");
                                    System.out.print("Select : ");
                                    int powerChoice = scanner.nextInt();
                                    if (powerChoice == 1) {
                                        Arya.turnOnThePhone();
                                    } else if (powerChoice == 2) {
                                        Arya.turnOffThePhone();
                                    } else {
                                        System.out.println("Invalid Choice");
                                    }
                                    break;
                                case 2:
                                    if (Arya.isPowerOn()) {
                                        Arya.volumeUp();
                                        System.out.println("Volume increased. Current volume: " + Arya.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 3:
                                    if (Arya.isPowerOn()) {
                                        Arya.volumeDown();
                                        System.out.println("Volume decreased. Current volume: " + Arya.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 4:
                                    if (Arya.isPowerOn()) {
                                        System.out.println("Current Volume: " + Arya.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 5:
                                    if (Arya.isPowerOn()) {
                                        System.out.println("Power status: " + (Arya.isPowerOn() ? "On" : "Off"));
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 6:
                                    if (Arya.isPowerOn()) {
                                        Arya.makePhoneLouder();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 7:
                                    if (Arya.isPowerOn()) {
                                        Arya.makePhoneSilent();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }
                            break;
                        case 4:
                            Pragusta.subMenu();
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("1. Power On");
                                    System.out.println("2. Power Off");
                                    System.out.print("Select : ");
                                    int powerChoice = scanner.nextInt();
                                    if (powerChoice == 1) {

                                        Pragusta.turnOnThePhone();
                                    } else if (powerChoice == 2) {
                                        Pragusta.turnOffThePhone();
                                    } else {
                                        System.out.println("Invalid Choice");
                                    }
                                    break;
                                case 2:
                                    if (Pragusta.isPowerOn()) {
                                        Pragusta.volumeUp();
                                        System.out.println("Volume increased. Current volume: " + Pragusta.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 3:
                                    if (Pragusta.isPowerOn()) {
                                        Pragusta.volumeDown();
                                        System.out.println("Volume decreased. Current volume: " + Pragusta.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 4:
                                    if (Pragusta.isPowerOn()) {
                                        System.out.println("Current Volume: " + Pragusta.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 5:
                                    if (Pragusta.isPowerOn()) {
                                        System.out.println("Power status: " + (Pragusta.isPowerOn() ? "On" : "Off"));
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 6:
                                    if (Pragusta.isPowerOn()) {
                                        Pragusta.makePhoneLouder();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 7:
                                    if (Pragusta.isPowerOn()) {
                                        Pragusta.makePhoneSilent();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    System.out.println();
                    break;
            }
        }
    }
}
