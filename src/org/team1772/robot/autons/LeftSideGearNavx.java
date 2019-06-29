package org.team1772.robot.autons;

import org.team1772.Core.superclasses.Autonomous;
import org.team1772.robot.Robot;
import org.team1772.robot.autons.commands.*;

public class LeftSideGearNavx extends Autonomous {

	public LeftSideGearNavx() {
		super(Robot.driver);

		addStep(new DriveStraight(83, 0.5, 0.5), 5);
		addStep(new ResetDrive(-0.1), 0.5);
		
		addStep(new TurnToAngle(0.5, 0.5, 50));
		addStep(new ResetDrive(-0.1, 0.1), 0.5);
		
		addStep(new DriveStraight(20, 0.5, 0.5), 5);

		addParallel(new PushGear(true), 3);
		addStep(new DriveStraight(-20, 0.5, 0.5));
		
		addStep(new ResetDrive(0.1), 0.5);
	}

}
