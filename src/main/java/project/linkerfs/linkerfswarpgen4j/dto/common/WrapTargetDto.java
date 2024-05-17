package project.linkerfs.linkerfswarpgen4j.dto.common;

import lombok.Data;

@Data
public class WrapTargetDto {
    Long size2Read;
    Long offsetInFile;
    String filePath;
}
