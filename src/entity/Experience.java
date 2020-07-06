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
// year of experience (ExpInYear) (int), Professional Skill (ProSkill) (String). 

public class Experience extends Candidate{
    private int ExpInyear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int ExpInyear, String proSkill, String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.ExpInyear = ExpInyear;
        this.proSkill = proSkill;
    }

    public int getExpInyear() {
        return ExpInyear;
    }

    public void setExpInyear(int ExpInyear) {
        this.ExpInyear = ExpInyear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
 
    
    
}
