package com.example;


import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;




    @GetMapping("/getUser")
    public String getUser() {
        ResponseEntity<UserDTO> responseEntity = restTemplate.getForEntity("http://SERVICE-PROVIDER-DEMO/user", UserDTO.class);
        UserDTO userDTO = responseEntity.getBody();
        return userDTO.getName();
    }
}