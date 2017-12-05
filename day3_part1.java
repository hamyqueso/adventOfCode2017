import java.util.Arrays;

public class day3_part1{
    public static void main(String[] args) {
        int number = 26;
        int count = 1;
        int square = count*count;
        int size = 1;
        int distance = 0;
        int offset = 0;

        while ((number - square) > 0){
            count+=2;
            size+=2;
            square = count*count;
            distance++;
            offset++;
        }

        int center1 = (count - 1)/2;
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

        System.out.println(count);

    }
}