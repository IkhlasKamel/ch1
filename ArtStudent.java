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
    public class ArtStudent extends students{

    public ArtStudent(int id, String name,double mid ,double report,double finall  ) {
        this.id = id;
        this.name = name;
        this.grade =  (mid*0.40) + (report*0.10) + (finall*0.50);        
    }
    
}

