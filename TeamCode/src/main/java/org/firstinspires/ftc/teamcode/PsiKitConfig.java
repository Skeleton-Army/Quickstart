package org.firstinspires.ftc.teamcode;

import android.content.Context;

import com.qualcomm.ftccommon.FtcEventLoop;

import org.firstinspires.ftc.ftccommon.external.OnCreateEventLoop;
import org.psilynx.psikit.ftc.autolog.PsiKitAutoLogSettings;

public final class PsiKitConfig {
    @OnCreateEventLoop
    public static void configure(Context context, FtcEventLoop ftcEventLoop) {
        PsiKitAutoLogSettings.enabledByDefault = true;
        PsiKitAutoLogSettings.enableLinearByDefault = true;
    }
}