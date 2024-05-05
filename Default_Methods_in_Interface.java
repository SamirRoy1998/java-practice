package pkg1;

interface Camera {
    void takePicture();
    void recordVideo();
}

interface Wifi {
    String[] getNetwork();
    void ConnectToNetwork(String network);
}

class CellPhone {
    void callNumber(int phoneNumber) {System.out.printf("Calling %d%n", phoneNumber);}
    void pickCall() {System.out.println("Connecting...");}
}

public class Default_Methods_in_Interface {
}
