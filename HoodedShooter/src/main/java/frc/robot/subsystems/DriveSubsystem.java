// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private CANSparkMax m_leftWheel = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushed);
  private CANSparkMax m_rightWheel = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushed);

  private MotorControllerGroup m_leftMotors = new MotorControllerGroup(m_leftWheel);
  private MotorControllerGroup m_rightMotors = new MotorControllerGroup(m_rightWheel);

  public DriveSubsystem() {
    m_leftMotors.setInverted(false);
    m_rightMotors.setInverted(false);
  }

  public void drive(double speed) {
    m_rightMotors.set(speed);
    m_leftMotors.set(speed);
  }

  public void turn(double speed) {
    m_rightMotors.set(speed);
    m_leftMotors.set(-speed);
  }

  public void setMotors(double leftSpeed, double rightSpeed) {
    m_leftMotors.set(leftSpeed);
    m_rightMotors.set(rightSpeed);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
