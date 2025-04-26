package com.todo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskService {

    public void addTask(String description) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO tasks (description) VALUES (?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, description);
            stmt.executeUpdate();
            System.out.println("Task added!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM tasks";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                tasks.add(new Task(
                        rs.getInt("id"),
                        rs.getString("description"),
                        rs.getBoolean("done")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public void markTaskAsDone(int id) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE tasks SET done = TRUE WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Task marked as done!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
