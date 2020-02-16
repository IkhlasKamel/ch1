/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Ikhlas Kamel
 */


  public class ItStudent extends students{

    public ItStudent(int id, String name,double mid , double project,double finall) {
        this.id = id;
        this.name = name;
        this.grade = (mid*0.30) + (project*0.30) + (finall*0.40);
    }

    
}
