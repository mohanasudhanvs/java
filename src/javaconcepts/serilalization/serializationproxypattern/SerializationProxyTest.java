package javaconcepts.serilalization.serializationproxypattern;

import java.io.IOException;

import javaconcepts.serilalization.SerializationUtil;

public class SerializationProxyTest {

	public static void main(String[] args) {
		String fileName = "data.ser";

		Data data = new Data("Pankaj");

		try {
			SerializationUtil.serialize(data, fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Data newData = (Data) SerializationUtil.deserialize(fileName);
			System.out.println(newData);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
