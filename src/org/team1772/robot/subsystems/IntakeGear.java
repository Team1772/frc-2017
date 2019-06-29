package org.team1772.robot.subsystems;

import org.team1772.Core.components.SmartSolenoid;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeGear extends Subsystem {
	private Solenoid intakePush;
	private SmartSolenoid intakeMove;
	private Talon intakeMotor;
	
	public IntakeGear() {
		intakePush    = new Solenoid(0);
		intakeMove    = new SmartSolenoid(3, 2);
		intakeMotor   = new Talon(5);
	}
	public void pushGear(boolean canIPush){
		intakePush.set(canIPush);
	} 
	public void move(boolean down){
		intakeMove.set(down);
	}
	public void setSpeed(double sp) {
		intakeMotor.set(sp);
	}

	@Override
	protected void initDefaultCommand() {
	}
}
