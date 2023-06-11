package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;
   @ManyToMany
    private List<Skill> skills;

    public Job() {
    }

    public Job(Employer anemployer, List<Skill> someSkills) {
        super();
        this.employer = anemployer;
        this.skills = someSkills;

    }

    // Getters and setters.


    public Employer getEmployer() {

        return employer;
    }

    public void setEmployer(Employer employer) {

        this.employer = employer;
    }

     public  Iterable<Skill> getSkills() {
        return skills;
    }

    public void setSkills (List <Skill> skills) {

        this.skills = skills;
    }
}
