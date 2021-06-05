package models;

public class Links
{
    private Patch patch;

    private String webcast;

    private Flickr flickr;

    private Reddit reddit;

    private String wikipedia;

    private String youtube_id;

    private String presskit;

    private String article;

    public Patch getPatch ()
    {
        return patch;
    }

    public void setPatch (Patch patch)
    {
        this.patch = patch;
    }

    public String getWebcast ()
    {
        return webcast;
    }

    public void setWebcast (String webcast)
    {
        this.webcast = webcast;
    }

    public Flickr getFlickr ()
    {
        return flickr;
    }

    public void setFlickr (Flickr flickr)
    {
        this.flickr = flickr;
    }

    public Reddit getReddit ()
    {
        return reddit;
    }

    public void setReddit (Reddit reddit)
    {
        this.reddit = reddit;
    }

    public String getWikipedia ()
    {
        return wikipedia;
    }

    public void setWikipedia (String wikipedia)
    {
        this.wikipedia = wikipedia;
    }

    public String getYoutube_id ()
    {
        return youtube_id;
    }

    public void setYoutube_id (String youtube_id)
    {
        this.youtube_id = youtube_id;
    }

    public String getPresskit ()
    {
        return presskit;
    }

    public void setPresskit (String presskit)
    {
        this.presskit = presskit;
    }

    public String getArticle ()
    {
        return article;
    }

    public void setArticle (String article)
    {
        this.article = article;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [patch = "+patch+", webcast = "+webcast+", flickr = "+flickr+", reddit = "+reddit+", wikipedia = "+wikipedia+", youtube_id = "+youtube_id+", presskit = "+presskit+", article = "+article+"]";
    }
}

