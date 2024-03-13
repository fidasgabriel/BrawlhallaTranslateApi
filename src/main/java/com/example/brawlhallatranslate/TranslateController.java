package com.example.brawlhallatranslate;

import com.example.brawlhallatranslate.Model.BaseReturn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class TranslateController {

    @CrossOrigin()
    @GetMapping("/translate/{item}")
    public BaseReturn translation(@PathVariable() String item){
        if(item.toLowerCase().trim().equals("sword")){
            return new BaseReturn("Espada");
        } else if (item.toLowerCase().trim().equals("spear")) {
            return new BaseReturn("Lança");
        } else if (item.toLowerCase().trim().equals("rocketlance")) {
            return new BaseReturn("Lança Foguete");
        } else if (item.toLowerCase().trim().equals("orb")) {
            return new BaseReturn("Orbe");
        } else if (item.toLowerCase().trim().equals("hammer")) {
            return new BaseReturn("Marreta");
        } else if (item.toLowerCase().trim().equals("greatsword")) {
            return new BaseReturn("Espada Montante Lendária");
        } else if (item.toLowerCase().trim().equals("axe")) {
            return new BaseReturn("Machado");
        } else if (item.toLowerCase().trim().equals("pistol") || item.toLowerCase().trim().equals("blasters")) {
            return new BaseReturn("Pistolas");
        } else if (item.toLowerCase().trim().equals("scythe")) {
            return new BaseReturn("Foice");
        } else if (item.toLowerCase().trim().equals("katar")) {
            return new BaseReturn("Katar");
        } else if (item.toLowerCase().trim().equals("bow")) {
            return new BaseReturn("Arco");
        } else if (item.toLowerCase().trim().equals("fists") || item.toLowerCase().trim().equals("gaunglets")) {
            return new BaseReturn("Luvas");
        } else if (item.toLowerCase().trim().equals("cannon")) {
            return new BaseReturn("Canhão");
        } else if (item.toLowerCase().trim().equals("boots")) {
            return new BaseReturn("Botas de Batalha");
        }
        return new BaseReturn(item);
    }

}
