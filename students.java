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

    

public abstract class students {
 protected int id;
    protected String name;
    protected double grade;
       protected String major;

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getgrade() {
        return grade;
    }

    public void setgrade(double grade) {
        this.grade = grade;
    }
  public String getmajor() {
        return major;
    }

    public void setmajor(String major) {
        this.major = major;
    }
    @Override
    public String toString() {
        return  id + "   " + name + "   " + grade;
    }
    
}

