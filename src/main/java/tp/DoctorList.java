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
    }

    public int getSize() {
        return size;
    }

    public Doctor deleteDoctor(int index) {
        Doctor curr = doctors.get(index - 1);
        size -= 1;
        return curr;
    }

    public Doctor searchDoctor(String id) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getId().trim().equals(id)) {
                return doctors.get(i);
            }
        }
        return null;
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
