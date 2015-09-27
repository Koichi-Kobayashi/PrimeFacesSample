package pf_sample;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="themeService", eager = true)
@ApplicationScoped
public class ThemeService {

  private List<Theme> themes;

  @PostConstruct
  public void init() {
    themes = new ArrayList<Theme>();
    themes.add(new Theme(0, "Ａ", "Ａ"));
    themes.add(new Theme(1, "ＡＢ", "ＡＢ"));
    themes.add(new Theme(2, "ＡＢＣ", "ＡＢＣ"));
    themes.add(new Theme(3, "ＡＢＣＤ", "ＡＢＣＤ"));
    themes.add(new Theme(4, "Ｘ", "Ｘ"));
    themes.add(new Theme(5, "ＸＹ", "ＸＹ"));
    themes.add(new Theme(6, "ＸＹＺ", "ＸＹＺ"));
    themes.add(new Theme(7, "管理１", "管理"));
    themes.add(new Theme(8, "管理２", "管理２"));
    themes.add(new Theme(9, "管理３", "管理３"));
    themes.add(new Theme(10, "管理４", "管理４"));
    themes.add(new Theme(11, "管理５", "管理５"));
    themes.add(new Theme(12, "Delta", "delta"));
    themes.add(new Theme(13, "Dot-Luv", "dot-luv"));
    themes.add(new Theme(14, "Eggplant", "eggplant"));
    themes.add(new Theme(15, "Excite-Bike", "excite-bike"));
    themes.add(new Theme(16, "Flick", "flick"));
    themes.add(new Theme(17, "Glass-X", "glass-x"));
    themes.add(new Theme(18, "Home", "home"));
    themes.add(new Theme(19, "Hot-Sneaks", "hot-sneaks"));
    themes.add(new Theme(20, "Humanity", "humanity"));
    themes.add(new Theme(21, "Le-Frog", "le-frog"));
    themes.add(new Theme(22, "Midnight", "midnight"));
    themes.add(new Theme(23, "Mint-Choc", "mint-choc"));
    themes.add(new Theme(24, "Overcast", "overcast"));
    themes.add(new Theme(25, "Pepper-Grinder", "pepper-grinder"));
    themes.add(new Theme(26, "Redmond", "redmond"));
    themes.add(new Theme(27, "Rocket", "rocket"));
    themes.add(new Theme(28, "Sam", "sam"));
    themes.add(new Theme(29, "Smoothness", "smoothness"));
    themes.add(new Theme(30, "South-Street", "south-street"));
    themes.add(new Theme(31, "Start", "start"));
    themes.add(new Theme(32, "Sunny", "sunny"));
    themes.add(new Theme(33, "Swanky-Purse", "swanky-purse"));
    themes.add(new Theme(34, "Trontastic", "trontastic"));
    themes.add(new Theme(35, "UI-Darkness", "ui-darkness"));
    themes.add(new Theme(36, "UI-Lightness", "ui-lightness"));
    themes.add(new Theme(37, "Vader", "vader"));
  }

  public List<Theme> getThemes() {
    return themes;
  }
}