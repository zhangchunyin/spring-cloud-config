package com.pharmagin.configclient;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "xx.test")
public class ConfigProperties {

  private String hehe;

  private String[] txtarray;

  private List<Map<String, String>> listmap;

  private List<String> liststr;

  private Map<String, String> map;

  public String getHehe() {
    return hehe;
  }

  public void setHehe(String hehe) {
    this.hehe = hehe;
  }

  public String[] getTxtarray() {
    return txtarray;
  }

  public void setTxtarray(String[] txtarray) {
    this.txtarray = txtarray;
  }

  public List<Map<String, String>> getListmap() {
    return listmap;
  }

  public void setListmap(List<Map<String, String>> listmap) {
    this.listmap = listmap;
  }

  public List<String> getListstr() {
    return liststr;
  }

  public void setListstr(List<String> liststr) {
    this.liststr = liststr;
  }

  public Map<String, String> getMap() {
    return map;
  }

  public void setMap(Map<String, String> map) {
    this.map = map;
  }

  @Override
  public String toString() {
    return "ConfigProperties [hehe=" + hehe + ", txtarray=" + Arrays.toString(txtarray) + ", listmap=" + listmap
        + ", liststr=" + liststr + ", map=" + map + "]";
  }
}