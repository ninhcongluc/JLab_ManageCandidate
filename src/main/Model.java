/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Candidate;
import entity.Experience;
import java.util.ArrayList;
import java.util.List;
import process.Processor;
import validate.Validation;

/**
 *
 * @author Ninh Cong Luc
 */
public class Model {

    // menu 
    public int menu() {
        System.out.println("==========Manage Candidate Program=========="
                + "\n1. Experience"
                + "\n2. Fresher"
                + "\n3. Internship"
                + "\n4. Search"
                + "\n5. Exist");
        int choice = Validation.getInt("Enter your chocie :", 1, 5);
        return choice;
    }

    // display ( write switch case ) 
    public void outputProgram() {
        Processor p = new Processor();
        ArrayList<Candidate> list = new ArrayList<Candidate>();
        while (true) {
            int choice = menu();
            switch (choice) {
                case 1:
                    p.createCandidate(list, 0);
                    break;
                case 2:
                    p.createCandidate(list, 1);
                    break;
                case 3:
                    p.createCandidate(list, 2);
                    break;
                case 4:
                    p.search(list);
                    break;
                case 5: return;
            }
        }
    }
}
