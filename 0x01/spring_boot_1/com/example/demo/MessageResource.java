package spring_boot_1.com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessageResource {

    @GetMapping("/simpleMessageWelcome")
    @ResponseStatus(HttpStatus.OK)
    public String simpleMessageWelcome() {
        return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";

    }

    @GetMapping("/login")
    public String login(@RequestParam String user, @RequestParam String password) {
        if (user.equals("") || password.equals("")){
            return "USUÁRIO E SENHA NÃO INFORMADOS";
        }if (user.length() > 15 || password.length() > 15){
            return "USUÁRIO E SENHA INVÁLIDOS";
        }else {
            return "LOGIN EFETUADO COM SUCESSO !!!";
        }



    }
}
