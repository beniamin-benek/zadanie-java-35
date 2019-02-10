class Main {

    public static void main(String[] args) {

        MobilePhone[] mobilePhones = new MobilePhone[3];
        MobilePhone mobilePhone1 = new MobilePhone();
        MobilePhone mobilePhone2 = new MobilePhone();
        MobilePhone mobilePhone3 = new MobilePhone();

        //pierwszy telefon:
        mobilePhone1 = MobilePhone.createPhone(1);

        //drugi telefon:
        do {
            mobilePhone2 = MobilePhone.createPhone(2);

            if(mobilePhone2.equals(mobilePhone1))
                System.out.println("Błąd. Podany numer już istnieje. Spróbuj ponownie:");

        } while(mobilePhone2.equals(mobilePhone1));

        //trzeci telefon:
        do {
            mobilePhone3 = MobilePhone.createPhone(3);

            if(mobilePhone3.equals(mobilePhone1) || mobilePhone3.equals(mobilePhone2))
                System.out.println("Błąd. Podany numer już istnieje. Spróbuj ponownie:");

        } while(mobilePhone3.equals(mobilePhone1) || mobilePhone3.equals(mobilePhone2));

        //dodanie do tablicy
        mobilePhones[0] = mobilePhone1;
        mobilePhones[1] = mobilePhone2;
        mobilePhones[2] = mobilePhone3;

        for (int i = 0; i < mobilePhones.length; i++)
            System.out.println("\nTelefon nr " + (i + 1) + ": " + mobilePhones[i].toString());

    }

}