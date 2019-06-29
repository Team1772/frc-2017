package org.team1772.robot.autons.general;

import org.team1772.Core.superclasses.Autonomous;
import org.team1772.robot.Robot;
import org.team1772.robot.autons.commands.*;


public class Test extends Autonomous {

	public Test() {
		super(Robot.driver);
		
		// ** ROBO ANDAR RETO **
		
		
		/* PRIMEIRO MODO
		 * 1 parametro polegadas que quer andar... se tiver funcionando encoder
		 * 2 parametro voltagem para o motor
		 * 3 parametro tempo limite... caso o encoder n esteja funcionando ele vai por tempo dai
		 * */
		//addStep(new DriveStraight(50, 0.5), 10);// se por acaso ele andar mais torto ou diminuir a tensão do lado errado, inverte a linha 51 com 53 arquivo DriveStraight
		
		// OU

		addStep(new DriveStraight(69, 0.5, 0.5), 10);// já sai setando voltagens diferentes pros lados
		
		addStep(new ResetDrive(-0.1), 0.5);

		addParallel(new PushGear(true), 3);

		addStep(new SmartDriveToPoint(-20, 5, 5, 0.2));
		
		addStep(new ResetDrive(0.1), 0.5);

		

		/* SEGUNDO MODO
		 * Essa segunda forma faz uma calibragem diferente
		 * no final posta a constante usada para calibrar a tracao como "constant-navx used" esse print so serve pra esse modo
		 * */

		 //addStep(new DriveStraight(63, 0.55, 0.4, true), 10);
		
		
		
		
		
		
		
		
		
		
		/*

		// ****************************************  Autonomo tentativa e erro 
		//anda até a lift
		addStep(new DriveForward(0.47, 0.4), 2.5);
		
		addStep(new DriveForward(0, 0), 1);
		
		//adiciona essas regras
		addStep(() -> {
			//se a gear nao ta certa adiciona os comandos
			if (!Robot.driver.isGearInLift()) {
			    // volta um pouco ALTERAR O TEMPO AQUI e PASSAR PARA PARTE QUE SE REPETE
				addStep(new DriveForward(-0.2, -0.2), 1.5);
				addStep(new DriveForward(0, 0), 0.3);
				addStep(new TurnToAngle(0.5, 0.5, 20));// vira 20 graus ALTERAR AQUI O NUMERO CERTO DE GRAUS
				addStep(new DriveForward(0, 0), 0.3);
				addStep(new DriveForward(0.2, 0.2), 1.5);
				addStep(new DriveForward(0, 0), 0.3);

				addStep(() -> {
					if (!Robot.driver.isGearInLift()) {
						// se repete aqui a segunda tentativa
						addStep(new DriveForward(-0.2, -0.2), 1.5);
						addStep(new DriveForward(0, 0), 0.3);
						addStep(new TurnToAngle(0.5, 0.5, -20));// colocando o mesmo angulo mas em negativo para ir pro outro lado
						addStep(new DriveForward(0, 0), 0.3);
						addStep(new DriveForward(0.2, 0.2), 1.5);
						addStep(new DriveForward(0, 0), 0.3);
					}
					addParallel(new PushGear(), 3);
					addStep(new DriveForward(-0.2, -0.2), 3);
					addStep(new DriveForward(0, 0), 1);
					return true;
				});

			} else {
				addParallel(new PushGear(), 3);
				addStep(new DriveForward(-0.2, -0.2), 3);
				addStep(new DriveForward(0, 0), 1);
			}
			return true;
		});
		*/
		
	}

}
