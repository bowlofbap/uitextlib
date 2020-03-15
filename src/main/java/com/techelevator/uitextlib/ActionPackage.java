package com.techelevator.uitextlib;

public class ActionPackage<T>{
	private Actions action;
	private Scene<T> scene;
	private ActionPackage<T> followupAction;
	private int numPops = 1;
	
	public static enum Actions {
		POP,
		REFRESH,
		PUSH,
		ACTION
	}
	
	/*
	 * scene is only needed for the PUSH action, otherwise no scene is needed
	 */
	public ActionPackage(Actions action) {
		this.action = action;
	}
	
	public ActionPackage(Actions action, Scene<T> scene) {
		this.action = action;
		this.scene = scene;
	}
	
	public ActionPackage(Actions action, ActionPackage<T> followupAction) {
		if (action != Actions.ACTION) { throw new InvalidActionException(); }
		this.action = action;
		this.followupAction = followupAction;
	}
	
	/*
	 * pops back n number of scenes
	 */
	public ActionPackage(Actions action, int numPops) {
		if (action != Actions.POP) { throw new InvalidActionException(); }
		this.action = action;
		this.numPops = numPops;
	}
	
	public int getNumPops() {
		return numPops;
	}

	public Actions getAction() {
		return action;
	}

	public Scene<T> getScene() {
		return scene;
	}

	public ActionPackage<T> getFollowupAction() {
		return followupAction;
	}

}
