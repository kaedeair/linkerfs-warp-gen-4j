package project.linkerfs.linkerfswarpgen4j.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.linkerfs.linkerfswarpgen4j.dto.request.DirReqDto;
import project.linkerfs.linkerfswarpgen4j.dto.response.DirRespDto;
import project.linkerfs.linkerfswarpgen4j.dto.response.ResponseDto;
import project.linkerfs.linkerfswarpgen4j.service.DirService;

@Tag(name = "Dir Handler")
@RestController
@RequestMapping("/api/dir")
public class DirController {

    @Operation(description = "list dir")
    @PostMapping("/list")
    public ResponseDto<DirRespDto> listDir(@Validated @RequestBody DirReqDto reqDto) {
        return DirService.listDir(reqDto.getDirPath());
    }
}
