//package org.example.demo.integration;
//
//import org.example.dto.request.UserRequestDto;
//import org.example.entity.Service;
//import org.example.entity.User;
//import org.example.entity.UserRoleType;
//import org.example.repository.ServiceRepository;
//import org.example.repository.UserRepository;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//@Testcontainers
//@DisplayName("ServiceController Integration Test")
//public class ServiceControllerIntegrationTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ServiceRepository serviceRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    private static MySQLContainer<?> mySQLContainer;
//
//    @BeforeAll
//    static void setUp() {
//        mySQLContainer = new MySQLContainer<>("mysql:8.0")
//                .withDatabaseName("testdb")
//                .withUsername("testuser")
//                .withPassword("testpass");
//        mySQLContainer.start();
//        System.setProperty("spring.datasource.url", mySQLContainer.getJdbcUrl());
//        System.setProperty("spring.datasource.username", mySQLContainer.getUsername());
//        System.setProperty("spring.datasource.password", mySQLContainer.getPassword());
//    }
//
//    @AfterAll
//    static void tearDown() {
//        mySQLContainer.stop();
//    }
//
//    @Test
//    @DisplayName("Create Service API - Success")
//    void testCreateServiceApiSuccess() throws Exception {
//        // Create user request
//        UserRequestDto requestDto = new UserRequestDto();
//        requestDto.setLogin("testLogin");
//        requestDto.setPassword("testPassword");
//        requestDto.setEmail("testEmail@example.com");
//        requestDto.setFirstName("Test");
//        requestDto.setLastName("User");
//        requestDto.setRole(UserRoleType.TUTOR);
//
//        // Send POST request to create service
//        mockMvc.perform(post("/service")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(requestDto)))
//                .andExpect(status().isOk());
//
//        // Verify that the service was created
//        User user = userRepository.findByLogin(requestDto.getLogin())
//                .orElseThrow(() -> new NotFoundException("User not found"));
//
//        Service service = serviceRepository.findByTutor(user)
//                .orElseThrow(() -> new NotFoundException("Service not found"));
//
//        assertEquals(requestDto.getRole(), service.getTutor().getRole());
//        assertEquals(requestDto.getFirstName(), service.getTutor().getFirstName());
//        assertEquals(requestDto.getLastName(), service.getTutor().getLastName());
//        assertEquals(requestDto.getEmail(), service.getTutor().getEmail());
//        assertTrue(passwordEncoder.matches(requestDto.getPassword(), service.getTutor().getPassword()));
//    }
//}