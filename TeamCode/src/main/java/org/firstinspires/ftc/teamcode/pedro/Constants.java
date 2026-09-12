package org.firstinspires.ftc.teamcode.pedro;

import com.pedropathing.algorithm.Foresight;
import com.pedropathing.algorithm.ForesightConfig;
import com.pedropathing.follower.Follower;
import com.pedropathing.revhub.drivetrains.Mecanum;
import com.pedropathing.revhub.drivetrains.MecanumConfig;
import com.pedropathing.revhub.localizers.PinpointConfig;
import com.pedropathing.revhub.localizers.PinpointLocalizer;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Constants {
    public static MecanumConfig drivetrainConfig = new MecanumConfig(
            c -> {

            }
    );

    public static PinpointConfig localizerConfig = new PinpointConfig(
            c -> {

            }
    );

    public static ForesightConfig foresightConfig = new ForesightConfig(
            c -> {

            }
    );

    public static Follower create(HardwareMap h) {
        localizerConfig.resetMode.set(PinpointLocalizer.ResetMode.RECALIBRATE_IMU);

        return new Follower(
                new PinpointLocalizer(h, localizerConfig),
                new Mecanum(h, drivetrainConfig),
                new Foresight(foresightConfig)
        );
    }

    /**
     * Creates a follower that doesn't reset the pinpoint pose at the start.
     * This is useful for TeleOp when the robot continues off where the autonomous ended.
     */
    public static Follower createWithoutReset(HardwareMap h) {
        localizerConfig.resetMode.set(PinpointLocalizer.ResetMode.NONE);

        return new Follower(
                new PinpointLocalizer(h, localizerConfig),
                new Mecanum(h, drivetrainConfig),
                new Foresight(foresightConfig)
        );
    }
}