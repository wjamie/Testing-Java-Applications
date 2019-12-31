package trainsPackage;


public class Stop {

    public Stop(String name, String arrives) {
        this.name = name;
        this.arrives = arrives;
    }

    public Stop(String name, String arrives, String departs) {
        this.name = name;
        this.arrives = arrives;
        this.departs = departs;
    }

private String name;
private String arrives;
private String departs;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getArrives() {
return arrives;
}

public void setArrives(String arrives) {
this.arrives = arrives;
}

public String getDeparts() {
return departs;
}

public void setDeparts(String departs) {
this.departs = departs;
}

}

