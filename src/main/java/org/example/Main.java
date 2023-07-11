package org.example;

public class Main {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testRemoveToDoList();
    }
    /*
    Menampilkan To Do List
     */
    public static void showToDoList() {
        for (var i = 0; i<model.length; i++){
            var todo = model[i];
            var no = i+1;

            if (todo != null) {
                System.out.println(no+"."+todo);
            }
        }
    }
    public static void testShowToDoList() {
        model[0] = "Belajar Java Beginner";
        model[1] = "Belajar Java Intermediate";
        model[2] = "Belajar Java Advance";
        model[3] = "Belajar Java Pro";
        showToDoList();
    }
    /*
    Menambah To Do List
     */
    public static void addToDoList(String todo) {
        // Cek Apakah data model sudah full
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                // Model masih ada yg kosong isFull= false
                isFull = false;
                break;
            }
        }
        // Jika model sudah full, resize array
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int j = 0; j < temp.length; j++) {
                model[j] = temp[j];
            }
        }
        // Menambah ke posisi data array yang Null
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddToDoList() {
        for (int i = 1; i <= 25; i++) {
            addToDoList("Contoh Add Todo List ke." + i);
        }
        showToDoList();
    }

    /*
    Mengurangi To Do List
     */
    public static boolean removeToDoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == model.length - 1) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }

            }
            return true;
        }
    }

    public static void testRemoveToDoList() {
        addToDoList("Satu");
        addToDoList("Dua");
        addToDoList("Tiga");
        addToDoList("Empat");
        addToDoList("Lima");

        var result = removeToDoList(20);
        System.out.println(result);
        result = removeToDoList(4);
        System.out.println(result);
        result = removeToDoList(2);
        System.out.println(result);

        showToDoList();
    }

    // Tampilan
    public static void viewShowToDoList() {

    }
    public static void viewAddToDoList() {

    }
    public static void viewRemoveToDoList() {

    }


}