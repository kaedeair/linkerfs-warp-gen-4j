package project.linkerfs.linkerfswarpgen4j.service;

import org.springframework.stereotype.Service;
import project.linkerfs.linkerfswarpgen4j.dto.response.ResponseDto;
import project.linkerfs.linkerfswarpgen4j.utils.jni.object.WarpTarget;

import java.util.ArrayList;


@Service
public class WarpService {
    public static ResponseDto<Object> createWarp(ArrayList<WarpTarget> warpTargets) {

        return ResponseDto.success();
    }
}
