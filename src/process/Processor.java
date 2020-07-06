package process;

import entity.Candidate;
import entity.Experience;
import entity.Fresher;
import entity.Internship;
import java.util.ArrayList;
import java.util.Calendar;
import validate.Validation;

/**
 *
 * @author Ninh Cong Luc
 */
public class Processor implements IProcess {

  
    public void createCandidate(ArrayList<Candidate> list, int type) {
        String id, phone, email;
        while (true) {
            id = Validation.getString("Input ID: ");
            if (!Validation.checkExisted(id, list)) {
                break;
            } else {
                System.err.println("ID has existed !!");
            }
        }

        String firstName = Validation.getName("Input first name: ");
        String lastName = Validation.getName("Input last name: ");
        int birthDate = Validation.getInt("Input birth date: ", 1900, Calendar.getInstance().get(Calendar.YEAR));
        String address = Validation.getString("Input address: ");
        while (true) {
            phone = Validation.getPhone("Input phone: ");
            if (!Validation.checkExisted(phone, list)) {
                break;
            } else {
                System.err.println("Phone has existed !!");
            }
        }
        while (true) {
            email = Validation.getEmail("Input email: ");
            if (!Validation.checkExisted(email, list)) {
                break;
            } else {
                System.err.println("Email has existed !!");
            }
        }
        switch (type) {
            case 0://int ExpInyear, String proSkill, String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type
                int ExpInYear = Validation.getInt("Enter experience year: ", 0, 100);
                String proSkill = Validation.getString("Enter professional skill: ");
                list.add(new Experience(ExpInYear, proSkill, id, firstName, lastName, birthDate, address, phone, email, type));
                break;
            case 1:
                int graduationDate = Validation.getInt("Enter graduation date: ", 1900, Calendar.getInstance().get(Calendar.YEAR));
                String graduationRank = Validation.getRank("Enter graduation rank: ");
                String university = Validation.getString("Enter university: ");
                list.add(new Fresher(graduationDate, graduationRank, university, id, firstName, lastName, birthDate, address, phone, email, type));
                break;
            case 2:
                String majors = Validation.getString("Enter majors: ");
                int semester = Validation.getInt("Enter semester: ", 1, Integer.MAX_VALUE);
                String universityName = Validation.getString("Enter university name: ");
                list.add(new Internship(majors, semester, universityName, id, firstName, lastName, birthDate, address, phone, email, type));
                break;
        }
     
    }

    @Override
    public void displayData(ArrayList<Candidate> list) {
        for (Candidate x : list) {
            if (x.getType() == 0) {
                System.out.println("=========Experience Candidate===========");
                System.out.println(x.getFirstName() + " " + x.getLastName());
            }
        }
        for (Candidate x : list) {
            if (x.getType() == 1) {
                System.out.println("=========Fresher Candidate===========");
                System.out.println(x.getFirstName() + " " + x.getLastName());
            }
        }
        for (Candidate x : list) {
            if (x.getType() == 2) {
                System.out.println("=========Internship Candidate===========");
                System.out.println(x.getFirstName() + " " + x.getLastName());
            }
        }
    }

    @Override
    public void search(ArrayList<Candidate> list) {
        int check = 0;
        Processor p = new Processor();
        p.displayData(list);
        String name = Validation.getString("Input Candidate name(first name or last name): ").toLowerCase();
        int type = Validation.getInt("Input type of candidate: ", 0, 2);
        for (Candidate x : list) {
            if (x.getType() == type && (x.getFirstName().toLowerCase().contains(name) || x.getLastName().toLowerCase().contains(name))) {
                System.out.println(x);
                check = 1;
            }
        }
        if(check == 0) {
            System.out.println("Not found !!!");
        }
    }

}
