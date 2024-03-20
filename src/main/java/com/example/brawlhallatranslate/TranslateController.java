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

    @CrossOrigin()
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
        crossovers.add(new Crossovers("Lara Croft", "Diana", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_LaraClassicM.png"));
        crossovers.add(new Crossovers("Heatblast", "Ada", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_HeatblastM.png"));
        crossovers.add(new Crossovers("Diamondhead", "Caspian", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_DiamondheadM.png"));
        crossovers.add(new Crossovers("Four Arms", "Kor", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_FourArmsM.png"));
        crossovers.add(new Crossovers("Michonne", "Koji", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_MichonneM.png"));
        crossovers.add(new Crossovers("Daryl", "Ember", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_DarylM.png"));
        crossovers.add(new Crossovers("Rick", "Barraza", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_RickM.png"));
        crossovers.add(new Crossovers("Negan", "Jaeyun", "https://cms.brawlhalla.com/c/uploads/2021/12/a_Roster_Pose_NeganM.png"));
        crossovers.add(new Crossovers("Maggie", "Jhala", "https://cms.brawlhalla.com/c/uploads/2021/12/a_Roster_Pose_MaggieM.png"));
        crossovers.add(new Crossovers("Po", "Wu Shang", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_PoM.png"));
        crossovers.add(new Crossovers("Tai Lung", "Mordex", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_TaiLungM.png"));
        crossovers.add(new Crossovers("Tigress", "Asuri", "https://cms.brawlhalla.com/c/uploads/2022/01/a_Roster_Pose_TigressM.png"));
        crossovers.add(new Crossovers("Michelangelo", "Val", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_MikeyM.png"));
        crossovers.add(new Crossovers("Raphael", "Ragnir", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_RaphM.png"));
        crossovers.add(new Crossovers("Leonardo", "Jiro", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_LeoM.png"));
        crossovers.add(new Crossovers("Donatello", "Mirage", "https://cms.brawlhalla.com/c/uploads/2021/07/a_Roster_Pose_DonnieM.png"));
        crossovers.add(new Crossovers("Ryu", "Petra", "https://cms.brawlhalla.com/c/uploads/2021/12/a_Roster_Pose_RyuM.png"));
        crossovers.add(new Crossovers("Chun Li", "Wu Shang", "https://cms.brawlhalla.com/c/uploads/2021/12/a_Roster_Pose_ChunLiM.png"));
        crossovers.add(new Crossovers("Akuma", "Val", "https://cms.brawlhalla.com/c/uploads/2021/12/a_Roster_Pose_AkumaM.png"));
        crossovers.add(new Crossovers("M. Bison", "Thor", "https://cms.brawlhalla.com/c/uploads/2022/05/a_Roster_Pose_BisonM-1.png"));
        crossovers.add(new Crossovers("Ken", "Petra", "https://cms.brawlhalla.com/c/uploads/2022/05/a_Roster_Pose_KenM-1.png"));
        crossovers.add(new Crossovers("Sakura", "Lin Fei", "https://cms.brawlhalla.com/c/uploads/2022/05/a_Roster_Pose_SakuraM-1.png"));
        crossovers.add(new Crossovers("Dhalsim", "Rayman", "https://cms.brawlhalla.com/c/uploads/2022/05/a_Roster_Pose_DhalsimM-1.png"));
        crossovers.add(new Crossovers("Luke", "Cross", "https://cms.brawlhalla.com/c/uploads/2022/05/a_Roster_Pose_LukeM-1.png"));
        crossovers.add(new Crossovers("Storm Shadow", "Koji", "https://cms.brawlhalla.com/c/uploads/2022/03/a_Roster_Pose_StormShadowM.png"));
        crossovers.add(new Crossovers("Snake Eyes", "Thatch", "https://cms.brawlhalla.com/c/uploads/2022/03/a_Roster_Pose_SnakeEyesM.png"));
        crossovers.add(new Crossovers("Eivor", "Brynn", "https://cms.brawlhalla.com/c/uploads/2022/07/a_Roster_Pose_EivorM.png"));
        crossovers.add(new Crossovers("Alucard", "Ezio", "https://cms.brawlhalla.com/c/uploads/2022/10/a_Roster_Pose_AlucardCVM.png"));
        crossovers.add(new Crossovers("Simon Belmont", "Jhala", "https://cms.brawlhalla.com/c/uploads/2022/10/a_Roster_Pose_SimonCVM.png"));
        crossovers.add(new Crossovers("Aang", "Wu Shang", "https://cms.brawlhalla.com/c/uploads/2022/11/a_Roster_Pose_AangM.png"));
        crossovers.add(new Crossovers("Toph", "Kor", "https://cms.brawlhalla.com/c/uploads/2022/11/a_Roster_Pose_TophM.png"));
        crossovers.add(new Crossovers("Zuko", "Hattori", "https://cms.brawlhalla.com/c/uploads/2022/11/a_Roster_Pose_ZukoM.png"));
        crossovers.add(new Crossovers("The Master Chief", "Isaiah", "https://cms.brawlhalla.com/c/uploads/2023/07/a_Roster_Pose_MasterChiefM.png"));
        crossovers.add(new Crossovers("The Arbiter", "Sidra", "https://cms.brawlhalla.com/c/uploads/2023/07/a_Roster_Pose_ArbiterM.png"));
        crossovers.add(new Crossovers("Devil Jin", "Zariel", "https://cms.brawlhalla.com/c/uploads/2023/09/DevilJin_icon.png"));
        crossovers.add(new Crossovers("Nina Williams", "Lucien", "https://cms.brawlhalla.com/c/uploads/2023/09/Nina_icon.png"));
        crossovers.add(new Crossovers("Yoshimitsu", "Jiro", "https://cms.brawlhalla.com/c/uploads/2023/09/Yosh_icon.png"));
        crossovers.add(new Crossovers("SpongeBob SquarePants", "Rayman", "https://cms.brawlhalla.com/c/uploads/2023/12/a_Roster_Pose_SpongebobM.png"));
        crossovers.add(new Crossovers("Patrick Star", "Teros", "https://cms.brawlhalla.com/c/uploads/2023/12/a_Roster_Pose_PatrickM.png"));
        crossovers.add(new Crossovers("Sandy Cheeks", "Cassidy", "https://cms.brawlhalla.com/c/uploads/2023/12/a_Roster_Pose_SandyM.png"));


        return crossovers;
    }

}
