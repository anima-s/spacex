package models;

public class Flickr
{
    private String[] small;

    private String[] original;

    public String[] getSmall ()
    {
        return small;
    }

    public void setSmall (String[] small)
    {
        this.small = small;
    }

    public String[] getOriginal ()
    {
        return original;
    }

    public void setOriginal (String[] original)
    {
        this.original = original;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [small = "+small+", original = "+original+"]";
    }
}
