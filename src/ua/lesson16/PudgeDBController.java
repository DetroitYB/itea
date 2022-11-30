package ua.lesson16;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PudgeDBController {

    private DbConnector dbConnector;

    private static final String INSERT = "INSERT INTO pudge(name, level, ultimate) VALUES('%s', '%d', '%s')";
    private static final String GET_BY_ID = "SELECT * FROM pudge WHERE id = %d";

    public PudgeDBController(DbConnector dbConnector) {
        this.dbConnector = dbConnector;
    }

    public Pudge[] getAll(){

        return null;
    }

    public Pudge getPudgeById(int id){
        Pudge pudge = null;

        Connection conn = dbConnector.createConnection();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            String sql = String.format(GET_BY_ID, id);
            rs = st.executeQuery(sql);
            if(rs.next()){
                pudge = new Pudge();
                pudge.setId(rs.getInt("id"));
                pudge.setLevel(rs.getInt("level"));
                pudge.setName(rs.getString("name"));
                pudge.setUltimate(rs.getString("ultimate"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(st != null){
                try {
                    st.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return pudge;
    }

    public void addPudge(Pudge pudge){
        Connection conn = dbConnector.createConnection();
        Statement st = null;
        try {
            st = conn.createStatement();
            String sql = String.format(INSERT, pudge.getName(), pudge.getLevel(), pudge.getUltimate());
            st.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(st != null){
                try {
                    st.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }
    }
}
