import java.util.Arrays;

public class day3_part1{
    public static void main(String[] args) {
        int number = 312051;
        int count = 1;
        int square = count*count;
        int size = 1;
        int distance = 0;
        int offset = 0;
        if(number == 1){
            distance = 0;
        } else {
            while ((number - square) > 0){
                count+=2;
                size+=2;
                square = count*count;
                distance++;
                offset++;
            }

            square = count*count;

            int center1 = square - (count - 1)/2;
            int center2 = square - (count - 1)/2 - (size - 1);
            int center3 = square - (count-1)/2 - 2*(size - 1);
            int center4 = square - (count-1)/2 - 3*(size - 1);

            int hdistance = Math.abs(number - center1);
            if(Math.abs(number - center2) < hdistance){
                hdistance = Math.abs(number - center2);
            }
            if(Math.abs(number - center3) < hdistance){
                hdistance = Math.abs(number - center3);
            }
            if(Math.abs(number - center4) < hdistance){
                hdistance = Math.abs(number - center4);
            }

            distance +=hdistance;
            /*
            System.out.println(center1);
            System.out.println(center2);
            System.out.println(center3);
            System.out.println(center4);
            */
            

        }
        System.out.println(distance);
        //int current = count*count;
        //int array[][] = new int[size][size];
        //int center =((int) Math.floor(size/2)) - 1;
        
        /*for (int i = center+offset; i > -1; i--){ //fill in left side of array
            
            array[i][size -1] = current;
            if(current == number){
                break;
            }
            current++;

        } */

       
    }
}