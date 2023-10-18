package Les3;

public enum Color {
    //constructor
    RED(100),
    GREEN(200),
    BLUE(300);

    private int colorCode;

    private Color(int colorCode){
        this.colorCode = colorCode;
    }

    int getColorCode(){
        return colorCode;
    }
    public void colorInfo(){
        System.out.println("Universal Color");
    }

}
