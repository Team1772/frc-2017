package org.team1772.robot.autons.oldAutons;

import org.team1772.Core.superclasses.Autonomous;
import org.team1772.robot.Robot;
import org.team1772.robot.autons.commands.DriveStraight;
import org.team1772.robot.autons.commands.ResetDrive;
import org.team1772.robot.autons.commands.TurnToAngle;

import edu.wpi.first.wpilibj.command.Subsystem;

public class FirstHopperToBoiler extends Autonomous {

	public FirstHopperToBoiler() {
		super(Robot.driver);
		
		addStep(new DriveStraight(-103, 0.5, 0.5), 10);
		addStep(new ResetDrive(0.1), 0.5);
		
		addStep(new TurnToAngle(0.4, 0.4, -45));

		addStep(new DriveStraight(-15, 0.5, 0.5), 10);
		addStep(new ResetDrive(0.1), 0.3);
		addStep(new ResetDrive(0), 1.5);
		
		addStep(new DriveStraight(10, 0.5, 0.5), 10);
		addStep(new ResetDrive(-0.1), 0.5);
		
		addStep(new TurnToAngle(0.5, 0.5, 90));
		addStep(new ResetDrive(-0.1, 0.1), 0.3);
	}

}
