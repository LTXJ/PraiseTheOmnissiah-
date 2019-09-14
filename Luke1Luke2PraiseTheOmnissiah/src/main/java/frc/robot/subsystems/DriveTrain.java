/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
 private WPI_TalonSRX leftMaster;
 private WPI_TalonSRX rightMaster;
 private WPI_VictorSPX leftFollower;
 private WPI_VictorSPX rightFollower;
 DifferentialDrive drive; 
private DriveTrain(){
 leftMaster = new WPI_TalonSRX(1);
 rightMaster = new WPI_TalonSRX(4);
 leftFollower = new WPI_VictorSPX(2);
 rightFollower = new WPI_VictorSPX(5);
  leftFollower.follow(leftMaster);
  rightFollower.follow(rightMaster);
  DifferentialDrive drive =  new DifferentialDrive(leftMaster, rightMaster);
} 

public void arcadeDrive(double speed, double rotation){
  drive.arcadeDrive(speed, rotation);
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
