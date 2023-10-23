package Oefening2;

abstract class Planeten {

    final int OmtrekZon = 437000;
    final int OmtrekAarde = 40075;
    final int OmtrekMaan = 10917;

    final int brekenTotalOmtrek(){
        return OmtrekZon +  OmtrekAarde + OmtrekMaan;
    }
    abstract void result();


}




