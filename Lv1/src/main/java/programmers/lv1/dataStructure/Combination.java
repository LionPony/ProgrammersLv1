package programmers.lv1.dataStructure;

public class Combination {
    public static void main(String[] args){
        Combination combination = new Combination();
        combination.combination(new boolean[4], 0, 2);
    }

    public void combination(boolean[] array, int start, int depth){
        if(depth == 0){
            print(array);
            return;
        }

        for(int i = start; i < array.length; i++){
            array[i] = true;
            combination(array, i+1, depth-1);
            array[i] = false;
        }
    }
    public void print(boolean[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i]){
                System.out.print(i + "\t");
            }
        }
        System.out.print("\n");
    }
}
