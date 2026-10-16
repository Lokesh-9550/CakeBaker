package com.puttam.lokesh.CakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakeBakerApplication implements CommandLineRunner {
	final Frosting frosting;
	final Syrupe syrupe;
	public CakeBakerApplication(Frosting frosting, Syrupe syrupe) {
		this.frosting = frosting;
		this.syrupe = syrupe;
	}
	public void bakeCake(){
		frosting.getFrostingType();
		syrupe.getSyrupeType();
	}

	public static void main(String[] args) {
		SpringApplication.run(CakeBakerApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		bakeCake();
	}
}
