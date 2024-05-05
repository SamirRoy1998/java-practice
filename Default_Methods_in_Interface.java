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

class SmartPhone1 extends CellPhone implements Camera,Wifi{

    @Override
    public void takePicture() {
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording..");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting the network list");
        String[] networkList= {"Samir","Jio Fiber 826","Airtel X-Stream 23"};
        return networkList;
    }

    @Override
    public void ConnectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }
}

public class Default_Methods_in_Interface {
}
