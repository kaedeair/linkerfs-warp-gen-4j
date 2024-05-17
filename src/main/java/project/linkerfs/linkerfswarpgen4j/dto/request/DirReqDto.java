package project.linkerfs.linkerfswarpgen4j.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DirReqDto {
    @NotBlank
    private String dirPath;
}
