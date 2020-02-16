/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Ikhlas Kamel
 */
public class Student {
     public static void main(String[] args) throws FileNotFoundException {
        students[] studentss = {
            new ArtStudent(458, "Reem", 100,100,100),
            new ArtStudent(748, "Laila",  0.11,7,5),
            new ArtStudent(147, "Sleman", 0.16,6,5),
            new ItStudent(963, "Emad", 20,10,5),
            new ItStudent(258, "SHEREEN", 25,15,5) };
        
        
//        for (int m = 0; m < students.length; m++) {
//            for(int s=0; s< students.length-1; s++){
//               if(students[s+1].getgrade() > 
//                       students[s].getgrade()){
//                   students temp = students[s];
//                   students[s]= students[s+1];
//                   students[s+1] = temp;
//               } 
//            }             
//        }
//        
        List<students> studentsList = Arrays.asList(studentss);
         studentsList  = studentsList.stream().sorted(Comparator.comparing(students::getgrade))
                .collect(Collectors.toList());
                
        System.out.println("Sorted students ================");
        for(students student: studentsList)
            System.out.println(student);  
    
     PrintWriter pp = new PrintWriter(new File("src/Student/std.data"));
     for(students gg:studentsList)
         pp.println(gg);
     
     pp.flush();
     pp.close();
}

}