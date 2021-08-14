//package com.example.demo.filesupload;
//
//import java.io.IOException;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//import com.example.demo.filesupload.StorageService;
//
//
//
//
//@Controller
//public class Fileuploads {
//	private final StorageService storageService;
//	@Autowired
//	public Fileuploads(StorageService storageService) {
//		this.storageService=storageService;
//	}
//	
//	@GetMapping("/")
//	public String listUploadFiles(Model model) throws IOException{
//		model.addAttribute("files",storageService.loadAll().map(
//				path->
//				MvcUriComponentsBuilder.fromMethodName(Fileuploads.class,"serveFile",path.getFileName().toString()).build().toUri().toString()).collect(Collectors.toList()));
//				return "file uploaded";
//	}
//	
//	@PostMapping("/")
//	public String handleFileUpload(@RequestParam("file") MultipartFile file,RedirectAttributes redirectAtributes) {
//		storageService.store(file);
//		redirectAtributes.addFlashAttribute("message","you successfully uloaded"+file.getOriginalFilename()+"!");
//		return "file uploaded Successfully";
//	}
//	/*@ExceptionHandler(StroageFileNotFoundException.class)
//	public ResponseEntity<?>
//	handleStorageFileNotFound(StroageFileNotFoundException exc){
//		return ResponseEntity.notFound().build();
//	}*/
//}
