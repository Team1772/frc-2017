package org.team1772.robot.autons;

import org.team1772.robot.autons.commands.*;

public class CenterGear extends GoToLoadStation {

	public CenterGear() {
		super();

		addStep(new DriveStraight(69, 0.5, 0.5));

		addStep(new ResetDrive(-0.1), 0.5);
		addStep(new ResetDrive(0), 0.5);

		addParallel(new PushGear(), 1.5);

		addStep(new DriveStraight(-30, 0.5, 0.5));

		addStep(new ResetDrive(0.1), 0.5);
		addStep(new ResetDrive(0), 1.5);

		super.goToLoadStation();
	}

}
