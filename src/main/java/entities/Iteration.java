package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Iteration {

    private String goal;
    private Project project;
    private List<Activity> activities;

    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();

        project.addIteration(this);
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public Duration getDuration() throws SabanaResearchException
    {
        //Duration d = new Duration(0,0);
        int cont = 0;
        if (this.activities.size()==0)
        {
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_ITERATION);
        }
        for(Activity a: this.activities)
        {

            a.getDuration();
        }
        return Duration.ofDays(cont);
    }



}
