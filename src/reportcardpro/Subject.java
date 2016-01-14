package reportcardpro;

import java.util.*;

public class Subject
{
    public String subjectName;
    public String subjectDescription;
    public double subjectAverage = 0.0;
    public ArrayList<Mark> marks = new ArrayList<>();
    public ArrayList<String> comments = new ArrayList<>();
    
    public Subject(String sName, String sDesc)
    {
        this.subjectName = sName;
        this.subjectDescription = sDesc;
    }
    
    public void setSubjectName(String name)
    {
        subjectName = name;
    }
    
    public void setubjectDescription(String description)
    {
        subjectDescription = description;
    }
    
    public void setMarks(ArrayList<Mark> marksToSet)
    {
        marks = marksToSet;
        this.sortMarks();
    }
    
    public void addMark(Double markToAdd, Double weightToAdd)
    {
        marks.add(new Mark(markToAdd, weightToAdd));
        this.sortMarks();
    }
    
    public void addMark(Mark toAdd)
    {
        marks.add(toAdd);
        this.sortMarks();
    }
    
    public void removeMark(Mark toRemove)
    {
        marks.remove(toRemove);
        this.sortMarks();
    }
    
    public void sortMarks()
    {
        Collections.sort(marks, new MarkComparator());
    }
    
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