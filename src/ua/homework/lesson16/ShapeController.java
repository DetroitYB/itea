package ua.homework.lesson16;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShapeController {

    private DbConnector dbConnector;

    private static final String INSERT_SHAPE = "INSERT INTO shape(name, color, perimeter, square) VALUES('%s', '%s', %d, %d);";
    private static final String GET_ALL_SHAPES = "SELECT * FROM shape";
    private static final String GET_COUNT_OF_TABLE = "SELECT COUNT(*) FROM shape";
    private static final String SHAPE_FILTER = " WHERE name = '%s'";

    public ShapeController(DbConnector dbConnector) {
        this.dbConnector = dbConnector;
    }

    public void addShape(Shape shape) {
        Connection conn = null;
        Statement statement = null;
        try {
            conn = this.dbConnector.getConnection();
            statement = conn.createStatement();
            statement.execute(String.format(INSERT_SHAPE, shape.getName(), shape.getColor(), shape.getPerimeter(), shape.getSquare()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public int getCountOfRows(String filter) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        int count = 0;

        try {
            conn = this.dbConnector.getConnection();
            st = conn.createStatement();
            if(filter.isEmpty()) {
                rs = st.executeQuery(GET_COUNT_OF_TABLE);
            }else {
                rs = st.executeQuery(GET_COUNT_OF_TABLE + String.format(SHAPE_FILTER,filter));
            }
            if(rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return count;
    }

    public Shape[] getAllShapes(String filter) {
        Shape[] shapes = new Shape[getCountOfRows(filter)];
        int iterator = 0;
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        conn = dbConnector.getConnection();
        try {
            st = conn.createStatement();
            if(filter.isEmpty()) {
                rs = st.executeQuery(GET_ALL_SHAPES);
            }else{
                rs = st.executeQuery(GET_ALL_SHAPES + String.format(SHAPE_FILTER, filter));
            }
            while(rs.next()){
                Shape shape = new Shape(rs.getString("name"));
                shape.setColor(rs.getString("color"));
                shape.setPerimeter(rs.getInt("perimeter"));
                shape.setSquare(rs.getInt("square"));
                shapes[iterator++] = shape;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return shapes;
    }
}

