package com.cn.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("fileupload")
public class fileuploadController {
    @RequestMapping("fileupload1")
    public String fileupload1(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("文件上传...");
        String realPath=request.getSession().getServletContext().getRealPath("/uploads/");
        File file=new File(realPath);
        if(file.exists()){
            file.mkdirs();
        }
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
        List<FileItem> items=upload.parseRequest(request);
        for (FileItem item:items){
            if (item.isFormField()){
            }else{
                String filename=item.getName();
                String uuid=UUID.randomUUID().toString().replace("-","");
                filename = uuid+"_"+filename;
                item.write(new File(realPath,filename));
                item.delete();
            }
        }
        return "success";
    }
    @RequestMapping("fileupload2")
    public String fileupload2(HttpServletRequest request,MultipartFile upload) throws Exception {
        System.out.println("文件上传...");
        String realPath=request.getSession().getServletContext().getRealPath("/uploads/");
        File file=new File(realPath);
        if(file.exists()){
            file.mkdir();
        }String filename=upload.getOriginalFilename();
        String uuid=UUID.randomUUID().toString().replace("-","");
        filename=uuid+"_"+filename;
        upload.transferTo(new File(realPath+filename));
        return "success";
    }
    @RequestMapping("fileupload3")
    public String fileupload3(MultipartFile upload){
        System.out.println("文件上传...");
        String path="http://localhost:9090/fileloadserver_war_exploded/uploads";
        String filename=upload.getOriginalFilename();
        String uuid=UUID.randomUUID().toString().replace("-","");
        filename=uuid+"_"+filename;
        Client client=new Client();
        WebResource resource = client.resource(path+filename);
        return "success";
    }
}
