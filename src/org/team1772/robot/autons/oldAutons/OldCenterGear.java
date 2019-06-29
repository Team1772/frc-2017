package org.team1772.robot.autons.oldAutons;

import org.team1772.Core.superclasses.Autonomous;
import org.team1772.robot.Robot;
import org.team1772.robot.autons.commands.PushGear;
import org.team1772.robot.autons.commands.ResetDrive;
import org.team1772.robot.autons.commands.SmartDriveToPoint;
import org.team1772.robot.autons.commands.SmartTurnToAngle;

public class OldCenterGear extends Autonomous {

	public OldCenterGear(double angle) {
		super(Robot.driver);

		addStep(new ResetDrive(), 0.5);

		addStep(new SmartDriveToPoint(53, 8, 4, 0.4));

		addStep(new ResetDrive(), 0.5);

		addParallel(new PushGear(), 3);
		
		addStep(new SmartDriveToPoint(-15, 4, 5, 0.2));
		
		addStep(new ResetDrive(0.1), 0.5);

		addStep(new SmartTurnToAngle(angle, 5, 6, 0.6));
		
		addStep(new ResetDrive(), 0.5);
		
		addStep(new SmartDriveToPoint(20, 4, 5, 0.3));
	}

}
