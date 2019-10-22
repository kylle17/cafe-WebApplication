package com.file.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


@Repository
public class FileUploadController  {
	public String adUpload(MultipartHttpServletRequest request , HttpServletResponse response) {	
		ServletContext context = request.getServletContext();
		String savePath = "/resources/adData/";
		String contextPath = context.getRealPath(savePath);
		
		
		System.out.println(contextPath);
		
		MultipartFile mFile = request.getFile("fileName");

		String fileName = mFile.getName();
		File file = new File(contextPath+"\\"+fileName);
		
		String originalFileName = mFile.getOriginalFilename();
		try {
			if(mFile.getSize()!=0){ //File Null Check
				if(! file.exists()){ //경로상에 파일이 존재하지 않을 경우
					if(file.getParentFile().mkdirs()){ //경로에 해당하는 디렉토리들을 생성
						file.createNewFile(); //이후 파일 생성
					}
				}
				mFile.transferTo(new File(contextPath +"\\"+ originalFileName)); //임시로 저장된 multipartFile을 실제 파일로 전송
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return originalFileName;

	}
}


