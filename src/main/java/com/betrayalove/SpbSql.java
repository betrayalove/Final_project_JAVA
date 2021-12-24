package com.betrayalove;

import org.sqlite.JDBC;

import java.sql.*;

public class SpbSql {

    private static final String CON_STR = "jdbc:sqlite:identifier.sqlite";

//    private static SpbSql instance = null;
//
//    public static synchronized SpbSql getInstance() throws SQLException {
//        if (instance == null)
//            instance = new SpbSql();
//        return instance;
//    }

    private final Connection connection;

    public SpbSql() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(CON_STR);
    }

    public void addProduct(SpbBase spbBase) {
        try (PreparedStatement statement = this.connection.prepareStatement(
                "INSERT INTO table_name(`number`,`address`, `snapshot`, `number_floor`, `appellation`, `prefix_code`, `year_construction`) " +
                        "VALUES(?, ?, ?, ?, ?, ?, ?)")) {
            statement.setObject(1, spbBase.getNumber());
            statement.setObject(2, spbBase.getAddress());
            statement.setObject(3, spbBase.getSnapshot());
            statement.setObject(4, spbBase.getNumberFloor());
            statement.setObject(5, spbBase.getAppellation());
            statement.setObject(6, spbBase.getPrefixCode());
            statement.setObject(7, spbBase.getYearConstruction());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int task1(int countFloor) {
        try (PreparedStatement statement = this.connection.prepareStatement(
                "SELECT COUNT(number) " +
                        "FROM table_name " +
                        "WHERE CAST(TRIM(number_floor,'Мяюэьыъщшчцхфутсрпонмлкйизжёедгвба-') AS INTEGER) == ?")) {
            statement.setObject(1, countFloor);
            return statement.executeQuery().getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException();
    }

    public String task2() {
        try (PreparedStatement statement = this.connection.prepareStatement(
                "SELECT address " +
                        "FROM table_name " +
                        "WHERE(CAST(prefix_code AS INTEGER) == 9881 AND appellation == 'Зарегистрированный участок')")) {
            StringBuilder builder = new StringBuilder();
            var resultSet = statement.executeQuery();
            while (resultSet.next()) {
                builder.append(resultSet.getString(1)).append('\n');
            }
            return builder.toString();
//        return null;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException();
    }

    public String task3() {
        try (PreparedStatement statement = this.connection.prepareStatement(
                "SELECT address, prefix_code " +
                        "FROM table_name " +
                        "WHERE appellation LIKE 'Университет' " +
                        "AND CAST(TRIM(number_floor,'Мяюэьыъщшчцхфутсрпонмлкйизжёедгвба-') AS INTEGER) > 5 " +
                        "AND year_construction != ''")) {
            StringBuilder builder = new StringBuilder();
            var resultSet = statement.executeQuery();
            int count = 0;
            int sum = 0;
            while (resultSet.next()) {
                builder.append(resultSet.getString(1)).append('\n');
                sum += resultSet.getInt(2);
                count++;
            }
            builder.append("\nСредний prefix_code = ").append(sum / count);
            return builder.toString();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException();
    }
}
