package lesson4.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "oksana0405");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from city");
        ResultSet resultSet = preparedStatement.executeQuery();//поверне вибірку
        List<City> cityList = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String cityName = resultSet.getString(2);
            int zip = resultSet.getInt(3);
            cityList.add(new City(id, cityName, zip));
        }
        cityList.forEach(city -> System.out.println(city));
        cityList.stream()
                .filter(city -> city.getId() >= 400 && city.getId() <= 500)
                        .sorted((c1, c2) -> c1.getZip() -c2.getZip())
                                .collect(Collectors.toList())
                                        .forEach(System.out::println);

        connection.close();
    }
}
