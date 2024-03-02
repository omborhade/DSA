package Strings;

public class compression {//aaabbbccddd=a3b3c2d3

    public static  StringBuilder compress(String str){
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <str.length() ; i++) {
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb = sb.append(count.toString());
            }

        }
        return sb;
    }
    public static void main(String[] args) {
        String str = "abcdde";
        System.out.println(compress(str));
    }
}
