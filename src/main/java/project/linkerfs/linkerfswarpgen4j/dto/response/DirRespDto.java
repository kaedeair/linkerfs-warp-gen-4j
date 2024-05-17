package project.linkerfs.linkerfswarpgen4j.dto.response;

import lombok.Data;
import project.linkerfs.linkerfswarpgen4j.dto.DirDto;

import java.util.ArrayList;

@Data
public class DirRespDto {
    private String dirPath;
    private ArrayList<String> fileList;
    private ArrayList<DirDto> DirList;
}
