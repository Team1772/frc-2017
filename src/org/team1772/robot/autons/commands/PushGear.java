package org.team1772.robot.autons.commands;

import org.team1772.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PushGear extends Command {
	
	private boolean stayDown;
	
	public PushGear() {
		stayDown = false;
	}
	public PushGear(boolean stayDown) {
		this.stayDown = stayDown;
	}

	@Override
	protected boolean isFinished() {
		Robot.intakeGear.setSpeed(-1);
		Robot.intakeGear.move(true);

		return isTimedOut();
	}
	
	@Override
	protected void end() {
		if (!stayDown)
			Robot.intakeGear.move(false);
		Robot.intakeGear.setSpeed(0);
	}
}
