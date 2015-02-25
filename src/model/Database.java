package model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Database {
	private List<User> users = new ArrayList<User>();

}
