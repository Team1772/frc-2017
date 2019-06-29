package org.team1772.robot.autons;

import org.team1772.Core.superclasses.Autonomous;
import org.team1772.robot.Robot;
import org.team1772.robot.autons.commands.*;

public class TwoGearsCenter extends Autonomous {

	public TwoGearsCenter(double firstAngle, double secondAngle) {
		super(Robot.driver);
		
		// First Gear
		
		addStep(new DriveStraight(69, 0.5, 0.5));
		
		addStep(new ResetDrive(-0.1), 0.5);
		addStep(new ResetDrive(0), 0.5);

		addParallel(new PushGear(), 1.5);

		addStep(new DriveStraight(-20, 0.5, 0.5));
		
		addStep(new ResetDrive(0.1), 0.5);
		
		// ** Second Gear **

		//Turn to angle and pull intake
		addStep(new TurnToAngle(0.5, 0.5, firstAngle));
		if (firstAngle > 0)
			addStep(new ResetDrive(-0.1, 0.1), 0.3);
		else
			addStep(new ResetDrive(0.1, -0.1), 0.3);
		
		//Drive straight to get the gear
		addParallel(new PullGear(), 1.5);
		addStep(new DriveStraight(40, 0.5, 0.5));
		addStep(new DriveStraight(9, 0.5, 0.5));
		addStep(new ResetDrive(-0.1), 0.5);
		
		//Go back
		addStep(new DriveStraight(-46, 0.5, 0.5));
		addStep(new ResetDrive(0.1), 0.5);

		//Back to angle
		addStep(new TurnToAngle(0.5, 0.5, secondAngle));
		if (firstAngle > 0)
			addStep(new ResetDrive(-0.1, 0.1), 0.3);
		else
			addStep(new ResetDrive(0.1, -0.1), 0.3);

		//Drive to lift
		addStep(new DriveStraight(13, 0.5, 0.5));

		//Do it
		addStep(new ResetDrive(-0.1), 0.5);
		addStep(new ResetDrive(0), 0.5);
		addParallel(new PushGear(true), 1.5);
		addStep(new DriveStraight(-16, 0.2, 0.2));
	}

}
