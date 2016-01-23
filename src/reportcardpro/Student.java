package reportcardpro;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import java.util.*;

/**
 *The class that finds the information of a student.
 * <br>
 * @param name The first and last name of the student.
 * <br>
 * @param gender The gender of the student   
 * <br>
 * @param birthdate The birth date of the student (year, month, day)
 * <br>
 * @param today The school schedule of the student for a specific day. (the subjects and at what time they have the subjects)
 * <br>
 * @param subjects The subjects/classes the student is in.
 * <br>
 * @param df
 * <br>
 * @param studentPicture The picture of the student.
 * <br>
 * @param pic The rendered picture of the student
 * <br>
 * @param id The student's id number.
 */
public class Student
{
    /**
     *The first and last name of the student.
     */
    public String name;
    /**
     *The gender of the student.
     */
    public String gender;
    /**
     *The birth date of the student (year, month, day)
     */
    public Calendar birthDate;
    /**
     *The school calendar of the student (the subjects and at what time they have the subjects)
     */
    public Calendar today = new GregorianCalendar();
    /**
     *The subjects/classes the student is in.
     */
    public ArrayList<Subject> subjects = new ArrayList<>();
    /**
     *
     */
    public DecimalFormat df = new DecimalFormat("#.##");
    /**
     *The picture of the student.
     */
    public File studentPicture;
    /**
     *The rendered picture of the student
     */
    public BufferedImage pic;
   /**
     *The student's id number.
     */
    public UUID id;
    
   /**
     * The information that is found from the id of the student.
     * @param sID
     * <br>
     * @param sName
     * <br>
     * @param sGender
     * <br>
     * @param sYear
     * <br>
     * @param sMonth
     * <br>
     * @param sDay
     */
    public Student(String sID, String sName, String sGender, int sYear, int sMonth, int sDay)
    {
        this.id = UUID.fromString(sID);
        this.name = sName;
        this.gender = sGender;
        this.birthDate = new GregorianCalendar(sYear, sMonth++, sDay);
        this.studentPicture = new File("pictures//" + sID + ".png");
    }
    
     /**
     *
     * @param sID
     * <br>
     * @param sName
     * <br>
     * @param sGender
     * <br>
     * @param sYear
     * <br>
     * @param sMonth
     * <br>
     * @param sDay
     */
    public Student(UUID sID, String sName, String sGender, int sYear, int sMonth, int sDay)
    {
        this.id = sID;
        this.name = sName;
        this.gender = sGender;
        this.birthDate = new GregorianCalendar(sYear, sMonth++, sDay);
        this.studentPicture = new File("pictures//" + sID + ".png");
    }
    
    /**
     *
     * @param toID
     */
    public void setID(UUID toID)
    {
        this.id = toID;
    }
    
    /**
     *
     * @param toID
     */
    public void setID(String toID)
    {
        this.id = UUID.fromString(toID);
    }
   /**
     *Generates a random ID number for the student.
     */
    public void newRandomID()
    {
        this.id = UUID.randomUUID();
    }

    /**
     *
     * @param toName
     */
    public void setName(String toName)
    {
        this.name = toName;
    }
    
    /**
     *
     * @param toGender
     */
    public void setGender(String toGender)
    {
        this.gender = toGender;
    }
    
   /**
     * sets the birth date of a student.
     * @param year The year the student was born in,
     * <br>
     * @param month The month the student was born in.
     * <br>
     * @param day The day the student was born in.
     */
    public void setBirthday(int year, int month, int day)
    {
        this.birthDate = new GregorianCalendar(year, month++, day);
    }

    /**
     *
     * @param toSubjects
     */
    public void setSubjects(ArrayList<Subject> toSubjects)
    {
        this.subjects = toSubjects;
    }
    
    /**
     *
     * @param picName
     */
    public void setPictureFile(String picName)
    {
        this.studentPicture = new File(picName + ".png");
    }
    
    /**
     *
     * @param toPicture
     */
    public void setPicture(BufferedImage toPicture)
    {
        this.pic = new BufferedImage(0, 0, 0);
    }
   
    /**
     *
     * @param toAdd
     */
    public void addSubject(Subject toAdd)
    {
        this.subjects.add(toAdd);
        sortSubjects();
    }
    
    /**
     * Adds a subject to a student's time table.
     * @param name The name of the subject the student is in.
     * <br>
     * @param desc A brief description of the course and the course code.
     */
    public void addSubject(String name, String desc)
    {
        this.subjects.add(new Subject(name, desc));
        sortSubjects();
    }
    
    /**
     *Removes a subject from a student's time table.
     * @param toRemove
     */
    public void removeSubject(Subject toRemove)
    {
        this.subjects.remove(toRemove);
        sortSubjects();
    }
    
    /**
     *
     * @return
     */
    public int getAge()
    {
        int age = (today.getTime().getYear() - birthDate.getTime().getYear());
        int birthMonth = birthDate.getTime().getMonth() + 1;
        int todayMonth = today.getTime().getMonth() + 1;
        int birthDay = birthDate.getTime().getDate();
        int todayDay = today.getTime().getDate();
        if (birthMonth > todayMonth)
        {
            age--;
        }
        else if (birthMonth == todayMonth)
        {
           if (birthDay > todayDay)
           {
               age--;
           }
        }
        return age;
    }
    
   /**
     *Sorts the subjects of a student alphabetically.
     */
    public void sortSubjects()
    {
        Collections.sort(subjects, new SubjectComparator());
    }
    
    public void sortSubjectsByAverages()
    {
        Collections.sort(subjects, new SubjectComparatorByMark());
    }

    
    /**
     *Puts the list of subjects in alphabetical order and the marks from lowest to highest for each subject.
     */
    public void listSubjects()
    {
        if (!subjects.isEmpty())
        {
            System.out.println(this.name + "'s Subjects:");
            for (Subject s: subjects)
            {
                System.out.println(" - " + s.subjectName);
                for (Mark m: s.marks)
                {
                    String mark = Double.toString(m.mark);
                    if (m.mark <= 0.0)
                    {
                        mark = "Zero!";
                    }
                    System.out.print("Mark: "+ m.mark + " (Weight: " + m.markWeight + ", " + m.getMarkType() + ", " + m.markDescription + "), ");
                }
                System.out.print("MEAN AVG: " + df.format(s.getMeanAverage()) + ", ");
                System.out.println("MEDIAN AVG: " + df.format(s.getMedianAverage()));
                System.out.println("Comment: " + s.comment);
            }
            System.out.println("Overall Mean Average: " + df.format(this.getOverallMeanAverage()));
            System.out.println("Overall Median Average: " + df.format(this.getOverallMedianAverage()));
        }
        else
        {
            System.out.println(this.name + " has no subjects.");
        }
    }
    
    /**
     *Finds the overall mean average for a subject.
     */
    public Double getOverallMeanAverage()
    {
        int numOfSubs = subjects.size();
        Double sum = 0.0;
        Double avg = 0.0;
        
        if (!subjects.isEmpty())
        {
            for (Subject s : subjects)
            {
                sum += s.getMeanAverage();
            }
            avg = (sum / numOfSubs);
        }
        return avg;
    }
    
    /**
     *Finds the overall median average for a subject.
     */
    public Double getOverallMedianAverage()
    {
        sortSubjectsByAverages();
        int numOfSubs = subjects.size();
        Double median = 0.0;
        
        if (numOfSubs > 0)
        {
            if (numOfSubs%2 == 1)
            {
                median = subjects.get((int)Math.floor(numOfSubs / 2)).getMeanAverage();
            }
            else if (numOfSubs%2 == 0)
            {
                median = ((subjects.get(numOfSubs / 2).getMeanAverage()) + (subjects.get((numOfSubs / 2) - 1).getMeanAverage())) / 2;
            }
            sortSubjects();
        }
        return median;
    }
      /**
     * Finds the name of each subject.
     * @param name the name of the subject the user is trying to find.
     * <br>
     * @return 
     */
    public Subject getSubjectByName(String name)
    {
        for (Subject s: subjects)
        {
            if (name.equalsIgnoreCase(s.subjectName))
            {
                return s;
            }
        }
        System.err.println("Subject (" + name + ") not found!");
        return null;
    }
}