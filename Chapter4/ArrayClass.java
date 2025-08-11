import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] ids,types; // En este caso se crean dos variables de referencia de tipo int[]

        int id[],types2;//Crea una variable de referencia id tipo int[] y otra tipo int

        String[] bugs = {"cricket","bettle","ladybug"};
        String [] alias = bugs;

        System.out.println(bugs.equals(alias));


        System.out.println(Arrays.toString(bugs));

        String[] mammals = {"Monkey","Chimp","Donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);

        var birds = new String[6];
        System.out.println(birds.length);

        int[] numbers = {13,4,7};
        Arrays.sort(numbers);

        for(int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]+ " ");


        var twoD = new int[3][2];
/*       for(int i =0;i<twoD.length;i++){
            for(int j=0;j<twoD[i].length;j++)
                System.out.println(twoD[i][j] +" ");
            System.out.println();
        }*/  

        for(int[] inner:twoD){
            for(int num : inner)
                System.out.println(num+ " ");
            System.out.println();
            
        }




        
    }
}
