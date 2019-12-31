

package trainsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Train {

    public Train(String platform, String departs, List stops) {
        this.platform = platform;
        this.departs = departs;
         this.stops = stops;
    }

    public Train(String platform, String departs, String expected, List stops) {
        this.platform = platform;
        this.departs = departs;
        this.expected = expected;
        this.stops = stops;
    }

public List<Train> trains = new ArrayList<Train>();
public List<Stop> stops = new ArrayList<Stop>();
private String platform;
private String departs;
private String expected;

public List<Train> getTrains() {
        return trains;
    }

public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    
public List<Stop> getStops() {
return stops;
}

public void setStops(List<Stop> stops) {
this.stops = stops;
}

public String getPlatform() {
return platform;
}

public void setPlatform(String platform) {
this.platform = platform;
}

public String getDeparts() {
return departs;
}

public void setDeparts(String departs) {
this.departs = departs;
}

public String getExpected() {
return expected;
}

public void setExpected(String expected) {
this.expected = expected;
}

}
