package com.dependecy.injection.dependency_injection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {
    private int aid;
    private String aname;
    private String tech;

    public int getAid() {
        return aid;
    }

    public Alien() {
        System.out.println("Object Created!!");
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show()
    {
        System.out.println("Show");
    }
}
