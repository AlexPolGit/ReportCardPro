package reportcardpro;

import java.util.Comparator;

class TeacherComparator implements Comparator<Teacher>
{
    @Override
    public int compare(Teacher t1, Teacher t2)
    {
        return t1.name.compareToIgnoreCase(t2.name);
    }
}

class StudentComparator implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.name.compareToIgnoreCase(s2.name);
    }
}

class SubjectComparator implements Comparator<Subject>
{
    @Override
    public int compare(Subject s1, Subject s2)
    {
        return s1.subjectName.compareToIgnoreCase(s2.subjectName);
    }
}

class SubjectComparatorByMark implements Comparator<Subject>
{
    @Override
    public int compare(Subject s1, Subject s2)
    {
        return s1.getMeanAverage().compareTo(s2.getMeanAverage());
    }
}

class MarkComparator implements Comparator<Mark>
{
    @Override
    public int compare(Mark m1, Mark m2)
    {
        return m1.mark.compareTo(m2.mark);
    }
}

/**
 *
 * @author websj1127
 */
public class Comparators
{}
