package pkg1;

public class Flats2DArrays {
    public static void main(String[] args) {
        int[][] RoomNo = new int[9][5];
        RoomNo [0][0] = 101;
        RoomNo [0][1] = 102;
        RoomNo [0][2] = 103;
        RoomNo [0][3] = 104;
        RoomNo [0][4] = 105;

        RoomNo [1][0] = 201;
        RoomNo [1][1] = 202;
        RoomNo [1][2] = 203;
        RoomNo [1][3] = 204;
        RoomNo [1][4] = 205;

        RoomNo [2][0] = 301;
        RoomNo [2][1] = 302;
        RoomNo [2][2] = 303;
        RoomNo [2][3] = 304;
        RoomNo [2][4] = 305;

        RoomNo [3][0] = 401;
        RoomNo [3][1] = 402;
        RoomNo [3][2] = 403;
        RoomNo [3][3] = 404;
        RoomNo [3][4] = 405;

        RoomNo [4][0] = 501;
        RoomNo [4][1] = 502;
        RoomNo [4][2] = 503;
        RoomNo [4][3] = 504;
        RoomNo [4][4] = 505;

        RoomNo [5][0] = 601;
        RoomNo [5][1] = 602;
        RoomNo [5][2] = 603;
        RoomNo [5][3] = 604;
        RoomNo [5][4] = 605;

        RoomNo [6][0] = 701;
        RoomNo [6][1] = 702;
        RoomNo [6][2] = 703;
        RoomNo [6][3] = 704;
        RoomNo [6][4] = 705;

        RoomNo [7][0] = 801;
        RoomNo [7][1] = 802;
        RoomNo [7][2] = 803;
        RoomNo [7][3] = 804;
        RoomNo [7][4] = 805;

        RoomNo [8][0] = 901;
        RoomNo [8][1] = 902;
        RoomNo [8][2] = 903;
        RoomNo [8][3] = 904;
        RoomNo [8][4] = 905;

        System.out.println("Welcome To JAVA FLAT using 2D Arrays");
        for (int storey = RoomNo.length-1 ; storey >= 0 ; storey--){
            for (int rn = 0 ; rn < RoomNo[storey].length ; rn++){
                System.out.print(RoomNo[storey][rn]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
