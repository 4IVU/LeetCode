import java.util.HashMap;
public class RomanNum {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNums = new HashMap<>();
        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);

        int num = 0;
        for (int i = 0; i < s.length(); i++) {



            if (i<s.length()-1 && romanNums.get(s.charAt(i))<romanNums.get(s.charAt(i+1))) //если 1 по индексу буква < 2 буквы
            {
                num -= romanNums.get(s.charAt(i));} // если число слева меньше то вычитаем
            else{
                num+= romanNums.get(s.charAt(i));// если больше то прибавляем
            }

        }
        return num;



    }

    public static void main(String[] args) {
        RomanNum roman = new RomanNum();

        System.out.print(roman.romanToInt("CMVI"));
    }
}
