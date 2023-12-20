// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.ShooterHoodSubsystem;

public class MoveHood extends CommandBase {

  private final ShooterHoodSubsystem m_shooterHoodSubsystem;
  private final DoubleSupplier m_speedSupplier;

  /** Creates a new MoveHood. */
  public MoveHood(ShooterHoodSubsystem shooterhood, DoubleSupplier speedSupplier) {
    m_shooterHoodSubsystem = shooterhood;
    m_speedSupplier = speedSupplier;   // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(shooterhood);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_shooterHoodSubsystem.setHoodSpeed(m_speedSupplier.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_shooterHoodSubsystem.setHoodSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
