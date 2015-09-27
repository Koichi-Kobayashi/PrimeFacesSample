package pf_sample;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckboxView {
  private String[] selectedCities;
  private List<String> cities;

  @PostConstruct
  public void init() {
    cities = new ArrayList<String>();
    cities.add("Ａ");
    cities.add("ＡＢ");
    cities.add("ＡＢＣ");
    cities.add("ＡＢＣＤ");
    cities.add("Ｘ");
    cities.add("ＸＹ");
    cities.add("ＸＹＺ");
    cities.add("管理１");
    cities.add("管理２");
    cities.add("管理３");
    cities.add("管理４");
    cities.add("管理５");
  }

  public String[] getSelectedCities() {
    return selectedCities;
  }

  public void setSelectedCities(String[] selectedCities) {
    this.selectedCities = selectedCities;
  }

  public List<String> getCities() {
    return cities;
  }
}
