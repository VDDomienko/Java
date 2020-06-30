package org.example.classes;

import java.util.Scanner;

public class StudentObj {
    static Student[] stud = new Student[4];

    public static void setContactInfo(int i, String address, int phone){
        stud[i].setAddress(address);
        stud[i].setPhone(phone);
    }

    public static void setUnInfo(int i, int facultyId, int courseId, int groupId){

        String faculty = "";
        switch (facultyId){
            case 1:
                faculty = "Математический";
                break;
            case 2:
                faculty = "Физический";
                break;
        }

        String course = "";
        switch (courseId){
            case 1:
                course = "Первый курс";
                break;
            case 2:
                course = "Второй курс";
                break;
        }

        String group = "";
        switch (groupId){
            case 1:
                group = "ПО";
                break;
            case 2:
                group = "ПМ";
                break;
        }

        stud[i].setFaculty(faculty);
        stud[i].setCourse(course);
        stud[i].setGroup(group);
    }

    public static void getInfoS(int i){
        System.out.println(
                stud[i].getId() + " - " +
                stud[i].getSurname() + " - " +
                stud[i].getName() + " - " +
                stud[i].getMidName() + " - " +
                stud[i].getDoB() + " - " +
                stud[i].getAddress() + " - " +
                stud[i].getPhone() + " - " +
                stud[i].getFaculty() + " - " +
                stud[i].getCourse() + " - " +
                stud[i].getGroup()
        );
    }

    public static void setStudents(){
        stud[0] = new Student( 1, "Домиенко", "Вадим", "Денисович", "10.06.1998");
        setContactInfo(0,"adr-1", 555222);
        setUnInfo(0, 1, 2, 1);

        stud[1] = new Student( 2, "Домиенко", "Михаил", "Денисович", "20.06.1999");
        setContactInfo(1,"adr-2", 552322);
        setUnInfo(1, 1, 1, 1);

        stud[2] = new Student( 3, "Михайлов", "Михаил", "Михаилович", "10.07.2000");
        setContactInfo(2,"adr-3", 532222);
        setUnInfo(2, 1, 1, 1);

        stud[3] = new Student( 4, "Студентов", "Студент", "Студентович", "01.07.1997");
        setContactInfo(3,"adr-4", 444444);
        setUnInfo(3, 2, 1, 2);
    }

    public static void task1(){
        setStudents();

        System.out.println("Таск №1 - Список студентов заданного факультета");
        System.out.println();
        System.out.println("Выберете факультет:");
        System.out.println();
        System.out.println("1. Математический");
        System.out.println("2. Физический");
        System.out.println("3. Выход");
        System.out.println();
        System.out.print("----> ");

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();


        switch (k){
            case 1:
                for (int i = 0; i < 4; i++){
                    if (stud[i].getFaculty().equals("Математический")){
                        getInfoS(i);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < 4; i++){
                    if (stud[i].getFaculty().equals("Физический")){
                        getInfoS(i);
                    }
                }
                break;
            case 3:
                break;
            default:
                System.out.println("Ошибка ввода!");
        }
    }

    public static void task2(){
        setStudents();

        System.out.println("Таск №2 - Списки студентов для каждого факультета и курса");

        for (int i = 0; i < 4; i++){
            getInfoS(i);
        }
    }

    public static void task3(){
        setStudents();

        System.out.println("Таск №3 - Список студентов, родившихся после заданного года");
        System.out.println();
        System.out.print("Введите год:");
        System.out.println();
        System.out.println("----> ");

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        for (int i = 0; i < 4; i++){
            char[] dst=new char[4];
            stud[i].getDoB().getChars(6, 10, dst, 0);
            String dstS = new String(dst);
            int dstI = Integer.parseInt(dstS);
            if (k < dstI){
                getInfoS(i);
            }
        }
    }

    public static void task4(){
        setStudents();

        System.out.println("Таск №4 - Список учебной группы");
        System.out.println();
        System.out.println("Выберете Группу:");
        System.out.println();
        System.out.println("1. ПО");
        System.out.println("2. ПМ");
        System.out.println("3. Выход");
        System.out.println();
        System.out.print("----> ");

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        switch (k){
            case 1:
                for (int i = 0; i < 4; i++){
                    if (stud[i].getGroup().equals("ПО")){
                        getInfoS(i);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < 4; i++){
                    if (stud[i].getGroup().equals("ПМ")){
                        getInfoS(i);
                    }
                }
                break;
            case 3:
                break;
            default:
                System.out.println("Ошибка ввода!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Выберете пункт меню:");
        System.out.println();
        System.out.println("1. Список студентов заданного факультета");
        System.out.println("2. Списки студентов для каждого факультета и курса");
        System.out.println("3. Список студентов, родившихся после заданного года");
        System.out.println("4. Список учебной группы");
        System.out.println("5. Выход");
        System.out.println();
        System.out.print("----> ");

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        switch (k){
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
                task4();
                break;
            default:
                System.out.println("Ошибка ввода!");
        }
    }
}

