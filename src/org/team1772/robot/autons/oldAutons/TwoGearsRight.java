package org.team1772.robot.autons.oldAutons;

import org.team1772.Core.superclasses.Autonomous;
import org.team1772.robot.Robot;
import org.team1772.robot.autons.commands.*;


public class TwoGearsRight extends Autonomous {

	public TwoGearsRight() {
		super(Robot.driver);

		addStep(new SmartDriveToPoint(68, 8, 4, 0.4));
		
		addStep(new ResetDrive(-0.1), 0.5);

		addParallel(new PushGear(true), 3);

		addStep(new SmartDriveToPoint(-15, 4, 5, 0.2));
		
		addStep(new ResetDrive(0.1), 0.5);

		addStep(new SmartTurnToAngle(120, 5, 6, 0.6));
		
		addParallel(new PullGear(), 3);
		
		addStep(new SmartDriveToPoint(69, 4, 5, 0.3));
		
		addStep(new SmartDriveToPoint(-64, 4, 5, 0.3));
		
		addStep(new ResetDrive(0.1), 0.5);

		addStep(new SmartTurnToAngle(-102, 5, 6, 0.6));
		
		addStep(new SmartDriveToPoint(14, 4, 5, 0.3));

		addStep(new ResetDrive(-0.1), 0.5);

		addParallel(new PushGear(true), 3);
		
		addStep(new SmartDriveToPoint(-14, 4, 5, 0.3));
	}

}
