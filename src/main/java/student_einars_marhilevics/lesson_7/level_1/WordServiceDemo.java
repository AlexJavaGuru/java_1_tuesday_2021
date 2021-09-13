package student_einars_marhilevics.lesson_7.level_1;

import java.util.Arrays;

class WordServiceDemo {
    public static void main(String[] args) {
        String myStr = "how,can I find the most-frequent word in an string how-can I find how how how string";
        String Str = myStr.replaceAll("[^\\dA-Za-z ]", " ");
        System.out.println(Str);
        String[] splited = Str.split(" ");
        Arrays.sort(splited);
        System.out.println(Arrays.toString(splited));
        int max = 0;
        int count= 1;
        String word = splited[0];
        String curr = splited[0];
        for(int i = 1; i<splited.length; i++){
            if(splited[i].equals(curr)){
                count++;
            }
            else{
                count =1;
                curr = splited[i];
            }
            if(max<count){
                max = count;
                word = splited[i];
            }
        }
        System.out.println(max + " x " + word);
    }
}