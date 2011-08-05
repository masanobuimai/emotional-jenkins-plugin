package org.jenkinsci.plugins.emotional_jenkins;

import hudson.model.ProminentProjectAction;
import hudson.model.Result;

public final class EmotionalJenkinsAction implements ProminentProjectAction {

    private Result result;

    public EmotionalJenkinsAction() {}

    public EmotionalJenkinsAction(Result result) {
        this.result = result;
    }

    public String getIconFileName() { return null; }
    public String getDisplayName() { return ""; }
    public String getUrlName() { return ""; }

    public Result getResult() { return result; }
}
