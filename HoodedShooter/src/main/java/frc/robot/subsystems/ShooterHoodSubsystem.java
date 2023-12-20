// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ShooterHoodSubsystem extends SubsystemBase {

  private CANSparkMax hoodMotor;
  private CANSparkMax shooterMotor;
  
  /** Creates a new ShooterHoodSubsystem. */
  public ShooterHoodSubsystem() {
    hoodMotor = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
    shooterMotor = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
  }

  public void setHoodSpeed(double motorSpeed){
    hoodMotor.set(motorSpeed);
  }

  public void setShooterSpeed(double motorSpeed){
    shooterMotor.set(motorSpeed);
  }

  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}