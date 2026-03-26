<%@ page import="java.sql.*" %>
<html>
<head>
    <title>PostgreSQL Table Data</title>
</head>
<body>

<h3>PostgreSQL Table Data</h3>

<%
try {
    // Load PostgreSQL JDBC Driver
    Class.forName("org.postgresql.Driver");

    // Connect to PostgreSQLs
    String url = "jdbc:postgresql://localhost:5432/techouts"; // replace 'yourDB' with your database name
    String username = "postgres";  // your PostgreSQL username
    String password = "manthan";   // your PostgreSQL password

    Connection con = DriverManager.getConnection(url, username, password);

    // Create statement and execute query
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM student"); // replace 'table_name' with your table

    // Print table data
  
    out.println("<tr><th>ID</th><th>Name</th><th>marks</th></tr>"); // change columns if needed
    out.println("<table border='1'>");
    while(rs.next()) {
     out.println("<tr>");
     out.println(rs.getInt("roll") + " - " + rs.getString("name") + "<br>");

        out.println("</tr>");
    }
 

    // Close connections
    rs.close();
    stmt.close();
    con.close();

} catch(Exception e) {
    // Show any errors on browser
    out.println("Error: " + e);
}
%>

</body>
</html>