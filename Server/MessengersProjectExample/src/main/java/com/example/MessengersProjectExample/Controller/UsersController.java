    package com.example.MessengersProjectExample.Controller;

    import com.example.MessengersProjectExample.DTO.CommonResponse;
    import com.example.MessengersProjectExample.DTO.Request.UsersRequest;
    import com.example.MessengersProjectExample.DTO.Response.UserResponse;
    import com.example.MessengersProjectExample.Service.UsersService;
    import jakarta.validation.Valid;
    import lombok.RequiredArgsConstructor;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.validation.annotation.Validated;
    import org.springframework.web.bind.annotation.*;

    @RestController
    @RequiredArgsConstructor
    @RequestMapping("/users")
    @Validated
    @CrossOrigin
    public class UsersController {

        private final UsersService usersService;

        @PostMapping("/addUser")
        ResponseEntity<?> addUsers(@Valid @RequestBody UsersRequest usersRequest){

            UserResponse userResponse = usersService.addUsers(usersRequest);

            return ResponseEntity.status(HttpStatus.OK)
                    .body(CommonResponse.<UserResponse>builder()
                            .statusCode(HttpStatus.OK.value())
                            .message("Sukses")
                            .data(userResponse)
                            .build()
                    );

        }
    }
