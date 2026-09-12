package org.firstinspires.ftc.teamcode.opmodes;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.pedropathing.follower.Follower;
import com.qualcomm.hardware.lynx.LynxModule;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.skeletonarmy.marrow.LynxUtil;

import org.firstinspires.ftc.teamcode.pedro.Constants;

@TeleOp(name="TeleOp")
public class TeleOpApp extends CommandOpMode {
    private Follower follower;

    @Override
    public void initialize() {
        LynxUtil.setBulkCachingMode(hardwareMap, LynxModule.BulkCachingMode.MANUAL);
        telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());

        follower = Constants.createWithoutReset(hardwareMap);
    }

    @Override
    public void run() {
        LynxUtil.clearBulkCache(hardwareMap);

        follower.update();
    }
}
