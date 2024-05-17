package project.linkerfs.linkerfswarpgen4j.dto.request;

import lombok.Data;
import project.linkerfs.linkerfswarpgen4j.utils.jni.object.WarpTarget;

import java.util.ArrayList;

@Data
public class CreateWarpReqDto {
    ArrayList<WarpTarget> warpTargets;
}
