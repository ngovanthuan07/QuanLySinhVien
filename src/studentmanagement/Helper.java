/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author ngova
 */
public class Helper {
    public static int compareAver(Student s1, Student s2){
        return (int) (s1.getAver() - s2.getAver());
    }
}
