package org.team1772.robot.autons.commands;

import org.team1772.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveForward extends Command {
	private double leftSpeed, rightSpeed;

	public DriveForward(double left, double right) {
		leftSpeed    = left;
		rightSpeed   = right;
	}

	@Override
	protected boolean isFinished() {
		Robot.driver.setSpeed(leftSpeed, rightSpeed);
		return isTimedOut();
	}

}