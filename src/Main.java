import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        MobilePhone[] mobilePhones = new MobilePhone[5];
        MobilePhone mobilePhone = new MobilePhone();

        int i = 0;
        do {
            mobilePhone = MobilePhone.createPhone(i);
            if(!chceckArray(mobilePhone,mobilePhones)){
                mobilePhones[findFirstEmptyIndex(mobilePhones)] = mobilePhone;
                i++;
            }
        } while (i < mobilePhones.length);

        for (int j = 0; j < mobilePhones.length; j++)
            System.out.println("\nTelefon nr " + (j + 1) + ": " + mobilePhones[j].toString());

    }

    private static boolean chceckArray (MobilePhone mobilePhone, MobilePhone[] mobilePhones) {
        return Arrays.asList(mobilePhones).contains(mobilePhone);
    }

    private static int findFirstEmptyIndex(MobilePhone[] mobilePhones) {
        int firstEmpty;
        for (int i = 0; i < mobilePhones.length; i++) {
            if(mobilePhones[i] == null) {
                firstEmpty = i;
                return firstEmpty;
            }
        }
        return -1;
    }
}