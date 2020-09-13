package se.home.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.dekorate.kubernetes.annotation.KubernetesApplication;

@SpringBootApplication
@KubernetesApplication(name = "k8sjava")
public class K8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sApplication.class, args);
	}
}
