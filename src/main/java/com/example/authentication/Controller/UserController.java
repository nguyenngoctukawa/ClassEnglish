package com.example.authentication.Controller;

import com.example.authentication.Dto.UserDto;
import com.example.authentication.Dto.UserregisterDto;
import com.example.authentication.Entity.UserEntity;
import com.example.authentication.Model.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@Controller
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    private  UserRepository repo;
    @RequestMapping("/")
    public String login(Model model){
        System.out.println(userRepository.findAll().toString());
        UserDto userDto = new UserDto();
//        userDto.setUsername("nam");
//        userDto.setPassword("chu");
        model.addAttribute("user",userDto);
        return "login";
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String loginform(@ModelAttribute UserDto userDto,Model model){
//        System.out.println(userDto.getUsername() != null ? userDto.getUsername() : "null list");
//        System.out.println(userDto.toString());
        boolean check = false;
        for( int i=0; i< userRepository.findAll().size();i++)
        {
            //equal ss =
            //contain ss chua  list[3]
            if(userDto.getUsername().equals(userRepository.findAll().get(i).getEmail()))
            {
                if(userDto.getPassword().equals(userRepository.findAll().get(i).getPassword()))
                {
                    check = true;
                }
            }
        }
        if(check==false)
        {
            model.addAttribute("user",userDto);
//            model.addAttribute("check","1");
            return "login";
        }
        else {
            return "Main";
        }
    }
    @RequestMapping("/register")
    public String register(Model model){
        System.out.println(userRepository.findAll().toString());
        UserregisterDto userDto = new UserregisterDto();
//        userDto.setUsername("nam");
//        userDto.setPassword("chu");
        model.addAttribute("user",userDto);
        return "register";
    }
    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String registerform(@ModelAttribute UserregisterDto userregisterDto, Model model) {
        System.out.println(userregisterDto.getRoleid());
        boolean check = false;
        for( int i=0; i< userRepository.findAll().size();i++)
        {
            if(userregisterDto.getEmail().equals(userRepository.findAll().get(i).getEmail()))
            {
                check=true;
            }
        }
        if(check==true)
        {
            model.addAttribute("user",userregisterDto);
            model.addAttribute("error", "Email đã được sử dụng");
            return "register";
        }
        else {
            UserEntity user=new UserEntity(Long.parseLong( userregisterDto.getRoleid()),userregisterDto.getEmail() , userregisterDto.getPassword());
            userRepository.save(user);
            return "Main";
        }
    }

    @RequestMapping("createuser")
    public String createuser(){
        System.out.println(userRepository.findAll().toString());
        return "register";
    }
    @RequestMapping("ForgotPass")
    public String ForgotPass(){
        System.out.println(userRepository.findAll().toString());
        return "forgotpass";
    }
    @RequestMapping("Main")
    public String Mainn(){
        System.out.println(userRepository.findAll().toString());
        return "Main";
    }
}
