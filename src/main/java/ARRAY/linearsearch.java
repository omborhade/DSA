package ARRAY;

public class linearsearch {

    public static int linears(int numbers[],int key){
        for (int i = 0; i < numbers.length ; i++) {

            if(numbers[i]==key){
                return i;
            }
            }
        return  -1;

        }


    public static void main(String[] args) {
        int numbers[]={12,13,14,88,45,753,77};
                int key = 77;
         int index=  linears(numbers,key);
         if(index==-1){
             System.out.println("key not found");
         }else {
             System.out.println("key is at index "+index);
         }
    }
}
