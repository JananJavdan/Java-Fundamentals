package Les1;

public class WhileLoopExample {
    public static void main(String[] args) {
        int[] numbersArr = {5,6,7,8,9};
        int index = 0;
        while (index < numbersArr.length){
            System.out.println("element op index" + index + "" + numbersArr[index]);
            index++;
        }
    }
}
