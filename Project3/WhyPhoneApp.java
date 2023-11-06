package Project3;

public class WhyPhoneApp {
    public static void main(String[] args) {
        WhyPhone phone;
        phone = new WhyPhone(12.60, "Appal", "Black", 14.60, "Samsung");
        System.out.println();

        //methode
        showSpace(phone);
    }

    public static void showSpace(WhyPhone phone) {
        //roep alle methoden
        phone.shootAPhoto(34.6);
        phone.viewPhotos();
        phone.locate(36.8,88.9);
        phone.navigate();
        phone.playChannel(1.2);
        phone.changeChannel(4.6);
        phone.startCall("0456-678-456");
        phone.endCall();
        phone.connect("wifi");
        phone.disconnect("wifi disconnect");

    }
    }
