package com.example.brawlhallatranslate;

import com.example.brawlhallatranslate.Model.BaseReturn;
import com.example.brawlhallatranslate.Model.Crossovers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/crossovers")
    public List<Crossovers> getCrossovers(){
        List<Crossovers> crossovers = new ArrayList<>();

        crossovers.add(new Crossovers("Shovel Knight", "Gnash", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_ShovelKnightM.png"));
        crossovers.add(new Crossovers("Black Knight", "Orion", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_BlackKnightM.png"));
        crossovers.add(new Crossovers("King Knight", "Sir Roland", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_KingKnightM.png"));
        crossovers.add(new Crossovers("Specter Knight", "Nix", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_SpecterKnightM.png"));
        crossovers.add(new Crossovers("Plague Knight", "Caspian", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_PlagueKnightM.png"));
        crossovers.add(new Crossovers("Enchantress", "Fait", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_EnchantressM.png"));
        crossovers.add(new Crossovers("Globox", "Cassidy", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_GloboxM.png"));
        crossovers.add(new Crossovers("Barbara", "Brynn", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_BarbaraM.png"));
        crossovers.add(new Crossovers("Hellboy", "Cross", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_HellboyM.png"));
        crossovers.add(new Crossovers("Nimue", "Dusk", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_NimueM.png"));
        crossovers.add(new Crossovers("Daimio", "Mordex", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_DaimioM.png"));
        crossovers.add(new Crossovers("Gruagach", "Teros", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_GruagachM.png"));
        crossovers.add(new Crossovers("Finn", "Jhala", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_FinnM.png"));
        crossovers.add(new Crossovers("Jake", "Kor", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_JakeM.png"));
        crossovers.add(new Crossovers("Princess Bubblegum", "Lord Vraxx", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_BubblegumM.png"));
        crossovers.add(new Crossovers("John Cena", "Hattori", "https://cms.brawlhalla.com/c/uploads/2021/12/Cena.png"));
        crossovers.add(new Crossovers("Becky Lynch", "Gnash", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_BeckyM.png"));
        crossovers.add(new Crossovers("Xavier Woods", "Bödvar", "https://cms.brawlhalla.com/c/uploads/2021/12/Xavier.png"));
        crossovers.add(new Crossovers("The Rock", "Sentinel", "https://cms.brawlhalla.com/c/uploads/2021/12/therock.png"));
        crossovers.add(new Crossovers("Asuka", "Queen Nai", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_AsukaM.png"));
        crossovers.add(new Crossovers("Roman Reigns", "Teros", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_RomanReignsM.png"));
        crossovers.add(new Crossovers("Macho Man", "Ulgrim", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_MachoManM.png"));
        crossovers.add(new Crossovers("The Undertaker", "Thor", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_UndertakerM.png"));
        crossovers.add(new Crossovers("Amethyst", "Xull", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_AmethystM.png"));
        crossovers.add(new Crossovers("Stevonnie", "Val", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_StevonnieM.png"));
        crossovers.add(new Crossovers("Garnet", "Petra", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_GarnetM.png"));
        crossovers.add(new Crossovers("Pearl", "Kaya", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_PearlM.png"));
        crossovers.add(new Crossovers("Lara Croft", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_LaraClassicM.png", "Diana"));
        crossovers.add(new Crossovers("Heatblast", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_HeatblastM.png", "Ada"));
        crossovers.add(new Crossovers("Diamondhead", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_DiamondheadM.png", "Caspian"));
        crossovers.add(new Crossovers("Four Arms", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_FourArmsM.png", "Kor"));
        crossovers.add(new Crossovers("Michonne", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_MichonneM.png", "Koji"));
        crossovers.add(new Crossovers("Daryl", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_DarylM.png", "Ember"));
        crossovers.add(new Crossovers("Rick", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_RickM.png", "Barraza"));
        crossovers.add(new Crossovers("Negan", "https://cms.brawlhalla.com/c/uploads/2021/12/a_Roster_Pose_NeganM.png", "Jaeyun"));
        crossovers.add(new Crossovers("Maggie", "https://cms.brawlhalla.com/c/uploads/2021/12/a_Roster_Pose_MaggieM.png", "Jhala"));
        crossovers.add(new Crossovers("Po", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_PoM.png", "Wu Shang"));
        crossovers.add(new Crossovers("Tai Lung", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_TaiLungM.png", "Mordex"));
        crossovers.add(new Crossovers("Tigress", "https://cms.brawlhalla.com/c/uploads/2022/01/a_Roster_Pose_TigressM.png", "Asuri"));
        crossovers.add(new Crossovers("Michelangelo", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_MikeyM.png", "Val"));
        crossovers.add(new Crossovers("Raphael", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_RaphM.png", "Ragnir"));
        crossovers.add(new Crossovers("Leonardo", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_LeoM.png", "Jiro"));
        crossovers.add(new Crossovers("Donatello", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_DonnieM.png", "Mirage"));
        crossovers.add(new Crossovers("Ryu", "https://cms.brawlhalla.com/c/uploads/2021/12/a_Roster_Pose_RyuM.png", "Petra"));
        crossovers.add(new Crossovers("Chun Li", "https://cms.brawlhalla.com/c/uploads/2021/12/a_Roster_Pose_ChunLiM.png", "Wu Shang"));
        crossovers.add(new Crossovers("Akuma", "https://cms.brawlhalla.com/c/uploads/2021/12/a_Roster_Pose_AkumaM.png", "Val"));
        crossovers.add(new Crossovers("M. Bison", "https://cms.brawlhalla.com/c/uploads/2022/05/a_Roster_Pose_BisonM-1.png", "Thor"));
        crossovers.add(new Crossovers("Ken", "https://cms.brawlhalla.com/c/uploads/2022/05/a_Roster_Pose_KenM-1.png", "Petra"));
        crossovers.add(new Crossovers("Sakura", "https://cms.brawlhalla.com/c/uploads/2022/05/a_Roster_Pose_SakuraM-1.png", "Lin Fei"));
        crossovers.add(new Crossovers("Dhalsim", "https://cms.brawlhalla.com/c/uploads/2022/05/a_Roster_Pose_DhalsimM-1.png", "Rayman"));
        crossovers.add(new Crossovers("Luke", "https://cms.brawlhalla.com/c/uploads/2022/05/a_Roster_Pose_LukeM-1.png", "Cross"));
        crossovers.add(new Crossovers("Storm Shadow", "https://cms.brawlhalla.com/c/uploads/2022/03/a_Roster_Pose_StormShadowM.png", "Koji"));
        crossovers.add(new Crossovers("Snake Eyes", "https://cms.brawlhalla.com/c/uploads/2022/03/a_Roster_Pose_SnakeEyesM.png", "Thatch"));
        crossovers.add(new Crossovers("Eivor", "https://cms.brawlhalla.com/c/uploads/2022/07/a_Roster_Pose_EivorM.png", "Brynn"));
        crossovers.add(new Crossovers("Alucard", "https://cms.brawlhalla.com/c/uploads/2022/10/a_Roster_Pose_AlucardCVM.png", "Ezio"));
        crossovers.add(new Crossovers("Simon Belmont", "https://cms.brawlhalla.com/c/uploads/2022/10/a_Roster_Pose_SimonCVM.png", "Jhala"));
        crossovers.add(new Crossovers("Aang", "https://cms.brawlhalla.com/c/uploads/2022/11/a_Roster_Pose_AangM.png", "Wu Shang"));
        crossovers.add(new Crossovers("Toph", "https://cms.brawlhalla.com/c/uploads/2022/11/a_Roster_Pose_TophM.png", "Kor"));
        crossovers.add(new Crossovers("Zuko", "https://cms.brawlhalla.com/c/uploads/2022/11/a_Roster_Pose_ZukoM.png", "Hattori"));
        crossovers.add(new Crossovers("The Master Chief", "https://cms.brawlhalla.com/c/uploads/2023/07/a_Roster_Pose_MasterChiefM.png", "Isaiah"));
        crossovers.add(new Crossovers("The Arbiter", "https://cms.brawlhalla.com/c/uploads/2023/07/a_Roster_Pose_ArbiterM.png", "Sidra"));
        crossovers.add(new Crossovers("Devil Jin", "https://cms.brawlhalla.com/c/uploads/2023/09/DevilJin_icon.png", "Zariel"));
        crossovers.add(new Crossovers("Nina Williams", "https://cms.brawlhalla.com/c/uploads/2023/09/Nina_icon.png", "Lucien"));
        crossovers.add(new Crossovers("Yoshimitsu", "https://cms.brawlhalla.com/c/uploads/2023/09/Yosh_icon.png", "Jiro"));
        crossovers.add(new Crossovers("SpongeBob SquarePants", "https://cms.brawlhalla.com/c/uploads/2023/12/a_Roster_Pose_SpongebobM.png", "Rayman"));
        crossovers.add(new Crossovers("Patrick Star", "https://cms.brawlhalla.com/c/uploads/2023/12/a_Roster_Pose_PatrickM.png", "Teros"));
        crossovers.add(new Crossovers("Sandy Cheeks", "https://cms.brawlhalla.com/c/uploads/2023/12/a_Roster_Pose_SandyM.png", "Cassidy"));


        return crossovers;
    }

}
