package reportcardpro;

public enum MarkType
{
    TEST(2.0),
    QUIZ(1.0),
    QUEST(1.5),
    PROJECT(3.0),
    ASSIGNMENT(0.5),
    EXAM(10.0);

    private final Double weight;

    MarkType(Double weight)
    {
        this.weight = weight;
    }

    private Double weight() { return weight; }

    public Double getWeight()
    {
        return weight;
    }

    @Override
    public String toString()
    {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}