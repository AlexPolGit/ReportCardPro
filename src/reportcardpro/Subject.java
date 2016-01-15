package reportcardpro;

import java.util.*;
/**
 * The class finds the subjects of the student, finds the marks of the students for each subject and finds the median for each subject.
 */
public class Subject
{
    /**
     *The subject(s) the student is being evaluated in.
     */
    public String subjectName;
    /**
     *A specific description of a subject the student is in.
     */
    public String subjectDescription;
    /**
     *The average of the subject the student is in.
     */
    public double subjectAverage = 0.0;
    /**
     *The marks that the student received from assessments in a subject
     */
    public ArrayList<Mark> marks = new ArrayList<>();
    /**
     *
     */
    public ArrayList<String> comments = new ArrayList<>();
    
    /**
     *The comments for the teacher to add input about the student.
     * @param sName - name of the student
     * @param sDesc - description of who they are and how they are doing in the subject.
     */
    public Subject(String sName, String sDesc)
    {
        this.subjectName = sName;
        this.subjectDescription = sDesc;
    }
    
    /**
     *
     * @param name
     */
    public void setSubjectName(String name)
    {
        subjectName = name;
    }
    
    /**
     *
     * @param description
     */
    public void setubjectDescription(String description)
    {
        subjectDescription = description;
    }
    
    /**
     *
     * @param marksToSet
     */
    public void setMarks(ArrayList<Mark> marksToSet)
    {
        marks = marksToSet;
        this.sortMarks();
    }
    
    /**
     *
     * @param markToAdd
     * @param weightToAdd
     */
    public void addMark(Double markToAdd, Double weightToAdd)
    {
        marks.add(new Mark(markToAdd, weightToAdd));
        this.sortMarks();
    }
    
    /**
     *
     * @param toAdd
     */
    public void addMark(Mark toAdd)
    {
        marks.add(toAdd);
        this.sortMarks();
    }
    
    /**
     *
     * @param toRemove
     */
    public void removeMark(Mark toRemove)
    {
        marks.remove(toRemove);
        this.sortMarks();
    }
    
    /**
     *
     */
    public void sortMarks()
    {
        Collections.sort(marks, new MarkComparator());
    }
    
    /**
     *
     * @return
     */
    public Double getMeanAverage()
    {
        double numOfMarks = 0.0;
        Double sum = 0.0;
        for (Mark m : marks)
        {
            sum += m.markWeight * m.mark;
            numOfMarks += m.markWeight;
        }
        return (sum / numOfMarks);
    }
    
    /**
     *
     * @return
     */
    public Double getMedianAverage()
    {
        int numOfMarks = marks.size();
        Double median = 0.0;
        if (numOfMarks%2 == 0)
        {
            median = (marks.get(numOfMarks / 2).mark + marks.get((numOfMarks / 2) - 1).mark) / 2;
        }
        else if (numOfMarks %2 == 1)
        {
            median = marks.get((int)Math.floor(numOfMarks / 2)).mark;
        }
        return median;
    }
}