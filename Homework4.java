package Homework4;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Homework4 {
   static ArrayList<String> list_fname = new ArrayList<>();
    static ArrayList<String> list_lname = new ArrayList<>();
    static ArrayList<String> list_tname = new ArrayList<>();
    static ArrayList<Integer> list_age = new ArrayList<>();
   static ArrayList<Boolean> list_sex = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();

    public static void main(String[] args) {

        putTo("Kotov Peter Petrovich", 23, "M");
        putTo("Petrov Petr Petrovich", 45, "M");
        putTo("Ivanov Ivan Ivanovich", 36, "M");
        putTo("Abramova Anna Ivanovna", 50, "F");
        putTo("Serova Dina Mihaylovna", 40, "F");

        

        int cnt = list_age.size()-1;
        while (cnt > -1) {
            int max_age = list_age.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (max_age < list_age.get(linkedlist.get(i))){
                    max_age = list_age.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);

            cnt--;
        }
        linkedlist.forEach(i ->
                System.out.println(list_fname.get(i) + list_lname.get(i) + list_tname.get(i) + list_age.get(i) + list_sex.get(i)));


    }

    private static void putTo(String fio, int age, String gender) {
        list_age.add(age);
        String [] fio1 = fio.split(" ");
        list_fname.add(fio1[1]);
        list_lname.add(fio1[0]);
        list_tname.add(fio1[2]);
        if (gender.contains("F")) {list_sex.add(true);} else {list_sex.add(false);}
        linkedlist.add(list_age.size() - 1);
    }
}
