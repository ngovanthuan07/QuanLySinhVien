/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ngova
 */
public class StudentManagement {

    ArrayList<Student> list = new ArrayList<>();

    public void input() {
        int num;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("    Nhap vao so luong sinh vien: ");
        num = keyboard.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("    Nhap thong tin sinh vien thu: " + i);
            System.out.println("    ID: ");
            int id = Integer.parseInt(keyboard.next());
            keyboard.nextLine();// Xoa bo nho dem
            System.out.println("    Ten: ");
            String name = keyboard.nextLine();
            System.out.println("Nhap diem trung binh: ");
            double aver = Double.parseDouble(keyboard.next());

            Student st = new Student(id, name, aver);

            list.add(st);
        }
        System.out.println("\n------------------------\n");

    }

    public void view() {
        if (list.size() == 0) {
            System.out.println("List isn't empty");
            return;
        }

        System.out.println("    Thong tin danh sach sinh vien");
        int i = 1;
        for (Student sts : list) {
            System.out.println("    " + i++ + ".  ID=" + sts.getId() + " Ten=" + sts.getName() + ", Diem trung binh=" + sts.getAver());
        }
        System.out.println("\n------------------------\n");
    }

    public void search() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("    Nhap ten sinh vien can tim: ");
        String name = keyboard.nextLine();
        System.out.println("\n--Thong tin tim kiem duoc--");
        ArrayList<Student> seekStudens = (ArrayList<Student>) list.stream().filter(student 
                        -> student.getName().equals(name))
                        .collect(Collectors.toList());
        
        if(seekStudens.size() == 0){
            System.out.println("Khong Tim Thay");
            return;
        }
        
        seekStudens.forEach(student ->{
            System.out.println(".  ID=" + student.getId() + " Ten=" +student.getName() + ", Diem trung binh=" + student.getAver());
        });
        System.out.println("----------------------------------------");
    }
    
    public void sort(){
        Collections.sort(list, Helper::compareAver);
        
        this.view();
    }
    
    public StudentManagement() {
        while (true) {
            System.out.println("*-CHUONG TRINH QUAN LY SINH VIEN-*");
            System.out.println("*-Chuc nang chinh chuong trinh-*");
            System.out.println("    1. Nhap danh sach sinh vien ");
            System.out.println("    2. Xem danh sach sinh vien  ");
            System.out.println("    3. Sap xep danh sach sinh vien theo diem trung binh ");
            System.out.println("    4. Tim sinh vien theo ten   ");
            System.out.println("    5. Thoat");
            System.out.println("---------------------------------");

            int num;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("    Nhap mot so de chon chuc nang: ");
            num = keyboard.nextInt();

            switch (num) {
                case 1:
                    this.input();
                    break;
                case 2:
                    this.view();
                    break;
                case 3:
                    this.sort();
                    break;
                case 4:
                    this.search();
                    break;
                case 5:
                    System.out.println("----------- Chuong trinh ket thuc ----------");
                    return;

            }
        }
    }

    public static void main(String[] args) {
        new StudentManagement();
    }
}
