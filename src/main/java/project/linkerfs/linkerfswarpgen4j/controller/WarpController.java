package project.linkerfs.linkerfswarpgen4j.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.linkerfs.linkerfswarpgen4j.dto.request.CreateWarpReqDto;
import project.linkerfs.linkerfswarpgen4j.dto.response.ResponseDto;
import project.linkerfs.linkerfswarpgen4j.service.WarpService;

@Tag(name = "Warp Handler")
@RestController
@RequestMapping("/api/warp")
public class WarpController {

    @Operation(description = "create warp config file")
    @PostMapping("/create")
    public ResponseDto<Object> createWarp(@Validated @RequestBody CreateWarpReqDto reqDto) {

        return WarpService.createWarp(reqDto.getWarpTargets());
    }
}
