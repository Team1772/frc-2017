package org.team1772.robot.autons.commands;

import org.team1772.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PullGear extends Command {

	@Override
	protected boolean isFinished() {
		Robot.intakeGear.setSpeed(1);
		Robot.intakeGear.move(true);

		return isTimedOut();
	}
	
	@Override
	protected void end() {
		Robot.intakeGear.move(false);
		Robot.intakeGear.setSpeed(0);
	}

}
