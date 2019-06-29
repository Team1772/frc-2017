package org.team1772.robot.routines;

import org.team1772.Core.util.XboxControl;
import org.team1772.robot.Robot;

public enum Teleop {
	INSTANCE;

	private XboxControl pilot;
	
    public void init() {
    	pilot = new XboxControl(0);
    }

    public void periodic() {

    	Robot.driver.print();
    	
    	Robot.driver.arcadeDrive(pilot.getAxisLeftY(),pilot.getAxisRightX());

    	if (pilot.getButtonB())
    		Robot.driver.reset();
    	
    	if (pilot.getButtonL1()){
    		Robot.intakeGear.move(true);
    		Robot.intakeGear.setSpeed(1);
    	} else if (pilot.getButtonY()) {
    		Robot.intakeGear.setSpeed(1);
    	} else if (pilot.getButtonR1()) {
    		Robot.intakeGear.move(true);
    		Robot.intakeGear.setSpeed(-1);;
    	} else if(pilot.getAxisZRight() > 0.3){
    		Robot.climb.setSpeed(1);
    		Robot.intakeGear.move(true);
    	} else {
    		Robot.intakeGear.move(false);
    		Robot.intakeGear.setSpeed(0);
    		Robot.climb.setSpeed(0);
    	}
    }
}
