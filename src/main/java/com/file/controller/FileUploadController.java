package com.file.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;

@Controller
public class FileUploadController{
	private static final String CURR_IMAGE_REPO_PATH = "c:\\spring\\image_repo";
		
	
	public String adUpload (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("adUpload메서드 실행됨");
		String fileName =null;
		
		request.setCharacterEncoding("utf-8");
		System.out.println("request인코딩 완료");
		String encoding = "utf-8";
		File currentDirPath = new File("C:\\Users\\USER\\Desktop\\cafe project\\01-cafe-project\\adData");
		DiskFileItemFactory factory = new DiskFileItemFactory();
		System.out.println("팩토리 생성완료");
		factory.setRepository(currentDirPath);
		factory.setSizeThreshold(1024 * 1024);
	
		ServletFileUpload upload = new ServletFileUpload(factory);
		System.out.println("업로드 파일 완성 ");

		try {
			List items = upload.parseRequest(request);
			System.out.println("아이템 리스트 생성완료");

			for (int i = 0; i < items.size(); i++) {
				System.out.println("step 1");

				FileItem fileItem = (FileItem) items.get(i);
	
				if (fileItem.isFormField()) {
					System.out.println("step 2 true");

					System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
				} else {
					System.out.println("step 2 false");

					System.out.println("파라미터명:" + fileItem.getFieldName());
					System.out.println("파일명:" + fileItem.getName());
					System.out.println("파일크기:" + fileItem.getSize() + "bytes");
	
					if (fileItem.getSize() > 0) {
						int idx = fileItem.getName().lastIndexOf("\\");
						if (idx == -1) {
							idx = fileItem.getName().lastIndexOf("/");
						}
						fileName = fileItem.getName().substring(idx + 1);
						File uploadFile = new File(currentDirPath + "\\" + fileName);
						fileItem.write(uploadFile);
					} // end if
				} // end if
			} // end for
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	return fileName;
	}
	
	
}


