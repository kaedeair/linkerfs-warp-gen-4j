package project.linkerfs.linkerfswarpgen4j.service;

import org.springframework.stereotype.Service;
import project.linkerfs.linkerfswarpgen4j.common.ResponseCode;
import project.linkerfs.linkerfswarpgen4j.dto.common.DirDto;
import project.linkerfs.linkerfswarpgen4j.dto.response.DirRespDto;
import project.linkerfs.linkerfswarpgen4j.dto.response.ResponseDto;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Objects;

@Service
public class DirService {
    static public ResponseDto<DirRespDto> listDir(String dirPath) {
        return listDirWithFilter(dirPath, null);
    }

    static public ResponseDto<DirRespDto> listDirWithFilter(String dirPath, FileFilter fileFilter) {
        DirRespDto dto = new DirRespDto();
        File file = new File(dirPath);
        ArrayList<String> fileList = new ArrayList<>();
        ArrayList<DirDto> dirList = new ArrayList<>();
        if (file.exists() && file.isDirectory()) {
            dto.setDirPath(dirPath);
            File[] files;
            if (fileFilter == null) {
                files = Objects.requireNonNull(file.listFiles());

            } else {
                files = Objects.requireNonNull(file.listFiles(fileFilter));
            }
            for (File f : files) {
                if (f.isDirectory()) {
                    DirDto dir = new DirDto();
                    dir.setDirName(f.getName());
                    dir.setIsEmpty(f.listFiles() == null || Objects.requireNonNull(f.listFiles()).length == 0);
                    dirList.add(dir);
                } else {
                    fileList.add(f.getName());
                }
            }
            dto.setFileList(fileList);
            dto.setDirList(dirList);

        } else {
            return ResponseDto.fail(ResponseCode.NOT_FOUND.getCode(), "Dir not found!");
        }
        return ResponseDto.success(dto);

    }
}
