package reportcardpro;

public class Mark
{
    public Double mark;
    public String markType;
    public Double markWeight;
    
    public final String QUIZ = "Quiz";
    public final String TEST = "Test";
    public final String QUEST = "Quest";
    public final String PROJECT = "Project";
    public final String ASSIGNMENT = "Assignment";
    public final String EXAM = "Exam";
    
    public Mark(Double mark, Double weight)
    {
        this.mark = mark;
        this.markWeight = weight;
    }
    
    public void setMark(Double toMark)
    {
        this.mark = toMark;
    }
    
    public void setMarkWeight(Double toWeight)
    {
        this.markWeight = toWeight;
    }
    
    public void setMarkType(String toType)
    {
        this.markType = toType;
    }
    
    public String getMarkType()
    {
        String type;
        if (markWeight == 1.0)
        {
            type = QUIZ;
        }
        else if (markWeight == 2.0)
        {
            type = TEST;
        }
        else if (markWeight == 1.5)
        {
            type = QUEST;
        }
        else if (markWeight == 3.0)
        {
            type = PROJECT;
        }
        else if (markWeight == 0.5)
        {
            type = ASSIGNMENT;
        }
        else if (markWeight == 10.0)
        {
            type = EXAM;
        }
        else
        {
            type = "Custom";
        }
        return type;
    }
}