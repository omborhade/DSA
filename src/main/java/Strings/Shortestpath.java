package Strings;

public class Shortestpath {
    //given a route containing 4 direction(E,W,N,S) find the shortest distance to reach destination

    public static float shortestpath(String route) {
           int x = 0 , y= 0;

        for (int i = 0; i < route.length() ; i++) {
            int direction = route.charAt(i);

            if(direction == 'E'){
                x--;
            }if( direction =='W'){
                x++;
            }
            if(direction == 'N'){
                y++;
            }if( direction =='S'){
                y--;
            }


        }
        float X = x*x;
        float Y = y*y;

        return (float) Math.sqrt(X+Y);
    }
    public static void main(String[] args) {
        String route ="WNEENESENNN";
       // shortestpath(route);
        System.out.println(shortestpath(route));
    }
}
