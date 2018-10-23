package task_digits;

import java.util.HashMap;
import java.util.Map;

public class Data {

    static Map<Integer, String> createMapWithUniqueNumbers(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Один");
        map.put(2,"Два");
        map.put(3,"Три");
        map.put(4,"Четыре");
        map.put(5,"Пять");
        map.put(6,"Шесть");
        map.put(7,"Семь");
        map.put(8,"Восемь");
        map.put(9,"Девять");
        map.put(11,"Одиннадцать");
        map.put(12,"Двенадцать");
        map.put(13,"Тринадцать");
        return map;
    }


    static Map<Integer, String> createMapWithUnits(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put((int)(Math.pow(10,3)),"Тысяч");
        map.put((int)(Math.pow(10,6)),"Миллион");
        return map;
    }

}


// 1 - тысяча 2,3,4 - тысячи, 5> тысяч
// 1 - миллион, 2,3,4 - миллиона , 5> миллионов
// 1-сто , 2 - сти , 3,4 - ста, 5> сот
