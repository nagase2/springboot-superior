package com.superior.fw.superior.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.FileSystemUtils;

import com.superior.fw.superior.entity.Image;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class ImageService {
	private static String UPLOAD_ROOT = "upoad-dir";
	private final ResourceLoader resourceLoader;

	public ImageService(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	/**
	 * pre-load some test images
	 */
	@Bean
	CommandLineRunner setUp() throws IOException{
		log.info("★ setup method ");
		return (args) -> {

			FileSystemUtils.deleteRecursively(new File(UPLOAD_ROOT));
			
			Files.createDirectory(Paths.get(UPLOAD_ROOT));
			
			FileCopyUtils.copy("Test file1", new FileWriter(UPLOAD_ROOT+ "/learning-spring-boot-cover1.jpg"));
			FileCopyUtils.copy("Test file2", new FileWriter(UPLOAD_ROOT+ "/learning-spring-boot-cover2.jpg"));
			FileCopyUtils.copy("Test file3", new FileWriter(UPLOAD_ROOT+ "/learning-spring-boot-cover3.jpg"));
			
		};
	}
	
	public Flux<Image> findAllImages() {
		try {
			return Flux.fromIterable(Files.newDirectoryStream(Paths.get(UPLOAD_ROOT)))
					.map(path -> new Image(path.hashCode(), path.getFileName().toString()));
		} catch (IOException e) {
			return Flux.empty();

		}
	}

	public Mono<Resource> findOneImage(String filename) {
		return Mono.fromSupplier(() -> 
		  resourceLoader.getResource(
				"file:" + UPLOAD_ROOT + "/" + filename));		
	}
	
}
