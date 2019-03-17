package ProyectoLae.DatabaseX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseX 
{

    //variables de clase
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/proyectoprogra2oficial"
                + "?autoReconnect=true"
                + "&useUnicode=true"
                + "&useSSL=false"
                + "&useJDBCCompliantTimezoneShift=true"
                + "&useLegacyDatetimeCode=false"
                + "&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    
    //para hacer la conexion
    private Connection m_CConnection;
    private Statement m_CStatement;
    private ResultSet m_CResultSet;
    
    //todo pasa en el constructor
    public DatabaseX() 
    {
        //primer paso: crear la connection
        setConnection( createConnection() );
        //segundo paso: crear el statement
        setStatement( createStatement() );
    }

    public Connection getConnection() 
    {
        return m_CConnection;
    }

    private void setConnection(Connection p_CConnection) 
    {
        m_CConnection = p_CConnection;
    }

    public Statement getStatement() 
    {
        return m_CStatement;
    }

    private void setStatement(Statement p_CStatement) 
    {
        m_CStatement = p_CStatement;
    }

    public ResultSet getResultSet() 
    {
        return m_CResultSet;
    }

    private void setResultSet(ResultSet p_CResultSet) 
    {
        m_CResultSet = p_CResultSet;
    }

    private Connection createConnection() 
    {
        Connection CConexion = null;
        try 
        {
            Class.forName(DB_DRIVER);
            CConexion =
                    DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(DatabaseX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CConexion;
    }

    private Statement createStatement() 
    {
        //variables locales o variables de metodo
        Connection CConnection = getConnection();
        Statement stm = null;
        try
        {
            if(!CConnection.isClosed())
            {
                stm = CConnection.createStatement();
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(DatabaseX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stm;
    }
    
    public ResultSet executeQuery(String p_strSql)
    {
        Connection con = getConnection();
        Statement stm = getStatement();
        ResultSet result = null;
        
        try 
        {
            if(!con.isClosed())
            {
                result = stm.executeQuery(p_strSql);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DatabaseX.class.getName()).log(Level.SEVERE, null, ex);
        }
        setResultSet( result );
        
        return result;
    }

    public int executeNonQueryRows(String p_strSql)
    {
        Connection con = getConnection();
        Statement stm = getStatement();
        int iRows = 0;
        
        try 
        {
            if(!con.isClosed())
            {
                iRows = stm.executeUpdate(p_strSql);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DatabaseX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return iRows;
    }
    
    public boolean executeNonQueryBool(String p_strSql)
    {
        Connection con = getConnection();
        Statement stm = getStatement();
        boolean iSuccess = false;
        
        try 
        {
            if(!con.isClosed())
            {
                iSuccess = stm.execute(p_strSql);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DatabaseX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return iSuccess;
    }
    
    
}
