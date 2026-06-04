package org.firstinspires.ftc.teamcode.opmodes;

import com.pedropathing.follower.Follower;
import com.qualcomm.hardware.lynx.LynxModule;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.skeletonarmy.marrow.LynxUtil;

import org.firstinspires.ftc.teamcode.pedroPathing.Constants;

@TeleOp(name="TeleOp")
public class TeleOpApp extends CommandOpMode {
    private Follower follower;

    @Override
    public void initialize() {
        LynxUtil.setBulkCachingMode(hardwareMap, LynxModule.BulkCachingMode.AUTO);

        follower = Constants.createFollower(hardwareMap);
        follower.startTeleOpDrive(true);
    }

    @Override
    public void run() {
        follower.update();
    }
}
