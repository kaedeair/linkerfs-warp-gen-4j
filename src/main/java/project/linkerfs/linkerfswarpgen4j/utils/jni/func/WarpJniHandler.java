package project.linkerfs.linkerfswarpgen4j.utils.jni.func;


import project.linkerfs.linkerfswarpgen4j.utils.jni.object.WarpConfig;

public class WarpJniHandler {

    public static native Byte[] getWarpConfigContent(final WarpConfig warpConfig);
}
