import java.util.*;

public class Q2_P1 {

    static void toSortByOccurrences(int[] inputFromUser) {
        Arrays.sort(inputFromUser);
        ArrayList<Integer> finalArr = new ArrayList<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < inputFromUser.length; i++) {
            set.add(inputFromUser[i]);
        }
        ArrayList<Integer> arrlist = new ArrayList<>(set);

        ArrayList<Integer> twoD = new ArrayList<>();
        for(int i=0; i< arrlist.size(); i++){
            int count =0;
            for (int j=0; j< inputFromUser.length; j++){
                if(arrlist.get(i)==inputFromUser[j]){
                    count++;
                }
            }
            twoD.add(count);
        }
        for(int i=0; i<arrlist.size(); i++){
            int max = Collections.max(twoD);
            int index = twoD.indexOf(max);
            int j=max;
            while(j>0){
                finalArr.add(arrlist.get(index));
                j--;
            }
            twoD.remove(index);
            arrlist.remove(index);
        }
        for(int ele:finalArr){
            System.out.print(ele+" ");
        }
        for(int ele:arrlist){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfInputs = sc.nextInt();
        int[] input = new int[noOfInputs];
        for (int i = 0; i < noOfInputs; i++){
            input[i] = sc.nextInt();
        }
        toSortByOccurrences(input);
    }
}

