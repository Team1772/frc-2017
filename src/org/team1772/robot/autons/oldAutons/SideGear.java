package org.team1772.robot.autons.oldAutons;

import org.team1772.Core.superclasses.Autonomous;
import org.team1772.robot.Robot;
import org.team1772.robot.autons.commands.*;

public class SideGear extends Autonomous {

	public SideGear(double angle) {
		super(Robot.driver);
		
		addStep(new ResetDrive(), 0.5);

		addStep(new SmartDriveToPoint(83, 6, 5, 0.4));
		
		addStep(new ResetDrive(-0.1), 0.5);
		
		addStep(new SmartTurnToAngle(angle, 6, 5, 0.4));
		
		addStep(new SmartDriveToPoint(20, 6, 5));

		//addParallel(new PushGear(), 3);
		
		//addStep(new SmartDriveToPoint(-20, 5, 4));
		
		addStep(new ResetDrive(-0.1), 0.5);
		
		//addStep(new SmartTurnToAngle(-angle, 5, 6, 0.5));
	}

}
