package models;

public class Cores
{
    private String core;

    private String flight;

    private String landing_type;

    private String gridfins;

    private String landing_attempt;

    private String legs;

    private String landpad;

    private String reused;

    private String landing_success;

    public String getCore ()
    {
        return core;
    }

    public void setCore (String core)
    {
        this.core = core;
    }

    public String getFlight ()
    {
        return flight;
    }

    public void setFlight (String flight)
    {
        this.flight = flight;
    }

    public String getLanding_type ()
    {
        return landing_type;
    }

    public void setLanding_type (String landing_type)
    {
        this.landing_type = landing_type;
    }

    public String getGridfins ()
    {
        return gridfins;
    }

    public void setGridfins (String gridfins)
    {
        this.gridfins = gridfins;
    }

    public String getLanding_attempt ()
    {
        return landing_attempt;
    }

    public void setLanding_attempt (String landing_attempt)
    {
        this.landing_attempt = landing_attempt;
    }

    public String getLegs ()
    {
        return legs;
    }

    public void setLegs (String legs)
    {
        this.legs = legs;
    }

    public String getLandpad ()
    {
        return landpad;
    }

    public void setLandpad (String landpad)
    {
        this.landpad = landpad;
    }

    public String getReused ()
    {
        return reused;
    }

    public void setReused (String reused)
    {
        this.reused = reused;
    }

    public String getLanding_success ()
    {
        return landing_success;
    }

    public void setLanding_success (String landing_success)
    {
        this.landing_success = landing_success;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [core = "+core+", flight = "+flight+", landing_type = "+landing_type+", gridfins = "+gridfins+", landing_attempt = "+landing_attempt+", legs = "+legs+", landpad = "+landpad+", reused = "+reused+", landing_success = "+landing_success+"]";
    }
}