import java.util.Scanner;

class MobilePhone {

    private String ownerFirstName;
    private String ownerSecondName;
    private int phoneNumber;

    MobilePhone(String ownerFirstName, String ownerSecondName, int phoneNumber) {
        this.ownerFirstName = ownerFirstName;
        this.ownerSecondName = ownerSecondName;
        this.phoneNumber = phoneNumber;
    }

    MobilePhone() {

    }

    static MobilePhone createPhone(int a) { //zmienna a mówi nam, który telefon z rzędu wczytujemy
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię właściciela " + (a + 1) + ". telefonu: ");
        String firstName1 = scanner.nextLine();
        System.out.print("Podaj nazwisko właściciela " + (a + 1) + ". telefonu: ");
        String secondName1 = scanner.nextLine();
        System.out.print("Podaj numer właściciela " + (a + 1) + ". telefonu: ");
        int number1 = scanner.nextInt(); scanner.nextLine();
        MobilePhone mobilePhone1 = new MobilePhone(firstName1, secondName1, number1);
        return mobilePhone1;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ownerFirstName == null) ? 0 : ownerFirstName.hashCode());
        result = prime * result + ((ownerSecondName == null) ? 0 : ownerSecondName.hashCode());
        result = prime * result + phoneNumber;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        MobilePhone other = (MobilePhone) obj;
        if (obj == null || getClass() != obj.getClass())
            return false;
        else {
            return this.ownerFirstName.equals(other.ownerFirstName)
                    && this.ownerSecondName.equals(other.ownerSecondName)
                    && this.phoneNumber == other.phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "\n - właściciel: " + ownerFirstName + " " + ownerSecondName
                + "\n - numer: " + phoneNumber;
    }

}