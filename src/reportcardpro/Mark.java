package reportcardpro;
/**
 * The class finds the mark of the student and the weight factor of each evaluation.
 * The class also has a custom feature in case the mark weight/assessment is not one of the options. in the program.
 */

public class Mark
{
    /**
     * The final mark of a subject rounded to two decimal places.
     */
    public Double mark;
    /**
     *The type of assessment and the mark the student received on the assessment.
     */
    public String markType;
    /**
     *The mark from an assessment and the impact it has on the final mark.
     */
    public Double markWeight;
    
    /**
     *Quiz assessment with a mark weight of 
     */
    public final String QUIZ = "Quiz";
    /**
     *Test assessment with a mark weight of 1.0% of the final mark for each subject.
     */
    public final String TEST = "Test";
    /**
     *Quest assessment with a mark weight of 2.0% of the final mark for each subject.
     */
    public final String QUEST = "Quest";
    /**
     *Project assessment with s mark weight of 1.5% of the final mark for each subject.
     */
    public final String PROJECT = "Project";
    /**
     *Assignment assessment with a mark weight of 3.0% of the final mark for each subject.
     */
    public final String ASSIGNMENT = "Assignment";
    /**
     *Exam assessment with a mark weight of 10.0% of the final mark for each subject.
     */
    public final String EXAM = "Exam";
    
    /**
     *
     * @param mark
     * finds the mark of  an assessment for a subject. 
     * @param weight
     * finds the weight of that mark for s subject.
     */
    public Mark(Double mark, Double weight)
    {
        this.mark = mark;
        this.markWeight = weight;
    }
    
    /**
     *
     * @param toMark
     * 
     */
    public void setMark(Double toMark)
    {
        this.mark = toMark;
    }
    
    /**
     *
     * @param toWeight
     * 
     */
    public void setMarkWeight(Double toWeight)
    {
        this.markWeight = toWeight;
    }
    
    /**
     *
     * @param toType
     * 
     */
    public void setMarkType(String toType)
    {
        this.markType = toType;
    }
    
    /**
     *finds the mark type: can be a quiz, test, quest, project, assignment, exam, or other (custom).
     * @return 
     */
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