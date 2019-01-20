package com.battlecall.spring.test3;

import java.util.*;

public class Chinese implements Person{
    private List list = new ArrayList();
    private Map map = new HashMap();
    private Set set = new HashSet();
    private Properties properties = new Properties();


    @Override
    public void test() {
        System.out.println(this.list);
        System.out.println(this.map);
        System.out.println(this.set);
        System.out.println(this.properties);
    }


    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
