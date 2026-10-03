package Service;

import db.DBConnection;
import model.Customer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static final Statement DBConnection = null;

	public void addCustomer(String name, String email, String phone) {
        String sql = "INSERT INTO customers(name, email, phone) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, phone);
            stmt.executeUpdate();
            System.out.println("✅ Customer added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Object> getAllCustomers() {
        List<Object> list = new ArrayList<>();
        String sql = "SELECT * FROM customers";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Customer(rs.getInt("customer_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
