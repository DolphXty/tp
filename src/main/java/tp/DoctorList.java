package tp;

import tp.person.Doctor;
import tp.person.Person;

import javax.print.Doc;
import java.util.ArrayList;

public class DoctorList {
    public static String boundary = "____________________________________________________________"
                                            + System.lineSeparator();
    protected ArrayList<Doctor> doctors = new ArrayList<>();
    protected int size = 0;

    public DoctorList() {
        size = 0;
    }

    public Person getDoctor(int index) {
        return doctors.get(index - 1);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        size++;
        System.out.println(boundary + "Noted. I've added this doctor:");
        System.out.println(doctors.get(size - 1));
        System.out.print("Now you have " + size
                                 + " doctors recorded in the system." + System.lineSeparator() + boundary);
    }

    public int getSize() {
        return size;
    }

    public void deleteDoctor(int index) {
        System.out.println(boundary + "Noted. I've removed this doctor:");
        System.out.println(doctors.get(index - 1));
        System.out.print("Now you have " + (size - 1)
                                 + " doctors in the system." + System.lineSeparator() + boundary);
        doctors.remove(index - 1);
        size -= 1;
    }

    public void searchDoctor(String id){
        boolean found = false;
        for (int i = 0; i < doctors.size(); i++){
            if (doctors.get(i).getId().trim().equals(id)){
                System.out.println(boundary + "Here is the doctor found:");
                System.out.println(doctors.get(i));
                System.out.print(boundary);
                found = true;
            }
        }
        if (!found) {
            System.out.print(boundary + "Doctor not found."
                                     + System.lineSeparator() + boundary);
        }
    }

    @Override
    public String toString() {
        String toPrint = boundary + "Here are the doctors in this hospital:" + System.lineSeparator();
        for (int i = 1; i <= size; i++) {
            toPrint += (i + ". " + getDoctor(i) + System.lineSeparator());

        }
        toPrint += ("You have " + size + " doctors recorded in the system."
                            + System.lineSeparator() + boundary + System.lineSeparator());
        return toPrint;
    }
}
