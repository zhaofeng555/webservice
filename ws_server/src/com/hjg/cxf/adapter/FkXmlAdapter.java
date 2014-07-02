package com.hjg.cxf.adapter;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.hjg.cxf.adapter.StringCat.Entry;
import com.hjg.cxf.model.Cat;

public class FkXmlAdapter extends XmlAdapter<StringCat, Map<String, Cat>>{

	@Override
	public Map<String, Cat> unmarshal(StringCat v) throws Exception {
		Map<String, Cat> result = new HashMap<String, Cat>();
		for (Entry entry : v.getEntries()) {
			String key = entry.getKey();
			Cat cat = entry.getValue();
			result.put(key, cat);
		}
		return result;
	}

	@Override
	public StringCat marshal(Map<String, Cat> v) throws Exception {
		
		StringCat sc = new StringCat();
		for (String key : v.keySet()) {
			sc.getEntries().add(new Entry(key, v.get(key)));
		}
		return sc;
	}

}
