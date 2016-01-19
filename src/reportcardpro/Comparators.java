package reportcardpro;

import java.util.Comparator;

/**
 * compares two students name and sorts them alphabetically.
 */

class TeacherComparator implements Comparator<Teacher>
{
    @Override
    public int compare(Teacher t1, Teacher t2)
    {
        return t1.name.compareToIgnoreCase(t2.name);
    }
}
/**
 * 
 */
class StudentComparator implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.name.compareToIgnoreCase(s2.name);
    }
}

/**
 * compares the subject of the students 
 */
class SubjectComparator implements Comparator<Subject>
{
    @Override
    public int compare(Subject s1, Subject s2)
    {
        return s1.subjectName.compareToIgnoreCase(s2.subjectName);
    }
}
/**
 * compares the marks of two students and sorts them from lowest to highest.
 */

class MarkComparator implements Comparator<Mark>
{
    @Override
    public int compare(Mark m1, Mark m2)
    {
        return m1.mark.compareTo(m2.mark);
    }
}

/**
 *The class that compares two students information.
 */
public class Comparators
{}
