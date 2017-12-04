public class day3_part1{
    public static void main(String[] args) {
        int number = 26;
        int count = 1;
        int square = count*count;
        int size = 1;
        int distance = 0;

        while ((number - square) > 0){
            count+=2;
            size+=2;
            square = count*count;
            distance++;
        }
        count -= 2;
        square = count*count;
        int array[][] = new int[size][size];
        int center =((int) Math.floor(size/2)) - 1;
        
        for (int i = -1; i < size; i++){ //fill in left side of array
            
            array[size -1][center + i]
        }
        System.out.println(center);

    }
}