/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Ninh Cong Luc
 */
//graduated time (Graduation_date)(int), Rank of Graduation (Graduation_rank)(String) 
//and university where student graduated (Education) (String)
public class Fresher extends Candidate{
    private int graduaionDate;
    private String graduationRank;
    private String university;

    public Fresher() {
    }

    public Fresher(int graduaionDate, String graduationRank, String university, String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.graduaionDate = graduaionDate;
        this.graduationRank = graduationRank;
        this.university = university;
    }

    public int getGraduaionDate() {
        return graduaionDate;
    }

    public void setGraduaionDate(int graduaionDate) {
        this.graduaionDate = graduaionDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    
 
    
}
