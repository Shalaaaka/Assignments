package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List_Map_Value 
{
	private Map<String, String> map;
    private List<String> list;
    
    public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public List_Map_Value() {
        map = new HashMap<String, String>();
        map.put("key1", "Value 1");
        map.put("key2", "Value 2");
  
        list = new ArrayList<String>();
        list.add("list1");
        list.add("list2");
  
    }

}
