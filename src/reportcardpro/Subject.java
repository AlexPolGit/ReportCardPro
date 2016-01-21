package reportcardpro;

import java.util.*;
/**
 * The class finds the subjects of the student. 
 * <br>
 * The class finds the marks of the students for each subject
 * <br>
 * The class finds the median for each subject.
 */
public class Subject
{
    /**
     *The subject the student is being evaluated in.
     */
    public String subjectName;
    /**
     *A specific description of a subject the student is in.
     */
    public String subjectDescription;
    /**
     *The marks that the student received from assessments in a subject
     */
    public ArrayList<Mark> marks = new ArrayList<>();
    public String comment;
    
       /**
     *The comments for the teacher to add input about the student and their progress in their class.
<<<<<<< HEAD
     * @param sName  Name of the student
     * @param sDesc  Description of who they are and how they are doing in the subject.
=======
     * @param sName - Name of the subject.
     * @param sDesc -  A brief description for the subject.
>>>>>>> origin/master
     */
    public Subject(String sName, String sDesc)
    {
        this.subjectName = sName;
        this.subjectDescription = sDesc;
    }
    
   /**
     * @param name name of the subject the student is in.
     */
    public void setSubjectName(String name)
    {
        subjectName = name;
    }
    
     /**
     * @param description description of the subject the student is in.
     */
    public void setubjectDescription(String description)
    {
        subjectDescription = description;
    }
    
     /**
     * @param marksToSet the assessment marks put into a sorted list from highest mark to lowest.
     */
    public void setMarks(ArrayList<Mark> marksToSet)
    {
        marks = marksToSet;
        this.sortMarks();
    }
    
    /**
     * @param markToAdd a mark from an assessment that is added to the current final mark.
     * <br>
     * @param weightToAdd the weight of the assessed mark that needs to be added and calculated with the current final mark.
     */
    public void addMark(Double markToAdd, Double weightToAdd, String descToAdd)
    {
        marks.add(new Mark(markToAdd, weightToAdd, descToAdd));
        this.sortMarks();
    }
    
    /**
     * @param toAdd An assessed mark that needs to be added and then sorted with the other assessed marks.
     */
    public void addMark(Mark toAdd)
    {
        marks.add(toAdd);
        this.sortMarks();
    }
    
    /**
     * Removes an assessed mark from the sorted list and then updates the list without that mark.
     */
    public void removeMark(Mark toRemove)
    {
        marks.remove(toRemove);
        this.sortMarks();
    }
    
     /**
     *Sorts all of the assessed marks put into the program from highest mark to lowest.
     */
    public void sortMarks()
    {
        Collections.sort(marks, new MarkComparator());
    }
    
      /**
<<<<<<< HEAD
     * Finds the mean average of that student in a subject.
=======
     *
     * @param toComment
>>>>>>> origin/master
     */
    public void setComment(String toComment)
    {
        this.comment = toComment;
    }
    /**
     * @param desc Description of the type of mark assessment and a brief explanation of the assessment (what the student had to do)
     */
    public Mark getMarkByDescription(String desc)
    {
        for (Mark m: marks)
        {
            if (m.markDescription.equalsIgnoreCase(desc))
            {
                return m;
            }
        }
        System.err.println("Mark (" + desc + ") not found!");
        return null;
    }
    
    /**
     *Finds the mean average of that student in a subject.
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
     *Finds the median average of a class in a subject.
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