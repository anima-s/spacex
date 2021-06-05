package models;


public class Launch {
        private String launchpad;

        private String[] payloads;

        private String rocket;

        private String[] crew;

        private String date_unix;

        private Cores[] cores;

        private String auto_update;

        private String date_precision;

        private Links links;

        private String details;

        private String id;

        private String net;

        private String[] capsules;

        private String static_fire_date_utc;

        private String[] failures;

        private String date_local;

        private String flight_number;

        private String launch_library_id;

        private String fairings;

        private String[] ships;

        private String date_utc;

        private String static_fire_date_unix;

        private String success;

        private String tbd;

        private String name;

        private String window;

        private String upcoming;

        public String getLaunchpad ()
        {
            return launchpad;
        }

        public void setLaunchpad (String launchpad)
        {
            this.launchpad = launchpad;
        }

        public String[] getPayloads ()
        {
            return payloads;
        }

        public void setPayloads (String[]payloads)
        {
            this.payloads = payloads;
        }

        public String getRocket ()
        {
            return rocket;
        }

        public void setRocket (String rocket)
        {
            this.rocket = rocket;
        }

        public String[] getCrew ()
        {
            return crew;
        }

        public void setCrew (String[]crew)
        {
            this.crew = crew;
        }

        public String getDate_unix ()
        {
            return date_unix;
        }

        public void setDate_unix (String date_unix)
        {
            this.date_unix = date_unix;
        }

        public Cores[] getCores ()
        {
            return cores;
        }

        public void setCores (Cores[]cores)
        {
            this.cores = cores;
        }

        public String getAuto_update ()
        {
            return auto_update;
        }

        public void setAuto_update (String auto_update)
        {
            this.auto_update = auto_update;
        }

        public String getDate_precision ()
        {
            return date_precision;
        }

        public void setDate_precision (String date_precision)
        {
            this.date_precision = date_precision;
        }

        public Links getLinks ()
        {
            return links;
        }

        public void setLinks (Links links)
        {
            this.links = links;
        }

        public String getDetails ()
        {
            return details;
        }

        public void setDetails (String details)
        {
            this.details = details;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getNet ()
        {
            return net;
        }

        public void setNet (String net)
        {
            this.net = net;
        }

        public String[] getCapsules ()
        {
            return capsules;
        }

        public void setCapsules (String[]capsules)
        {
            this.capsules = capsules;
        }

        public String getStatic_fire_date_utc() {
            return static_fire_date_utc;
        }

        public void setStatic_fire_date_utc(String static_fire_date_utc) {
            this.static_fire_date_utc = static_fire_date_utc;
        }

        public String getFairings() {
            return fairings;
        }

        public void setFairings(String fairings) {
            this.fairings = fairings;
        }

        public String getStatic_fire_date_unix() {
            return static_fire_date_unix;
        }

        public void setStatic_fire_date_unix(String static_fire_date_unix) {
            this.static_fire_date_unix = static_fire_date_unix;
        }

    public String[] getFailures ()
        {
            return failures;
        }

        public void setFailures (String[]failures)
        {
            this.failures = failures;
        }

        public String getDate_local ()
        {
            return date_local;
        }

        public void setDate_local (String date_local)
        {
            this.date_local = date_local;
        }

        public String getFlight_number ()
        {
            return flight_number;
        }

        public void setFlight_number (String flight_number)
        {
            this.flight_number = flight_number;
        }

        public String getLaunch_library_id ()
        {
            return launch_library_id;
        }

        public void setLaunch_library_id (String launch_library_id)
        {
            this.launch_library_id = launch_library_id;
        }

        public String[] getShips ()
        {
            return ships;
        }

        public void setShips (String[]ships)
        {
            this.ships = ships;
        }

        public String getDate_utc ()
        {
            return date_utc;
        }

        public void setDate_utc (String date_utc)
        {
            this.date_utc = date_utc;
        }

        public String getSuccess ()
        {
            return success;
        }

        public void setSuccess (String success)
        {
            this.success = success;
        }

        public String getTbd ()
        {
            return tbd;
        }

        public void setTbd (String tbd)
        {
            this.tbd = tbd;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getWindow ()
        {
            return window;
        }

        public void setWindow (String window)
        {
            this.window = window;
        }

        public String getUpcoming ()
        {
            return upcoming;
        }

        public void setUpcoming (String upcoming)
        {
            this.upcoming = upcoming;
        }

        @Override
        public String toString ()
        {
            return "ClassPojo [launchpad = " + launchpad + ", payloads = " + payloads + ", rocket = " + rocket + ", crew = " + crew + ", date_unix = " + date_unix + ", cores = " + cores + ", auto_update = " + auto_update + ", date_precision = " + date_precision + ", links = " + links + ", details = " + details + ", id = " + id + ", net = " + net + ", capsules = " + capsules + ", static_fire_date_utc = " + static_fire_date_utc + ", failures = " + failures + ", date_local = " + date_local + ", flight_number = " + flight_number + ", launch_library_id = " + launch_library_id + ", fairings = " + fairings + ", ships = " + ships + ", date_utc = " + date_utc + ", static_fire_date_unix = " + static_fire_date_unix + ", success = " + success + ", tbd = " + tbd + ", name = " + name + ", window = " + window + ", upcoming = " + upcoming + "]";
        }
}