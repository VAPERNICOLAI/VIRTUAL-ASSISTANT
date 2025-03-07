import java.sql.*;

public class ServiceDAO {

    public void addService(Service service) {
        String query = "INSERT INTO services (name, hourly_rate) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, service.getName());
            stmt.setDouble(2, service.getHourlyRate());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewAllServices() {
        String query = "SELECT * FROM services";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("service_id") + ", Service: " + rs.getString("name") + ", Rate: " + rs.getDouble("hourly_rate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
