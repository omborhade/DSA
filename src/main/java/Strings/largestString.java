package Strings;

public class largestString {
    public static void main(String[] args) {
    /*    String str="sweetmango";
        System.out.println(str.substring(0,4));  ;*/

        String fruits[]={"mango","orange"," banana"," chikoo","appple", "zoopeee"};
        String largest = fruits[0];

        for (int i = 0; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i])<0){

                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
