/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import entity.Candidate;
import java.util.ArrayList;

/**
 *
 * @author Ninh Cong Luc
 */
public interface IProcess {
    void createCandidate(ArrayList<Candidate> list, int type) ;
    void displayData(ArrayList<Candidate> list);
    void search(ArrayList<Candidate> list);
        
      
    
}
