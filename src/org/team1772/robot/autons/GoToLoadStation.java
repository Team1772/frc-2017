package org.team1772.robot.autons;

import org.team1772.Core.superclasses.Autonomous;
import org.team1772.robot.Robot;
import org.team1772.robot.autons.commands.DriveStraight;
import org.team1772.robot.autons.commands.PullGear;
import org.team1772.robot.autons.commands.PushGear;
import org.team1772.robot.autons.commands.ResetDrive;
import org.team1772.robot.autons.commands.TurnToAngle;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class GoToLoadStation extends Autonomous {

	public GoToLoadStation() {
		super(Robot.driver);
	}
	
	public void goToLoadStation() {

		if ((int)SmartDashboard.getNumber("Go to loadstation", 0) == 1) {

			addStep(new TurnToAngle(0.5, 0.5, 75));
			
			addStep(new ResetDrive(-0.1, 0.1), 0.5);
			addStep(new ResetDrive(0), 0.5);

			addStep(new DriveStraight(70, 0.5, 0.5));
			
			addStep(new ResetDrive(-0.1), 0.5);
			addStep(new ResetDrive(0), 0.5);

			addStep(new TurnToAngle(0.5, 0.5, -75));
			
			addStep(new ResetDrive(0.1, -0.1), 0.5);
			addStep(new ResetDrive(0), 0.5);

			addStep(new DriveStraight(10, 0.5, 0.5));// 215 in
			
			addStep(new ResetDrive(0.1), 0.5);

		} else if ((int)SmartDashboard.getNumber("Go to loadstation", 0) == 2) {

			addStep(new TurnToAngle(0.5, 0.5, -75));
			
			addStep(new ResetDrive(0.1, -0.1), 0.5);
			addStep(new ResetDrive(0), 0.5);

			addStep(new DriveStraight(70, 0.5, 0.5));
			
			addStep(new ResetDrive(-0.1), 0.5);
			addStep(new ResetDrive(0), 0.5);

			addStep(new TurnToAngle(0.5, 0.5, 75));
			
			addStep(new ResetDrive(-0.1, 0.1), 0.5);
			addStep(new ResetDrive(0), 0.5);

			addStep(new DriveStraight(10, 0.5, 0.5));// 215 in
			
			addStep(new ResetDrive(0.1), 0.5);
		}
	}

}
