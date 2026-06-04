package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.hardware.lynx.LynxModule;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.skeletonarmy.marrow.LynxUtil;

@Autonomous(name="Autonomous", preselectTeleOp="TeleOpApp")
public class AutonomousApp extends CommandOpMode {
    @Override
    public void initialize() {
        LynxUtil.setBulkCachingMode(hardwareMap, LynxModule.BulkCachingMode.AUTO);
    }

    @Override
    public void run() {

    }
}
