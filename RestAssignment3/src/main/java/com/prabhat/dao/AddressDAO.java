package com.prabhat.dao;

import java.util.ArrayList;
import java.util.List;

import com.prabhat.pojo.AddressPOJO;



public class AddressDAO {
	public List<AddressPOJO> getAddressAllUsers() {

		List<AddressPOJO> list = new ArrayList<>();
		list.add(new AddressPOJO("BANGALORE", "KARNATAKA", "India", "560077"));
		list.add(new AddressPOJO("BIHAR", "PATNA", "India", "811201"));
		return list;
	}
	public AddressPOJO getAddress(String zipcode) {
		List<AddressPOJO> list = new ArrayList<>();
		list.add(new AddressPOJO("BANGALORE", "KARNATAKA", "India", "560077"));
		list.add(new AddressPOJO("BIHAR", "PATNA", "India", "811201"));

		AddressPOJO res = null;
		for (AddressPOJO addressPOJO : list) {
			if (zipcode.equals(addressPOJO.getZipcode())) {
				res = addressPOJO;
				}
		}
		return res;
	}
}