

package trains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Train {

private List<Stop> stops = new ArrayList<Stop>();
private String platform;
private String departs;
private String expected;

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


@Override
 public String toString() {
        return "Departs = " + departs + ", expected = " + expected
+ ", platform = " + platform +  "]";
    }


}
