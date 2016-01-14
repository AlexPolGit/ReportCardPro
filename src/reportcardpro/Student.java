package reportcardpro;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import java.util.*;

public class Student
{
    public String name;
    public String gender;
    public Calendar birthDate;
    public Calendar today = new GregorianCalendar();
    public ArrayList<Subject> subjects = new ArrayList<>();
    public DecimalFormat df = new DecimalFormat("#.##");
    public File studentPicture;
    public BufferedImage pic;
    public UUID id;
    
    public Student(String sID, String sName, String sGender, int sYear, int sMonth, int sDay)
    {
        this.id = UUID.fromString(sID);
        this.name = sName;
        this.gender = sGender;
        this.birthDate = new GregorianCalendar(sYear, sMonth++, sDay);
        this.studentPicture = new File("pictures//" + sID + ".png");
    }
    
    public Student(UUID sID, String sName, String sGender, int sYear, int sMonth, int sDay)
    {
        this.id = sID;
        this.name = sName;
        this.gender = sGender;
        this.birthDate = new GregorianCalendar(sYear, sMonth++, sDay);
        this.studentPicture = new File("pictures//" + sID + ".png");
    }
    
    public void setID(UUID toID)
    {
        this.id = toID;
    }
    
    public void setID(String toID)
    {
        this.id = UUID.fromString(toID);
    }
    
    public void newRandomID()
    {
        this.id = UUID.randomUUID();
    }

    public void setName(String toName)
    {
        this.name = toName;
    }
    
    public void setGender(String toGender)
    {
        this.gender = toGender;
    }
    
    public void setBirthday(int year, int month, int day)
    {
        this.birthDate = new GregorianCalendar(year, month++, day);
    }

    public void setSubjects(ArrayList<Subject> toSubjects)
    {
        this.subjects = toSubjects;
    }
    
    public void setPictureFile(String picName)
    {
        this.studentPicture = new File(picName + ".png");
    }
    
    public void setPicture(BufferedImage toPicture)
    {
        this.pic = new BufferedImage(0, 0, 0);
    }
   
    public void addSubject(Subject toAdd)
    {
        this.subjects.add(toAdd);
        sortSubjects();
    }
    
    public void addSubject(String name, String desc)
    {
        this.subjects.add(new Subject(name, desc));
        sortSubjects();
    }
    
    public void removeSubject(Subject toRemove)
    {
        this.subjects.remove(toRemove);
        sortSubjects();
    }
    
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
    
    public void sortSubjects()
    {
        Collections.sort(subjects, new SubjectComparator());
    }
    
    public void listSubjects()
    {
        System.out.println(this.name + "'s Subjects:");
        for (Subject s: subjects)
        {
            System.out.println(" - " + s.subjectName);
            for (Mark m: s.marks)
            {
                String mark = Double.toString(m.mark);
                if (m.mark == 0.0)
                {
                    mark = "Zero!";
                }
                System.out.print("Mark: "+ m.mark + " (Weight: " + m.markWeight + ", " + m.getMarkType() + "), ");
            }
            System.out.print("MEAN AVG: " + df.format(s.getMeanAverage()) + ", ");
            System.out.println("MEDIAN AVG: " + df.format(s.getMedianAverage()));
        }
        System.out.println("Overall Mean Average: " + df.format(this.getOverallMeanAverage()));
        System.out.println("Overall Median Average: " + df.format(this.getOverallMedianAverage()));
    }
    
    public Double getOverallMeanAverage()
    {
        int numOfSubs = subjects.size();
        Double sum = 0.0;
        for (Subject s : subjects)
        {
            sum += s.getMeanAverage();
        }
        return (sum / numOfSubs);
    }
    
    public Double getOverallMedianAverage()
    {
        int numOfSubs = subjects.size();
        Double median = 0.0;
        if (numOfSubs%2 == 1)
        {
            median = subjects.get((int)Math.floor(numOfSubs / 2)).getMeanAverage();
        }
        else if (numOfSubs%2 == 0)
        {
            median = ((subjects.get(numOfSubs / 2).getMeanAverage()) + (subjects.get((numOfSubs / 2) - 1).getMeanAverage())) / 2;
        }
        return median;
    }
    
}